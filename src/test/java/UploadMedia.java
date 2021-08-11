import java.io.IOException;

import org.apache.commons.httpclient.HttpException;
import com.google.protobuf.util.JsonFormat;

import com.mediaassetsdk.*;

public class UploadMedia {
	public static void main(String []args){
		String host = "119.91.67.143";
		String secretID = "16111e9bb6ca4708abb0b4db2f";
		String secretKey = "fd46f3cb84c141ffa52dd9c8d6";
		MediaAssetClient client = new MediaAssetClient(host, "", secretID, secretKey);
		ApplyUploadRequest.Builder builder = ApplyUploadRequest.newBuilder();
		builder.setName("测试");
		builder.setSize("123");
		builder.setTIBusinessID(1);
		builder.setTIProjectID(1);
		ApplyUploadResponse rsp = ApplyUploadResponse.newBuilder().build();
		// builder.setMediaMeta(MediaMeta.newBuilder().setMediaType("视频").setMediaTag("新闻").build());
		try {
			rsp = client.applyUpload(builder.build());
			System.out.print(JsonFormat.printer().print(rsp));
		} catch (HttpException e) {
			System.out.println(e.toString());
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}
	}
}