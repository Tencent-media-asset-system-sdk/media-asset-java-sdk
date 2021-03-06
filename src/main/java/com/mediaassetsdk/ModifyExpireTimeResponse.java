// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MediaAsset.proto

package com.mediaassetsdk;

/**
 * Protobuf type {@code ModifyExpireTimeResponse}
 */
public final class ModifyExpireTimeResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ModifyExpireTimeResponse)
    ModifyExpireTimeResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ModifyExpireTimeResponse.newBuilder() to construct.
  private ModifyExpireTimeResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ModifyExpireTimeResponse() {
    requestID_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ModifyExpireTimeResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ModifyExpireTimeResponse(
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
    return com.mediaassetsdk.MediaAsset.internal_static_ModifyExpireTimeResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.mediaassetsdk.MediaAsset.internal_static_ModifyExpireTimeResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.mediaassetsdk.ModifyExpireTimeResponse.class, com.mediaassetsdk.ModifyExpireTimeResponse.Builder.class);
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
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.mediaassetsdk.ModifyExpireTimeResponse)) {
      return super.equals(obj);
    }
    com.mediaassetsdk.ModifyExpireTimeResponse other = (com.mediaassetsdk.ModifyExpireTimeResponse) obj;

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
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.mediaassetsdk.ModifyExpireTimeResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.mediaassetsdk.ModifyExpireTimeResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.mediaassetsdk.ModifyExpireTimeResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.mediaassetsdk.ModifyExpireTimeResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.mediaassetsdk.ModifyExpireTimeResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.mediaassetsdk.ModifyExpireTimeResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.mediaassetsdk.ModifyExpireTimeResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.mediaassetsdk.ModifyExpireTimeResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.mediaassetsdk.ModifyExpireTimeResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.mediaassetsdk.ModifyExpireTimeResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.mediaassetsdk.ModifyExpireTimeResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.mediaassetsdk.ModifyExpireTimeResponse parseFrom(
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
  public static Builder newBuilder(com.mediaassetsdk.ModifyExpireTimeResponse prototype) {
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
   * Protobuf type {@code ModifyExpireTimeResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ModifyExpireTimeResponse)
      com.mediaassetsdk.ModifyExpireTimeResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.mediaassetsdk.MediaAsset.internal_static_ModifyExpireTimeResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.mediaassetsdk.MediaAsset.internal_static_ModifyExpireTimeResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.mediaassetsdk.ModifyExpireTimeResponse.class, com.mediaassetsdk.ModifyExpireTimeResponse.Builder.class);
    }

    // Construct using com.mediaassetsdk.ModifyExpireTimeResponse.newBuilder()
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
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.mediaassetsdk.MediaAsset.internal_static_ModifyExpireTimeResponse_descriptor;
    }

    @java.lang.Override
    public com.mediaassetsdk.ModifyExpireTimeResponse getDefaultInstanceForType() {
      return com.mediaassetsdk.ModifyExpireTimeResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.mediaassetsdk.ModifyExpireTimeResponse build() {
      com.mediaassetsdk.ModifyExpireTimeResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.mediaassetsdk.ModifyExpireTimeResponse buildPartial() {
      com.mediaassetsdk.ModifyExpireTimeResponse result = new com.mediaassetsdk.ModifyExpireTimeResponse(this);
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
      if (other instanceof com.mediaassetsdk.ModifyExpireTimeResponse) {
        return mergeFrom((com.mediaassetsdk.ModifyExpireTimeResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.mediaassetsdk.ModifyExpireTimeResponse other) {
      if (other == com.mediaassetsdk.ModifyExpireTimeResponse.getDefaultInstance()) return this;
      if (other.hasRequestID()) {
        bitField0_ |= 0x00000001;
        requestID_ = other.requestID_;
        onChanged();
      }
      if (other.hasError()) {
        mergeError(other.getError());
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
      com.mediaassetsdk.ModifyExpireTimeResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.mediaassetsdk.ModifyExpireTimeResponse) e.getUnfinishedMessage();
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


    // @@protoc_insertion_point(builder_scope:ModifyExpireTimeResponse)
  }

  // @@protoc_insertion_point(class_scope:ModifyExpireTimeResponse)
  private static final com.mediaassetsdk.ModifyExpireTimeResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.mediaassetsdk.ModifyExpireTimeResponse();
  }

  public static com.mediaassetsdk.ModifyExpireTimeResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ModifyExpireTimeResponse>
      PARSER = new com.google.protobuf.AbstractParser<ModifyExpireTimeResponse>() {
    @java.lang.Override
    public ModifyExpireTimeResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ModifyExpireTimeResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ModifyExpireTimeResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ModifyExpireTimeResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.mediaassetsdk.ModifyExpireTimeResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

