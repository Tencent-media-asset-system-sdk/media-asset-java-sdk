package com.mediaassetsdk;

import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.math.BigInteger;

import org.apache.commons.httpclient.HttpException;
import com.google.protobuf.util.JsonFormat;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class MediaAssetClient {
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
				+ "&uploadId=" + request.getUploadID() + "&partNumber= " + request.getPartNUmber() + "&Content-MD5=" + md5sum;
		String url = this.endPoint + "/FileManager/UploadPart?" + canonicalQueryString;
		String response = com.mediaassetsdk.HttpClientUtil.doPut(httpHeaderMap, url, request.getBuffer().toByteArray());
		JsonObject json = (JsonObject) new JsonParser().parse(response);
		JsonFormat.parser().ignoringUnknownFields().merge(json.get("Response").toString(), rsp);
		return rsp.build();
	}

	public com.mediaassetsdk.CommitUploadResponse commitUpload(com.mediaassetsdk.CommitUploadRequest request)
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

	public com.mediaassetsdk.MediaInfo uploadFile(String filename, String name,
			String type, String tag, String secondTag, String lang, int threads)
			throws IOException, MediaAssetException {
		File file = new File(filename);
		if (!file.exists()) {
			throw new IOException(filename + "文件不存在");
		}
		Long filelength = file.length();
    byte[] filecontent = new byte[filelength.intValue()];
      FileInputStream in = new FileInputStream(file); 
      in.read(filecontent); 
      in.close();
		ApplyUploadRequest.Builder applyUploadRequest = ApplyUploadRequest.newBuilder();
		applyUploadRequest.setName(name);
		applyUploadRequest.setSize(filelength.toString());
		applyUploadRequest.setMediaMeta(MediaMeta.newBuilder().setMediaType("视频").setMediaTag("新闻").build());
		ApplyUploadResponse rsp = ApplyUploadResponse.newBuilder().build();
			rsp = applyUpload(applyUploadRequest.build());
		if (rsp.hasError()) {
			throw new com.mediaassetsdk.MediaAssetException(
					"ApplyUpload erroe " + JsonFormat.printer().print(rsp.getError()));
		}
		
		return com.mediaassetsdk.MediaInfo.newBuilder().build();
		
	}


	
	public static String calcMD5(byte[] buffer) throws RuntimeException {
		byte[] secretBytes = null;
		try {
			secretBytes = MessageDigest.getInstance("md5").digest(buffer);
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException("没有这个md5算法");
		}
		String md5code = new BigInteger(1, secretBytes).toString(16);
		for (int i = 0; i < 32 - md5code.length(); i++) {
			md5code = "0" + md5code;
		}
		return md5code;
	}
}