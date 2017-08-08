// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/pubsub/v1/pubsub.proto

package com.google.pubsub.v1;

/**
 * <pre>
 * Request for the UpdateTopic method.
 * </pre>
 *
 * Protobuf type {@code google.pubsub.v1.UpdateTopicRequest}
 */
public  final class UpdateTopicRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.pubsub.v1.UpdateTopicRequest)
    UpdateTopicRequestOrBuilder {
  // Use UpdateTopicRequest.newBuilder() to construct.
  private UpdateTopicRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateTopicRequest() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private UpdateTopicRequest(
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
            com.google.pubsub.v1.Topic.Builder subBuilder = null;
            if (topic_ != null) {
              subBuilder = topic_.toBuilder();
            }
            topic_ = input.readMessage(com.google.pubsub.v1.Topic.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(topic_);
              topic_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.protobuf.FieldMask.Builder subBuilder = null;
            if (updateMask_ != null) {
              subBuilder = updateMask_.toBuilder();
            }
            updateMask_ = input.readMessage(com.google.protobuf.FieldMask.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(updateMask_);
              updateMask_ = subBuilder.buildPartial();
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
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.pubsub.v1.PubsubProto.internal_static_google_pubsub_v1_UpdateTopicRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.pubsub.v1.PubsubProto.internal_static_google_pubsub_v1_UpdateTopicRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.pubsub.v1.UpdateTopicRequest.class, com.google.pubsub.v1.UpdateTopicRequest.Builder.class);
  }

  public static final int TOPIC_FIELD_NUMBER = 1;
  private com.google.pubsub.v1.Topic topic_;
  /**
   * <pre>
   * The topic to update.
   * </pre>
   *
   * <code>.google.pubsub.v1.Topic topic = 1;</code>
   */
  public boolean hasTopic() {
    return topic_ != null;
  }
  /**
   * <pre>
   * The topic to update.
   * </pre>
   *
   * <code>.google.pubsub.v1.Topic topic = 1;</code>
   */
  public com.google.pubsub.v1.Topic getTopic() {
    return topic_ == null ? com.google.pubsub.v1.Topic.getDefaultInstance() : topic_;
  }
  /**
   * <pre>
   * The topic to update.
   * </pre>
   *
   * <code>.google.pubsub.v1.Topic topic = 1;</code>
   */
  public com.google.pubsub.v1.TopicOrBuilder getTopicOrBuilder() {
    return getTopic();
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * Indicates which fields in the provided topic to update.
   * Must be specified and non-empty.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   * <pre>
   * Indicates which fields in the provided topic to update.
   * Must be specified and non-empty.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   * <pre>
   * Indicates which fields in the provided topic to update.
   * Must be specified and non-empty.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return getUpdateMask();
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
    if (topic_ != null) {
      output.writeMessage(1, getTopic());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (topic_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getTopic());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getUpdateMask());
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
    if (!(obj instanceof com.google.pubsub.v1.UpdateTopicRequest)) {
      return super.equals(obj);
    }
    com.google.pubsub.v1.UpdateTopicRequest other = (com.google.pubsub.v1.UpdateTopicRequest) obj;

    boolean result = true;
    result = result && (hasTopic() == other.hasTopic());
    if (hasTopic()) {
      result = result && getTopic()
          .equals(other.getTopic());
    }
    result = result && (hasUpdateMask() == other.hasUpdateMask());
    if (hasUpdateMask()) {
      result = result && getUpdateMask()
          .equals(other.getUpdateMask());
    }
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasTopic()) {
      hash = (37 * hash) + TOPIC_FIELD_NUMBER;
      hash = (53 * hash) + getTopic().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.pubsub.v1.UpdateTopicRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.pubsub.v1.UpdateTopicRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.pubsub.v1.UpdateTopicRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.pubsub.v1.UpdateTopicRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.pubsub.v1.UpdateTopicRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.pubsub.v1.UpdateTopicRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.pubsub.v1.UpdateTopicRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.pubsub.v1.UpdateTopicRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.pubsub.v1.UpdateTopicRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.pubsub.v1.UpdateTopicRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.pubsub.v1.UpdateTopicRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.pubsub.v1.UpdateTopicRequest parseFrom(
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
  public static Builder newBuilder(com.google.pubsub.v1.UpdateTopicRequest prototype) {
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
   * Request for the UpdateTopic method.
   * </pre>
   *
   * Protobuf type {@code google.pubsub.v1.UpdateTopicRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.pubsub.v1.UpdateTopicRequest)
      com.google.pubsub.v1.UpdateTopicRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.pubsub.v1.PubsubProto.internal_static_google_pubsub_v1_UpdateTopicRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.pubsub.v1.PubsubProto.internal_static_google_pubsub_v1_UpdateTopicRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.pubsub.v1.UpdateTopicRequest.class, com.google.pubsub.v1.UpdateTopicRequest.Builder.class);
    }

    // Construct using com.google.pubsub.v1.UpdateTopicRequest.newBuilder()
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
    public Builder clear() {
      super.clear();
      if (topicBuilder_ == null) {
        topic_ = null;
      } else {
        topic_ = null;
        topicBuilder_ = null;
      }
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.pubsub.v1.PubsubProto.internal_static_google_pubsub_v1_UpdateTopicRequest_descriptor;
    }

    public com.google.pubsub.v1.UpdateTopicRequest getDefaultInstanceForType() {
      return com.google.pubsub.v1.UpdateTopicRequest.getDefaultInstance();
    }

    public com.google.pubsub.v1.UpdateTopicRequest build() {
      com.google.pubsub.v1.UpdateTopicRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.pubsub.v1.UpdateTopicRequest buildPartial() {
      com.google.pubsub.v1.UpdateTopicRequest result = new com.google.pubsub.v1.UpdateTopicRequest(this);
      if (topicBuilder_ == null) {
        result.topic_ = topic_;
      } else {
        result.topic_ = topicBuilder_.build();
      }
      if (updateMaskBuilder_ == null) {
        result.updateMask_ = updateMask_;
      } else {
        result.updateMask_ = updateMaskBuilder_.build();
      }
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
      if (other instanceof com.google.pubsub.v1.UpdateTopicRequest) {
        return mergeFrom((com.google.pubsub.v1.UpdateTopicRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.pubsub.v1.UpdateTopicRequest other) {
      if (other == com.google.pubsub.v1.UpdateTopicRequest.getDefaultInstance()) return this;
      if (other.hasTopic()) {
        mergeTopic(other.getTopic());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
      com.google.pubsub.v1.UpdateTopicRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.pubsub.v1.UpdateTopicRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.pubsub.v1.Topic topic_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.pubsub.v1.Topic, com.google.pubsub.v1.Topic.Builder, com.google.pubsub.v1.TopicOrBuilder> topicBuilder_;
    /**
     * <pre>
     * The topic to update.
     * </pre>
     *
     * <code>.google.pubsub.v1.Topic topic = 1;</code>
     */
    public boolean hasTopic() {
      return topicBuilder_ != null || topic_ != null;
    }
    /**
     * <pre>
     * The topic to update.
     * </pre>
     *
     * <code>.google.pubsub.v1.Topic topic = 1;</code>
     */
    public com.google.pubsub.v1.Topic getTopic() {
      if (topicBuilder_ == null) {
        return topic_ == null ? com.google.pubsub.v1.Topic.getDefaultInstance() : topic_;
      } else {
        return topicBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The topic to update.
     * </pre>
     *
     * <code>.google.pubsub.v1.Topic topic = 1;</code>
     */
    public Builder setTopic(com.google.pubsub.v1.Topic value) {
      if (topicBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        topic_ = value;
        onChanged();
      } else {
        topicBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The topic to update.
     * </pre>
     *
     * <code>.google.pubsub.v1.Topic topic = 1;</code>
     */
    public Builder setTopic(
        com.google.pubsub.v1.Topic.Builder builderForValue) {
      if (topicBuilder_ == null) {
        topic_ = builderForValue.build();
        onChanged();
      } else {
        topicBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The topic to update.
     * </pre>
     *
     * <code>.google.pubsub.v1.Topic topic = 1;</code>
     */
    public Builder mergeTopic(com.google.pubsub.v1.Topic value) {
      if (topicBuilder_ == null) {
        if (topic_ != null) {
          topic_ =
            com.google.pubsub.v1.Topic.newBuilder(topic_).mergeFrom(value).buildPartial();
        } else {
          topic_ = value;
        }
        onChanged();
      } else {
        topicBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The topic to update.
     * </pre>
     *
     * <code>.google.pubsub.v1.Topic topic = 1;</code>
     */
    public Builder clearTopic() {
      if (topicBuilder_ == null) {
        topic_ = null;
        onChanged();
      } else {
        topic_ = null;
        topicBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The topic to update.
     * </pre>
     *
     * <code>.google.pubsub.v1.Topic topic = 1;</code>
     */
    public com.google.pubsub.v1.Topic.Builder getTopicBuilder() {
      
      onChanged();
      return getTopicFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The topic to update.
     * </pre>
     *
     * <code>.google.pubsub.v1.Topic topic = 1;</code>
     */
    public com.google.pubsub.v1.TopicOrBuilder getTopicOrBuilder() {
      if (topicBuilder_ != null) {
        return topicBuilder_.getMessageOrBuilder();
      } else {
        return topic_ == null ?
            com.google.pubsub.v1.Topic.getDefaultInstance() : topic_;
      }
    }
    /**
     * <pre>
     * The topic to update.
     * </pre>
     *
     * <code>.google.pubsub.v1.Topic topic = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.pubsub.v1.Topic, com.google.pubsub.v1.Topic.Builder, com.google.pubsub.v1.TopicOrBuilder> 
        getTopicFieldBuilder() {
      if (topicBuilder_ == null) {
        topicBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.pubsub.v1.Topic, com.google.pubsub.v1.Topic.Builder, com.google.pubsub.v1.TopicOrBuilder>(
                getTopic(),
                getParentForChildren(),
                isClean());
        topic_ = null;
      }
      return topicBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * Indicates which fields in the provided topic to update.
     * Must be specified and non-empty.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public boolean hasUpdateMask() {
      return updateMaskBuilder_ != null || updateMask_ != null;
    }
    /**
     * <pre>
     * Indicates which fields in the provided topic to update.
     * Must be specified and non-empty.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Indicates which fields in the provided topic to update.
     * Must be specified and non-empty.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Indicates which fields in the provided topic to update.
     * Must be specified and non-empty.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Indicates which fields in the provided topic to update.
     * Must be specified and non-empty.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (updateMask_ != null) {
          updateMask_ =
            com.google.protobuf.FieldMask.newBuilder(updateMask_).mergeFrom(value).buildPartial();
        } else {
          updateMask_ = value;
        }
        onChanged();
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Indicates which fields in the provided topic to update.
     * Must be specified and non-empty.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder clearUpdateMask() {
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
        onChanged();
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Indicates which fields in the provided topic to update.
     * Must be specified and non-empty.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Indicates which fields in the provided topic to update.
     * Must be specified and non-empty.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null ?
            com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      }
    }
    /**
     * <pre>
     * Indicates which fields in the provided topic to update.
     * Must be specified and non-empty.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> 
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(),
                getParentForChildren(),
                isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.pubsub.v1.UpdateTopicRequest)
  }

  // @@protoc_insertion_point(class_scope:google.pubsub.v1.UpdateTopicRequest)
  private static final com.google.pubsub.v1.UpdateTopicRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.pubsub.v1.UpdateTopicRequest();
  }

  public static com.google.pubsub.v1.UpdateTopicRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateTopicRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateTopicRequest>() {
    public UpdateTopicRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new UpdateTopicRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdateTopicRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateTopicRequest> getParserForType() {
    return PARSER;
  }

  public com.google.pubsub.v1.UpdateTopicRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

