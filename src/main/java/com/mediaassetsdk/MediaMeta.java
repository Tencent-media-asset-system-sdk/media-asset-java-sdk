// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MediaAsset.proto

package com.mediaassetsdk;

/**
 * Protobuf type {@code MediaMeta}
 */
public final class MediaMeta extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:MediaMeta)
    MediaMetaOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MediaMeta.newBuilder() to construct.
  private MediaMeta(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MediaMeta() {
    mediaType_ = "";
    mediaTag_ = "";
    mediaSecondTag_ = "";
    mediaLang_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MediaMeta();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MediaMeta(
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
            mediaType_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            bitField0_ |= 0x00000002;
            mediaTag_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();
            bitField0_ |= 0x00000004;
            mediaSecondTag_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();
            bitField0_ |= 0x00000008;
            mediaLang_ = s;
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
    return com.mediaassetsdk.MediaAsset.internal_static_MediaMeta_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.mediaassetsdk.MediaAsset.internal_static_MediaMeta_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.mediaassetsdk.MediaMeta.class, com.mediaassetsdk.MediaMeta.Builder.class);
  }

  private int bitField0_;
  public static final int MEDIATYPE_FIELD_NUMBER = 1;
  private volatile java.lang.Object mediaType_;
  /**
   * <code>optional string MediaType = 1;</code>
   * @return Whether the mediaType field is set.
   */
  @java.lang.Override
  public boolean hasMediaType() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional string MediaType = 1;</code>
   * @return The mediaType.
   */
  @java.lang.Override
  public java.lang.String getMediaType() {
    java.lang.Object ref = mediaType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      mediaType_ = s;
      return s;
    }
  }
  /**
   * <code>optional string MediaType = 1;</code>
   * @return The bytes for mediaType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMediaTypeBytes() {
    java.lang.Object ref = mediaType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      mediaType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MEDIATAG_FIELD_NUMBER = 2;
  private volatile java.lang.Object mediaTag_;
  /**
   * <code>optional string MediaTag = 2;</code>
   * @return Whether the mediaTag field is set.
   */
  @java.lang.Override
  public boolean hasMediaTag() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional string MediaTag = 2;</code>
   * @return The mediaTag.
   */
  @java.lang.Override
  public java.lang.String getMediaTag() {
    java.lang.Object ref = mediaTag_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      mediaTag_ = s;
      return s;
    }
  }
  /**
   * <code>optional string MediaTag = 2;</code>
   * @return The bytes for mediaTag.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMediaTagBytes() {
    java.lang.Object ref = mediaTag_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      mediaTag_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MEDIASECONDTAG_FIELD_NUMBER = 3;
  private volatile java.lang.Object mediaSecondTag_;
  /**
   * <code>optional string MediaSecondTag = 3;</code>
   * @return Whether the mediaSecondTag field is set.
   */
  @java.lang.Override
  public boolean hasMediaSecondTag() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>optional string MediaSecondTag = 3;</code>
   * @return The mediaSecondTag.
   */
  @java.lang.Override
  public java.lang.String getMediaSecondTag() {
    java.lang.Object ref = mediaSecondTag_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      mediaSecondTag_ = s;
      return s;
    }
  }
  /**
   * <code>optional string MediaSecondTag = 3;</code>
   * @return The bytes for mediaSecondTag.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMediaSecondTagBytes() {
    java.lang.Object ref = mediaSecondTag_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      mediaSecondTag_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MEDIALANG_FIELD_NUMBER = 4;
  private volatile java.lang.Object mediaLang_;
  /**
   * <code>optional string MediaLang = 4;</code>
   * @return Whether the mediaLang field is set.
   */
  @java.lang.Override
  public boolean hasMediaLang() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   * <code>optional string MediaLang = 4;</code>
   * @return The mediaLang.
   */
  @java.lang.Override
  public java.lang.String getMediaLang() {
    java.lang.Object ref = mediaLang_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      mediaLang_ = s;
      return s;
    }
  }
  /**
   * <code>optional string MediaLang = 4;</code>
   * @return The bytes for mediaLang.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMediaLangBytes() {
    java.lang.Object ref = mediaLang_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      mediaLang_ = b;
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, mediaType_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, mediaTag_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, mediaSecondTag_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, mediaLang_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, mediaType_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, mediaTag_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, mediaSecondTag_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, mediaLang_);
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
    if (!(obj instanceof com.mediaassetsdk.MediaMeta)) {
      return super.equals(obj);
    }
    com.mediaassetsdk.MediaMeta other = (com.mediaassetsdk.MediaMeta) obj;

    if (hasMediaType() != other.hasMediaType()) return false;
    if (hasMediaType()) {
      if (!getMediaType()
          .equals(other.getMediaType())) return false;
    }
    if (hasMediaTag() != other.hasMediaTag()) return false;
    if (hasMediaTag()) {
      if (!getMediaTag()
          .equals(other.getMediaTag())) return false;
    }
    if (hasMediaSecondTag() != other.hasMediaSecondTag()) return false;
    if (hasMediaSecondTag()) {
      if (!getMediaSecondTag()
          .equals(other.getMediaSecondTag())) return false;
    }
    if (hasMediaLang() != other.hasMediaLang()) return false;
    if (hasMediaLang()) {
      if (!getMediaLang()
          .equals(other.getMediaLang())) return false;
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
    if (hasMediaType()) {
      hash = (37 * hash) + MEDIATYPE_FIELD_NUMBER;
      hash = (53 * hash) + getMediaType().hashCode();
    }
    if (hasMediaTag()) {
      hash = (37 * hash) + MEDIATAG_FIELD_NUMBER;
      hash = (53 * hash) + getMediaTag().hashCode();
    }
    if (hasMediaSecondTag()) {
      hash = (37 * hash) + MEDIASECONDTAG_FIELD_NUMBER;
      hash = (53 * hash) + getMediaSecondTag().hashCode();
    }
    if (hasMediaLang()) {
      hash = (37 * hash) + MEDIALANG_FIELD_NUMBER;
      hash = (53 * hash) + getMediaLang().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.mediaassetsdk.MediaMeta parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.mediaassetsdk.MediaMeta parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.mediaassetsdk.MediaMeta parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.mediaassetsdk.MediaMeta parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.mediaassetsdk.MediaMeta parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.mediaassetsdk.MediaMeta parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.mediaassetsdk.MediaMeta parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.mediaassetsdk.MediaMeta parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.mediaassetsdk.MediaMeta parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.mediaassetsdk.MediaMeta parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.mediaassetsdk.MediaMeta parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.mediaassetsdk.MediaMeta parseFrom(
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
  public static Builder newBuilder(com.mediaassetsdk.MediaMeta prototype) {
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
   * Protobuf type {@code MediaMeta}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:MediaMeta)
      com.mediaassetsdk.MediaMetaOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.mediaassetsdk.MediaAsset.internal_static_MediaMeta_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.mediaassetsdk.MediaAsset.internal_static_MediaMeta_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.mediaassetsdk.MediaMeta.class, com.mediaassetsdk.MediaMeta.Builder.class);
    }

    // Construct using com.mediaassetsdk.MediaMeta.newBuilder()
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
      mediaType_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      mediaTag_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      mediaSecondTag_ = "";
      bitField0_ = (bitField0_ & ~0x00000004);
      mediaLang_ = "";
      bitField0_ = (bitField0_ & ~0x00000008);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.mediaassetsdk.MediaAsset.internal_static_MediaMeta_descriptor;
    }

    @java.lang.Override
    public com.mediaassetsdk.MediaMeta getDefaultInstanceForType() {
      return com.mediaassetsdk.MediaMeta.getDefaultInstance();
    }

    @java.lang.Override
    public com.mediaassetsdk.MediaMeta build() {
      com.mediaassetsdk.MediaMeta result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.mediaassetsdk.MediaMeta buildPartial() {
      com.mediaassetsdk.MediaMeta result = new com.mediaassetsdk.MediaMeta(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.mediaType_ = mediaType_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.mediaTag_ = mediaTag_;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        to_bitField0_ |= 0x00000004;
      }
      result.mediaSecondTag_ = mediaSecondTag_;
      if (((from_bitField0_ & 0x00000008) != 0)) {
        to_bitField0_ |= 0x00000008;
      }
      result.mediaLang_ = mediaLang_;
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
      if (other instanceof com.mediaassetsdk.MediaMeta) {
        return mergeFrom((com.mediaassetsdk.MediaMeta)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.mediaassetsdk.MediaMeta other) {
      if (other == com.mediaassetsdk.MediaMeta.getDefaultInstance()) return this;
      if (other.hasMediaType()) {
        bitField0_ |= 0x00000001;
        mediaType_ = other.mediaType_;
        onChanged();
      }
      if (other.hasMediaTag()) {
        bitField0_ |= 0x00000002;
        mediaTag_ = other.mediaTag_;
        onChanged();
      }
      if (other.hasMediaSecondTag()) {
        bitField0_ |= 0x00000004;
        mediaSecondTag_ = other.mediaSecondTag_;
        onChanged();
      }
      if (other.hasMediaLang()) {
        bitField0_ |= 0x00000008;
        mediaLang_ = other.mediaLang_;
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
      com.mediaassetsdk.MediaMeta parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.mediaassetsdk.MediaMeta) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object mediaType_ = "";
    /**
     * <code>optional string MediaType = 1;</code>
     * @return Whether the mediaType field is set.
     */
    public boolean hasMediaType() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional string MediaType = 1;</code>
     * @return The mediaType.
     */
    public java.lang.String getMediaType() {
      java.lang.Object ref = mediaType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        mediaType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string MediaType = 1;</code>
     * @return The bytes for mediaType.
     */
    public com.google.protobuf.ByteString
        getMediaTypeBytes() {
      java.lang.Object ref = mediaType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        mediaType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string MediaType = 1;</code>
     * @param value The mediaType to set.
     * @return This builder for chaining.
     */
    public Builder setMediaType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      mediaType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string MediaType = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMediaType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      mediaType_ = getDefaultInstance().getMediaType();
      onChanged();
      return this;
    }
    /**
     * <code>optional string MediaType = 1;</code>
     * @param value The bytes for mediaType to set.
     * @return This builder for chaining.
     */
    public Builder setMediaTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000001;
      mediaType_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object mediaTag_ = "";
    /**
     * <code>optional string MediaTag = 2;</code>
     * @return Whether the mediaTag field is set.
     */
    public boolean hasMediaTag() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional string MediaTag = 2;</code>
     * @return The mediaTag.
     */
    public java.lang.String getMediaTag() {
      java.lang.Object ref = mediaTag_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        mediaTag_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string MediaTag = 2;</code>
     * @return The bytes for mediaTag.
     */
    public com.google.protobuf.ByteString
        getMediaTagBytes() {
      java.lang.Object ref = mediaTag_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        mediaTag_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string MediaTag = 2;</code>
     * @param value The mediaTag to set.
     * @return This builder for chaining.
     */
    public Builder setMediaTag(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      mediaTag_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string MediaTag = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMediaTag() {
      bitField0_ = (bitField0_ & ~0x00000002);
      mediaTag_ = getDefaultInstance().getMediaTag();
      onChanged();
      return this;
    }
    /**
     * <code>optional string MediaTag = 2;</code>
     * @param value The bytes for mediaTag to set.
     * @return This builder for chaining.
     */
    public Builder setMediaTagBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000002;
      mediaTag_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object mediaSecondTag_ = "";
    /**
     * <code>optional string MediaSecondTag = 3;</code>
     * @return Whether the mediaSecondTag field is set.
     */
    public boolean hasMediaSecondTag() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional string MediaSecondTag = 3;</code>
     * @return The mediaSecondTag.
     */
    public java.lang.String getMediaSecondTag() {
      java.lang.Object ref = mediaSecondTag_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        mediaSecondTag_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string MediaSecondTag = 3;</code>
     * @return The bytes for mediaSecondTag.
     */
    public com.google.protobuf.ByteString
        getMediaSecondTagBytes() {
      java.lang.Object ref = mediaSecondTag_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        mediaSecondTag_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string MediaSecondTag = 3;</code>
     * @param value The mediaSecondTag to set.
     * @return This builder for chaining.
     */
    public Builder setMediaSecondTag(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      mediaSecondTag_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string MediaSecondTag = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMediaSecondTag() {
      bitField0_ = (bitField0_ & ~0x00000004);
      mediaSecondTag_ = getDefaultInstance().getMediaSecondTag();
      onChanged();
      return this;
    }
    /**
     * <code>optional string MediaSecondTag = 3;</code>
     * @param value The bytes for mediaSecondTag to set.
     * @return This builder for chaining.
     */
    public Builder setMediaSecondTagBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000004;
      mediaSecondTag_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object mediaLang_ = "";
    /**
     * <code>optional string MediaLang = 4;</code>
     * @return Whether the mediaLang field is set.
     */
    public boolean hasMediaLang() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>optional string MediaLang = 4;</code>
     * @return The mediaLang.
     */
    public java.lang.String getMediaLang() {
      java.lang.Object ref = mediaLang_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        mediaLang_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string MediaLang = 4;</code>
     * @return The bytes for mediaLang.
     */
    public com.google.protobuf.ByteString
        getMediaLangBytes() {
      java.lang.Object ref = mediaLang_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        mediaLang_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string MediaLang = 4;</code>
     * @param value The mediaLang to set.
     * @return This builder for chaining.
     */
    public Builder setMediaLang(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
      mediaLang_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string MediaLang = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearMediaLang() {
      bitField0_ = (bitField0_ & ~0x00000008);
      mediaLang_ = getDefaultInstance().getMediaLang();
      onChanged();
      return this;
    }
    /**
     * <code>optional string MediaLang = 4;</code>
     * @param value The bytes for mediaLang to set.
     * @return This builder for chaining.
     */
    public Builder setMediaLangBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000008;
      mediaLang_ = value;
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


    // @@protoc_insertion_point(builder_scope:MediaMeta)
  }

  // @@protoc_insertion_point(class_scope:MediaMeta)
  private static final com.mediaassetsdk.MediaMeta DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.mediaassetsdk.MediaMeta();
  }

  public static com.mediaassetsdk.MediaMeta getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MediaMeta>
      PARSER = new com.google.protobuf.AbstractParser<MediaMeta>() {
    @java.lang.Override
    public MediaMeta parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MediaMeta(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MediaMeta> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MediaMeta> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.mediaassetsdk.MediaMeta getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
