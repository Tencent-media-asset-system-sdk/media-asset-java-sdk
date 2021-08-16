# media-asset-java-sdk

此SDK用于在java中方便的向媒体管理系统上传媒体字资源。使用此SDK之前请先参考相关的API接口文档。


## 构建客户端

所有的方法都封装在 com.mediaassetsdk.MediaAssetClient。构造一个MediaAssetClient的方法如下
···java
import com.mediaassetsdk.MediaAssetClient;

String host = "106.52.71.124"; // 调用服务的的 host
String port = ""; // 调用服务的的 port, 80 填空
String secretID = "secretID"; // secretID
String secretID = "secretKey"; // secretKey
int businessID = 1; // 业务ID
int projectID = 1; // 项目ID
MediaAssetClient client = new MediaAssetClient(host, port, secretID, secretKey, businessID, projectID);
```

## 获取支持媒体列表

## 上传媒体
```java

```

## 下载媒体

## 获取指定媒体详细信息

## 获取上传媒体列表

## 删除媒体

## 修改媒体类型

## 修改媒体过期时间

