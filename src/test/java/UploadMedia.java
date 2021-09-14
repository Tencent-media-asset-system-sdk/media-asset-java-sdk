import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.BasicParser;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.ParseException;
import org.apache.commons.cli.CommandLine;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.httpclient.HttpException;
import com.google.protobuf.util.JsonFormat;

import com.mediaassetsdk.*;

public class UploadMedia {
	private static void printHelp(String[] args, Options options) {
		String helpStr = "[Usgae] UploadMedia\n";
		for (Object object : options.getOptions()) {
			Option opt = (Option) object;
			helpStr += "\t-" + opt.getOpt() + "\t--" + opt.getLongOpt() + "\t\t" + opt.getDescription() + "\n";
		}
		System.out.print(helpStr);
	}

	public static void main(String[] args) {
		// Create a Parser
		CommandLineParser parser = new BasicParser();
		Options options = new Options();
		options.addOption("h", "help", false, "Print this usage information");
		options.addOption("H", "host", true, "remote service host");
		options.addOption("P", "port", true, "remote service port");
		options.addOption("i", "secret_id", true, "secret_id");
		options.addOption("k", "secret_key", true, "secret_key");
		options.addOption("p", "project_id", true, "ti project_id, default 1");
		options.addOption("b", "business_id", true, "ti business_id, default 1");
		options.addOption("f", "file", true, "the path for file to be upload");
		options.addOption("n", "name", true, "media name");
		options.addOption("t", "type", true, "media type [视频, 图片, 音频], default 视频");
		options.addOption("g", "tag", true, "media tag [新闻, 综艺, 电影, 电视剧, 体育, 专题, 互联网咨询], default 新闻");
		options.addOption("s", "second_tag", true, "media second_tag [晚会, 其他]");
		options.addOption("l", "lang", true, "media lang [普通话, 粤语], defalue 普通话");
		options.addOption("j", "threads", true, "upload threads number, defalue 1");
		// Parse the program arguments
		String host = "", port = "", secretID = "", secretKey = "", file = "";
		String name = "", type = "视频", tag = "新闻", secondTag = "", lang = "普通话";
		int projectID = 1, businessID = 1, threads = 1;
		try {
			CommandLine commandLine = parser.parse(options, args);
			if (commandLine.hasOption('h')) {
				printHelp(args, options);
				System.exit(0);
			}
			if (commandLine.hasOption('H')) {
				host = commandLine.getOptionValue('H');

			}
			if (commandLine.hasOption('P')) {
				port = commandLine.getOptionValue('P');
			}
			if (commandLine.hasOption('i')) {
				secretID = commandLine.getOptionValue('i');
			}
			if (commandLine.hasOption('k')) {
				secretKey = commandLine.getOptionValue('k');
			}
			if (commandLine.hasOption('j')) {
				String value = commandLine.getOptionValue('j');
				try {
					threads = Integer.parseInt(value);
				} catch (NumberFormatException e) {
					System.out.println("threads 不是整数");
					System.exit(-1);
				}
			}
			if (commandLine.hasOption('p')) {
				String value = commandLine.getOptionValue('p');
				try {
					projectID = Integer.parseInt(value);
				} catch (NumberFormatException e) {
					System.out.println("project_id 不是整数");
					System.exit(-1);
				}
			}
			if (commandLine.hasOption('b')) {
				try {
					businessID = Integer.parseInt(commandLine.getOptionValue('b'));
				} catch (NumberFormatException e) {
					System.out.println("business_id 不是整数");
					System.exit(-1);
				}
			}
			if (commandLine.hasOption('f')) {
				file = commandLine.getOptionValue('f');
			}
			if (commandLine.hasOption('n')) {
				name = commandLine.getOptionValue('n');
			}
			if (commandLine.hasOption('t')) {
				type = commandLine.getOptionValue('t');
			}
			if (commandLine.hasOption('g')) {
				tag = commandLine.getOptionValue('g');
			}
			if (commandLine.hasOption('s')) {
				secondTag = commandLine.getOptionValue('s');
			}
			if (commandLine.hasOption('l')) {
				lang = commandLine.getOptionValue('l');
			}
		} catch (ParseException e) {
			System.out.println("参数解析错误: " + e.toString());
			printHelp(args, options);
			System.exit(-1);
		}
		MediaAssetClient client = new MediaAssetClient(host, "", secretID, secretKey, businessID, projectID);
		try {
			int mediaID = client.uploadFile(file, name, type, tag, secondTag, lang, threads);
			System.out.printf("Upload %s success, mediaID: %d\n", file, mediaID);
			
			com.mediaassetsdk.DescribeMediaDetailsResponse rsp = client
					.describeMediaDetails(com.mediaassetsdk.DescribeMediaDetailsRequest.newBuilder().addMediaIDSet(mediaID)
							.addMediaIDSet(mediaID).build());
			String details = JsonFormat.printer().print(rsp.getMediaInfoSet(0));
			System.out.println("details response: " + details);

//			String categories = JsonFormat.printer().print(
//					client.describeCategories(com.mediaassetsdk.DescribeCategoriesRequest.newBuilder().build()));
//			System.out.println("categories response: " + categories);
//			client.modifyMedia(com.mediaassetsdk.ModifyMediaRequest.newBuilder().setMediaID(mediaID)
//					.setMediaTag("综艺").setMediaSecondTag("晚会").build());
//			client.modifyExpireTime(com.mediaassetsdk.ModifyExpireTimeRequest.newBuilder().setMediaID(mediaID)
//					.setDays(1).build());

//			com.mediaassetsdk.DescribeMediasResponse rsp1 = client.describeMedias(
//					com.mediaassetsdk.DescribeMediasRequest.newBuilder().setPageNumber(1)
//					.setPageSize(20)
//					.setFilterBy(com.mediaassetsdk.FilterBy.newBuilder().setMediaNameOrID(name))
//					.build());
//			String lists = JsonFormat.printer().print(rsp1);
//			System.out.println("lists response: " + lists);
			
//			com.mediaassetsdk.UploadMedia media = com.mediaassetsdk.UploadMedia.newBuilder().setName("Java URL上传")
//					.setMediaURL("https://ai-media-1300074211.cos.ap-shanghai.myqcloud.com/ai-media/2021-04-06/8b46057e-1923-4444-b0fb-91b094bf7530_trans.mp4")
//					.setMediaMeta(MediaMeta.newBuilder().setMediaType("视频").setMediaTag("新闻").build()).build();
//			com.mediaassetsdk.CreateMediasResponse rsp = client.createMedias(
//					com.mediaassetsdk.CreateMediasRequest.newBuilder().addUploadMediaSet(media).build());
//			String medias = JsonFormat.printer().print(rsp);
//			System.out.println("details response: " + medias);
		} catch (HttpException e) {
			System.out.println("UploadFile error: " + e.toString());
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("UploadFile error: " + e.toString());
			e.printStackTrace();
		} catch (MediaAssetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}