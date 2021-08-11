// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MediaAsset.proto

package com.mediaassetsdk;

/**
 * Protobuf type {@code RemoveMediasRequest}
 */
public final class RemoveMediasRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:RemoveMediasRequest)
    RemoveMediasRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RemoveMediasRequest.newBuilder() to construct.
  private RemoveMediasRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RemoveMediasRequest() {
    action_ = "";
    mediaIDSet_ = emptyLongList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RemoveMediasRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RemoveMediasRequest(
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
            action_ = s;
            break;
          }
          case 16: {
            bitField0_ |= 0x00000002;
            tIBusinessID_ = input.readInt32();
            break;
          }
          case 24: {
            bitField0_ |= 0x00000004;
            tIProjectID_ = input.readInt32();
            break;
          }
          case 32: {
            if (!((mutable_bitField0_ & 0x00000008) != 0)) {
              mediaIDSet_ = newLongList();
              mutable_bitField0_ |= 0x00000008;
            }
            mediaIDSet_.addLong(input.readUInt64());
            break;
          }
          case 34: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000008) != 0) && input.getBytesUntilLimit() > 0) {
              mediaIDSet_ = newLongList();
              mutable_bitField0_ |= 0x00000008;
            }
            while (input.getBytesUntilLimit() > 0) {
              mediaIDSet_.addLong(input.readUInt64());
            }
            input.popLimit(limit);
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
      if (((mutable_bitField0_ & 0x00000008) != 0)) {
        mediaIDSet_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.mediaassetsdk.MediaAsset.internal_static_RemoveMediasRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.mediaassetsdk.MediaAsset.internal_static_RemoveMediasRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.mediaassetsdk.RemoveMediasRequest.class, com.mediaassetsdk.RemoveMediasRequest.Builder.class);
  }

  private int bitField0_;
  public static final int ACTION_FIELD_NUMBER = 1;
  private volatile java.lang.Object action_;
  /**
   * <code>optional string Action = 1;</code>
   * @return Whether the action field is set.
   */
  @java.lang.Override
  public boolean hasAction() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional string Action = 1;</code>
   * @return The action.
   */
  @java.lang.Override
  public java.lang.String getAction() {
    java.lang.Object ref = action_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      action_ = s;
      return s;
    }
  }
  /**
   * <code>optional string Action = 1;</code>
   * @return The bytes for action.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getActionBytes() {
    java.lang.Object ref = action_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      action_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TIBUSINESSID_FIELD_NUMBER = 2;
  private int tIBusinessID_;
  /**
   * <code>optional int32 TIBusinessID = 2;</code>
   * @return Whether the tIBusinessID field is set.
   */
  @java.lang.Override
  public boolean hasTIBusinessID() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional int32 TIBusinessID = 2;</code>
   * @return The tIBusinessID.
   */
  @java.lang.Override
  public int getTIBusinessID() {
    return tIBusinessID_;
  }

  public static final int TIPROJECTID_FIELD_NUMBER = 3;
  private int tIProjectID_;
  /**
   * <code>optional int32 TIProjectID = 3;</code>
   * @return Whether the tIProjectID field is set.
   */
  @java.lang.Override
  public boolean hasTIProjectID() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>optional int32 TIProjectID = 3;</code>
   * @return The tIProjectID.
   */
  @java.lang.Override
  public int getTIProjectID() {
    return tIProjectID_;
  }

  public static final int MEDIAIDSET_FIELD_NUMBER = 4;
  private com.google.protobuf.Internal.LongList mediaIDSet_;
  /**
   * <code>repeated uint64 MediaIDSet = 4;</code>
   * @return A list containing the mediaIDSet.
   */
  @java.lang.Override
  public java.util.List<java.lang.Long>
      getMediaIDSetList() {
    return mediaIDSet_;
  }
  /**
   * <code>repeated uint64 MediaIDSet = 4;</code>
   * @return The count of mediaIDSet.
   */
  public int getMediaIDSetCount() {
    return mediaIDSet_.size();
  }
  /**
   * <code>repeated uint64 MediaIDSet = 4;</code>
   * @param index The index of the element to return.
   * @return The mediaIDSet at the given index.
   */
  public long getMediaIDSet(int index) {
    return mediaIDSet_.getLong(index);
  }
  private int mediaIDSetMemoizedSerializedSize = -1;

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
    getSerializedSize();
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, action_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeInt32(2, tIBusinessID_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeInt32(3, tIProjectID_);
    }
    if (getMediaIDSetList().size() > 0) {
      output.writeUInt32NoTag(34);
      output.writeUInt32NoTag(mediaIDSetMemoizedSerializedSize);
    }
    for (int i = 0; i < mediaIDSet_.size(); i++) {
      output.writeUInt64NoTag(mediaIDSet_.getLong(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, action_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, tIBusinessID_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, tIProjectID_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < mediaIDSet_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeUInt64SizeNoTag(mediaIDSet_.getLong(i));
      }
      size += dataSize;
      if (!getMediaIDSetList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      mediaIDSetMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof com.mediaassetsdk.RemoveMediasRequest)) {
      return super.equals(obj);
    }
    com.mediaassetsdk.RemoveMediasRequest other = (com.mediaassetsdk.RemoveMediasRequest) obj;

    if (hasAction() != other.hasAction()) return false;
    if (hasAction()) {
      if (!getAction()
          .equals(other.getAction())) return false;
    }
    if (hasTIBusinessID() != other.hasTIBusinessID()) return false;
    if (hasTIBusinessID()) {
      if (getTIBusinessID()
          != other.getTIBusinessID()) return false;
    }
    if (hasTIProjectID() != other.hasTIProjectID()) return false;
    if (hasTIProjectID()) {
      if (getTIProjectID()
          != other.getTIProjectID()) return false;
    }
    if (!getMediaIDSetList()
        .equals(other.getMediaIDSetList())) return false;
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
    if (hasAction()) {
      hash = (37 * hash) + ACTION_FIELD_NUMBER;
      hash = (53 * hash) + getAction().hashCode();
    }
    if (hasTIBusinessID()) {
      hash = (37 * hash) + TIBUSINESSID_FIELD_NUMBER;
      hash = (53 * hash) + getTIBusinessID();
    }
    if (hasTIProjectID()) {
      hash = (37 * hash) + TIPROJECTID_FIELD_NUMBER;
      hash = (53 * hash) + getTIProjectID();
    }
    if (getMediaIDSetCount() > 0) {
      hash = (37 * hash) + MEDIAIDSET_FIELD_NUMBER;
      hash = (53 * hash) + getMediaIDSetList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.mediaassetsdk.RemoveMediasRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.mediaassetsdk.RemoveMediasRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.mediaassetsdk.RemoveMediasRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.mediaassetsdk.RemoveMediasRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.mediaassetsdk.RemoveMediasRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.mediaassetsdk.RemoveMediasRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.mediaassetsdk.RemoveMediasRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.mediaassetsdk.RemoveMediasRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.mediaassetsdk.RemoveMediasRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.mediaassetsdk.RemoveMediasRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.mediaassetsdk.RemoveMediasRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.mediaassetsdk.RemoveMediasRequest parseFrom(
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
  public static Builder newBuilder(com.mediaassetsdk.RemoveMediasRequest prototype) {
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
   * Protobuf type {@code RemoveMediasRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:RemoveMediasRequest)
      com.mediaassetsdk.RemoveMediasRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.mediaassetsdk.MediaAsset.internal_static_RemoveMediasRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.mediaassetsdk.MediaAsset.internal_static_RemoveMediasRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.mediaassetsdk.RemoveMediasRequest.class, com.mediaassetsdk.RemoveMediasRequest.Builder.class);
    }

    // Construct using com.mediaassetsdk.RemoveMediasRequest.newBuilder()
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
      action_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      tIBusinessID_ = 0;
      bitField0_ = (bitField0_ & ~0x00000002);
      tIProjectID_ = 0;
      bitField0_ = (bitField0_ & ~0x00000004);
      mediaIDSet_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000008);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.mediaassetsdk.MediaAsset.internal_static_RemoveMediasRequest_descriptor;
    }

    @java.lang.Override
    public com.mediaassetsdk.RemoveMediasRequest getDefaultInstanceForType() {
      return com.mediaassetsdk.RemoveMediasRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.mediaassetsdk.RemoveMediasRequest build() {
      com.mediaassetsdk.RemoveMediasRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.mediaassetsdk.RemoveMediasRequest buildPartial() {
      com.mediaassetsdk.RemoveMediasRequest result = new com.mediaassetsdk.RemoveMediasRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.action_ = action_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.tIBusinessID_ = tIBusinessID_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.tIProjectID_ = tIProjectID_;
        to_bitField0_ |= 0x00000004;
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        mediaIDSet_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000008);
      }
      result.mediaIDSet_ = mediaIDSet_;
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
      if (other instanceof com.mediaassetsdk.RemoveMediasRequest) {
        return mergeFrom((com.mediaassetsdk.RemoveMediasRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.mediaassetsdk.RemoveMediasRequest other) {
      if (other == com.mediaassetsdk.RemoveMediasRequest.getDefaultInstance()) return this;
      if (other.hasAction()) {
        bitField0_ |= 0x00000001;
        action_ = other.action_;
        onChanged();
      }
      if (other.hasTIBusinessID()) {
        setTIBusinessID(other.getTIBusinessID());
      }
      if (other.hasTIProjectID()) {
        setTIProjectID(other.getTIProjectID());
      }
      if (!other.mediaIDSet_.isEmpty()) {
        if (mediaIDSet_.isEmpty()) {
          mediaIDSet_ = other.mediaIDSet_;
          bitField0_ = (bitField0_ & ~0x00000008);
        } else {
          ensureMediaIDSetIsMutable();
          mediaIDSet_.addAll(other.mediaIDSet_);
        }
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
      com.mediaassetsdk.RemoveMediasRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.mediaassetsdk.RemoveMediasRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object action_ = "";
    /**
     * <code>optional string Action = 1;</code>
     * @return Whether the action field is set.
     */
    public boolean hasAction() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional string Action = 1;</code>
     * @return The action.
     */
    public java.lang.String getAction() {
      java.lang.Object ref = action_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        action_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string Action = 1;</code>
     * @return The bytes for action.
     */
    public com.google.protobuf.ByteString
        getActionBytes() {
      java.lang.Object ref = action_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        action_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string Action = 1;</code>
     * @param value The action to set.
     * @return This builder for chaining.
     */
    public Builder setAction(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      action_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string Action = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAction() {
      bitField0_ = (bitField0_ & ~0x00000001);
      action_ = getDefaultInstance().getAction();
      onChanged();
      return this;
    }
    /**
     * <code>optional string Action = 1;</code>
     * @param value The bytes for action to set.
     * @return This builder for chaining.
     */
    public Builder setActionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000001;
      action_ = value;
      onChanged();
      return this;
    }

    private int tIBusinessID_ ;
    /**
     * <code>optional int32 TIBusinessID = 2;</code>
     * @return Whether the tIBusinessID field is set.
     */
    @java.lang.Override
    public boolean hasTIBusinessID() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional int32 TIBusinessID = 2;</code>
     * @return The tIBusinessID.
     */
    @java.lang.Override
    public int getTIBusinessID() {
      return tIBusinessID_;
    }
    /**
     * <code>optional int32 TIBusinessID = 2;</code>
     * @param value The tIBusinessID to set.
     * @return This builder for chaining.
     */
    public Builder setTIBusinessID(int value) {
      bitField0_ |= 0x00000002;
      tIBusinessID_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 TIBusinessID = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTIBusinessID() {
      bitField0_ = (bitField0_ & ~0x00000002);
      tIBusinessID_ = 0;
      onChanged();
      return this;
    }

    private int tIProjectID_ ;
    /**
     * <code>optional int32 TIProjectID = 3;</code>
     * @return Whether the tIProjectID field is set.
     */
    @java.lang.Override
    public boolean hasTIProjectID() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional int32 TIProjectID = 3;</code>
     * @return The tIProjectID.
     */
    @java.lang.Override
    public int getTIProjectID() {
      return tIProjectID_;
    }
    /**
     * <code>optional int32 TIProjectID = 3;</code>
     * @param value The tIProjectID to set.
     * @return This builder for chaining.
     */
    public Builder setTIProjectID(int value) {
      bitField0_ |= 0x00000004;
      tIProjectID_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 TIProjectID = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTIProjectID() {
      bitField0_ = (bitField0_ & ~0x00000004);
      tIProjectID_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.LongList mediaIDSet_ = emptyLongList();
    private void ensureMediaIDSetIsMutable() {
      if (!((bitField0_ & 0x00000008) != 0)) {
        mediaIDSet_ = mutableCopy(mediaIDSet_);
        bitField0_ |= 0x00000008;
       }
    }
    /**
     * <code>repeated uint64 MediaIDSet = 4;</code>
     * @return A list containing the mediaIDSet.
     */
    public java.util.List<java.lang.Long>
        getMediaIDSetList() {
      return ((bitField0_ & 0x00000008) != 0) ?
               java.util.Collections.unmodifiableList(mediaIDSet_) : mediaIDSet_;
    }
    /**
     * <code>repeated uint64 MediaIDSet = 4;</code>
     * @return The count of mediaIDSet.
     */
    public int getMediaIDSetCount() {
      return mediaIDSet_.size();
    }
    /**
     * <code>repeated uint64 MediaIDSet = 4;</code>
     * @param index The index of the element to return.
     * @return The mediaIDSet at the given index.
     */
    public long getMediaIDSet(int index) {
      return mediaIDSet_.getLong(index);
    }
    /**
     * <code>repeated uint64 MediaIDSet = 4;</code>
     * @param index The index to set the value at.
     * @param value The mediaIDSet to set.
     * @return This builder for chaining.
     */
    public Builder setMediaIDSet(
        int index, long value) {
      ensureMediaIDSetIsMutable();
      mediaIDSet_.setLong(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint64 MediaIDSet = 4;</code>
     * @param value The mediaIDSet to add.
     * @return This builder for chaining.
     */
    public Builder addMediaIDSet(long value) {
      ensureMediaIDSetIsMutable();
      mediaIDSet_.addLong(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint64 MediaIDSet = 4;</code>
     * @param values The mediaIDSet to add.
     * @return This builder for chaining.
     */
    public Builder addAllMediaIDSet(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureMediaIDSetIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, mediaIDSet_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint64 MediaIDSet = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearMediaIDSet() {
      mediaIDSet_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000008);
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


    // @@protoc_insertion_point(builder_scope:RemoveMediasRequest)
  }

  // @@protoc_insertion_point(class_scope:RemoveMediasRequest)
  private static final com.mediaassetsdk.RemoveMediasRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.mediaassetsdk.RemoveMediasRequest();
  }

  public static com.mediaassetsdk.RemoveMediasRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RemoveMediasRequest>
      PARSER = new com.google.protobuf.AbstractParser<RemoveMediasRequest>() {
    @java.lang.Override
    public RemoveMediasRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RemoveMediasRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RemoveMediasRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RemoveMediasRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.mediaassetsdk.RemoveMediasRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

