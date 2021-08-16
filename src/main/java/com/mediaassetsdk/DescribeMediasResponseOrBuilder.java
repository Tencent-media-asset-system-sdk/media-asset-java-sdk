// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MediaAsset.proto

package com.mediaassetsdk;

public interface DescribeMediasResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:DescribeMediasResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string RequestID = 1;</code>
   * @return Whether the requestID field is set.
   */
  boolean hasRequestID();
  /**
   * <code>optional string RequestID = 1;</code>
   * @return The requestID.
   */
  java.lang.String getRequestID();
  /**
   * <code>optional string RequestID = 1;</code>
   * @return The bytes for requestID.
   */
  com.google.protobuf.ByteString
      getRequestIDBytes();

  /**
   * <code>optional .Error Error = 2;</code>
   * @return Whether the error field is set.
   */
  boolean hasError();
  /**
   * <code>optional .Error Error = 2;</code>
   * @return The error.
   */
  com.mediaassetsdk.Error getError();
  /**
   * <code>optional .Error Error = 2;</code>
   */
  com.mediaassetsdk.ErrorOrBuilder getErrorOrBuilder();

  /**
   * <code>repeated .MediaInfo MediaInfoSet = 3;</code>
   */
  java.util.List<com.mediaassetsdk.MediaInfo> 
      getMediaInfoSetList();
  /**
   * <code>repeated .MediaInfo MediaInfoSet = 3;</code>
   */
  com.mediaassetsdk.MediaInfo getMediaInfoSet(int index);
  /**
   * <code>repeated .MediaInfo MediaInfoSet = 3;</code>
   */
  int getMediaInfoSetCount();
  /**
   * <code>repeated .MediaInfo MediaInfoSet = 3;</code>
   */
  java.util.List<? extends com.mediaassetsdk.MediaInfoOrBuilder> 
      getMediaInfoSetOrBuilderList();
  /**
   * <code>repeated .MediaInfo MediaInfoSet = 3;</code>
   */
  com.mediaassetsdk.MediaInfoOrBuilder getMediaInfoSetOrBuilder(
      int index);

  /**
   * <code>optional int32 TotalCount = 4;</code>
   * @return Whether the totalCount field is set.
   */
  boolean hasTotalCount();
  /**
   * <code>optional int32 TotalCount = 4;</code>
   * @return The totalCount.
   */
  int getTotalCount();
}