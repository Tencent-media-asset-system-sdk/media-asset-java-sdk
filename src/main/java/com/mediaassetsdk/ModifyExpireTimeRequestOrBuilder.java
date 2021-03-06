// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MediaAsset.proto

package com.mediaassetsdk;

public interface ModifyExpireTimeRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ModifyExpireTimeRequest)
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
   * <code>optional uint32 TIBusinessID = 2;</code>
   * @return Whether the tIBusinessID field is set.
   */
  boolean hasTIBusinessID();
  /**
   * <code>optional uint32 TIBusinessID = 2;</code>
   * @return The tIBusinessID.
   */
  int getTIBusinessID();

  /**
   * <code>optional uint32 TIProjectID = 3;</code>
   * @return Whether the tIProjectID field is set.
   */
  boolean hasTIProjectID();
  /**
   * <code>optional uint32 TIProjectID = 3;</code>
   * @return The tIProjectID.
   */
  int getTIProjectID();

  /**
   * <code>optional uint32 MediaID = 4;</code>
   * @return Whether the mediaID field is set.
   */
  boolean hasMediaID();
  /**
   * <code>optional uint32 MediaID = 4;</code>
   * @return The mediaID.
   */
  int getMediaID();

  /**
   * <code>optional int32 Days = 5;</code>
   * @return Whether the days field is set.
   */
  boolean hasDays();
  /**
   * <code>optional int32 Days = 5;</code>
   * @return The days.
   */
  int getDays();
}
