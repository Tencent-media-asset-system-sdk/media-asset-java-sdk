// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MediaAsset.proto

package com.mediaassetsdk;

public interface ApplyUploadRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ApplyUploadRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string Action = 1;</code>
   * @return Whether the action field is set.
   */
  boolean hasAction();
  /**
   * <code>optional string Action = 1;</code>
   * @return The action.
   */
  java.lang.String getAction();
  /**
   * <code>optional string Action = 1;</code>
   * @return The bytes for action.
   */
  com.google.protobuf.ByteString
      getActionBytes();

  /**
   * <code>optional int32 TIBusinessID = 2;</code>
   * @return Whether the tIBusinessID field is set.
   */
  boolean hasTIBusinessID();
  /**
   * <code>optional int32 TIBusinessID = 2;</code>
   * @return The tIBusinessID.
   */
  int getTIBusinessID();

  /**
   * <code>optional int32 TIProjectID = 3;</code>
   * @return Whether the tIProjectID field is set.
   */
  boolean hasTIProjectID();
  /**
   * <code>optional int32 TIProjectID = 3;</code>
   * @return The tIProjectID.
   */
  int getTIProjectID();

  /**
   * <code>optional string Name = 4;</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <code>optional string Name = 4;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>optional string Name = 4;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>optional .MediaMeta MediaMeta = 5;</code>
   * @return Whether the mediaMeta field is set.
   */
  boolean hasMediaMeta();
  /**
   * <code>optional .MediaMeta MediaMeta = 5;</code>
   * @return The mediaMeta.
   */
  com.mediaassetsdk.MediaMeta getMediaMeta();
  /**
   * <code>optional .MediaMeta MediaMeta = 5;</code>
   */
  com.mediaassetsdk.MediaMetaOrBuilder getMediaMetaOrBuilder();

  /**
   * <code>optional string Size = 6;</code>
   * @return Whether the size field is set.
   */
  boolean hasSize();
  /**
   * <code>optional string Size = 6;</code>
   * @return The size.
   */
  java.lang.String getSize();
  /**
   * <code>optional string Size = 6;</code>
   * @return The bytes for size.
   */
  com.google.protobuf.ByteString
      getSizeBytes();

  /**
   * <code>optional string ContentMD5 = 7;</code>
   * @return Whether the contentMD5 field is set.
   */
  boolean hasContentMD5();
  /**
   * <code>optional string ContentMD5 = 7;</code>
   * @return The contentMD5.
   */
  java.lang.String getContentMD5();
  /**
   * <code>optional string ContentMD5 = 7;</code>
   * @return The bytes for contentMD5.
   */
  com.google.protobuf.ByteString
      getContentMD5Bytes();

  /**
   * <code>optional bool Inner = 8;</code>
   * @return Whether the inner field is set.
   */
  boolean hasInner();
  /**
   * <code>optional bool Inner = 8;</code>
   * @return The inner.
   */
  boolean getInner();
}