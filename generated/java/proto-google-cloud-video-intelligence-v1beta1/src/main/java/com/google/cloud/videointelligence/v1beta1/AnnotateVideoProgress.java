// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/videointelligence/v1beta1/video_intelligence.proto

package com.google.cloud.videointelligence.v1beta1;

/**
 * <pre>
 * Video annotation progress. Included in the `metadata`
 * field of the `Operation` returned by the `GetOperation`
 * call of the `google::longrunning::Operations` service.
 * </pre>
 *
 * Protobuf type {@code google.cloud.videointelligence.v1beta1.AnnotateVideoProgress}
 */
public  final class AnnotateVideoProgress extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.videointelligence.v1beta1.AnnotateVideoProgress)
    AnnotateVideoProgressOrBuilder {
  // Use AnnotateVideoProgress.newBuilder() to construct.
  private AnnotateVideoProgress(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AnnotateVideoProgress() {
    annotationProgress_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private AnnotateVideoProgress(
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
              annotationProgress_ = new java.util.ArrayList<com.google.cloud.videointelligence.v1beta1.VideoAnnotationProgress>();
              mutable_bitField0_ |= 0x00000001;
            }
            annotationProgress_.add(
                input.readMessage(com.google.cloud.videointelligence.v1beta1.VideoAnnotationProgress.parser(), extensionRegistry));
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
        annotationProgress_ = java.util.Collections.unmodifiableList(annotationProgress_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.videointelligence.v1beta1.VideoIntelligenceServiceProto.internal_static_google_cloud_videointelligence_v1beta1_AnnotateVideoProgress_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.videointelligence.v1beta1.VideoIntelligenceServiceProto.internal_static_google_cloud_videointelligence_v1beta1_AnnotateVideoProgress_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.videointelligence.v1beta1.AnnotateVideoProgress.class, com.google.cloud.videointelligence.v1beta1.AnnotateVideoProgress.Builder.class);
  }

  public static final int ANNOTATION_PROGRESS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.videointelligence.v1beta1.VideoAnnotationProgress> annotationProgress_;
  /**
   * <pre>
   * Progress metadata for all videos specified in `AnnotateVideoRequest`.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1beta1.VideoAnnotationProgress annotation_progress = 1;</code>
   */
  public java.util.List<com.google.cloud.videointelligence.v1beta1.VideoAnnotationProgress> getAnnotationProgressList() {
    return annotationProgress_;
  }
  /**
   * <pre>
   * Progress metadata for all videos specified in `AnnotateVideoRequest`.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1beta1.VideoAnnotationProgress annotation_progress = 1;</code>
   */
  public java.util.List<? extends com.google.cloud.videointelligence.v1beta1.VideoAnnotationProgressOrBuilder> 
      getAnnotationProgressOrBuilderList() {
    return annotationProgress_;
  }
  /**
   * <pre>
   * Progress metadata for all videos specified in `AnnotateVideoRequest`.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1beta1.VideoAnnotationProgress annotation_progress = 1;</code>
   */
  public int getAnnotationProgressCount() {
    return annotationProgress_.size();
  }
  /**
   * <pre>
   * Progress metadata for all videos specified in `AnnotateVideoRequest`.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1beta1.VideoAnnotationProgress annotation_progress = 1;</code>
   */
  public com.google.cloud.videointelligence.v1beta1.VideoAnnotationProgress getAnnotationProgress(int index) {
    return annotationProgress_.get(index);
  }
  /**
   * <pre>
   * Progress metadata for all videos specified in `AnnotateVideoRequest`.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1beta1.VideoAnnotationProgress annotation_progress = 1;</code>
   */
  public com.google.cloud.videointelligence.v1beta1.VideoAnnotationProgressOrBuilder getAnnotationProgressOrBuilder(
      int index) {
    return annotationProgress_.get(index);
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
    for (int i = 0; i < annotationProgress_.size(); i++) {
      output.writeMessage(1, annotationProgress_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < annotationProgress_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, annotationProgress_.get(i));
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
    if (!(obj instanceof com.google.cloud.videointelligence.v1beta1.AnnotateVideoProgress)) {
      return super.equals(obj);
    }
    com.google.cloud.videointelligence.v1beta1.AnnotateVideoProgress other = (com.google.cloud.videointelligence.v1beta1.AnnotateVideoProgress) obj;

    boolean result = true;
    result = result && getAnnotationProgressList()
        .equals(other.getAnnotationProgressList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getAnnotationProgressCount() > 0) {
      hash = (37 * hash) + ANNOTATION_PROGRESS_FIELD_NUMBER;
      hash = (53 * hash) + getAnnotationProgressList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.videointelligence.v1beta1.AnnotateVideoProgress parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.videointelligence.v1beta1.AnnotateVideoProgress parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.videointelligence.v1beta1.AnnotateVideoProgress parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.videointelligence.v1beta1.AnnotateVideoProgress parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.videointelligence.v1beta1.AnnotateVideoProgress parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.videointelligence.v1beta1.AnnotateVideoProgress parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.videointelligence.v1beta1.AnnotateVideoProgress parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.videointelligence.v1beta1.AnnotateVideoProgress parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.videointelligence.v1beta1.AnnotateVideoProgress parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.videointelligence.v1beta1.AnnotateVideoProgress parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.videointelligence.v1beta1.AnnotateVideoProgress parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.videointelligence.v1beta1.AnnotateVideoProgress parseFrom(
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
  public static Builder newBuilder(com.google.cloud.videointelligence.v1beta1.AnnotateVideoProgress prototype) {
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
   * Video annotation progress. Included in the `metadata`
   * field of the `Operation` returned by the `GetOperation`
   * call of the `google::longrunning::Operations` service.
   * </pre>
   *
   * Protobuf type {@code google.cloud.videointelligence.v1beta1.AnnotateVideoProgress}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.videointelligence.v1beta1.AnnotateVideoProgress)
      com.google.cloud.videointelligence.v1beta1.AnnotateVideoProgressOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.videointelligence.v1beta1.VideoIntelligenceServiceProto.internal_static_google_cloud_videointelligence_v1beta1_AnnotateVideoProgress_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.videointelligence.v1beta1.VideoIntelligenceServiceProto.internal_static_google_cloud_videointelligence_v1beta1_AnnotateVideoProgress_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.videointelligence.v1beta1.AnnotateVideoProgress.class, com.google.cloud.videointelligence.v1beta1.AnnotateVideoProgress.Builder.class);
    }

    // Construct using com.google.cloud.videointelligence.v1beta1.AnnotateVideoProgress.newBuilder()
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
        getAnnotationProgressFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (annotationProgressBuilder_ == null) {
        annotationProgress_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        annotationProgressBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.videointelligence.v1beta1.VideoIntelligenceServiceProto.internal_static_google_cloud_videointelligence_v1beta1_AnnotateVideoProgress_descriptor;
    }

    public com.google.cloud.videointelligence.v1beta1.AnnotateVideoProgress getDefaultInstanceForType() {
      return com.google.cloud.videointelligence.v1beta1.AnnotateVideoProgress.getDefaultInstance();
    }

    public com.google.cloud.videointelligence.v1beta1.AnnotateVideoProgress build() {
      com.google.cloud.videointelligence.v1beta1.AnnotateVideoProgress result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.cloud.videointelligence.v1beta1.AnnotateVideoProgress buildPartial() {
      com.google.cloud.videointelligence.v1beta1.AnnotateVideoProgress result = new com.google.cloud.videointelligence.v1beta1.AnnotateVideoProgress(this);
      int from_bitField0_ = bitField0_;
      if (annotationProgressBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          annotationProgress_ = java.util.Collections.unmodifiableList(annotationProgress_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.annotationProgress_ = annotationProgress_;
      } else {
        result.annotationProgress_ = annotationProgressBuilder_.build();
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
      if (other instanceof com.google.cloud.videointelligence.v1beta1.AnnotateVideoProgress) {
        return mergeFrom((com.google.cloud.videointelligence.v1beta1.AnnotateVideoProgress)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.videointelligence.v1beta1.AnnotateVideoProgress other) {
      if (other == com.google.cloud.videointelligence.v1beta1.AnnotateVideoProgress.getDefaultInstance()) return this;
      if (annotationProgressBuilder_ == null) {
        if (!other.annotationProgress_.isEmpty()) {
          if (annotationProgress_.isEmpty()) {
            annotationProgress_ = other.annotationProgress_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAnnotationProgressIsMutable();
            annotationProgress_.addAll(other.annotationProgress_);
          }
          onChanged();
        }
      } else {
        if (!other.annotationProgress_.isEmpty()) {
          if (annotationProgressBuilder_.isEmpty()) {
            annotationProgressBuilder_.dispose();
            annotationProgressBuilder_ = null;
            annotationProgress_ = other.annotationProgress_;
            bitField0_ = (bitField0_ & ~0x00000001);
            annotationProgressBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAnnotationProgressFieldBuilder() : null;
          } else {
            annotationProgressBuilder_.addAllMessages(other.annotationProgress_);
          }
        }
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
      com.google.cloud.videointelligence.v1beta1.AnnotateVideoProgress parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.videointelligence.v1beta1.AnnotateVideoProgress) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.cloud.videointelligence.v1beta1.VideoAnnotationProgress> annotationProgress_ =
      java.util.Collections.emptyList();
    private void ensureAnnotationProgressIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        annotationProgress_ = new java.util.ArrayList<com.google.cloud.videointelligence.v1beta1.VideoAnnotationProgress>(annotationProgress_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.videointelligence.v1beta1.VideoAnnotationProgress, com.google.cloud.videointelligence.v1beta1.VideoAnnotationProgress.Builder, com.google.cloud.videointelligence.v1beta1.VideoAnnotationProgressOrBuilder> annotationProgressBuilder_;

    /**
     * <pre>
     * Progress metadata for all videos specified in `AnnotateVideoRequest`.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1beta1.VideoAnnotationProgress annotation_progress = 1;</code>
     */
    public java.util.List<com.google.cloud.videointelligence.v1beta1.VideoAnnotationProgress> getAnnotationProgressList() {
      if (annotationProgressBuilder_ == null) {
        return java.util.Collections.unmodifiableList(annotationProgress_);
      } else {
        return annotationProgressBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Progress metadata for all videos specified in `AnnotateVideoRequest`.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1beta1.VideoAnnotationProgress annotation_progress = 1;</code>
     */
    public int getAnnotationProgressCount() {
      if (annotationProgressBuilder_ == null) {
        return annotationProgress_.size();
      } else {
        return annotationProgressBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Progress metadata for all videos specified in `AnnotateVideoRequest`.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1beta1.VideoAnnotationProgress annotation_progress = 1;</code>
     */
    public com.google.cloud.videointelligence.v1beta1.VideoAnnotationProgress getAnnotationProgress(int index) {
      if (annotationProgressBuilder_ == null) {
        return annotationProgress_.get(index);
      } else {
        return annotationProgressBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Progress metadata for all videos specified in `AnnotateVideoRequest`.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1beta1.VideoAnnotationProgress annotation_progress = 1;</code>
     */
    public Builder setAnnotationProgress(
        int index, com.google.cloud.videointelligence.v1beta1.VideoAnnotationProgress value) {
      if (annotationProgressBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAnnotationProgressIsMutable();
        annotationProgress_.set(index, value);
        onChanged();
      } else {
        annotationProgressBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Progress metadata for all videos specified in `AnnotateVideoRequest`.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1beta1.VideoAnnotationProgress annotation_progress = 1;</code>
     */
    public Builder setAnnotationProgress(
        int index, com.google.cloud.videointelligence.v1beta1.VideoAnnotationProgress.Builder builderForValue) {
      if (annotationProgressBuilder_ == null) {
        ensureAnnotationProgressIsMutable();
        annotationProgress_.set(index, builderForValue.build());
        onChanged();
      } else {
        annotationProgressBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Progress metadata for all videos specified in `AnnotateVideoRequest`.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1beta1.VideoAnnotationProgress annotation_progress = 1;</code>
     */
    public Builder addAnnotationProgress(com.google.cloud.videointelligence.v1beta1.VideoAnnotationProgress value) {
      if (annotationProgressBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAnnotationProgressIsMutable();
        annotationProgress_.add(value);
        onChanged();
      } else {
        annotationProgressBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Progress metadata for all videos specified in `AnnotateVideoRequest`.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1beta1.VideoAnnotationProgress annotation_progress = 1;</code>
     */
    public Builder addAnnotationProgress(
        int index, com.google.cloud.videointelligence.v1beta1.VideoAnnotationProgress value) {
      if (annotationProgressBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAnnotationProgressIsMutable();
        annotationProgress_.add(index, value);
        onChanged();
      } else {
        annotationProgressBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Progress metadata for all videos specified in `AnnotateVideoRequest`.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1beta1.VideoAnnotationProgress annotation_progress = 1;</code>
     */
    public Builder addAnnotationProgress(
        com.google.cloud.videointelligence.v1beta1.VideoAnnotationProgress.Builder builderForValue) {
      if (annotationProgressBuilder_ == null) {
        ensureAnnotationProgressIsMutable();
        annotationProgress_.add(builderForValue.build());
        onChanged();
      } else {
        annotationProgressBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Progress metadata for all videos specified in `AnnotateVideoRequest`.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1beta1.VideoAnnotationProgress annotation_progress = 1;</code>
     */
    public Builder addAnnotationProgress(
        int index, com.google.cloud.videointelligence.v1beta1.VideoAnnotationProgress.Builder builderForValue) {
      if (annotationProgressBuilder_ == null) {
        ensureAnnotationProgressIsMutable();
        annotationProgress_.add(index, builderForValue.build());
        onChanged();
      } else {
        annotationProgressBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Progress metadata for all videos specified in `AnnotateVideoRequest`.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1beta1.VideoAnnotationProgress annotation_progress = 1;</code>
     */
    public Builder addAllAnnotationProgress(
        java.lang.Iterable<? extends com.google.cloud.videointelligence.v1beta1.VideoAnnotationProgress> values) {
      if (annotationProgressBuilder_ == null) {
        ensureAnnotationProgressIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, annotationProgress_);
        onChanged();
      } else {
        annotationProgressBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Progress metadata for all videos specified in `AnnotateVideoRequest`.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1beta1.VideoAnnotationProgress annotation_progress = 1;</code>
     */
    public Builder clearAnnotationProgress() {
      if (annotationProgressBuilder_ == null) {
        annotationProgress_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        annotationProgressBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Progress metadata for all videos specified in `AnnotateVideoRequest`.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1beta1.VideoAnnotationProgress annotation_progress = 1;</code>
     */
    public Builder removeAnnotationProgress(int index) {
      if (annotationProgressBuilder_ == null) {
        ensureAnnotationProgressIsMutable();
        annotationProgress_.remove(index);
        onChanged();
      } else {
        annotationProgressBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Progress metadata for all videos specified in `AnnotateVideoRequest`.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1beta1.VideoAnnotationProgress annotation_progress = 1;</code>
     */
    public com.google.cloud.videointelligence.v1beta1.VideoAnnotationProgress.Builder getAnnotationProgressBuilder(
        int index) {
      return getAnnotationProgressFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Progress metadata for all videos specified in `AnnotateVideoRequest`.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1beta1.VideoAnnotationProgress annotation_progress = 1;</code>
     */
    public com.google.cloud.videointelligence.v1beta1.VideoAnnotationProgressOrBuilder getAnnotationProgressOrBuilder(
        int index) {
      if (annotationProgressBuilder_ == null) {
        return annotationProgress_.get(index);  } else {
        return annotationProgressBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Progress metadata for all videos specified in `AnnotateVideoRequest`.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1beta1.VideoAnnotationProgress annotation_progress = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.videointelligence.v1beta1.VideoAnnotationProgressOrBuilder> 
         getAnnotationProgressOrBuilderList() {
      if (annotationProgressBuilder_ != null) {
        return annotationProgressBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(annotationProgress_);
      }
    }
    /**
     * <pre>
     * Progress metadata for all videos specified in `AnnotateVideoRequest`.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1beta1.VideoAnnotationProgress annotation_progress = 1;</code>
     */
    public com.google.cloud.videointelligence.v1beta1.VideoAnnotationProgress.Builder addAnnotationProgressBuilder() {
      return getAnnotationProgressFieldBuilder().addBuilder(
          com.google.cloud.videointelligence.v1beta1.VideoAnnotationProgress.getDefaultInstance());
    }
    /**
     * <pre>
     * Progress metadata for all videos specified in `AnnotateVideoRequest`.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1beta1.VideoAnnotationProgress annotation_progress = 1;</code>
     */
    public com.google.cloud.videointelligence.v1beta1.VideoAnnotationProgress.Builder addAnnotationProgressBuilder(
        int index) {
      return getAnnotationProgressFieldBuilder().addBuilder(
          index, com.google.cloud.videointelligence.v1beta1.VideoAnnotationProgress.getDefaultInstance());
    }
    /**
     * <pre>
     * Progress metadata for all videos specified in `AnnotateVideoRequest`.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1beta1.VideoAnnotationProgress annotation_progress = 1;</code>
     */
    public java.util.List<com.google.cloud.videointelligence.v1beta1.VideoAnnotationProgress.Builder> 
         getAnnotationProgressBuilderList() {
      return getAnnotationProgressFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.videointelligence.v1beta1.VideoAnnotationProgress, com.google.cloud.videointelligence.v1beta1.VideoAnnotationProgress.Builder, com.google.cloud.videointelligence.v1beta1.VideoAnnotationProgressOrBuilder> 
        getAnnotationProgressFieldBuilder() {
      if (annotationProgressBuilder_ == null) {
        annotationProgressBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.videointelligence.v1beta1.VideoAnnotationProgress, com.google.cloud.videointelligence.v1beta1.VideoAnnotationProgress.Builder, com.google.cloud.videointelligence.v1beta1.VideoAnnotationProgressOrBuilder>(
                annotationProgress_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        annotationProgress_ = null;
      }
      return annotationProgressBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.videointelligence.v1beta1.AnnotateVideoProgress)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.videointelligence.v1beta1.AnnotateVideoProgress)
  private static final com.google.cloud.videointelligence.v1beta1.AnnotateVideoProgress DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.videointelligence.v1beta1.AnnotateVideoProgress();
  }

  public static com.google.cloud.videointelligence.v1beta1.AnnotateVideoProgress getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AnnotateVideoProgress>
      PARSER = new com.google.protobuf.AbstractParser<AnnotateVideoProgress>() {
    public AnnotateVideoProgress parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new AnnotateVideoProgress(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AnnotateVideoProgress> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AnnotateVideoProgress> getParserForType() {
    return PARSER;
  }

  public com.google.cloud.videointelligence.v1beta1.AnnotateVideoProgress getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

