// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MediaAsset.proto

package com.mediaassetsdk;

public interface CategoryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Category)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string Type = 1;</code>
   * @return Whether the type field is set.
   */
  boolean hasType();
  /**
   * <code>optional string Type = 1;</code>
   * @return The type.
   */
  java.lang.String getType();
  /**
   * <code>optional string Type = 1;</code>
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <code>repeated string TagSet = 2;</code>
   * @return A list containing the tagSet.
   */
  java.util.List<java.lang.String>
      getTagSetList();
  /**
   * <code>repeated string TagSet = 2;</code>
   * @return The count of tagSet.
   */
  int getTagSetCount();
  /**
   * <code>repeated string TagSet = 2;</code>
   * @param index The index of the element to return.
   * @return The tagSet at the given index.
   */
  java.lang.String getTagSet(int index);
  /**
   * <code>repeated string TagSet = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the tagSet at the given index.
   */
  com.google.protobuf.ByteString
      getTagSetBytes(int index);
}