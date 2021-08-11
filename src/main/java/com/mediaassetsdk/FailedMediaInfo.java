// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MediaAsset.proto

package com.mediaassetsdk;

/**
 * Protobuf type {@code FailedMediaInfo}
 */
public final class FailedMediaInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:FailedMediaInfo)
    FailedMediaInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FailedMediaInfo.newBuilder() to construct.
  private FailedMediaInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FailedMediaInfo() {
    failedReason_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FailedMediaInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FailedMediaInfo(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {
            bitField0_ |= 0x00000001;
            mediaID_ = input.readUInt64();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            bitField0_ |= 0x00000002;
            failedReason_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.mediaassetsdk.MediaAsset.internal_static_FailedMediaInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.mediaassetsdk.MediaAsset.internal_static_FailedMediaInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.mediaassetsdk.FailedMediaInfo.class, com.mediaassetsdk.FailedMediaInfo.Builder.class);
  }

  private int bitField0_;
  public static final int MEDIAID_FIELD_NUMBER = 1;
  private long mediaID_;
  /**
   * <code>optional uint64 MediaID = 1;</code>
   * @return Whether the mediaID field is set.
   */
  @java.lang.Override
  public boolean hasMediaID() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional uint64 MediaID = 1;</code>
   * @return The mediaID.
   */
  @java.lang.Override
  public long getMediaID() {
    return mediaID_;
  }

  public static final int FAILEDREASON_FIELD_NUMBER = 2;
  private volatile java.lang.Object failedReason_;
  /**
   * <code>optional string FailedReason = 2;</code>
   * @return Whether the failedReason field is set.
   */
  @java.lang.Override
  public boolean hasFailedReason() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional string FailedReason = 2;</code>
   * @return The failedReason.
   */
  @java.lang.Override
  public java.lang.String getFailedReason() {
    java.lang.Object ref = failedReason_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      failedReason_ = s;
      return s;
    }
  }
  /**
   * <code>optional string FailedReason = 2;</code>
   * @return The bytes for failedReason.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFailedReasonBytes() {
    java.lang.Object ref = failedReason_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      failedReason_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeUInt64(1, mediaID_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, failedReason_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, mediaID_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, failedReason_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.mediaassetsdk.FailedMediaInfo)) {
      return super.equals(obj);
    }
    com.mediaassetsdk.FailedMediaInfo other = (com.mediaassetsdk.FailedMediaInfo) obj;

    if (hasMediaID() != other.hasMediaID()) return false;
    if (hasMediaID()) {
      if (getMediaID()
          != other.getMediaID()) return false;
    }
    if (hasFailedReason() != other.hasFailedReason()) return false;
    if (hasFailedReason()) {
      if (!getFailedReason()
          .equals(other.getFailedReason())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasMediaID()) {
      hash = (37 * hash) + MEDIAID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getMediaID());
    }
    if (hasFailedReason()) {
      hash = (37 * hash) + FAILEDREASON_FIELD_NUMBER;
      hash = (53 * hash) + getFailedReason().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.mediaassetsdk.FailedMediaInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.mediaassetsdk.FailedMediaInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.mediaassetsdk.FailedMediaInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.mediaassetsdk.FailedMediaInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.mediaassetsdk.FailedMediaInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.mediaassetsdk.FailedMediaInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.mediaassetsdk.FailedMediaInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.mediaassetsdk.FailedMediaInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.mediaassetsdk.FailedMediaInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.mediaassetsdk.FailedMediaInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.mediaassetsdk.FailedMediaInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.mediaassetsdk.FailedMediaInfo parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.mediaassetsdk.FailedMediaInfo prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code FailedMediaInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:FailedMediaInfo)
      com.mediaassetsdk.FailedMediaInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.mediaassetsdk.MediaAsset.internal_static_FailedMediaInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.mediaassetsdk.MediaAsset.internal_static_FailedMediaInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.mediaassetsdk.FailedMediaInfo.class, com.mediaassetsdk.FailedMediaInfo.Builder.class);
    }

    // Construct using com.mediaassetsdk.FailedMediaInfo.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      mediaID_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000001);
      failedReason_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.mediaassetsdk.MediaAsset.internal_static_FailedMediaInfo_descriptor;
    }

    @java.lang.Override
    public com.mediaassetsdk.FailedMediaInfo getDefaultInstanceForType() {
      return com.mediaassetsdk.FailedMediaInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.mediaassetsdk.FailedMediaInfo build() {
      com.mediaassetsdk.FailedMediaInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.mediaassetsdk.FailedMediaInfo buildPartial() {
      com.mediaassetsdk.FailedMediaInfo result = new com.mediaassetsdk.FailedMediaInfo(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.mediaID_ = mediaID_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.failedReason_ = failedReason_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.mediaassetsdk.FailedMediaInfo) {
        return mergeFrom((com.mediaassetsdk.FailedMediaInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.mediaassetsdk.FailedMediaInfo other) {
      if (other == com.mediaassetsdk.FailedMediaInfo.getDefaultInstance()) return this;
      if (other.hasMediaID()) {
        setMediaID(other.getMediaID());
      }
      if (other.hasFailedReason()) {
        bitField0_ |= 0x00000002;
        failedReason_ = other.failedReason_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.mediaassetsdk.FailedMediaInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.mediaassetsdk.FailedMediaInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long mediaID_ ;
    /**
     * <code>optional uint64 MediaID = 1;</code>
     * @return Whether the mediaID field is set.
     */
    @java.lang.Override
    public boolean hasMediaID() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional uint64 MediaID = 1;</code>
     * @return The mediaID.
     */
    @java.lang.Override
    public long getMediaID() {
      return mediaID_;
    }
    /**
     * <code>optional uint64 MediaID = 1;</code>
     * @param value The mediaID to set.
     * @return This builder for chaining.
     */
    public Builder setMediaID(long value) {
      bitField0_ |= 0x00000001;
      mediaID_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint64 MediaID = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMediaID() {
      bitField0_ = (bitField0_ & ~0x00000001);
      mediaID_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object failedReason_ = "";
    /**
     * <code>optional string FailedReason = 2;</code>
     * @return Whether the failedReason field is set.
     */
    public boolean hasFailedReason() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional string FailedReason = 2;</code>
     * @return The failedReason.
     */
    public java.lang.String getFailedReason() {
      java.lang.Object ref = failedReason_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        failedReason_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string FailedReason = 2;</code>
     * @return The bytes for failedReason.
     */
    public com.google.protobuf.ByteString
        getFailedReasonBytes() {
      java.lang.Object ref = failedReason_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        failedReason_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string FailedReason = 2;</code>
     * @param value The failedReason to set.
     * @return This builder for chaining.
     */
    public Builder setFailedReason(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      failedReason_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string FailedReason = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearFailedReason() {
      bitField0_ = (bitField0_ & ~0x00000002);
      failedReason_ = getDefaultInstance().getFailedReason();
      onChanged();
      return this;
    }
    /**
     * <code>optional string FailedReason = 2;</code>
     * @param value The bytes for failedReason to set.
     * @return This builder for chaining.
     */
    public Builder setFailedReasonBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000002;
      failedReason_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:FailedMediaInfo)
  }

  // @@protoc_insertion_point(class_scope:FailedMediaInfo)
  private static final com.mediaassetsdk.FailedMediaInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.mediaassetsdk.FailedMediaInfo();
  }

  public static com.mediaassetsdk.FailedMediaInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FailedMediaInfo>
      PARSER = new com.google.protobuf.AbstractParser<FailedMediaInfo>() {
    @java.lang.Override
    public FailedMediaInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FailedMediaInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FailedMediaInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FailedMediaInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.mediaassetsdk.FailedMediaInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

