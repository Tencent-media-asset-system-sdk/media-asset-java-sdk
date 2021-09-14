# media-asset-java-sdk

此SDK用于在java中方便的向媒体管理系统上传媒体资源。使用此SDK之前请先参考相关的API接口文档。


## 构建客户端

所有的方法都封装在 `com.mediaassetsdk.MediaAssetClient`。构造一个`MediaAssetClient`的方法如下

```java
import com.mediaassetsdk.*;

String host = "106.52.71.124"; // 调用服务的的 host
String port = ""; // 调用服务的的 port, 80 填空
String secretID = "secretID"; // secretID
String secretKey = "secretKey"; // secretKey
int businessID = 1; // 业务ID
int projectID = 1; // 项目ID
MediaAssetClient client = new MediaAssetClient(host, port, secretID, secretKey, businessID, projectID);
```

## 获取支持媒体列表
```java
DescribeCategoriesResponse categoriesRsp = client.describeCategories(
  DescribeCategoriesRequest.newBuilder()
  .setTIBusinessID(businessID) // 如果不配置，默认会用 client 的参数，后面接口同理
  .setTIProjectID(projectID) // 如果不配置，默认会用 client 的参数，后面接口同理
  .build());
```

## 上传媒体
```java
String file = "data/test.mp4"; // 文件路径
String name = "test视频"; // 媒体名称
String type = "视频"; // 媒体类型, 可选 视频，音频，图片
String tag = "新闻"; // 媒体标签, 可选 新闻, 综艺, 电影, 电视剧, 体育, 专题, 互联网资讯
String secondTag = ""; // 二级标签，如果一级标签为综艺可选 "晚会" 和 "其他"，其他为空
String lang = "普通话"; // 可选 普通话, 粤语
int threads = 4; // 并发上传的线程数

// 上传文件到媒体管理系统
int mediaID = client.uploadFile(file, name, type, tag, secondTag, lang, threads);

// 上传内存到媒体管理系统
File f = new File(file);
InputStream in = new FileInputStream(f);
byte[] filebuf = in.readAllBytes();
in.close();
int mediaID = client.uploadBuf(file, name, type, tag, secondTag, lang, threads);
```

## 获取指定媒体详细信息
```java
DescribeMediaDetailsResponse detailsRsp = client.describeMediaDetails(
  DescribeMediaDetailsRequest.newBuilder().
  addMediaIDSet(mediaID) // 增加媒体列表
  .build());
```

## 下载媒体
```java
// 下载媒体到文件
String dir = "./data"; // 下载到的目录
String fileName = "download.mp4"; // 下载的文件名
client.downLoadToFile(detailsRsp.getMediaInfoSet(0).getDownLoadURL(), dir, fileName);

// 下载媒体到内存
byte[] filebuf = client.downLoadToBuf(detailsRsp.getMediaInfoSet(0).getDownLoadURL());
```

## 获取上传媒体列表
```java
DescribeMediasResponse mediaLists = client.describeMedias(
  DescribeMediasRequest.newBuilder()
  .setPageNumber(1) // 分页数
  .setPageSize(20) // 分页大小
  .setFilterBy(com.mediaassetsdk.FilterBy.newBuilder().setMediaNameOrID("测试")) // 过滤参数
  .build());
```

## 删除媒体
```java
RemoveMediasResponse deleteRsp = client.removeMedias(
  RemoveMediasRequest.newBuilder()
  .addMediaIDSet(mediaID)
  .build());
```

## 修改媒体类型
```java
ModifyMediaResponse modifyRsp = client.modifyMedia(
  ModifyMediaRequest.newBuilder()
  .setMediaID(mediaID)
  .setMediaTag("综艺") // 修改的一级标签
  .setMediaSecondTag("晚会") // 修改的二级标签
  .build());
```
## 修改媒体过期时间
```java
ModifyExpireTimeResponse expireRsp = client.modifyExpireTime(
  ModifyExpireTimeRequest.newBuilder()
  .setMediaID(mediaID)
  .setDays(1)
  .build());
```

## 批量创建媒体
```java
com.mediaassetsdk.UploadMedia media = com.mediaassetsdk.UploadMedia.newBuilder().setName("Java URL上传")
  .setMediaURL("https://ai-media-1300074211.cos.ap-shanghai.myqcloud.com/ai-media/2021-04-06/8b46057e-1923-4444-b0fb-91b094bf7530_trans.mp4")
  .setMediaMeta(MediaMeta.newBuilder().setMediaType("视频").setMediaTag("新闻").build()).build();
com.mediaassetsdk.CreateMediasResponse rsp = client.createMedias(
com.mediaassetsdk.CreateMediasRequest.newBuilder().addUploadMediaSet(media).build());
```
