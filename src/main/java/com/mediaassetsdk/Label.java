// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MediaAsset.proto

package com.mediaassetsdk;

/**
 * Protobuf type {@code Label}
 */
public final class Label extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Label)
    LabelOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Label.newBuilder() to construct.
  private Label(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Label() {
    type_ = "";
    tag_ = "";
    secondTagSet_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Label();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Label(
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
            type_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            bitField0_ |= 0x00000002;
            tag_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000004) != 0)) {
              secondTagSet_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000004;
            }
            secondTagSet_.add(s);
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
        secondTagSet_ = secondTagSet_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.mediaassetsdk.MediaAsset.internal_static_Label_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.mediaassetsdk.MediaAsset.internal_static_Label_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.mediaassetsdk.Label.class, com.mediaassetsdk.Label.Builder.class);
  }

  private int bitField0_;
  public static final int TYPE_FIELD_NUMBER = 1;
  private volatile java.lang.Object type_;
  /**
   * <code>optional string Type = 1;</code>
   * @return Whether the type field is set.
   */
  @java.lang.Override
  public boolean hasType() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional string Type = 1;</code>
   * @return The type.
   */
  @java.lang.Override
  public java.lang.String getType() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      type_ = s;
      return s;
    }
  }
  /**
   * <code>optional string Type = 1;</code>
   * @return The bytes for type.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTypeBytes() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      type_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TAG_FIELD_NUMBER = 2;
  private volatile java.lang.Object tag_;
  /**
   * <code>optional string Tag = 2;</code>
   * @return Whether the tag field is set.
   */
  @java.lang.Override
  public boolean hasTag() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional string Tag = 2;</code>
   * @return The tag.
   */
  @java.lang.Override
  public java.lang.String getTag() {
    java.lang.Object ref = tag_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      tag_ = s;
      return s;
    }
  }
  /**
   * <code>optional string Tag = 2;</code>
   * @return The bytes for tag.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTagBytes() {
    java.lang.Object ref = tag_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      tag_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SECONDTAGSET_FIELD_NUMBER = 3;
  private com.google.protobuf.LazyStringList secondTagSet_;
  /**
   * <code>repeated string SecondTagSet = 3;</code>
   * @return A list containing the secondTagSet.
   */
  public com.google.protobuf.ProtocolStringList
      getSecondTagSetList() {
    return secondTagSet_;
  }
  /**
   * <code>repeated string SecondTagSet = 3;</code>
   * @return The count of secondTagSet.
   */
  public int getSecondTagSetCount() {
    return secondTagSet_.size();
  }
  /**
   * <code>repeated string SecondTagSet = 3;</code>
   * @param index The index of the element to return.
   * @return The secondTagSet at the given index.
   */
  public java.lang.String getSecondTagSet(int index) {
    return secondTagSet_.get(index);
  }
  /**
   * <code>repeated string SecondTagSet = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the secondTagSet at the given index.
   */
  public com.google.protobuf.ByteString
      getSecondTagSetBytes(int index) {
    return secondTagSet_.getByteString(index);
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, type_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, tag_);
    }
    for (int i = 0; i < secondTagSet_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, secondTagSet_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, type_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, tag_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < secondTagSet_.size(); i++) {
        dataSize += computeStringSizeNoTag(secondTagSet_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getSecondTagSetList().size();
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
    if (!(obj instanceof com.mediaassetsdk.Label)) {
      return super.equals(obj);
    }
    com.mediaassetsdk.Label other = (com.mediaassetsdk.Label) obj;

    if (hasType() != other.hasType()) return false;
    if (hasType()) {
      if (!getType()
          .equals(other.getType())) return false;
    }
    if (hasTag() != other.hasTag()) return false;
    if (hasTag()) {
      if (!getTag()
          .equals(other.getTag())) return false;
    }
    if (!getSecondTagSetList()
        .equals(other.getSecondTagSetList())) return false;
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
    if (hasType()) {
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getType().hashCode();
    }
    if (hasTag()) {
      hash = (37 * hash) + TAG_FIELD_NUMBER;
      hash = (53 * hash) + getTag().hashCode();
    }
    if (getSecondTagSetCount() > 0) {
      hash = (37 * hash) + SECONDTAGSET_FIELD_NUMBER;
      hash = (53 * hash) + getSecondTagSetList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.mediaassetsdk.Label parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.mediaassetsdk.Label parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.mediaassetsdk.Label parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.mediaassetsdk.Label parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.mediaassetsdk.Label parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.mediaassetsdk.Label parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.mediaassetsdk.Label parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.mediaassetsdk.Label parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.mediaassetsdk.Label parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.mediaassetsdk.Label parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.mediaassetsdk.Label parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.mediaassetsdk.Label parseFrom(
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
  public static Builder newBuilder(com.mediaassetsdk.Label prototype) {
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
   * Protobuf type {@code Label}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Label)
      com.mediaassetsdk.LabelOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.mediaassetsdk.MediaAsset.internal_static_Label_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.mediaassetsdk.MediaAsset.internal_static_Label_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.mediaassetsdk.Label.class, com.mediaassetsdk.Label.Builder.class);
    }

    // Construct using com.mediaassetsdk.Label.newBuilder()
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
      type_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      tag_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      secondTagSet_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.mediaassetsdk.MediaAsset.internal_static_Label_descriptor;
    }

    @java.lang.Override
    public com.mediaassetsdk.Label getDefaultInstanceForType() {
      return com.mediaassetsdk.Label.getDefaultInstance();
    }

    @java.lang.Override
    public com.mediaassetsdk.Label build() {
      com.mediaassetsdk.Label result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.mediaassetsdk.Label buildPartial() {
      com.mediaassetsdk.Label result = new com.mediaassetsdk.Label(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.type_ = type_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.tag_ = tag_;
      if (((bitField0_ & 0x00000004) != 0)) {
        secondTagSet_ = secondTagSet_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000004);
      }
      result.secondTagSet_ = secondTagSet_;
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
      if (other instanceof com.mediaassetsdk.Label) {
        return mergeFrom((com.mediaassetsdk.Label)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.mediaassetsdk.Label other) {
      if (other == com.mediaassetsdk.Label.getDefaultInstance()) return this;
      if (other.hasType()) {
        bitField0_ |= 0x00000001;
        type_ = other.type_;
        onChanged();
      }
      if (other.hasTag()) {
        bitField0_ |= 0x00000002;
        tag_ = other.tag_;
        onChanged();
      }
      if (!other.secondTagSet_.isEmpty()) {
        if (secondTagSet_.isEmpty()) {
          secondTagSet_ = other.secondTagSet_;
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          ensureSecondTagSetIsMutable();
          secondTagSet_.addAll(other.secondTagSet_);
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
      com.mediaassetsdk.Label parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.mediaassetsdk.Label) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object type_ = "";
    /**
     * <code>optional string Type = 1;</code>
     * @return Whether the type field is set.
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional string Type = 1;</code>
     * @return The type.
     */
    public java.lang.String getType() {
      java.lang.Object ref = type_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        type_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string Type = 1;</code>
     * @return The bytes for type.
     */
    public com.google.protobuf.ByteString
        getTypeBytes() {
      java.lang.Object ref = type_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string Type = 1;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string Type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      type_ = getDefaultInstance().getType();
      onChanged();
      return this;
    }
    /**
     * <code>optional string Type = 1;</code>
     * @param value The bytes for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000001;
      type_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object tag_ = "";
    /**
     * <code>optional string Tag = 2;</code>
     * @return Whether the tag field is set.
     */
    public boolean hasTag() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional string Tag = 2;</code>
     * @return The tag.
     */
    public java.lang.String getTag() {
      java.lang.Object ref = tag_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        tag_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string Tag = 2;</code>
     * @return The bytes for tag.
     */
    public com.google.protobuf.ByteString
        getTagBytes() {
      java.lang.Object ref = tag_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        tag_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string Tag = 2;</code>
     * @param value The tag to set.
     * @return This builder for chaining.
     */
    public Builder setTag(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      tag_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string Tag = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTag() {
      bitField0_ = (bitField0_ & ~0x00000002);
      tag_ = getDefaultInstance().getTag();
      onChanged();
      return this;
    }
    /**
     * <code>optional string Tag = 2;</code>
     * @param value The bytes for tag to set.
     * @return This builder for chaining.
     */
    public Builder setTagBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000002;
      tag_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList secondTagSet_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureSecondTagSetIsMutable() {
      if (!((bitField0_ & 0x00000004) != 0)) {
        secondTagSet_ = new com.google.protobuf.LazyStringArrayList(secondTagSet_);
        bitField0_ |= 0x00000004;
       }
    }
    /**
     * <code>repeated string SecondTagSet = 3;</code>
     * @return A list containing the secondTagSet.
     */
    public com.google.protobuf.ProtocolStringList
        getSecondTagSetList() {
      return secondTagSet_.getUnmodifiableView();
    }
    /**
     * <code>repeated string SecondTagSet = 3;</code>
     * @return The count of secondTagSet.
     */
    public int getSecondTagSetCount() {
      return secondTagSet_.size();
    }
    /**
     * <code>repeated string SecondTagSet = 3;</code>
     * @param index The index of the element to return.
     * @return The secondTagSet at the given index.
     */
    public java.lang.String getSecondTagSet(int index) {
      return secondTagSet_.get(index);
    }
    /**
     * <code>repeated string SecondTagSet = 3;</code>
     * @param index The index of the value to return.
     * @return The bytes of the secondTagSet at the given index.
     */
    public com.google.protobuf.ByteString
        getSecondTagSetBytes(int index) {
      return secondTagSet_.getByteString(index);
    }
    /**
     * <code>repeated string SecondTagSet = 3;</code>
     * @param index The index to set the value at.
     * @param value The secondTagSet to set.
     * @return This builder for chaining.
     */
    public Builder setSecondTagSet(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureSecondTagSetIsMutable();
      secondTagSet_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string SecondTagSet = 3;</code>
     * @param value The secondTagSet to add.
     * @return This builder for chaining.
     */
    public Builder addSecondTagSet(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureSecondTagSetIsMutable();
      secondTagSet_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string SecondTagSet = 3;</code>
     * @param values The secondTagSet to add.
     * @return This builder for chaining.
     */
    public Builder addAllSecondTagSet(
        java.lang.Iterable<java.lang.String> values) {
      ensureSecondTagSetIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, secondTagSet_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string SecondTagSet = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearSecondTagSet() {
      secondTagSet_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string SecondTagSet = 3;</code>
     * @param value The bytes of the secondTagSet to add.
     * @return This builder for chaining.
     */
    public Builder addSecondTagSetBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureSecondTagSetIsMutable();
      secondTagSet_.add(value);
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


    // @@protoc_insertion_point(builder_scope:Label)
  }

  // @@protoc_insertion_point(class_scope:Label)
  private static final com.mediaassetsdk.Label DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.mediaassetsdk.Label();
  }

  public static com.mediaassetsdk.Label getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Label>
      PARSER = new com.google.protobuf.AbstractParser<Label>() {
    @java.lang.Override
    public Label parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Label(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Label> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Label> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.mediaassetsdk.Label getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
