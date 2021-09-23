package com.mediaassetsdk;

import java.io.IOException;
import java.io.InputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.math.BigInteger;
import java.net.URL;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.HttpResponse;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.client.LaxRedirectStrategy;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.methods.GetMethod;

import com.google.protobuf.util.JsonFormat;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class MediaAssetClient {
	private static int UPLOAD_BLOCK_SIZE = 32 * 1024 * 1024;
	// 调用的 host
	private String host;

	// 调用的 port
	private String port;

	// 调用的 endPoint, 内部使用
	private String endPoint;

	// 鉴权的 SecretID
	private String secretID;

	// 鉴权的 SecretKey
	private String secretKey;

	// 业务 ID
	private int tiBusinessID;

	// 项目 ID
	private int tiProjectID;

	private void makeEndPoint() {
		this.endPoint = "http://" + this.host;
		if (this.port != "") {
			this.endPoint += ":" + this.port;
		}
	}

	private com.mediaassetsdk.UploadPartResponse putObject(String key, String bucket, byte[] filebuf)
			throws HttpException, IOException, RuntimeException {
		String action = "PutObject";
		String service = "app-cdn4aowk";
		String version = "2021-02-26";
		String contentType = "application/octet-stream";
		String httpMethod = "PUT";
		String secretId = this.secretID;
		String secretKey = this.secretKey;
		TiSign ts = new TiSign(host, action, version, service, contentType, httpMethod, secretId, secretKey);
		HashMap<String, String> httpHeaderMap = new HashMap<String, String>();
		try {
			ts.CreateHeaderWithSignature(httpHeaderMap);
		} catch (Exception e) {
			throw new IOException("生成签名错误: " + e.toString());
		}
		String md5sum = calcMD5(filebuf);
		String canonicalQueryString = "useJson=true&Bucket=" + bucket + "&Key=" + key + "&Content-MD5=" + md5sum;
		String url = this.endPoint + "/FileManager/PutObject?" + canonicalQueryString;
		String response = com.mediaassetsdk.HttpClientUtil.doPut(httpHeaderMap, url, filebuf);
		JsonObject json = (JsonObject) new JsonParser().parse(response);
		com.mediaassetsdk.UploadPartResponse.Builder rsp = com.mediaassetsdk.UploadPartResponse.newBuilder();
		JsonFormat.parser().ignoringUnknownFields().merge(json.get("Response").toString(), rsp);
		return rsp.build();
	}

	public MediaAssetClient(String host, String port, String secretID, String secretKey, int tiBusinessID,
			int tiProjectID) {
		super();
		this.host = host;
		this.port = port;
		this.secretID = secretID;
		this.secretKey = secretKey;
		this.tiBusinessID = tiBusinessID;
		this.tiProjectID = tiProjectID;
		this.makeEndPoint();
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
		this.makeEndPoint();
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
		this.makeEndPoint();
	}

	public String getSecretID() {
		return secretID;
	}

	public void setSecretID(String secretID) {
		this.secretID = secretID;
	}

	public String getSecretKey() {
		return secretKey;
	}

	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}

	public int getTiBusinessID() {
		return tiBusinessID;
	}

	public void setTiBusinessID(int tiBusinessID) {
		this.tiBusinessID = tiBusinessID;
	}

	public int getTiProjectID() {
		return tiProjectID;
	}

	public void setTiProjectID(int tiProjectID) {
		this.tiProjectID = tiProjectID;
	}

	public com.mediaassetsdk.Error makeError(String code, String message) {
		return com.mediaassetsdk.Error.newBuilder().setCode(code).setMessage(message).build();
	}

	public com.mediaassetsdk.ApplyUploadResponse applyUpload(com.mediaassetsdk.ApplyUploadRequest request)
			throws HttpException, IOException {
		String action = "ApplyUpload";
		String service = "app-cdn4aowk";
		String version = "2021-02-26";
		String contentType = "application/json";
		String httpMethod = "POST";
		String secretId = this.secretID;
		String secretKey = this.secretKey;
		request = request.toBuilder().setAction(action).build();
		if (!request.hasTIBusinessID()) {
			request = request.toBuilder().setTIBusinessID(this.tiBusinessID).build();
		}
		if (!request.hasTIProjectID()) {
			request = request.toBuilder().setTIProjectID(this.tiProjectID).build();
		}
		com.mediaassetsdk.ApplyUploadResponse.Builder rsp = com.mediaassetsdk.ApplyUploadResponse.newBuilder();
		if (!request.hasName()) {
			return rsp.setError(makeError("ErrParameterInvalid", "Name 参数为空")).build();
		}
		if (!request.hasMediaMeta()) {
			return rsp.setError(makeError("ErrParameterInvalid", "MediaMeta 参数为空")).build();
		}
		if (!request.hasSize()) {
			return rsp.setError(makeError("ErrParameterInvalid", "Size 参数为空")).build();
		}
		String body = JsonFormat.printer().print(request);

		TiSign ts = new TiSign(host, action, version, service, contentType, httpMethod, secretId, secretKey);
		HashMap<String, String> httpHeaderMap = new HashMap<String, String>();
		try {
			ts.CreateHeaderWithSignature(httpHeaderMap);
		} catch (Exception e) {
			throw new IOException("生成签名错误: " + e.toString());
		}

		String response = com.mediaassetsdk.HttpClientUtil.doPost(httpHeaderMap, this.endPoint + "/gateway", body);
		JsonObject json = (JsonObject) new JsonParser().parse(response);
		JsonFormat.parser().ignoringUnknownFields().merge(json.get("Response").toString(), rsp);
		return rsp.build();
	}

	public com.mediaassetsdk.UploadPartResponse uploadPart(com.mediaassetsdk.UploadPartRequest request)
			throws HttpException, IOException, RuntimeException {
		String action = "UploadPart";
		String service = "app-cdn4aowk";
		String version = "2021-02-26";
		String contentType = "application/octet-stream";
		String httpMethod = "PUT";
		String secretId = this.secretID;
		String secretKey = this.secretKey;
		com.mediaassetsdk.UploadPartResponse.Builder rsp = com.mediaassetsdk.UploadPartResponse.newBuilder();
		if (!request.hasBuffer()) {
			return rsp.setError(makeError("ErrParameterInvalid", "Buffer 参数为空")).build();
		}
		if (!request.hasPartNUmber()) {
			return rsp.setError(makeError("ErrParameterInvalid", "PartNUmber 参数为空")).build();
		}
		if (!request.hasBucket()) {
			return rsp.setError(makeError("ErrParameterInvalid", "Bucket 参数为空")).build();
		}
		if (!request.hasKey()) {
			return rsp.setError(makeError("ErrParameterInvalid", "Key 参数为空")).build();
		}
		if (!request.hasUploadID()) {
			return rsp.setError(makeError("ErrParameterInvalid", "UploadID 参数为空")).build();
		}
		TiSign ts = new TiSign(host, action, version, service, contentType, httpMethod, secretId, secretKey);
		HashMap<String, String> httpHeaderMap = new HashMap<String, String>();
		try {
			ts.CreateHeaderWithSignature(httpHeaderMap);
		} catch (Exception e) {
			throw new IOException("生成签名错误: " + e.toString());
		}

		String md5sum = calcMD5(request.getBuffer().toByteArray());
		String canonicalQueryString = "useJson=true&Bucket=" + request.getBucket() + "&Key=" + request.getKey()
				+ "&uploadId=" + request.getUploadID() + "&partNumber=" + request.getPartNUmber() + "&Content-MD5=" + md5sum;
		String url = this.endPoint + "/FileManager/UploadPart?" + canonicalQueryString;
		String response = com.mediaassetsdk.HttpClientUtil.doPut(httpHeaderMap, url, request.getBuffer().toByteArray());
		JsonObject json = (JsonObject) new JsonParser().parse(response);
		JsonFormat.parser().ignoringUnknownFields().merge(json.get("Response").toString(), rsp);
		return rsp.build();
	}

	public com.mediaassetsdk.CommitUploadResponse commitUpload(com.mediaassetsdk.CommitUploadRequest request)
			throws HttpException, IOException {
		String action = "CommitUpload";
		String service = "app-cdn4aowk";
		String version = "2021-02-26";
		String contentType = "application/json";
		String httpMethod = "POST";
		String secretId = this.secretID;
		String secretKey = this.secretKey;
		request = request.toBuilder().setAction(action).build();
		if (!request.hasTIBusinessID()) {
			request = request.toBuilder().setTIBusinessID(this.tiBusinessID).build();
		}
		if (!request.hasTIProjectID()) {
			request = request.toBuilder().setTIProjectID(this.tiProjectID).build();
		}
		com.mediaassetsdk.CommitUploadResponse.Builder rsp = com.mediaassetsdk.CommitUploadResponse.newBuilder();
		if (!request.hasMediaID()) {
			return rsp.setError(makeError("ErrParameterInvalid", "MediaID 参数为空")).build();
		}
		if (!request.hasKey()) {
			return rsp.setError(makeError("ErrParameterInvalid", "Key 参数为空")).build();
		}
		if (!request.hasBucket()) {
			return rsp.setError(makeError("ErrParameterInvalid", "Bucket 参数为空")).build();
		}
		if (!request.hasUploadId()) {
			return rsp.setError(makeError("ErrParameterInvalid", "UploadId 参数为空")).build();
		}
		String body = JsonFormat.printer().print(request);
		TiSign ts = new TiSign(host, action, version, service, contentType, httpMethod, secretId, secretKey);
		HashMap<String, String> httpHeaderMap = new HashMap<String, String>();
		try {
			ts.CreateHeaderWithSignature(httpHeaderMap);
		} catch (Exception e) {
			throw new IOException("生成签名错误: " + e.toString());
		}

		String response = com.mediaassetsdk.HttpClientUtil.doPost(httpHeaderMap, this.endPoint + "/gateway", body);
		JsonObject json = (JsonObject) new JsonParser().parse(response);
		JsonFormat.parser().ignoringUnknownFields().merge(json.get("Response").toString(), rsp);
		return rsp.build();
	}

	public com.mediaassetsdk.DescribeCategoriesResponse describeCategories(
			com.mediaassetsdk.DescribeCategoriesRequest request) throws HttpException, IOException {
		String action = "DescribeCategories";
		String service = "app-cdn4aowk";
		String version = "2021-02-26";
		String contentType = "application/json";
		String httpMethod = "POST";
		String secretId = this.secretID;
		String secretKey = this.secretKey;
		request = request.toBuilder().setAction(action).build();
		if (!request.hasTIBusinessID()) {
			request = request.toBuilder().setTIBusinessID(this.tiBusinessID).build();
		}
		if (!request.hasTIProjectID()) {
			request = request.toBuilder().setTIProjectID(this.tiProjectID).build();
		}
		com.mediaassetsdk.DescribeCategoriesResponse.Builder rsp = com.mediaassetsdk.DescribeCategoriesResponse
				.newBuilder();
		String body = JsonFormat.printer().print(request);

		TiSign ts = new TiSign(host, action, version, service, contentType, httpMethod, secretId, secretKey);
		HashMap<String, String> httpHeaderMap = new HashMap<String, String>();
		try {
			ts.CreateHeaderWithSignature(httpHeaderMap);
		} catch (Exception e) {
			throw new IOException("生成签名错误: " + e.toString());
		}

		String response = com.mediaassetsdk.HttpClientUtil.doPost(httpHeaderMap, this.endPoint + "/gateway", body);
		JsonObject json = (JsonObject) new JsonParser().parse(response);
		JsonFormat.parser().ignoringUnknownFields().merge(json.get("Response").toString(), rsp);
		return rsp.build();
	}

	public com.mediaassetsdk.DescribeMediaDetailsResponse describeMediaDetails(
			com.mediaassetsdk.DescribeMediaDetailsRequest request) throws HttpException, IOException {
		String action = "DescribeMediaDetails";
		String service = "app-cdn4aowk";
		String version = "2021-02-26";
		String contentType = "application/json";
		String httpMethod = "POST";
		String secretId = this.secretID;
		String secretKey = this.secretKey;
		request = request.toBuilder().setAction(action).build();
		if (!request.hasTIBusinessID()) {
			request = request.toBuilder().setTIBusinessID(this.tiBusinessID).build();
		}
		if (!request.hasTIProjectID()) {
			request = request.toBuilder().setTIProjectID(this.tiProjectID).build();
		}
		com.mediaassetsdk.DescribeMediaDetailsResponse.Builder rsp = com.mediaassetsdk.DescribeMediaDetailsResponse
				.newBuilder();
		if (request.getMediaIDSetCount() == 0) {
			return rsp.setError(makeError("ErrParameterInvalid", "MediaIDSet 参数为空")).build();
		}
		String body = JsonFormat.printer().print(request);

		TiSign ts = new TiSign(host, action, version, service, contentType, httpMethod, secretId, secretKey);
		HashMap<String, String> httpHeaderMap = new HashMap<String, String>();
		try {
			ts.CreateHeaderWithSignature(httpHeaderMap);
		} catch (Exception e) {
			throw new IOException("生成签名错误: " + e.toString());
		}

		String response = com.mediaassetsdk.HttpClientUtil.doPost(httpHeaderMap, this.endPoint + "/gateway", body);
		JsonObject json = (JsonObject) new JsonParser().parse(response);
		JsonFormat.parser().ignoringUnknownFields().merge(json.get("Response").toString(), rsp);
		return rsp.build();
	}

	public com.mediaassetsdk.DescribeMediasResponse describeMedias(com.mediaassetsdk.DescribeMediasRequest request)
			throws HttpException, IOException {
		String action = "DescribeMedias";
		String service = "app-cdn4aowk";
		String version = "2021-02-26";
		String contentType = "application/json";
		String httpMethod = "POST";
		String secretId = this.secretID;
		String secretKey = this.secretKey;
		request = request.toBuilder().setAction(action).build();
		if (!request.hasTIBusinessID()) {
			request = request.toBuilder().setTIBusinessID(this.tiBusinessID).build();
		}
		if (!request.hasTIProjectID()) {
			request = request.toBuilder().setTIProjectID(this.tiProjectID).build();
		}
		com.mediaassetsdk.DescribeMediasResponse.Builder rsp = com.mediaassetsdk.DescribeMediasResponse.newBuilder();
		String body = JsonFormat.printer().print(request);

		TiSign ts = new TiSign(host, action, version, service, contentType, httpMethod, secretId, secretKey);
		HashMap<String, String> httpHeaderMap = new HashMap<String, String>();
		try {
			ts.CreateHeaderWithSignature(httpHeaderMap);
		} catch (Exception e) {
			throw new IOException("生成签名错误: " + e.toString());
		}

		String response = com.mediaassetsdk.HttpClientUtil.doPost(httpHeaderMap, this.endPoint + "/gateway", body);
		JsonObject json = (JsonObject) new JsonParser().parse(response);
		JsonFormat.parser().ignoringUnknownFields().merge(json.get("Response").toString(), rsp);
		return rsp.build();
	}

	public com.mediaassetsdk.ModifyExpireTimeResponse modifyExpireTime(com.mediaassetsdk.ModifyExpireTimeRequest request)
			throws HttpException, IOException {
		String action = "ModifyExpireTime";
		String service = "app-cdn4aowk";
		String version = "2021-02-26";
		String contentType = "application/json";
		String httpMethod = "POST";
		String secretId = this.secretID;
		String secretKey = this.secretKey;
		request = request.toBuilder().setAction(action).build();
		if (!request.hasTIBusinessID()) {
			request = request.toBuilder().setTIBusinessID(this.tiBusinessID).build();
		}
		if (!request.hasTIProjectID()) {
			request = request.toBuilder().setTIProjectID(this.tiProjectID).build();
		}

		com.mediaassetsdk.ModifyExpireTimeResponse.Builder rsp = com.mediaassetsdk.ModifyExpireTimeResponse.newBuilder();
		if (!request.hasMediaID()) {
			return rsp.setError(makeError("ErrParameterInvalid", "MediaID 参数为空")).build();
		}
		if (!request.hasDays()) {
			return rsp.setError(makeError("ErrParameterInvalid", "Days 参数为空")).build();
		}
		String body = JsonFormat.printer().print(request);

		TiSign ts = new TiSign(host, action, version, service, contentType, httpMethod, secretId, secretKey);
		HashMap<String, String> httpHeaderMap = new HashMap<String, String>();
		try {
			ts.CreateHeaderWithSignature(httpHeaderMap);
		} catch (Exception e) {
			throw new IOException("生成签名错误: " + e.toString());
		}

		String response = com.mediaassetsdk.HttpClientUtil.doPost(httpHeaderMap, this.endPoint + "/gateway", body);
		JsonObject json = (JsonObject) new JsonParser().parse(response);
		JsonFormat.parser().ignoringUnknownFields().merge(json.get("Response").toString(), rsp);
		return rsp.build();
	}

	public com.mediaassetsdk.ModifyMediaResponse modifyMedia(com.mediaassetsdk.ModifyMediaRequest request)
			throws HttpException, IOException {
		String action = "ModifyMedia";
		String service = "app-cdn4aowk";
		String version = "2021-02-26";
		String contentType = "application/json";
		String httpMethod = "POST";
		String secretId = this.secretID;
		String secretKey = this.secretKey;
		request = request.toBuilder().setAction(action).build();
		if (!request.hasTIBusinessID()) {
			request = request.toBuilder().setTIBusinessID(this.tiBusinessID).build();
		}
		if (!request.hasTIProjectID()) {
			request = request.toBuilder().setTIProjectID(this.tiProjectID).build();
		}

		com.mediaassetsdk.ModifyMediaResponse.Builder rsp = com.mediaassetsdk.ModifyMediaResponse.newBuilder();
		if (!request.hasMediaID()) {
			return rsp.setError(makeError("ErrParameterInvalid", "MediaID 参数为空")).build();
		}
		if (!request.hasMediaSecondTag()) {
			return rsp.setError(makeError("ErrParameterInvalid", "MediaSecondTag 参数为空")).build();
		}
		String body = JsonFormat.printer().print(request);

		TiSign ts = new TiSign(host, action, version, service, contentType, httpMethod, secretId, secretKey);
		HashMap<String, String> httpHeaderMap = new HashMap<String, String>();
		try {
			ts.CreateHeaderWithSignature(httpHeaderMap);
		} catch (Exception e) {
			throw new IOException("生成签名错误: " + e.toString());
		}

		String response = com.mediaassetsdk.HttpClientUtil.doPost(httpHeaderMap, this.endPoint + "/gateway", body);
		JsonObject json = (JsonObject) new JsonParser().parse(response);
		JsonFormat.parser().ignoringUnknownFields().merge(json.get("Response").toString(), rsp);
		return rsp.build();
	}

	public com.mediaassetsdk.RemoveMediasResponse removeMedias(com.mediaassetsdk.RemoveMediasRequest request)
			throws HttpException, IOException {
		String action = "RemoveMedias";
		String service = "app-cdn4aowk";
		String version = "2021-02-26";
		String contentType = "application/json";
		String httpMethod = "POST";
		String secretId = this.secretID;
		String secretKey = this.secretKey;
		request = request.toBuilder().setAction(action).build();
		if (!request.hasTIBusinessID()) {
			request = request.toBuilder().setTIBusinessID(this.tiBusinessID).build();
		}
		if (!request.hasTIProjectID()) {
			request = request.toBuilder().setTIProjectID(this.tiProjectID).build();
		}

		com.mediaassetsdk.RemoveMediasResponse.Builder rsp = com.mediaassetsdk.RemoveMediasResponse.newBuilder();
		if (request.getMediaIDSetCount() == 0) {
			return rsp.setError(makeError("ErrParameterInvalid", "MediaIDSet 参数为空")).build();
		}
		String body = JsonFormat.printer().print(request);
		TiSign ts = new TiSign(host, action, version, service, contentType, httpMethod, secretId, secretKey);
		HashMap<String, String> httpHeaderMap = new HashMap<String, String>();
		try {
			ts.CreateHeaderWithSignature(httpHeaderMap);
		} catch (Exception e) {
			throw new IOException("生成签名错误: " + e.toString());
		}

		String response = com.mediaassetsdk.HttpClientUtil.doPost(httpHeaderMap, this.endPoint + "/gateway", body);
		JsonObject json = (JsonObject) new JsonParser().parse(response);
		JsonFormat.parser().ignoringUnknownFields().merge(json.get("Response").toString(), rsp);
		return rsp.build();
	}

	@SuppressWarnings("resource")
	public int uploadFile(String filename, String name, String type, String tag, String secondTag, String lang,
			int threads) throws IOException, HttpException, com.mediaassetsdk.MediaAssetException, InterruptedException {
		File file = new File(filename);
		if (!file.exists()) {
			throw new IOException(filename + "文件不存在");
		}
		Long filelength = file.length();
		final com.mediaassetsdk.RemoveMediasRequest.Builder removeReq = com.mediaassetsdk.RemoveMediasRequest.newBuilder();
		com.mediaassetsdk.ApplyUploadRequest.Builder applyUploadRequest = com.mediaassetsdk.ApplyUploadRequest.newBuilder();
		applyUploadRequest.setName(name);
		applyUploadRequest.setSize(filelength.toString());
		applyUploadRequest.setMediaMeta(MediaMeta.newBuilder().setMediaType(type).setMediaTag(tag).
				setMediaSecondTag(secondTag).setMediaLang(lang).build());
		final com.mediaassetsdk.ApplyUploadResponse applyUploadRsp = this.applyUpload(applyUploadRequest.build());
		if (applyUploadRsp.hasError()) {
			throw new com.mediaassetsdk.MediaAssetException(
					"ApplyUpload error " + JsonFormat.printer().print(applyUploadRsp));
		}
		ExecutorService exec = Executors.newCachedThreadPool(); // 缓存线程池
		final Semaphore semp = new Semaphore(threads); // 最大并发上传，防止内存溢出
		final String[] exception = new String[1];
		FileInputStream in = new FileInputStream(file);
		if (filelength <= UPLOAD_BLOCK_SIZE) {
			// 不需要分片
			byte[] filecontent = in.readNBytes(filelength.intValue());
			int sleepTime = 50;
			int tryTime = 5;
			String err = "";
			while (tryTime-- > 0) {
				err = "";
				try {
					com.mediaassetsdk.UploadPartResponse rsp = this.putObject(applyUploadRsp.getKey(), applyUploadRsp.getBucket(),
							filecontent);
					if (rsp.hasError()) {
						err = "PutObject error " + JsonFormat.printer().print(rsp);
					} else {
						break;
					}
				} catch (Exception e) {
					err = "PutObject error " + e.toString();
				}
				Thread.sleep(sleepTime);
				sleepTime *= 2;
			}
			if (err != "") {
				try {
					removeMedias(removeReq.addMediaIDSet(applyUploadRsp.getMediaID()).build());
				} catch (HttpException e1) {
				} catch (IOException e1) {
				}
				throw new com.mediaassetsdk.MediaAssetException(err);
			}
		} else {
			int partNumber = 1;
			while (exception[0] == null) {
				byte[] filecontent = in.readNBytes(UPLOAD_BLOCK_SIZE);
				if (filecontent.length == 0) {
					in.close();
					break;
				}
				semp.acquire();
				final com.mediaassetsdk.UploadPartRequest.Builder uploadReq = com.mediaassetsdk.UploadPartRequest.newBuilder();
				uploadReq.setBucket(applyUploadRsp.getBucket());
				uploadReq.setKey(applyUploadRsp.getKey());
				uploadReq.setUploadID(applyUploadRsp.getUploadId());
				uploadReq.setPartNUmber(partNumber);
				partNumber++;
				uploadReq.setBuffer(com.google.protobuf.ByteString.copyFrom(filecontent));
				Runnable run = new Runnable() {
					public void run() {
						int maxTry = 5;
						int sleepTime = 50;
						while (maxTry-- > 0) {
							try {
								com.mediaassetsdk.UploadPartResponse partRsp = uploadPart(uploadReq.build());
								if (partRsp.hasError()) {
									if (maxTry == 0) {
										removeMedias(removeReq.addMediaIDSet(applyUploadRsp.getMediaID()).build()); // 删除上传的视频
										// 上传错误抛出异常
										exception[0] = "UploadPart error " + JsonFormat.printer().print(partRsp);
									}
								} else {
									break;
								}
							} catch (Exception e) {
								if (maxTry == 0) {
									try {
										removeMedias(removeReq.addMediaIDSet(applyUploadRsp.getMediaID()).build());
									} catch (HttpException e1) {
									} catch (IOException e1) {
									}
									exception[0] = "UploadPart error " + e.toString();
								}
							}
							try {
								Thread.sleep(sleepTime);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							sleepTime *= 2;
						}
						semp.release();
					};
				};
				exec.execute(run);
			}
			for (int i = 0; i < threads; i++) {
				semp.acquire();
			}
			if (exception[0] != null) {
				throw new com.mediaassetsdk.MediaAssetException(exception[0]);
			}
		}

		com.mediaassetsdk.CommitUploadRequest.Builder commitReq = com.mediaassetsdk.CommitUploadRequest.newBuilder();
		commitReq.setBucket(applyUploadRsp.getBucket());
		commitReq.setKey(applyUploadRsp.getKey());
		commitReq.setUploadId(applyUploadRsp.getUploadId());
		commitReq.setMediaID(applyUploadRsp.getMediaID());
		try {
			com.mediaassetsdk.CommitUploadResponse commitRsp = this.commitUpload(commitReq.build());
			if (commitRsp.hasError()) {
				this.removeMedias(removeReq.addMediaIDSet(applyUploadRsp.getMediaID()).build()); // 删除上传的视频
				throw new com.mediaassetsdk.MediaAssetException("CommitUpload error " + JsonFormat.printer().print(commitRsp));
			}
		} catch (HttpException e) {
			this.removeMedias(removeReq.addMediaIDSet(applyUploadRsp.getMediaID()).build()); // 删除上传的视频
			throw e;
		} catch (IOException e) {
			this.removeMedias(removeReq.addMediaIDSet(applyUploadRsp.getMediaID()).build()); // 删除上传的视频
			throw e;
		}

		return applyUploadRsp.getMediaID();

	}

	public int uploadBuf(byte[] filebuf, String name, String type, String tag, String secondTag, String lang, int threads)
			throws IOException, HttpException, com.mediaassetsdk.MediaAssetException, InterruptedException {
		final com.mediaassetsdk.RemoveMediasRequest.Builder removeReq = com.mediaassetsdk.RemoveMediasRequest.newBuilder();
		com.mediaassetsdk.ApplyUploadRequest.Builder applyUploadRequest = com.mediaassetsdk.ApplyUploadRequest.newBuilder();
		applyUploadRequest.setName(name);
		applyUploadRequest.setSize(String.valueOf(filebuf.length));
		applyUploadRequest.setMediaMeta(MediaMeta.newBuilder().setMediaType(type).setMediaTag(tag).
				setMediaSecondTag(secondTag).setMediaLang(lang).build());
		final com.mediaassetsdk.ApplyUploadResponse applyUploadRsp = this.applyUpload(applyUploadRequest.build());
		if (applyUploadRsp.hasError()) {
			throw new com.mediaassetsdk.MediaAssetException(
					"ApplyUpload error " + JsonFormat.printer().print(applyUploadRsp));
		}
		ExecutorService exec = Executors.newCachedThreadPool(); // 缓存线程池
		final Semaphore semp = new Semaphore(threads); // 最大并发上传，防止内存溢出
		final String[] exception = new String[1];
		int partNumber = 1;
		if (filebuf.length <= UPLOAD_BLOCK_SIZE) {
			// 不需要分片
			int sleepTime = 50;
			int tryTime = 5;
			String err = "";
			while (tryTime-- > 0) {
				err = "";
				try {
					com.mediaassetsdk.UploadPartResponse rsp = this.putObject(applyUploadRsp.getKey(), applyUploadRsp.getBucket(),
							filebuf);
					if (rsp.hasError()) {
						err = "PutObject error " + JsonFormat.printer().print(rsp);
					} else {
						break;
					}
				} catch (Exception e) {
					err = "PutObject error " + e.toString();
				}
				Thread.sleep(sleepTime);
				sleepTime *= 2;
			}
			if (err != "") {
				try {
					removeMedias(removeReq.addMediaIDSet(applyUploadRsp.getMediaID()).build());
				} catch (HttpException e1) {
				} catch (IOException e1) {
				}
				throw new com.mediaassetsdk.MediaAssetException(err);
			}
		} else {
			for (int i = 0; i < filebuf.length; i += UPLOAD_BLOCK_SIZE) {
				if (exception[0] != null) {
					break;
				}
				int end = Math.min(i + UPLOAD_BLOCK_SIZE, filebuf.length);
				semp.acquire();
				final com.mediaassetsdk.UploadPartRequest.Builder uploadReq = com.mediaassetsdk.UploadPartRequest.newBuilder();
				uploadReq.setBucket(applyUploadRsp.getBucket());
				uploadReq.setKey(applyUploadRsp.getKey());
				uploadReq.setUploadID(applyUploadRsp.getUploadId());
				uploadReq.setPartNUmber(partNumber);
				partNumber++;
				uploadReq.setBuffer(com.google.protobuf.ByteString.copyFrom(filebuf, i, end - i));
				Runnable run = new Runnable() {
					public void run() {
						int maxTry = 5;
						int sleepTime = 50;
						while (maxTry-- > 0) {
							try {
								com.mediaassetsdk.UploadPartResponse partRsp = uploadPart(uploadReq.build());
								if (partRsp.hasError()) {
									if (maxTry == 0) {
										removeMedias(removeReq.addMediaIDSet(applyUploadRsp.getMediaID()).build()); // 删除上传的视频
										// 上传错误抛出异常
										exception[0] = "UploadPart error " + JsonFormat.printer().print(partRsp);
									}
								} else {
									break;
								}
							} catch (Exception e) {
								if (maxTry == 0) {
									try {
										removeMedias(removeReq.addMediaIDSet(applyUploadRsp.getMediaID()).build());
									} catch (HttpException e1) {
									} catch (IOException e1) {
									}
									exception[0] = "UploadPart error " + e.toString();
								}
							}
						}
						semp.release();
						try {
							Thread.sleep(sleepTime);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						sleepTime *= 2;
					};
				};
				exec.execute(run);
			}
			for (int i = 0; i < threads; i++) {
				semp.acquire();
			}
			if (exception[0] != null) {
				throw new com.mediaassetsdk.MediaAssetException(exception[0]);
			}
		}

		com.mediaassetsdk.CommitUploadRequest.Builder commitReq = com.mediaassetsdk.CommitUploadRequest.newBuilder();
		commitReq.setBucket(applyUploadRsp.getBucket());
		commitReq.setKey(applyUploadRsp.getKey());
		commitReq.setUploadId(applyUploadRsp.getUploadId());
		commitReq.setMediaID(applyUploadRsp.getMediaID());
		try {
			com.mediaassetsdk.CommitUploadResponse commitRsp = this.commitUpload(commitReq.build());
			if (commitRsp.hasError()) {
				this.removeMedias(removeReq.addMediaIDSet(applyUploadRsp.getMediaID()).build()); // 删除上传的视频
				throw new com.mediaassetsdk.MediaAssetException("CommitUpload error " + JsonFormat.printer().print(commitRsp));
			}
		} catch (HttpException e) {
			this.removeMedias(removeReq.addMediaIDSet(applyUploadRsp.getMediaID()).build()); // 删除上传的视频
			throw e;
		} catch (IOException e) {
			this.removeMedias(removeReq.addMediaIDSet(applyUploadRsp.getMediaID()).build()); // 删除上传的视频
			throw e;
		}

		return applyUploadRsp.getMediaID();

	}

	public byte[] downLoadToBuf(String url) throws IOException {
		String action = "DownloadFile";
		String service = "app-cdn4aowk";
		String version = "2021-02-26";
		String contentType = "application/octet-stream";
		String httpMethod = "GET";
		String secretId = this.secretID;
		String secretKey = this.secretKey;
		TiSign ts = new TiSign(host, action, version, service, contentType, httpMethod, secretId, secretKey);
		HashMap<String, String> httpHeaderMap = new HashMap<String, String>();
		try {
			ts.CreateHeaderWithSignature(httpHeaderMap);
		} catch (Exception e) {
			throw new IOException("生成签名错误: " + e.toString());
		}
		return com.mediaassetsdk.HttpClientUtil.doGet(httpHeaderMap, this.endPoint + url).getResponseBody();
	}

	@SuppressWarnings("deprecation")
	public File downLoadToFile(String url, String dirName, String fileName) throws IOException {
		File dir = new File(dirName);
		if (!dir.exists()) {
			dir.mkdirs();
		}
		String action = "DownloadFile";
		String service = "app-cdn4aowk";
		String version = "2021-02-26";
		String contentType = "application/octet-stream";
		String httpMethod = "GET";
		String secretId = this.secretID;
		String secretKey = this.secretKey;
		TiSign ts = new TiSign(host, action, version, service, contentType, httpMethod, secretId, secretKey);
		HashMap<String, String> httpHeaderMap = new HashMap<String, String>();
		try {
			ts.CreateHeaderWithSignature(httpHeaderMap);
		} catch (Exception e) {
			throw new IOException("生成签名错误: " + e.toString());
		}
		CloseableHttpClient httpclient = HttpClients.custom().setRedirectStrategy(new LaxRedirectStrategy()).build();
		try {
			HttpGet httpget = new HttpGet(this.endPoint + url);
			// 设置 header
			Iterator<HashMap.Entry<String, String>> iterable = httpHeaderMap.entrySet().iterator();
			while (iterable.hasNext()) {
				HashMap.Entry<String, String> entry = iterable.next();
				httpget.setHeader(entry.getKey(), entry.getValue());
			}
			File downloaded = httpclient.execute(httpget, new FileDownloadResponseHandler(new File(dirName, fileName)));
			return downloaded;
		} catch (Exception e) {
			throw new IllegalStateException(e);
		} finally {
			IOUtils.closeQuietly(httpclient);
		}
	}

	public static String calcMD5(byte[] buffer) throws RuntimeException {
		byte[] secretBytes = null;
		try {
			secretBytes = MessageDigest.getInstance("md5").digest(buffer);
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException("没有这个md5算法");
		}
		String md5code = new BigInteger(1, secretBytes).toString(16);
		int l = md5code.length();
		for (int i = 0; i < 32 - l; i++) {
			md5code = "0" + md5code;
		}
		return md5code;
	}

	public static class FileDownloadResponseHandler implements ResponseHandler<File> {

		private final File target;

		public FileDownloadResponseHandler(File target) {
			this.target = target;
		}

		@Override
		public File handleResponse(HttpResponse response) throws ClientProtocolException, IOException {
			InputStream source = response.getEntity().getContent();
			FileUtils.copyInputStreamToFile(source, this.target);
			return this.target;
		}

	}
}