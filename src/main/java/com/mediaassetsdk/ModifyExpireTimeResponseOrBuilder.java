// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MediaAsset.proto

package com.mediaassetsdk;

public interface ModifyExpireTimeResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ModifyExpireTimeResponse)
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
}
