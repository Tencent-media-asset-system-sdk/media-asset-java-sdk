package com.mediaassetsdk;

import java.io.IOException;
import java.util.HashMap;

import org.apache.commons.httpclient.HttpException;
import com.google.protobuf.util.JsonFormat;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.tisign.TiSign;

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

	private void makeEndPoint() {
		this.endPoint = "http://" + this.host;
		if (this.port != "") {
			this.endPoint += ":" + this.port;
		}
		this.endPoint += "/gateway";
	}
	
	public MediaAssetClient(String host, String port, String secretID, String secretKey) {
		super();
		this.host = host;
		this.port = port;
		this.secretID = secretID;
		this.secretKey = secretKey;
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
	
	public com.mediaassetsdk.Error makeError(String code, String message) {
		return com.mediaassetsdk.Error.newBuilder().setCode(code).setMessage(message).build();
	}
	
	public com.mediaassetsdk.ApplyUploadResponse applyUpload(
			com.mediaassetsdk.ApplyUploadRequest request) throws HttpException, IOException {
		String body = JsonFormat.printer().print(request);
		com.mediaassetsdk.ApplyUploadResponse.Builder rsp = com.mediaassetsdk.ApplyUploadResponse.newBuilder();
		System.out.println(body);
    String action = "ApplyUpload";
    String service = "app-cdn4aowk";
    String version = "2021-02-26";
    String contentType = "application/json";
    String httpMethod = "POST";
    String secretId = this.secretID;
    String secretKey = this.secretKey;
    TiSign ts = new TiSign(host, action, version, service, contentType, httpMethod, secretId, secretKey);
    HashMap<String, String> httpHeaderMap = new HashMap<String, String>();
    try {
			ts.CreateHeaderWithSignature(httpHeaderMap);
		} catch (Exception e) {
			throw new IOException("生成签名错误: " + e.toString());
		}
    String response = com.mediaassetsdk.HttpClientUtil.doPost(httpHeaderMap, this.endPoint, body);
    JsonObject json = (JsonObject) new JsonParser().parse(response);
    System.out.println(json.get("Response").toString());
    JsonFormat.parser().ignoringUnknownFields().merge(json.get("Response").toString(), rsp);
    return rsp.build();
	}
}