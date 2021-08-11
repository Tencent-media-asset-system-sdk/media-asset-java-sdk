// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MediaAsset.proto

package com.mediaassetsdk;

/**
 * Protobuf type {@code RemoveMediasResponse}
 */
public final class RemoveMediasResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:RemoveMediasResponse)
    RemoveMediasResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RemoveMediasResponse.newBuilder() to construct.
  private RemoveMediasResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RemoveMediasResponse() {
    requestID_ = "";
    failedMediaSet_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RemoveMediasResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RemoveMediasResponse(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();
            bitField0_ |= 0x00000001;
            requestID_ = s;
            break;
          }
          case 18: {
            com.mediaassetsdk.Error.Builder subBuilder = null;
            if (((bitField0_ & 0x00000002) != 0)) {
              subBuilder = error_.toBuilder();
            }
            error_ = input.readMessage(com.mediaassetsdk.Error.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(error_);
              error_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000002;
            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000004) != 0)) {
              failedMediaSet_ = new java.util.ArrayList<com.mediaassetsdk.FailedMediaInfo>();
              mutable_bitField0_ |= 0x00000004;
            }
            failedMediaSet_.add(
                input.readMessage(com.mediaassetsdk.FailedMediaInfo.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000004) != 0)) {
        failedMediaSet_ = java.util.Collections.unmodifiableList(failedMediaSet_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.mediaassetsdk.MediaAsset.internal_static_RemoveMediasResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.mediaassetsdk.MediaAsset.internal_static_RemoveMediasResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.mediaassetsdk.RemoveMediasResponse.class, com.mediaassetsdk.RemoveMediasResponse.Builder.class);
  }

  private int bitField0_;
  public static final int REQUESTID_FIELD_NUMBER = 1;
  private volatile java.lang.Object requestID_;
  /**
   * <code>optional string RequestID = 1;</code>
   * @return Whether the requestID field is set.
   */
  @java.lang.Override
  public boolean hasRequestID() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional string RequestID = 1;</code>
   * @return The requestID.
   */
  @java.lang.Override
  public java.lang.String getRequestID() {
    java.lang.Object ref = requestID_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      requestID_ = s;
      return s;
    }
  }
  /**
   * <code>optional string RequestID = 1;</code>
   * @return The bytes for requestID.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRequestIDBytes() {
    java.lang.Object ref = requestID_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      requestID_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ERROR_FIELD_NUMBER = 2;
  private com.mediaassetsdk.Error error_;
  /**
   * <code>optional .Error Error = 2;</code>
   * @return Whether the error field is set.
   */
  @java.lang.Override
  public boolean hasError() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional .Error Error = 2;</code>
   * @return The error.
   */
  @java.lang.Override
  public com.mediaassetsdk.Error getError() {
    return error_ == null ? com.mediaassetsdk.Error.getDefaultInstance() : error_;
  }
  /**
   * <code>optional .Error Error = 2;</code>
   */
  @java.lang.Override
  public com.mediaassetsdk.ErrorOrBuilder getErrorOrBuilder() {
    return error_ == null ? com.mediaassetsdk.Error.getDefaultInstance() : error_;
  }

  public static final int FAILEDMEDIASET_FIELD_NUMBER = 3;
  private java.util.List<com.mediaassetsdk.FailedMediaInfo> failedMediaSet_;
  /**
   * <code>repeated .FailedMediaInfo FailedMediaSet = 3;</code>
   */
  @java.lang.Override
  public java.util.List<com.mediaassetsdk.FailedMediaInfo> getFailedMediaSetList() {
    return failedMediaSet_;
  }
  /**
   * <code>repeated .FailedMediaInfo FailedMediaSet = 3;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.mediaassetsdk.FailedMediaInfoOrBuilder> 
      getFailedMediaSetOrBuilderList() {
    return failedMediaSet_;
  }
  /**
   * <code>repeated .FailedMediaInfo FailedMediaSet = 3;</code>
   */
  @java.lang.Override
  public int getFailedMediaSetCount() {
    return failedMediaSet_.size();
  }
  /**
   * <code>repeated .FailedMediaInfo FailedMediaSet = 3;</code>
   */
  @java.lang.Override
  public com.mediaassetsdk.FailedMediaInfo getFailedMediaSet(int index) {
    return failedMediaSet_.get(index);
  }
  /**
   * <code>repeated .FailedMediaInfo FailedMediaSet = 3;</code>
   */
  @java.lang.Override
  public com.mediaassetsdk.FailedMediaInfoOrBuilder getFailedMediaSetOrBuilder(
      int index) {
    return failedMediaSet_.get(index);
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, requestID_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getError());
    }
    for (int i = 0; i < failedMediaSet_.size(); i++) {
      output.writeMessage(3, failedMediaSet_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, requestID_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getError());
    }
    for (int i = 0; i < failedMediaSet_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, failedMediaSet_.get(i));
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
    if (!(obj instanceof com.mediaassetsdk.RemoveMediasResponse)) {
      return super.equals(obj);
    }
    com.mediaassetsdk.RemoveMediasResponse other = (com.mediaassetsdk.RemoveMediasResponse) obj;

    if (hasRequestID() != other.hasRequestID()) return false;
    if (hasRequestID()) {
      if (!getRequestID()
          .equals(other.getRequestID())) return false;
    }
    if (hasError() != other.hasError()) return false;
    if (hasError()) {
      if (!getError()
          .equals(other.getError())) return false;
    }
    if (!getFailedMediaSetList()
        .equals(other.getFailedMediaSetList())) return false;
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
    if (hasRequestID()) {
      hash = (37 * hash) + REQUESTID_FIELD_NUMBER;
      hash = (53 * hash) + getRequestID().hashCode();
    }
    if (hasError()) {
      hash = (37 * hash) + ERROR_FIELD_NUMBER;
      hash = (53 * hash) + getError().hashCode();
    }
    if (getFailedMediaSetCount() > 0) {
      hash = (37 * hash) + FAILEDMEDIASET_FIELD_NUMBER;
      hash = (53 * hash) + getFailedMediaSetList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.mediaassetsdk.RemoveMediasResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.mediaassetsdk.RemoveMediasResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.mediaassetsdk.RemoveMediasResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.mediaassetsdk.RemoveMediasResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.mediaassetsdk.RemoveMediasResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.mediaassetsdk.RemoveMediasResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.mediaassetsdk.RemoveMediasResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.mediaassetsdk.RemoveMediasResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.mediaassetsdk.RemoveMediasResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.mediaassetsdk.RemoveMediasResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.mediaassetsdk.RemoveMediasResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.mediaassetsdk.RemoveMediasResponse parseFrom(
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
  public static Builder newBuilder(com.mediaassetsdk.RemoveMediasResponse prototype) {
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
   * Protobuf type {@code RemoveMediasResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:RemoveMediasResponse)
      com.mediaassetsdk.RemoveMediasResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.mediaassetsdk.MediaAsset.internal_static_RemoveMediasResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.mediaassetsdk.MediaAsset.internal_static_RemoveMediasResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.mediaassetsdk.RemoveMediasResponse.class, com.mediaassetsdk.RemoveMediasResponse.Builder.class);
    }

    // Construct using com.mediaassetsdk.RemoveMediasResponse.newBuilder()
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
        getErrorFieldBuilder();
        getFailedMediaSetFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      requestID_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      if (errorBuilder_ == null) {
        error_ = null;
      } else {
        errorBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      if (failedMediaSetBuilder_ == null) {
        failedMediaSet_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
      } else {
        failedMediaSetBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.mediaassetsdk.MediaAsset.internal_static_RemoveMediasResponse_descriptor;
    }

    @java.lang.Override
    public com.mediaassetsdk.RemoveMediasResponse getDefaultInstanceForType() {
      return com.mediaassetsdk.RemoveMediasResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.mediaassetsdk.RemoveMediasResponse build() {
      com.mediaassetsdk.RemoveMediasResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.mediaassetsdk.RemoveMediasResponse buildPartial() {
      com.mediaassetsdk.RemoveMediasResponse result = new com.mediaassetsdk.RemoveMediasResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.requestID_ = requestID_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        if (errorBuilder_ == null) {
          result.error_ = error_;
        } else {
          result.error_ = errorBuilder_.build();
        }
        to_bitField0_ |= 0x00000002;
      }
      if (failedMediaSetBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)) {
          failedMediaSet_ = java.util.Collections.unmodifiableList(failedMediaSet_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.failedMediaSet_ = failedMediaSet_;
      } else {
        result.failedMediaSet_ = failedMediaSetBuilder_.build();
      }
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
      if (other instanceof com.mediaassetsdk.RemoveMediasResponse) {
        return mergeFrom((com.mediaassetsdk.RemoveMediasResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.mediaassetsdk.RemoveMediasResponse other) {
      if (other == com.mediaassetsdk.RemoveMediasResponse.getDefaultInstance()) return this;
      if (other.hasRequestID()) {
        bitField0_ |= 0x00000001;
        requestID_ = other.requestID_;
        onChanged();
      }
      if (other.hasError()) {
        mergeError(other.getError());
      }
      if (failedMediaSetBuilder_ == null) {
        if (!other.failedMediaSet_.isEmpty()) {
          if (failedMediaSet_.isEmpty()) {
            failedMediaSet_ = other.failedMediaSet_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureFailedMediaSetIsMutable();
            failedMediaSet_.addAll(other.failedMediaSet_);
          }
          onChanged();
        }
      } else {
        if (!other.failedMediaSet_.isEmpty()) {
          if (failedMediaSetBuilder_.isEmpty()) {
            failedMediaSetBuilder_.dispose();
            failedMediaSetBuilder_ = null;
            failedMediaSet_ = other.failedMediaSet_;
            bitField0_ = (bitField0_ & ~0x00000004);
            failedMediaSetBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getFailedMediaSetFieldBuilder() : null;
          } else {
            failedMediaSetBuilder_.addAllMessages(other.failedMediaSet_);
          }
        }
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
      com.mediaassetsdk.RemoveMediasResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.mediaassetsdk.RemoveMediasResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object requestID_ = "";
    /**
     * <code>optional string RequestID = 1;</code>
     * @return Whether the requestID field is set.
     */
    public boolean hasRequestID() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional string RequestID = 1;</code>
     * @return The requestID.
     */
    public java.lang.String getRequestID() {
      java.lang.Object ref = requestID_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        requestID_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string RequestID = 1;</code>
     * @return The bytes for requestID.
     */
    public com.google.protobuf.ByteString
        getRequestIDBytes() {
      java.lang.Object ref = requestID_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        requestID_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string RequestID = 1;</code>
     * @param value The requestID to set.
     * @return This builder for chaining.
     */
    public Builder setRequestID(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      requestID_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string RequestID = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearRequestID() {
      bitField0_ = (bitField0_ & ~0x00000001);
      requestID_ = getDefaultInstance().getRequestID();
      onChanged();
      return this;
    }
    /**
     * <code>optional string RequestID = 1;</code>
     * @param value The bytes for requestID to set.
     * @return This builder for chaining.
     */
    public Builder setRequestIDBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000001;
      requestID_ = value;
      onChanged();
      return this;
    }

    private com.mediaassetsdk.Error error_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.mediaassetsdk.Error, com.mediaassetsdk.Error.Builder, com.mediaassetsdk.ErrorOrBuilder> errorBuilder_;
    /**
     * <code>optional .Error Error = 2;</code>
     * @return Whether the error field is set.
     */
    public boolean hasError() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional .Error Error = 2;</code>
     * @return The error.
     */
    public com.mediaassetsdk.Error getError() {
      if (errorBuilder_ == null) {
        return error_ == null ? com.mediaassetsdk.Error.getDefaultInstance() : error_;
      } else {
        return errorBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .Error Error = 2;</code>
     */
    public Builder setError(com.mediaassetsdk.Error value) {
      if (errorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        error_ = value;
        onChanged();
      } else {
        errorBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .Error Error = 2;</code>
     */
    public Builder setError(
        com.mediaassetsdk.Error.Builder builderForValue) {
      if (errorBuilder_ == null) {
        error_ = builderForValue.build();
        onChanged();
      } else {
        errorBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .Error Error = 2;</code>
     */
    public Builder mergeError(com.mediaassetsdk.Error value) {
      if (errorBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
            error_ != null &&
            error_ != com.mediaassetsdk.Error.getDefaultInstance()) {
          error_ =
            com.mediaassetsdk.Error.newBuilder(error_).mergeFrom(value).buildPartial();
        } else {
          error_ = value;
        }
        onChanged();
      } else {
        errorBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .Error Error = 2;</code>
     */
    public Builder clearError() {
      if (errorBuilder_ == null) {
        error_ = null;
        onChanged();
      } else {
        errorBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }
    /**
     * <code>optional .Error Error = 2;</code>
     */
    public com.mediaassetsdk.Error.Builder getErrorBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getErrorFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .Error Error = 2;</code>
     */
    public com.mediaassetsdk.ErrorOrBuilder getErrorOrBuilder() {
      if (errorBuilder_ != null) {
        return errorBuilder_.getMessageOrBuilder();
      } else {
        return error_ == null ?
            com.mediaassetsdk.Error.getDefaultInstance() : error_;
      }
    }
    /**
     * <code>optional .Error Error = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.mediaassetsdk.Error, com.mediaassetsdk.Error.Builder, com.mediaassetsdk.ErrorOrBuilder> 
        getErrorFieldBuilder() {
      if (errorBuilder_ == null) {
        errorBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.mediaassetsdk.Error, com.mediaassetsdk.Error.Builder, com.mediaassetsdk.ErrorOrBuilder>(
                getError(),
                getParentForChildren(),
                isClean());
        error_ = null;
      }
      return errorBuilder_;
    }

    private java.util.List<com.mediaassetsdk.FailedMediaInfo> failedMediaSet_ =
      java.util.Collections.emptyList();
    private void ensureFailedMediaSetIsMutable() {
      if (!((bitField0_ & 0x00000004) != 0)) {
        failedMediaSet_ = new java.util.ArrayList<com.mediaassetsdk.FailedMediaInfo>(failedMediaSet_);
        bitField0_ |= 0x00000004;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.mediaassetsdk.FailedMediaInfo, com.mediaassetsdk.FailedMediaInfo.Builder, com.mediaassetsdk.FailedMediaInfoOrBuilder> failedMediaSetBuilder_;

    /**
     * <code>repeated .FailedMediaInfo FailedMediaSet = 3;</code>
     */
    public java.util.List<com.mediaassetsdk.FailedMediaInfo> getFailedMediaSetList() {
      if (failedMediaSetBuilder_ == null) {
        return java.util.Collections.unmodifiableList(failedMediaSet_);
      } else {
        return failedMediaSetBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .FailedMediaInfo FailedMediaSet = 3;</code>
     */
    public int getFailedMediaSetCount() {
      if (failedMediaSetBuilder_ == null) {
        return failedMediaSet_.size();
      } else {
        return failedMediaSetBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .FailedMediaInfo FailedMediaSet = 3;</code>
     */
    public com.mediaassetsdk.FailedMediaInfo getFailedMediaSet(int index) {
      if (failedMediaSetBuilder_ == null) {
        return failedMediaSet_.get(index);
      } else {
        return failedMediaSetBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .FailedMediaInfo FailedMediaSet = 3;</code>
     */
    public Builder setFailedMediaSet(
        int index, com.mediaassetsdk.FailedMediaInfo value) {
      if (failedMediaSetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFailedMediaSetIsMutable();
        failedMediaSet_.set(index, value);
        onChanged();
      } else {
        failedMediaSetBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .FailedMediaInfo FailedMediaSet = 3;</code>
     */
    public Builder setFailedMediaSet(
        int index, com.mediaassetsdk.FailedMediaInfo.Builder builderForValue) {
      if (failedMediaSetBuilder_ == null) {
        ensureFailedMediaSetIsMutable();
        failedMediaSet_.set(index, builderForValue.build());
        onChanged();
      } else {
        failedMediaSetBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .FailedMediaInfo FailedMediaSet = 3;</code>
     */
    public Builder addFailedMediaSet(com.mediaassetsdk.FailedMediaInfo value) {
      if (failedMediaSetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFailedMediaSetIsMutable();
        failedMediaSet_.add(value);
        onChanged();
      } else {
        failedMediaSetBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .FailedMediaInfo FailedMediaSet = 3;</code>
     */
    public Builder addFailedMediaSet(
        int index, com.mediaassetsdk.FailedMediaInfo value) {
      if (failedMediaSetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFailedMediaSetIsMutable();
        failedMediaSet_.add(index, value);
        onChanged();
      } else {
        failedMediaSetBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .FailedMediaInfo FailedMediaSet = 3;</code>
     */
    public Builder addFailedMediaSet(
        com.mediaassetsdk.FailedMediaInfo.Builder builderForValue) {
      if (failedMediaSetBuilder_ == null) {
        ensureFailedMediaSetIsMutable();
        failedMediaSet_.add(builderForValue.build());
        onChanged();
      } else {
        failedMediaSetBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .FailedMediaInfo FailedMediaSet = 3;</code>
     */
    public Builder addFailedMediaSet(
        int index, com.mediaassetsdk.FailedMediaInfo.Builder builderForValue) {
      if (failedMediaSetBuilder_ == null) {
        ensureFailedMediaSetIsMutable();
        failedMediaSet_.add(index, builderForValue.build());
        onChanged();
      } else {
        failedMediaSetBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .FailedMediaInfo FailedMediaSet = 3;</code>
     */
    public Builder addAllFailedMediaSet(
        java.lang.Iterable<? extends com.mediaassetsdk.FailedMediaInfo> values) {
      if (failedMediaSetBuilder_ == null) {
        ensureFailedMediaSetIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, failedMediaSet_);
        onChanged();
      } else {
        failedMediaSetBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .FailedMediaInfo FailedMediaSet = 3;</code>
     */
    public Builder clearFailedMediaSet() {
      if (failedMediaSetBuilder_ == null) {
        failedMediaSet_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
      } else {
        failedMediaSetBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .FailedMediaInfo FailedMediaSet = 3;</code>
     */
    public Builder removeFailedMediaSet(int index) {
      if (failedMediaSetBuilder_ == null) {
        ensureFailedMediaSetIsMutable();
        failedMediaSet_.remove(index);
        onChanged();
      } else {
        failedMediaSetBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .FailedMediaInfo FailedMediaSet = 3;</code>
     */
    public com.mediaassetsdk.FailedMediaInfo.Builder getFailedMediaSetBuilder(
        int index) {
      return getFailedMediaSetFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .FailedMediaInfo FailedMediaSet = 3;</code>
     */
    public com.mediaassetsdk.FailedMediaInfoOrBuilder getFailedMediaSetOrBuilder(
        int index) {
      if (failedMediaSetBuilder_ == null) {
        return failedMediaSet_.get(index);  } else {
        return failedMediaSetBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .FailedMediaInfo FailedMediaSet = 3;</code>
     */
    public java.util.List<? extends com.mediaassetsdk.FailedMediaInfoOrBuilder> 
         getFailedMediaSetOrBuilderList() {
      if (failedMediaSetBuilder_ != null) {
        return failedMediaSetBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(failedMediaSet_);
      }
    }
    /**
     * <code>repeated .FailedMediaInfo FailedMediaSet = 3;</code>
     */
    public com.mediaassetsdk.FailedMediaInfo.Builder addFailedMediaSetBuilder() {
      return getFailedMediaSetFieldBuilder().addBuilder(
          com.mediaassetsdk.FailedMediaInfo.getDefaultInstance());
    }
    /**
     * <code>repeated .FailedMediaInfo FailedMediaSet = 3;</code>
     */
    public com.mediaassetsdk.FailedMediaInfo.Builder addFailedMediaSetBuilder(
        int index) {
      return getFailedMediaSetFieldBuilder().addBuilder(
          index, com.mediaassetsdk.FailedMediaInfo.getDefaultInstance());
    }
    /**
     * <code>repeated .FailedMediaInfo FailedMediaSet = 3;</code>
     */
    public java.util.List<com.mediaassetsdk.FailedMediaInfo.Builder> 
         getFailedMediaSetBuilderList() {
      return getFailedMediaSetFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.mediaassetsdk.FailedMediaInfo, com.mediaassetsdk.FailedMediaInfo.Builder, com.mediaassetsdk.FailedMediaInfoOrBuilder> 
        getFailedMediaSetFieldBuilder() {
      if (failedMediaSetBuilder_ == null) {
        failedMediaSetBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.mediaassetsdk.FailedMediaInfo, com.mediaassetsdk.FailedMediaInfo.Builder, com.mediaassetsdk.FailedMediaInfoOrBuilder>(
                failedMediaSet_,
                ((bitField0_ & 0x00000004) != 0),
                getParentForChildren(),
                isClean());
        failedMediaSet_ = null;
      }
      return failedMediaSetBuilder_;
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


    // @@protoc_insertion_point(builder_scope:RemoveMediasResponse)
  }

  // @@protoc_insertion_point(class_scope:RemoveMediasResponse)
  private static final com.mediaassetsdk.RemoveMediasResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.mediaassetsdk.RemoveMediasResponse();
  }

  public static com.mediaassetsdk.RemoveMediasResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RemoveMediasResponse>
      PARSER = new com.google.protobuf.AbstractParser<RemoveMediasResponse>() {
    @java.lang.Override
    public RemoveMediasResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RemoveMediasResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RemoveMediasResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RemoveMediasResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.mediaassetsdk.RemoveMediasResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

