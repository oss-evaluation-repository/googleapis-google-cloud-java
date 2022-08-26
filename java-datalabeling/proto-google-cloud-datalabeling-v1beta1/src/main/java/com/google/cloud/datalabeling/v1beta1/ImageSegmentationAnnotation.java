/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datalabeling/v1beta1/annotation.proto

package com.google.cloud.datalabeling.v1beta1;

/**
 *
 *
 * <pre>
 * Image segmentation annotation.
 * </pre>
 *
 * Protobuf type {@code google.cloud.datalabeling.v1beta1.ImageSegmentationAnnotation}
 */
public final class ImageSegmentationAnnotation extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datalabeling.v1beta1.ImageSegmentationAnnotation)
    ImageSegmentationAnnotationOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ImageSegmentationAnnotation.newBuilder() to construct.
  private ImageSegmentationAnnotation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ImageSegmentationAnnotation() {
    mimeType_ = "";
    imageBytes_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ImageSegmentationAnnotation();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ImageSegmentationAnnotation(
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
          case 10:
            {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                annotationColors_ =
                    com.google.protobuf.MapField.newMapField(
                        AnnotationColorsDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000001;
              }
              com.google.protobuf.MapEntry<
                      java.lang.String, com.google.cloud.datalabeling.v1beta1.AnnotationSpec>
                  annotationColors__ =
                      input.readMessage(
                          AnnotationColorsDefaultEntryHolder.defaultEntry.getParserForType(),
                          extensionRegistry);
              annotationColors_
                  .getMutableMap()
                  .put(annotationColors__.getKey(), annotationColors__.getValue());
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              mimeType_ = s;
              break;
            }
          case 26:
            {
              imageBytes_ = input.readBytes();
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.datalabeling.v1beta1.AnnotationOuterClass
        .internal_static_google_cloud_datalabeling_v1beta1_ImageSegmentationAnnotation_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(int number) {
    switch (number) {
      case 1:
        return internalGetAnnotationColors();
      default:
        throw new RuntimeException("Invalid map field number: " + number);
    }
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datalabeling.v1beta1.AnnotationOuterClass
        .internal_static_google_cloud_datalabeling_v1beta1_ImageSegmentationAnnotation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datalabeling.v1beta1.ImageSegmentationAnnotation.class,
            com.google.cloud.datalabeling.v1beta1.ImageSegmentationAnnotation.Builder.class);
  }

  public static final int ANNOTATION_COLORS_FIELD_NUMBER = 1;

  private static final class AnnotationColorsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
            java.lang.String, com.google.cloud.datalabeling.v1beta1.AnnotationSpec>
        defaultEntry =
            com.google.protobuf.MapEntry
                .<java.lang.String, com.google.cloud.datalabeling.v1beta1.AnnotationSpec>
                    newDefaultInstance(
                        com.google.cloud.datalabeling.v1beta1.AnnotationOuterClass
                            .internal_static_google_cloud_datalabeling_v1beta1_ImageSegmentationAnnotation_AnnotationColorsEntry_descriptor,
                        com.google.protobuf.WireFormat.FieldType.STRING,
                        "",
                        com.google.protobuf.WireFormat.FieldType.MESSAGE,
                        com.google.cloud.datalabeling.v1beta1.AnnotationSpec.getDefaultInstance());
  }

  private com.google.protobuf.MapField<
          java.lang.String, com.google.cloud.datalabeling.v1beta1.AnnotationSpec>
      annotationColors_;

  private com.google.protobuf.MapField<
          java.lang.String, com.google.cloud.datalabeling.v1beta1.AnnotationSpec>
      internalGetAnnotationColors() {
    if (annotationColors_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          AnnotationColorsDefaultEntryHolder.defaultEntry);
    }
    return annotationColors_;
  }

  public int getAnnotationColorsCount() {
    return internalGetAnnotationColors().getMap().size();
  }
  /**
   *
   *
   * <pre>
   * The mapping between rgb color and annotation spec. The key is the rgb
   * color represented in format of rgb(0, 0, 0). The value is the
   * AnnotationSpec.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.datalabeling.v1beta1.AnnotationSpec&gt; annotation_colors = 1;
   * </code>
   */
  @java.lang.Override
  public boolean containsAnnotationColors(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    return internalGetAnnotationColors().getMap().containsKey(key);
  }
  /** Use {@link #getAnnotationColorsMap()} instead. */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, com.google.cloud.datalabeling.v1beta1.AnnotationSpec>
      getAnnotationColors() {
    return getAnnotationColorsMap();
  }
  /**
   *
   *
   * <pre>
   * The mapping between rgb color and annotation spec. The key is the rgb
   * color represented in format of rgb(0, 0, 0). The value is the
   * AnnotationSpec.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.datalabeling.v1beta1.AnnotationSpec&gt; annotation_colors = 1;
   * </code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, com.google.cloud.datalabeling.v1beta1.AnnotationSpec>
      getAnnotationColorsMap() {
    return internalGetAnnotationColors().getMap();
  }
  /**
   *
   *
   * <pre>
   * The mapping between rgb color and annotation spec. The key is the rgb
   * color represented in format of rgb(0, 0, 0). The value is the
   * AnnotationSpec.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.datalabeling.v1beta1.AnnotationSpec&gt; annotation_colors = 1;
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.datalabeling.v1beta1.AnnotationSpec getAnnotationColorsOrDefault(
      java.lang.String key, com.google.cloud.datalabeling.v1beta1.AnnotationSpec defaultValue) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, com.google.cloud.datalabeling.v1beta1.AnnotationSpec> map =
        internalGetAnnotationColors().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   *
   *
   * <pre>
   * The mapping between rgb color and annotation spec. The key is the rgb
   * color represented in format of rgb(0, 0, 0). The value is the
   * AnnotationSpec.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.datalabeling.v1beta1.AnnotationSpec&gt; annotation_colors = 1;
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.datalabeling.v1beta1.AnnotationSpec getAnnotationColorsOrThrow(
      java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, com.google.cloud.datalabeling.v1beta1.AnnotationSpec> map =
        internalGetAnnotationColors().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  public static final int MIME_TYPE_FIELD_NUMBER = 2;
  private volatile java.lang.Object mimeType_;
  /**
   *
   *
   * <pre>
   * Image format.
   * </pre>
   *
   * <code>string mime_type = 2;</code>
   *
   * @return The mimeType.
   */
  @java.lang.Override
  public java.lang.String getMimeType() {
    java.lang.Object ref = mimeType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      mimeType_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Image format.
   * </pre>
   *
   * <code>string mime_type = 2;</code>
   *
   * @return The bytes for mimeType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getMimeTypeBytes() {
    java.lang.Object ref = mimeType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      mimeType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IMAGE_BYTES_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString imageBytes_;
  /**
   *
   *
   * <pre>
   * A byte string of a full image's color map.
   * </pre>
   *
   * <code>bytes image_bytes = 3;</code>
   *
   * @return The imageBytes.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getImageBytes() {
    return imageBytes_;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    com.google.protobuf.GeneratedMessageV3.serializeStringMapTo(
        output, internalGetAnnotationColors(), AnnotationColorsDefaultEntryHolder.defaultEntry, 1);
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(mimeType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, mimeType_);
    }
    if (!imageBytes_.isEmpty()) {
      output.writeBytes(3, imageBytes_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, com.google.cloud.datalabeling.v1beta1.AnnotationSpec>
        entry : internalGetAnnotationColors().getMap().entrySet()) {
      com.google.protobuf.MapEntry<
              java.lang.String, com.google.cloud.datalabeling.v1beta1.AnnotationSpec>
          annotationColors__ =
              AnnotationColorsDefaultEntryHolder.defaultEntry
                  .newBuilderForType()
                  .setKey(entry.getKey())
                  .setValue(entry.getValue())
                  .build();
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, annotationColors__);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(mimeType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, mimeType_);
    }
    if (!imageBytes_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream.computeBytesSize(3, imageBytes_);
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
    if (!(obj instanceof com.google.cloud.datalabeling.v1beta1.ImageSegmentationAnnotation)) {
      return super.equals(obj);
    }
    com.google.cloud.datalabeling.v1beta1.ImageSegmentationAnnotation other =
        (com.google.cloud.datalabeling.v1beta1.ImageSegmentationAnnotation) obj;

    if (!internalGetAnnotationColors().equals(other.internalGetAnnotationColors())) return false;
    if (!getMimeType().equals(other.getMimeType())) return false;
    if (!getImageBytes().equals(other.getImageBytes())) return false;
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
    if (!internalGetAnnotationColors().getMap().isEmpty()) {
      hash = (37 * hash) + ANNOTATION_COLORS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetAnnotationColors().hashCode();
    }
    hash = (37 * hash) + MIME_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getMimeType().hashCode();
    hash = (37 * hash) + IMAGE_BYTES_FIELD_NUMBER;
    hash = (53 * hash) + getImageBytes().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datalabeling.v1beta1.ImageSegmentationAnnotation parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datalabeling.v1beta1.ImageSegmentationAnnotation parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.ImageSegmentationAnnotation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datalabeling.v1beta1.ImageSegmentationAnnotation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.ImageSegmentationAnnotation parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datalabeling.v1beta1.ImageSegmentationAnnotation parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.ImageSegmentationAnnotation parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datalabeling.v1beta1.ImageSegmentationAnnotation parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.ImageSegmentationAnnotation
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datalabeling.v1beta1.ImageSegmentationAnnotation
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.ImageSegmentationAnnotation parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datalabeling.v1beta1.ImageSegmentationAnnotation parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.datalabeling.v1beta1.ImageSegmentationAnnotation prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Image segmentation annotation.
   * </pre>
   *
   * Protobuf type {@code google.cloud.datalabeling.v1beta1.ImageSegmentationAnnotation}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datalabeling.v1beta1.ImageSegmentationAnnotation)
      com.google.cloud.datalabeling.v1beta1.ImageSegmentationAnnotationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datalabeling.v1beta1.AnnotationOuterClass
          .internal_static_google_cloud_datalabeling_v1beta1_ImageSegmentationAnnotation_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(int number) {
      switch (number) {
        case 1:
          return internalGetAnnotationColors();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(int number) {
      switch (number) {
        case 1:
          return internalGetMutableAnnotationColors();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datalabeling.v1beta1.AnnotationOuterClass
          .internal_static_google_cloud_datalabeling_v1beta1_ImageSegmentationAnnotation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datalabeling.v1beta1.ImageSegmentationAnnotation.class,
              com.google.cloud.datalabeling.v1beta1.ImageSegmentationAnnotation.Builder.class);
    }

    // Construct using
    // com.google.cloud.datalabeling.v1beta1.ImageSegmentationAnnotation.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      internalGetMutableAnnotationColors().clear();
      mimeType_ = "";

      imageBytes_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datalabeling.v1beta1.AnnotationOuterClass
          .internal_static_google_cloud_datalabeling_v1beta1_ImageSegmentationAnnotation_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.ImageSegmentationAnnotation
        getDefaultInstanceForType() {
      return com.google.cloud.datalabeling.v1beta1.ImageSegmentationAnnotation.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.ImageSegmentationAnnotation build() {
      com.google.cloud.datalabeling.v1beta1.ImageSegmentationAnnotation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.ImageSegmentationAnnotation buildPartial() {
      com.google.cloud.datalabeling.v1beta1.ImageSegmentationAnnotation result =
          new com.google.cloud.datalabeling.v1beta1.ImageSegmentationAnnotation(this);
      int from_bitField0_ = bitField0_;
      result.annotationColors_ = internalGetAnnotationColors();
      result.annotationColors_.makeImmutable();
      result.mimeType_ = mimeType_;
      result.imageBytes_ = imageBytes_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.datalabeling.v1beta1.ImageSegmentationAnnotation) {
        return mergeFrom((com.google.cloud.datalabeling.v1beta1.ImageSegmentationAnnotation) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.datalabeling.v1beta1.ImageSegmentationAnnotation other) {
      if (other
          == com.google.cloud.datalabeling.v1beta1.ImageSegmentationAnnotation.getDefaultInstance())
        return this;
      internalGetMutableAnnotationColors().mergeFrom(other.internalGetAnnotationColors());
      if (!other.getMimeType().isEmpty()) {
        mimeType_ = other.mimeType_;
        onChanged();
      }
      if (other.getImageBytes() != com.google.protobuf.ByteString.EMPTY) {
        setImageBytes(other.getImageBytes());
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
      com.google.cloud.datalabeling.v1beta1.ImageSegmentationAnnotation parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.datalabeling.v1beta1.ImageSegmentationAnnotation)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.MapField<
            java.lang.String, com.google.cloud.datalabeling.v1beta1.AnnotationSpec>
        annotationColors_;

    private com.google.protobuf.MapField<
            java.lang.String, com.google.cloud.datalabeling.v1beta1.AnnotationSpec>
        internalGetAnnotationColors() {
      if (annotationColors_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            AnnotationColorsDefaultEntryHolder.defaultEntry);
      }
      return annotationColors_;
    }

    private com.google.protobuf.MapField<
            java.lang.String, com.google.cloud.datalabeling.v1beta1.AnnotationSpec>
        internalGetMutableAnnotationColors() {
      onChanged();
      ;
      if (annotationColors_ == null) {
        annotationColors_ =
            com.google.protobuf.MapField.newMapField(
                AnnotationColorsDefaultEntryHolder.defaultEntry);
      }
      if (!annotationColors_.isMutable()) {
        annotationColors_ = annotationColors_.copy();
      }
      return annotationColors_;
    }

    public int getAnnotationColorsCount() {
      return internalGetAnnotationColors().getMap().size();
    }
    /**
     *
     *
     * <pre>
     * The mapping between rgb color and annotation spec. The key is the rgb
     * color represented in format of rgb(0, 0, 0). The value is the
     * AnnotationSpec.
     * </pre>
     *
     * <code>
     * map&lt;string, .google.cloud.datalabeling.v1beta1.AnnotationSpec&gt; annotation_colors = 1;
     * </code>
     */
    @java.lang.Override
    public boolean containsAnnotationColors(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      return internalGetAnnotationColors().getMap().containsKey(key);
    }
    /** Use {@link #getAnnotationColorsMap()} instead. */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.google.cloud.datalabeling.v1beta1.AnnotationSpec>
        getAnnotationColors() {
      return getAnnotationColorsMap();
    }
    /**
     *
     *
     * <pre>
     * The mapping between rgb color and annotation spec. The key is the rgb
     * color represented in format of rgb(0, 0, 0). The value is the
     * AnnotationSpec.
     * </pre>
     *
     * <code>
     * map&lt;string, .google.cloud.datalabeling.v1beta1.AnnotationSpec&gt; annotation_colors = 1;
     * </code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, com.google.cloud.datalabeling.v1beta1.AnnotationSpec>
        getAnnotationColorsMap() {
      return internalGetAnnotationColors().getMap();
    }
    /**
     *
     *
     * <pre>
     * The mapping between rgb color and annotation spec. The key is the rgb
     * color represented in format of rgb(0, 0, 0). The value is the
     * AnnotationSpec.
     * </pre>
     *
     * <code>
     * map&lt;string, .google.cloud.datalabeling.v1beta1.AnnotationSpec&gt; annotation_colors = 1;
     * </code>
     */
    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.AnnotationSpec getAnnotationColorsOrDefault(
        java.lang.String key, com.google.cloud.datalabeling.v1beta1.AnnotationSpec defaultValue) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, com.google.cloud.datalabeling.v1beta1.AnnotationSpec> map =
          internalGetAnnotationColors().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     *
     *
     * <pre>
     * The mapping between rgb color and annotation spec. The key is the rgb
     * color represented in format of rgb(0, 0, 0). The value is the
     * AnnotationSpec.
     * </pre>
     *
     * <code>
     * map&lt;string, .google.cloud.datalabeling.v1beta1.AnnotationSpec&gt; annotation_colors = 1;
     * </code>
     */
    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.AnnotationSpec getAnnotationColorsOrThrow(
        java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, com.google.cloud.datalabeling.v1beta1.AnnotationSpec> map =
          internalGetAnnotationColors().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearAnnotationColors() {
      internalGetMutableAnnotationColors().getMutableMap().clear();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The mapping between rgb color and annotation spec. The key is the rgb
     * color represented in format of rgb(0, 0, 0). The value is the
     * AnnotationSpec.
     * </pre>
     *
     * <code>
     * map&lt;string, .google.cloud.datalabeling.v1beta1.AnnotationSpec&gt; annotation_colors = 1;
     * </code>
     */
    public Builder removeAnnotationColors(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      internalGetMutableAnnotationColors().getMutableMap().remove(key);
      return this;
    }
    /** Use alternate mutation accessors instead. */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.google.cloud.datalabeling.v1beta1.AnnotationSpec>
        getMutableAnnotationColors() {
      return internalGetMutableAnnotationColors().getMutableMap();
    }
    /**
     *
     *
     * <pre>
     * The mapping between rgb color and annotation spec. The key is the rgb
     * color represented in format of rgb(0, 0, 0). The value is the
     * AnnotationSpec.
     * </pre>
     *
     * <code>
     * map&lt;string, .google.cloud.datalabeling.v1beta1.AnnotationSpec&gt; annotation_colors = 1;
     * </code>
     */
    public Builder putAnnotationColors(
        java.lang.String key, com.google.cloud.datalabeling.v1beta1.AnnotationSpec value) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      if (value == null) {
        throw new NullPointerException("map value");
      }

      internalGetMutableAnnotationColors().getMutableMap().put(key, value);
      return this;
    }
    /**
     *
     *
     * <pre>
     * The mapping between rgb color and annotation spec. The key is the rgb
     * color represented in format of rgb(0, 0, 0). The value is the
     * AnnotationSpec.
     * </pre>
     *
     * <code>
     * map&lt;string, .google.cloud.datalabeling.v1beta1.AnnotationSpec&gt; annotation_colors = 1;
     * </code>
     */
    public Builder putAllAnnotationColors(
        java.util.Map<java.lang.String, com.google.cloud.datalabeling.v1beta1.AnnotationSpec>
            values) {
      internalGetMutableAnnotationColors().getMutableMap().putAll(values);
      return this;
    }

    private java.lang.Object mimeType_ = "";
    /**
     *
     *
     * <pre>
     * Image format.
     * </pre>
     *
     * <code>string mime_type = 2;</code>
     *
     * @return The mimeType.
     */
    public java.lang.String getMimeType() {
      java.lang.Object ref = mimeType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        mimeType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Image format.
     * </pre>
     *
     * <code>string mime_type = 2;</code>
     *
     * @return The bytes for mimeType.
     */
    public com.google.protobuf.ByteString getMimeTypeBytes() {
      java.lang.Object ref = mimeType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        mimeType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Image format.
     * </pre>
     *
     * <code>string mime_type = 2;</code>
     *
     * @param value The mimeType to set.
     * @return This builder for chaining.
     */
    public Builder setMimeType(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      mimeType_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Image format.
     * </pre>
     *
     * <code>string mime_type = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMimeType() {

      mimeType_ = getDefaultInstance().getMimeType();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Image format.
     * </pre>
     *
     * <code>string mime_type = 2;</code>
     *
     * @param value The bytes for mimeType to set.
     * @return This builder for chaining.
     */
    public Builder setMimeTypeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      mimeType_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString imageBytes_ = com.google.protobuf.ByteString.EMPTY;
    /**
     *
     *
     * <pre>
     * A byte string of a full image's color map.
     * </pre>
     *
     * <code>bytes image_bytes = 3;</code>
     *
     * @return The imageBytes.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getImageBytes() {
      return imageBytes_;
    }
    /**
     *
     *
     * <pre>
     * A byte string of a full image's color map.
     * </pre>
     *
     * <code>bytes image_bytes = 3;</code>
     *
     * @param value The imageBytes to set.
     * @return This builder for chaining.
     */
    public Builder setImageBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }

      imageBytes_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A byte string of a full image's color map.
     * </pre>
     *
     * <code>bytes image_bytes = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearImageBytes() {

      imageBytes_ = getDefaultInstance().getImageBytes();
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.datalabeling.v1beta1.ImageSegmentationAnnotation)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datalabeling.v1beta1.ImageSegmentationAnnotation)
  private static final com.google.cloud.datalabeling.v1beta1.ImageSegmentationAnnotation
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datalabeling.v1beta1.ImageSegmentationAnnotation();
  }

  public static com.google.cloud.datalabeling.v1beta1.ImageSegmentationAnnotation
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ImageSegmentationAnnotation> PARSER =
      new com.google.protobuf.AbstractParser<ImageSegmentationAnnotation>() {
        @java.lang.Override
        public ImageSegmentationAnnotation parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ImageSegmentationAnnotation(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ImageSegmentationAnnotation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ImageSegmentationAnnotation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datalabeling.v1beta1.ImageSegmentationAnnotation
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
