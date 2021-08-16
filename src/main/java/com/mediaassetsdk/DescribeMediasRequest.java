// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MediaAsset.proto

package com.mediaassetsdk;

/**
 * Protobuf type {@code DescribeMediasRequest}
 */
public final class DescribeMediasRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:DescribeMediasRequest)
    DescribeMediasRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DescribeMediasRequest.newBuilder() to construct.
  private DescribeMediasRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DescribeMediasRequest() {
    action_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DescribeMediasRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DescribeMediasRequest(
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
            bitField0_ |= 0x00000008;
            pageNumber_ = input.readInt32();
            break;
          }
          case 40: {
            bitField0_ |= 0x00000010;
            pageSize_ = input.readInt32();
            break;
          }
          case 48: {
            bitField0_ |= 0x00000020;
            inner_ = input.readBool();
            break;
          }
          case 58: {
            com.mediaassetsdk.FilterBy.Builder subBuilder = null;
            if (((bitField0_ & 0x00000040) != 0)) {
              subBuilder = filterBy_.toBuilder();
            }
            filterBy_ = input.readMessage(com.mediaassetsdk.FilterBy.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(filterBy_);
              filterBy_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000040;
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
    return com.mediaassetsdk.MediaAsset.internal_static_DescribeMediasRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.mediaassetsdk.MediaAsset.internal_static_DescribeMediasRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.mediaassetsdk.DescribeMediasRequest.class, com.mediaassetsdk.DescribeMediasRequest.Builder.class);
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

  public static final int PAGENUMBER_FIELD_NUMBER = 4;
  private int pageNumber_;
  /**
   * <code>optional int32 PageNumber = 4;</code>
   * @return Whether the pageNumber field is set.
   */
  @java.lang.Override
  public boolean hasPageNumber() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   * <code>optional int32 PageNumber = 4;</code>
   * @return The pageNumber.
   */
  @java.lang.Override
  public int getPageNumber() {
    return pageNumber_;
  }

  public static final int PAGESIZE_FIELD_NUMBER = 5;
  private int pageSize_;
  /**
   * <code>optional int32 PageSize = 5;</code>
   * @return Whether the pageSize field is set.
   */
  @java.lang.Override
  public boolean hasPageSize() {
    return ((bitField0_ & 0x00000010) != 0);
  }
  /**
   * <code>optional int32 PageSize = 5;</code>
   * @return The pageSize.
   */
  @java.lang.Override
  public int getPageSize() {
    return pageSize_;
  }

  public static final int INNER_FIELD_NUMBER = 6;
  private boolean inner_;
  /**
   * <code>optional bool Inner = 6;</code>
   * @return Whether the inner field is set.
   */
  @java.lang.Override
  public boolean hasInner() {
    return ((bitField0_ & 0x00000020) != 0);
  }
  /**
   * <code>optional bool Inner = 6;</code>
   * @return The inner.
   */
  @java.lang.Override
  public boolean getInner() {
    return inner_;
  }

  public static final int FILTERBY_FIELD_NUMBER = 7;
  private com.mediaassetsdk.FilterBy filterBy_;
  /**
   * <code>optional .FilterBy FilterBy = 7;</code>
   * @return Whether the filterBy field is set.
   */
  @java.lang.Override
  public boolean hasFilterBy() {
    return ((bitField0_ & 0x00000040) != 0);
  }
  /**
   * <code>optional .FilterBy FilterBy = 7;</code>
   * @return The filterBy.
   */
  @java.lang.Override
  public com.mediaassetsdk.FilterBy getFilterBy() {
    return filterBy_ == null ? com.mediaassetsdk.FilterBy.getDefaultInstance() : filterBy_;
  }
  /**
   * <code>optional .FilterBy FilterBy = 7;</code>
   */
  @java.lang.Override
  public com.mediaassetsdk.FilterByOrBuilder getFilterByOrBuilder() {
    return filterBy_ == null ? com.mediaassetsdk.FilterBy.getDefaultInstance() : filterBy_;
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, action_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeInt32(2, tIBusinessID_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeInt32(3, tIProjectID_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      output.writeInt32(4, pageNumber_);
    }
    if (((bitField0_ & 0x00000010) != 0)) {
      output.writeInt32(5, pageSize_);
    }
    if (((bitField0_ & 0x00000020) != 0)) {
      output.writeBool(6, inner_);
    }
    if (((bitField0_ & 0x00000040) != 0)) {
      output.writeMessage(7, getFilterBy());
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
    if (((bitField0_ & 0x00000008) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, pageNumber_);
    }
    if (((bitField0_ & 0x00000010) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, pageSize_);
    }
    if (((bitField0_ & 0x00000020) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(6, inner_);
    }
    if (((bitField0_ & 0x00000040) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(7, getFilterBy());
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
    if (!(obj instanceof com.mediaassetsdk.DescribeMediasRequest)) {
      return super.equals(obj);
    }
    com.mediaassetsdk.DescribeMediasRequest other = (com.mediaassetsdk.DescribeMediasRequest) obj;

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
    if (hasPageNumber() != other.hasPageNumber()) return false;
    if (hasPageNumber()) {
      if (getPageNumber()
          != other.getPageNumber()) return false;
    }
    if (hasPageSize() != other.hasPageSize()) return false;
    if (hasPageSize()) {
      if (getPageSize()
          != other.getPageSize()) return false;
    }
    if (hasInner() != other.hasInner()) return false;
    if (hasInner()) {
      if (getInner()
          != other.getInner()) return false;
    }
    if (hasFilterBy() != other.hasFilterBy()) return false;
    if (hasFilterBy()) {
      if (!getFilterBy()
          .equals(other.getFilterBy())) return false;
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
    if (hasPageNumber()) {
      hash = (37 * hash) + PAGENUMBER_FIELD_NUMBER;
      hash = (53 * hash) + getPageNumber();
    }
    if (hasPageSize()) {
      hash = (37 * hash) + PAGESIZE_FIELD_NUMBER;
      hash = (53 * hash) + getPageSize();
    }
    if (hasInner()) {
      hash = (37 * hash) + INNER_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getInner());
    }
    if (hasFilterBy()) {
      hash = (37 * hash) + FILTERBY_FIELD_NUMBER;
      hash = (53 * hash) + getFilterBy().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.mediaassetsdk.DescribeMediasRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.mediaassetsdk.DescribeMediasRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.mediaassetsdk.DescribeMediasRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.mediaassetsdk.DescribeMediasRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.mediaassetsdk.DescribeMediasRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.mediaassetsdk.DescribeMediasRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.mediaassetsdk.DescribeMediasRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.mediaassetsdk.DescribeMediasRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.mediaassetsdk.DescribeMediasRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.mediaassetsdk.DescribeMediasRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.mediaassetsdk.DescribeMediasRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.mediaassetsdk.DescribeMediasRequest parseFrom(
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
  public static Builder newBuilder(com.mediaassetsdk.DescribeMediasRequest prototype) {
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
   * Protobuf type {@code DescribeMediasRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:DescribeMediasRequest)
      com.mediaassetsdk.DescribeMediasRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.mediaassetsdk.MediaAsset.internal_static_DescribeMediasRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.mediaassetsdk.MediaAsset.internal_static_DescribeMediasRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.mediaassetsdk.DescribeMediasRequest.class, com.mediaassetsdk.DescribeMediasRequest.Builder.class);
    }

    // Construct using com.mediaassetsdk.DescribeMediasRequest.newBuilder()
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
        getFilterByFieldBuilder();
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
      pageNumber_ = 0;
      bitField0_ = (bitField0_ & ~0x00000008);
      pageSize_ = 0;
      bitField0_ = (bitField0_ & ~0x00000010);
      inner_ = false;
      bitField0_ = (bitField0_ & ~0x00000020);
      if (filterByBuilder_ == null) {
        filterBy_ = null;
      } else {
        filterByBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000040);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.mediaassetsdk.MediaAsset.internal_static_DescribeMediasRequest_descriptor;
    }

    @java.lang.Override
    public com.mediaassetsdk.DescribeMediasRequest getDefaultInstanceForType() {
      return com.mediaassetsdk.DescribeMediasRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.mediaassetsdk.DescribeMediasRequest build() {
      com.mediaassetsdk.DescribeMediasRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.mediaassetsdk.DescribeMediasRequest buildPartial() {
      com.mediaassetsdk.DescribeMediasRequest result = new com.mediaassetsdk.DescribeMediasRequest(this);
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
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.pageNumber_ = pageNumber_;
        to_bitField0_ |= 0x00000008;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.pageSize_ = pageSize_;
        to_bitField0_ |= 0x00000010;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.inner_ = inner_;
        to_bitField0_ |= 0x00000020;
      }
      if (((from_bitField0_ & 0x00000040) != 0)) {
        if (filterByBuilder_ == null) {
          result.filterBy_ = filterBy_;
        } else {
          result.filterBy_ = filterByBuilder_.build();
        }
        to_bitField0_ |= 0x00000040;
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
      if (other instanceof com.mediaassetsdk.DescribeMediasRequest) {
        return mergeFrom((com.mediaassetsdk.DescribeMediasRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.mediaassetsdk.DescribeMediasRequest other) {
      if (other == com.mediaassetsdk.DescribeMediasRequest.getDefaultInstance()) return this;
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
      if (other.hasPageNumber()) {
        setPageNumber(other.getPageNumber());
      }
      if (other.hasPageSize()) {
        setPageSize(other.getPageSize());
      }
      if (other.hasInner()) {
        setInner(other.getInner());
      }
      if (other.hasFilterBy()) {
        mergeFilterBy(other.getFilterBy());
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
      com.mediaassetsdk.DescribeMediasRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.mediaassetsdk.DescribeMediasRequest) e.getUnfinishedMessage();
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

    private int pageNumber_ ;
    /**
     * <code>optional int32 PageNumber = 4;</code>
     * @return Whether the pageNumber field is set.
     */
    @java.lang.Override
    public boolean hasPageNumber() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>optional int32 PageNumber = 4;</code>
     * @return The pageNumber.
     */
    @java.lang.Override
    public int getPageNumber() {
      return pageNumber_;
    }
    /**
     * <code>optional int32 PageNumber = 4;</code>
     * @param value The pageNumber to set.
     * @return This builder for chaining.
     */
    public Builder setPageNumber(int value) {
      bitField0_ |= 0x00000008;
      pageNumber_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 PageNumber = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearPageNumber() {
      bitField0_ = (bitField0_ & ~0x00000008);
      pageNumber_ = 0;
      onChanged();
      return this;
    }

    private int pageSize_ ;
    /**
     * <code>optional int32 PageSize = 5;</code>
     * @return Whether the pageSize field is set.
     */
    @java.lang.Override
    public boolean hasPageSize() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <code>optional int32 PageSize = 5;</code>
     * @return The pageSize.
     */
    @java.lang.Override
    public int getPageSize() {
      return pageSize_;
    }
    /**
     * <code>optional int32 PageSize = 5;</code>
     * @param value The pageSize to set.
     * @return This builder for chaining.
     */
    public Builder setPageSize(int value) {
      bitField0_ |= 0x00000010;
      pageSize_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 PageSize = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearPageSize() {
      bitField0_ = (bitField0_ & ~0x00000010);
      pageSize_ = 0;
      onChanged();
      return this;
    }

    private boolean inner_ ;
    /**
     * <code>optional bool Inner = 6;</code>
     * @return Whether the inner field is set.
     */
    @java.lang.Override
    public boolean hasInner() {
      return ((bitField0_ & 0x00000020) != 0);
    }
    /**
     * <code>optional bool Inner = 6;</code>
     * @return The inner.
     */
    @java.lang.Override
    public boolean getInner() {
      return inner_;
    }
    /**
     * <code>optional bool Inner = 6;</code>
     * @param value The inner to set.
     * @return This builder for chaining.
     */
    public Builder setInner(boolean value) {
      bitField0_ |= 0x00000020;
      inner_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool Inner = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearInner() {
      bitField0_ = (bitField0_ & ~0x00000020);
      inner_ = false;
      onChanged();
      return this;
    }

    private com.mediaassetsdk.FilterBy filterBy_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.mediaassetsdk.FilterBy, com.mediaassetsdk.FilterBy.Builder, com.mediaassetsdk.FilterByOrBuilder> filterByBuilder_;
    /**
     * <code>optional .FilterBy FilterBy = 7;</code>
     * @return Whether the filterBy field is set.
     */
    public boolean hasFilterBy() {
      return ((bitField0_ & 0x00000040) != 0);
    }
    /**
     * <code>optional .FilterBy FilterBy = 7;</code>
     * @return The filterBy.
     */
    public com.mediaassetsdk.FilterBy getFilterBy() {
      if (filterByBuilder_ == null) {
        return filterBy_ == null ? com.mediaassetsdk.FilterBy.getDefaultInstance() : filterBy_;
      } else {
        return filterByBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .FilterBy FilterBy = 7;</code>
     */
    public Builder setFilterBy(com.mediaassetsdk.FilterBy value) {
      if (filterByBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        filterBy_ = value;
        onChanged();
      } else {
        filterByBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000040;
      return this;
    }
    /**
     * <code>optional .FilterBy FilterBy = 7;</code>
     */
    public Builder setFilterBy(
        com.mediaassetsdk.FilterBy.Builder builderForValue) {
      if (filterByBuilder_ == null) {
        filterBy_ = builderForValue.build();
        onChanged();
      } else {
        filterByBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000040;
      return this;
    }
    /**
     * <code>optional .FilterBy FilterBy = 7;</code>
     */
    public Builder mergeFilterBy(com.mediaassetsdk.FilterBy value) {
      if (filterByBuilder_ == null) {
        if (((bitField0_ & 0x00000040) != 0) &&
            filterBy_ != null &&
            filterBy_ != com.mediaassetsdk.FilterBy.getDefaultInstance()) {
          filterBy_ =
            com.mediaassetsdk.FilterBy.newBuilder(filterBy_).mergeFrom(value).buildPartial();
        } else {
          filterBy_ = value;
        }
        onChanged();
      } else {
        filterByBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000040;
      return this;
    }
    /**
     * <code>optional .FilterBy FilterBy = 7;</code>
     */
    public Builder clearFilterBy() {
      if (filterByBuilder_ == null) {
        filterBy_ = null;
        onChanged();
      } else {
        filterByBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000040);
      return this;
    }
    /**
     * <code>optional .FilterBy FilterBy = 7;</code>
     */
    public com.mediaassetsdk.FilterBy.Builder getFilterByBuilder() {
      bitField0_ |= 0x00000040;
      onChanged();
      return getFilterByFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .FilterBy FilterBy = 7;</code>
     */
    public com.mediaassetsdk.FilterByOrBuilder getFilterByOrBuilder() {
      if (filterByBuilder_ != null) {
        return filterByBuilder_.getMessageOrBuilder();
      } else {
        return filterBy_ == null ?
            com.mediaassetsdk.FilterBy.getDefaultInstance() : filterBy_;
      }
    }
    /**
     * <code>optional .FilterBy FilterBy = 7;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.mediaassetsdk.FilterBy, com.mediaassetsdk.FilterBy.Builder, com.mediaassetsdk.FilterByOrBuilder> 
        getFilterByFieldBuilder() {
      if (filterByBuilder_ == null) {
        filterByBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.mediaassetsdk.FilterBy, com.mediaassetsdk.FilterBy.Builder, com.mediaassetsdk.FilterByOrBuilder>(
                getFilterBy(),
                getParentForChildren(),
                isClean());
        filterBy_ = null;
      }
      return filterByBuilder_;
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


    // @@protoc_insertion_point(builder_scope:DescribeMediasRequest)
  }

  // @@protoc_insertion_point(class_scope:DescribeMediasRequest)
  private static final com.mediaassetsdk.DescribeMediasRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.mediaassetsdk.DescribeMediasRequest();
  }

  public static com.mediaassetsdk.DescribeMediasRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DescribeMediasRequest>
      PARSER = new com.google.protobuf.AbstractParser<DescribeMediasRequest>() {
    @java.lang.Override
    public DescribeMediasRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DescribeMediasRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DescribeMediasRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DescribeMediasRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.mediaassetsdk.DescribeMediasRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
