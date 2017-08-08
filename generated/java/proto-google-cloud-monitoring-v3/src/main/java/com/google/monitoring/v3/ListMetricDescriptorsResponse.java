// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/v3/metric_service.proto

package com.google.monitoring.v3;

/**
 * <pre>
 * The `ListMetricDescriptors` response.
 * </pre>
 *
 * Protobuf type {@code google.monitoring.v3.ListMetricDescriptorsResponse}
 */
public  final class ListMetricDescriptorsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.monitoring.v3.ListMetricDescriptorsResponse)
    ListMetricDescriptorsResponseOrBuilder {
  // Use ListMetricDescriptorsResponse.newBuilder() to construct.
  private ListMetricDescriptorsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListMetricDescriptorsResponse() {
    metricDescriptors_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ListMetricDescriptorsResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              metricDescriptors_ = new java.util.ArrayList<com.google.api.MetricDescriptor>();
              mutable_bitField0_ |= 0x00000001;
            }
            metricDescriptors_.add(
                input.readMessage(com.google.api.MetricDescriptor.parser(), extensionRegistry));
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            nextPageToken_ = s;
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        metricDescriptors_ = java.util.Collections.unmodifiableList(metricDescriptors_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.monitoring.v3.MetricServiceProto.internal_static_google_monitoring_v3_ListMetricDescriptorsResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.monitoring.v3.MetricServiceProto.internal_static_google_monitoring_v3_ListMetricDescriptorsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.monitoring.v3.ListMetricDescriptorsResponse.class, com.google.monitoring.v3.ListMetricDescriptorsResponse.Builder.class);
  }

  private int bitField0_;
  public static final int METRIC_DESCRIPTORS_FIELD_NUMBER = 1;
  private java.util.List<com.google.api.MetricDescriptor> metricDescriptors_;
  /**
   * <pre>
   * The metric descriptors that are available to the project
   * and that match the value of `filter`, if present.
   * </pre>
   *
   * <code>repeated .google.api.MetricDescriptor metric_descriptors = 1;</code>
   */
  public java.util.List<com.google.api.MetricDescriptor> getMetricDescriptorsList() {
    return metricDescriptors_;
  }
  /**
   * <pre>
   * The metric descriptors that are available to the project
   * and that match the value of `filter`, if present.
   * </pre>
   *
   * <code>repeated .google.api.MetricDescriptor metric_descriptors = 1;</code>
   */
  public java.util.List<? extends com.google.api.MetricDescriptorOrBuilder> 
      getMetricDescriptorsOrBuilderList() {
    return metricDescriptors_;
  }
  /**
   * <pre>
   * The metric descriptors that are available to the project
   * and that match the value of `filter`, if present.
   * </pre>
   *
   * <code>repeated .google.api.MetricDescriptor metric_descriptors = 1;</code>
   */
  public int getMetricDescriptorsCount() {
    return metricDescriptors_.size();
  }
  /**
   * <pre>
   * The metric descriptors that are available to the project
   * and that match the value of `filter`, if present.
   * </pre>
   *
   * <code>repeated .google.api.MetricDescriptor metric_descriptors = 1;</code>
   */
  public com.google.api.MetricDescriptor getMetricDescriptors(int index) {
    return metricDescriptors_.get(index);
  }
  /**
   * <pre>
   * The metric descriptors that are available to the project
   * and that match the value of `filter`, if present.
   * </pre>
   *
   * <code>repeated .google.api.MetricDescriptor metric_descriptors = 1;</code>
   */
  public com.google.api.MetricDescriptorOrBuilder getMetricDescriptorsOrBuilder(
      int index) {
    return metricDescriptors_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   * <pre>
   * If there are more results than have been returned, then this field is set
   * to a non-empty value.  To see the additional results,
   * use that value as `pageToken` in the next call to this method.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * If there are more results than have been returned, then this field is set
   * to a non-empty value.  To see the additional results,
   * use that value as `pageToken` in the next call to this method.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextPageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < metricDescriptors_.size(); i++) {
      output.writeMessage(1, metricDescriptors_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < metricDescriptors_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, metricDescriptors_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.monitoring.v3.ListMetricDescriptorsResponse)) {
      return super.equals(obj);
    }
    com.google.monitoring.v3.ListMetricDescriptorsResponse other = (com.google.monitoring.v3.ListMetricDescriptorsResponse) obj;

    boolean result = true;
    result = result && getMetricDescriptorsList()
        .equals(other.getMetricDescriptorsList());
    result = result && getNextPageToken()
        .equals(other.getNextPageToken());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getMetricDescriptorsCount() > 0) {
      hash = (37 * hash) + METRIC_DESCRIPTORS_FIELD_NUMBER;
      hash = (53 * hash) + getMetricDescriptorsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.monitoring.v3.ListMetricDescriptorsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.monitoring.v3.ListMetricDescriptorsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.monitoring.v3.ListMetricDescriptorsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.monitoring.v3.ListMetricDescriptorsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.monitoring.v3.ListMetricDescriptorsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.monitoring.v3.ListMetricDescriptorsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.monitoring.v3.ListMetricDescriptorsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.monitoring.v3.ListMetricDescriptorsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.monitoring.v3.ListMetricDescriptorsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.monitoring.v3.ListMetricDescriptorsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.monitoring.v3.ListMetricDescriptorsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.monitoring.v3.ListMetricDescriptorsResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.monitoring.v3.ListMetricDescriptorsResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * <pre>
   * The `ListMetricDescriptors` response.
   * </pre>
   *
   * Protobuf type {@code google.monitoring.v3.ListMetricDescriptorsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.monitoring.v3.ListMetricDescriptorsResponse)
      com.google.monitoring.v3.ListMetricDescriptorsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.monitoring.v3.MetricServiceProto.internal_static_google_monitoring_v3_ListMetricDescriptorsResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.monitoring.v3.MetricServiceProto.internal_static_google_monitoring_v3_ListMetricDescriptorsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.monitoring.v3.ListMetricDescriptorsResponse.class, com.google.monitoring.v3.ListMetricDescriptorsResponse.Builder.class);
    }

    // Construct using com.google.monitoring.v3.ListMetricDescriptorsResponse.newBuilder()
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
        getMetricDescriptorsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (metricDescriptorsBuilder_ == null) {
        metricDescriptors_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        metricDescriptorsBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.monitoring.v3.MetricServiceProto.internal_static_google_monitoring_v3_ListMetricDescriptorsResponse_descriptor;
    }

    public com.google.monitoring.v3.ListMetricDescriptorsResponse getDefaultInstanceForType() {
      return com.google.monitoring.v3.ListMetricDescriptorsResponse.getDefaultInstance();
    }

    public com.google.monitoring.v3.ListMetricDescriptorsResponse build() {
      com.google.monitoring.v3.ListMetricDescriptorsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.monitoring.v3.ListMetricDescriptorsResponse buildPartial() {
      com.google.monitoring.v3.ListMetricDescriptorsResponse result = new com.google.monitoring.v3.ListMetricDescriptorsResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (metricDescriptorsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          metricDescriptors_ = java.util.Collections.unmodifiableList(metricDescriptors_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.metricDescriptors_ = metricDescriptors_;
      } else {
        result.metricDescriptors_ = metricDescriptorsBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.monitoring.v3.ListMetricDescriptorsResponse) {
        return mergeFrom((com.google.monitoring.v3.ListMetricDescriptorsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.monitoring.v3.ListMetricDescriptorsResponse other) {
      if (other == com.google.monitoring.v3.ListMetricDescriptorsResponse.getDefaultInstance()) return this;
      if (metricDescriptorsBuilder_ == null) {
        if (!other.metricDescriptors_.isEmpty()) {
          if (metricDescriptors_.isEmpty()) {
            metricDescriptors_ = other.metricDescriptors_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMetricDescriptorsIsMutable();
            metricDescriptors_.addAll(other.metricDescriptors_);
          }
          onChanged();
        }
      } else {
        if (!other.metricDescriptors_.isEmpty()) {
          if (metricDescriptorsBuilder_.isEmpty()) {
            metricDescriptorsBuilder_.dispose();
            metricDescriptorsBuilder_ = null;
            metricDescriptors_ = other.metricDescriptors_;
            bitField0_ = (bitField0_ & ~0x00000001);
            metricDescriptorsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getMetricDescriptorsFieldBuilder() : null;
          } else {
            metricDescriptorsBuilder_.addAllMessages(other.metricDescriptors_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        onChanged();
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.monitoring.v3.ListMetricDescriptorsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.monitoring.v3.ListMetricDescriptorsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.api.MetricDescriptor> metricDescriptors_ =
      java.util.Collections.emptyList();
    private void ensureMetricDescriptorsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        metricDescriptors_ = new java.util.ArrayList<com.google.api.MetricDescriptor>(metricDescriptors_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.api.MetricDescriptor, com.google.api.MetricDescriptor.Builder, com.google.api.MetricDescriptorOrBuilder> metricDescriptorsBuilder_;

    /**
     * <pre>
     * The metric descriptors that are available to the project
     * and that match the value of `filter`, if present.
     * </pre>
     *
     * <code>repeated .google.api.MetricDescriptor metric_descriptors = 1;</code>
     */
    public java.util.List<com.google.api.MetricDescriptor> getMetricDescriptorsList() {
      if (metricDescriptorsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(metricDescriptors_);
      } else {
        return metricDescriptorsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The metric descriptors that are available to the project
     * and that match the value of `filter`, if present.
     * </pre>
     *
     * <code>repeated .google.api.MetricDescriptor metric_descriptors = 1;</code>
     */
    public int getMetricDescriptorsCount() {
      if (metricDescriptorsBuilder_ == null) {
        return metricDescriptors_.size();
      } else {
        return metricDescriptorsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The metric descriptors that are available to the project
     * and that match the value of `filter`, if present.
     * </pre>
     *
     * <code>repeated .google.api.MetricDescriptor metric_descriptors = 1;</code>
     */
    public com.google.api.MetricDescriptor getMetricDescriptors(int index) {
      if (metricDescriptorsBuilder_ == null) {
        return metricDescriptors_.get(index);
      } else {
        return metricDescriptorsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The metric descriptors that are available to the project
     * and that match the value of `filter`, if present.
     * </pre>
     *
     * <code>repeated .google.api.MetricDescriptor metric_descriptors = 1;</code>
     */
    public Builder setMetricDescriptors(
        int index, com.google.api.MetricDescriptor value) {
      if (metricDescriptorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMetricDescriptorsIsMutable();
        metricDescriptors_.set(index, value);
        onChanged();
      } else {
        metricDescriptorsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The metric descriptors that are available to the project
     * and that match the value of `filter`, if present.
     * </pre>
     *
     * <code>repeated .google.api.MetricDescriptor metric_descriptors = 1;</code>
     */
    public Builder setMetricDescriptors(
        int index, com.google.api.MetricDescriptor.Builder builderForValue) {
      if (metricDescriptorsBuilder_ == null) {
        ensureMetricDescriptorsIsMutable();
        metricDescriptors_.set(index, builderForValue.build());
        onChanged();
      } else {
        metricDescriptorsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The metric descriptors that are available to the project
     * and that match the value of `filter`, if present.
     * </pre>
     *
     * <code>repeated .google.api.MetricDescriptor metric_descriptors = 1;</code>
     */
    public Builder addMetricDescriptors(com.google.api.MetricDescriptor value) {
      if (metricDescriptorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMetricDescriptorsIsMutable();
        metricDescriptors_.add(value);
        onChanged();
      } else {
        metricDescriptorsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The metric descriptors that are available to the project
     * and that match the value of `filter`, if present.
     * </pre>
     *
     * <code>repeated .google.api.MetricDescriptor metric_descriptors = 1;</code>
     */
    public Builder addMetricDescriptors(
        int index, com.google.api.MetricDescriptor value) {
      if (metricDescriptorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMetricDescriptorsIsMutable();
        metricDescriptors_.add(index, value);
        onChanged();
      } else {
        metricDescriptorsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The metric descriptors that are available to the project
     * and that match the value of `filter`, if present.
     * </pre>
     *
     * <code>repeated .google.api.MetricDescriptor metric_descriptors = 1;</code>
     */
    public Builder addMetricDescriptors(
        com.google.api.MetricDescriptor.Builder builderForValue) {
      if (metricDescriptorsBuilder_ == null) {
        ensureMetricDescriptorsIsMutable();
        metricDescriptors_.add(builderForValue.build());
        onChanged();
      } else {
        metricDescriptorsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The metric descriptors that are available to the project
     * and that match the value of `filter`, if present.
     * </pre>
     *
     * <code>repeated .google.api.MetricDescriptor metric_descriptors = 1;</code>
     */
    public Builder addMetricDescriptors(
        int index, com.google.api.MetricDescriptor.Builder builderForValue) {
      if (metricDescriptorsBuilder_ == null) {
        ensureMetricDescriptorsIsMutable();
        metricDescriptors_.add(index, builderForValue.build());
        onChanged();
      } else {
        metricDescriptorsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The metric descriptors that are available to the project
     * and that match the value of `filter`, if present.
     * </pre>
     *
     * <code>repeated .google.api.MetricDescriptor metric_descriptors = 1;</code>
     */
    public Builder addAllMetricDescriptors(
        java.lang.Iterable<? extends com.google.api.MetricDescriptor> values) {
      if (metricDescriptorsBuilder_ == null) {
        ensureMetricDescriptorsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, metricDescriptors_);
        onChanged();
      } else {
        metricDescriptorsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The metric descriptors that are available to the project
     * and that match the value of `filter`, if present.
     * </pre>
     *
     * <code>repeated .google.api.MetricDescriptor metric_descriptors = 1;</code>
     */
    public Builder clearMetricDescriptors() {
      if (metricDescriptorsBuilder_ == null) {
        metricDescriptors_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        metricDescriptorsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The metric descriptors that are available to the project
     * and that match the value of `filter`, if present.
     * </pre>
     *
     * <code>repeated .google.api.MetricDescriptor metric_descriptors = 1;</code>
     */
    public Builder removeMetricDescriptors(int index) {
      if (metricDescriptorsBuilder_ == null) {
        ensureMetricDescriptorsIsMutable();
        metricDescriptors_.remove(index);
        onChanged();
      } else {
        metricDescriptorsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The metric descriptors that are available to the project
     * and that match the value of `filter`, if present.
     * </pre>
     *
     * <code>repeated .google.api.MetricDescriptor metric_descriptors = 1;</code>
     */
    public com.google.api.MetricDescriptor.Builder getMetricDescriptorsBuilder(
        int index) {
      return getMetricDescriptorsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The metric descriptors that are available to the project
     * and that match the value of `filter`, if present.
     * </pre>
     *
     * <code>repeated .google.api.MetricDescriptor metric_descriptors = 1;</code>
     */
    public com.google.api.MetricDescriptorOrBuilder getMetricDescriptorsOrBuilder(
        int index) {
      if (metricDescriptorsBuilder_ == null) {
        return metricDescriptors_.get(index);  } else {
        return metricDescriptorsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The metric descriptors that are available to the project
     * and that match the value of `filter`, if present.
     * </pre>
     *
     * <code>repeated .google.api.MetricDescriptor metric_descriptors = 1;</code>
     */
    public java.util.List<? extends com.google.api.MetricDescriptorOrBuilder> 
         getMetricDescriptorsOrBuilderList() {
      if (metricDescriptorsBuilder_ != null) {
        return metricDescriptorsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(metricDescriptors_);
      }
    }
    /**
     * <pre>
     * The metric descriptors that are available to the project
     * and that match the value of `filter`, if present.
     * </pre>
     *
     * <code>repeated .google.api.MetricDescriptor metric_descriptors = 1;</code>
     */
    public com.google.api.MetricDescriptor.Builder addMetricDescriptorsBuilder() {
      return getMetricDescriptorsFieldBuilder().addBuilder(
          com.google.api.MetricDescriptor.getDefaultInstance());
    }
    /**
     * <pre>
     * The metric descriptors that are available to the project
     * and that match the value of `filter`, if present.
     * </pre>
     *
     * <code>repeated .google.api.MetricDescriptor metric_descriptors = 1;</code>
     */
    public com.google.api.MetricDescriptor.Builder addMetricDescriptorsBuilder(
        int index) {
      return getMetricDescriptorsFieldBuilder().addBuilder(
          index, com.google.api.MetricDescriptor.getDefaultInstance());
    }
    /**
     * <pre>
     * The metric descriptors that are available to the project
     * and that match the value of `filter`, if present.
     * </pre>
     *
     * <code>repeated .google.api.MetricDescriptor metric_descriptors = 1;</code>
     */
    public java.util.List<com.google.api.MetricDescriptor.Builder> 
         getMetricDescriptorsBuilderList() {
      return getMetricDescriptorsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.api.MetricDescriptor, com.google.api.MetricDescriptor.Builder, com.google.api.MetricDescriptorOrBuilder> 
        getMetricDescriptorsFieldBuilder() {
      if (metricDescriptorsBuilder_ == null) {
        metricDescriptorsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.api.MetricDescriptor, com.google.api.MetricDescriptor.Builder, com.google.api.MetricDescriptorOrBuilder>(
                metricDescriptors_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        metricDescriptors_ = null;
      }
      return metricDescriptorsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * If there are more results than have been returned, then this field is set
     * to a non-empty value.  To see the additional results,
     * use that value as `pageToken` in the next call to this method.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * If there are more results than have been returned, then this field is set
     * to a non-empty value.  To see the additional results,
     * use that value as `pageToken` in the next call to this method.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * If there are more results than have been returned, then this field is set
     * to a non-empty value.  To see the additional results,
     * use that value as `pageToken` in the next call to this method.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If there are more results than have been returned, then this field is set
     * to a non-empty value.  To see the additional results,
     * use that value as `pageToken` in the next call to this method.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder clearNextPageToken() {
      
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If there are more results than have been returned, then this field is set
     * to a non-empty value.  To see the additional results,
     * use that value as `pageToken` in the next call to this method.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.monitoring.v3.ListMetricDescriptorsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.monitoring.v3.ListMetricDescriptorsResponse)
  private static final com.google.monitoring.v3.ListMetricDescriptorsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.monitoring.v3.ListMetricDescriptorsResponse();
  }

  public static com.google.monitoring.v3.ListMetricDescriptorsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListMetricDescriptorsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListMetricDescriptorsResponse>() {
    public ListMetricDescriptorsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ListMetricDescriptorsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListMetricDescriptorsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListMetricDescriptorsResponse> getParserForType() {
    return PARSER;
  }

  public com.google.monitoring.v3.ListMetricDescriptorsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

