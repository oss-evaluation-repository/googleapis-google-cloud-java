/*
 * Copyright 2024 Google LLC
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
// source: google/cloud/aiplatform/v1beta1/evaluation_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * Spec for response recall result.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.ResponseRecallResult}
 */
public final class ResponseRecallResult extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.ResponseRecallResult)
    ResponseRecallResultOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ResponseRecallResult.newBuilder() to construct.
  private ResponseRecallResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ResponseRecallResult() {
    explanation_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ResponseRecallResult();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.EvaluationServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_ResponseRecallResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.EvaluationServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_ResponseRecallResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.ResponseRecallResult.class,
            com.google.cloud.aiplatform.v1beta1.ResponseRecallResult.Builder.class);
  }

  private int bitField0_;
  public static final int SCORE_FIELD_NUMBER = 1;
  private float score_ = 0F;
  /**
   *
   *
   * <pre>
   * Output only. ResponseRecall score.
   * </pre>
   *
   * <code>optional float score = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return Whether the score field is set.
   */
  @java.lang.Override
  public boolean hasScore() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Output only. ResponseRecall score.
   * </pre>
   *
   * <code>optional float score = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The score.
   */
  @java.lang.Override
  public float getScore() {
    return score_;
  }

  public static final int EXPLANATION_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object explanation_ = "";
  /**
   *
   *
   * <pre>
   * Output only. Explanation for response recall score.
   * </pre>
   *
   * <code>string explanation = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The explanation.
   */
  @java.lang.Override
  public java.lang.String getExplanation() {
    java.lang.Object ref = explanation_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      explanation_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only. Explanation for response recall score.
   * </pre>
   *
   * <code>string explanation = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for explanation.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getExplanationBytes() {
    java.lang.Object ref = explanation_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      explanation_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONFIDENCE_FIELD_NUMBER = 3;
  private float confidence_ = 0F;
  /**
   *
   *
   * <pre>
   * Output only. Confidence for fulfillment score.
   * </pre>
   *
   * <code>optional float confidence = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return Whether the confidence field is set.
   */
  @java.lang.Override
  public boolean hasConfidence() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * Output only. Confidence for fulfillment score.
   * </pre>
   *
   * <code>optional float confidence = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The confidence.
   */
  @java.lang.Override
  public float getConfidence() {
    return confidence_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeFloat(1, score_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(explanation_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, explanation_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeFloat(3, confidence_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeFloatSize(1, score_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(explanation_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, explanation_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeFloatSize(3, confidence_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.ResponseRecallResult)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.ResponseRecallResult other =
        (com.google.cloud.aiplatform.v1beta1.ResponseRecallResult) obj;

    if (hasScore() != other.hasScore()) return false;
    if (hasScore()) {
      if (java.lang.Float.floatToIntBits(getScore())
          != java.lang.Float.floatToIntBits(other.getScore())) return false;
    }
    if (!getExplanation().equals(other.getExplanation())) return false;
    if (hasConfidence() != other.hasConfidence()) return false;
    if (hasConfidence()) {
      if (java.lang.Float.floatToIntBits(getConfidence())
          != java.lang.Float.floatToIntBits(other.getConfidence())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasScore()) {
      hash = (37 * hash) + SCORE_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(getScore());
    }
    hash = (37 * hash) + EXPLANATION_FIELD_NUMBER;
    hash = (53 * hash) + getExplanation().hashCode();
    if (hasConfidence()) {
      hash = (37 * hash) + CONFIDENCE_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(getConfidence());
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.ResponseRecallResult parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.ResponseRecallResult parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ResponseRecallResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.ResponseRecallResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ResponseRecallResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.ResponseRecallResult parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ResponseRecallResult parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ResponseRecallResult parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ResponseRecallResult parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ResponseRecallResult parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ResponseRecallResult parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ResponseRecallResult parseFrom(
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
      com.google.cloud.aiplatform.v1beta1.ResponseRecallResult prototype) {
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
   * Spec for response recall result.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.ResponseRecallResult}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.ResponseRecallResult)
      com.google.cloud.aiplatform.v1beta1.ResponseRecallResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.EvaluationServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_ResponseRecallResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.EvaluationServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_ResponseRecallResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.ResponseRecallResult.class,
              com.google.cloud.aiplatform.v1beta1.ResponseRecallResult.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.ResponseRecallResult.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      score_ = 0F;
      explanation_ = "";
      confidence_ = 0F;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.EvaluationServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_ResponseRecallResult_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ResponseRecallResult getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.ResponseRecallResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ResponseRecallResult build() {
      com.google.cloud.aiplatform.v1beta1.ResponseRecallResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ResponseRecallResult buildPartial() {
      com.google.cloud.aiplatform.v1beta1.ResponseRecallResult result =
          new com.google.cloud.aiplatform.v1beta1.ResponseRecallResult(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1beta1.ResponseRecallResult result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.score_ = score_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.explanation_ = explanation_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.confidence_ = confidence_;
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.ResponseRecallResult) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.ResponseRecallResult) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.ResponseRecallResult other) {
      if (other == com.google.cloud.aiplatform.v1beta1.ResponseRecallResult.getDefaultInstance())
        return this;
      if (other.hasScore()) {
        setScore(other.getScore());
      }
      if (!other.getExplanation().isEmpty()) {
        explanation_ = other.explanation_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasConfidence()) {
        setConfidence(other.getConfidence());
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 13:
              {
                score_ = input.readFloat();
                bitField0_ |= 0x00000001;
                break;
              } // case 13
            case 18:
              {
                explanation_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 29:
              {
                confidence_ = input.readFloat();
                bitField0_ |= 0x00000004;
                break;
              } // case 29
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private float score_;
    /**
     *
     *
     * <pre>
     * Output only. ResponseRecall score.
     * </pre>
     *
     * <code>optional float score = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return Whether the score field is set.
     */
    @java.lang.Override
    public boolean hasScore() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Output only. ResponseRecall score.
     * </pre>
     *
     * <code>optional float score = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The score.
     */
    @java.lang.Override
    public float getScore() {
      return score_;
    }
    /**
     *
     *
     * <pre>
     * Output only. ResponseRecall score.
     * </pre>
     *
     * <code>optional float score = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The score to set.
     * @return This builder for chaining.
     */
    public Builder setScore(float value) {

      score_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. ResponseRecall score.
     * </pre>
     *
     * <code>optional float score = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearScore() {
      bitField0_ = (bitField0_ & ~0x00000001);
      score_ = 0F;
      onChanged();
      return this;
    }

    private java.lang.Object explanation_ = "";
    /**
     *
     *
     * <pre>
     * Output only. Explanation for response recall score.
     * </pre>
     *
     * <code>string explanation = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The explanation.
     */
    public java.lang.String getExplanation() {
      java.lang.Object ref = explanation_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        explanation_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Explanation for response recall score.
     * </pre>
     *
     * <code>string explanation = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The bytes for explanation.
     */
    public com.google.protobuf.ByteString getExplanationBytes() {
      java.lang.Object ref = explanation_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        explanation_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Explanation for response recall score.
     * </pre>
     *
     * <code>string explanation = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The explanation to set.
     * @return This builder for chaining.
     */
    public Builder setExplanation(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      explanation_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Explanation for response recall score.
     * </pre>
     *
     * <code>string explanation = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearExplanation() {
      explanation_ = getDefaultInstance().getExplanation();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Explanation for response recall score.
     * </pre>
     *
     * <code>string explanation = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The bytes for explanation to set.
     * @return This builder for chaining.
     */
    public Builder setExplanationBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      explanation_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private float confidence_;
    /**
     *
     *
     * <pre>
     * Output only. Confidence for fulfillment score.
     * </pre>
     *
     * <code>optional float confidence = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return Whether the confidence field is set.
     */
    @java.lang.Override
    public boolean hasConfidence() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     *
     *
     * <pre>
     * Output only. Confidence for fulfillment score.
     * </pre>
     *
     * <code>optional float confidence = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The confidence.
     */
    @java.lang.Override
    public float getConfidence() {
      return confidence_;
    }
    /**
     *
     *
     * <pre>
     * Output only. Confidence for fulfillment score.
     * </pre>
     *
     * <code>optional float confidence = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The confidence to set.
     * @return This builder for chaining.
     */
    public Builder setConfidence(float value) {

      confidence_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Confidence for fulfillment score.
     * </pre>
     *
     * <code>optional float confidence = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearConfidence() {
      bitField0_ = (bitField0_ & ~0x00000004);
      confidence_ = 0F;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.ResponseRecallResult)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.ResponseRecallResult)
  private static final com.google.cloud.aiplatform.v1beta1.ResponseRecallResult DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.ResponseRecallResult();
  }

  public static com.google.cloud.aiplatform.v1beta1.ResponseRecallResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ResponseRecallResult> PARSER =
      new com.google.protobuf.AbstractParser<ResponseRecallResult>() {
        @java.lang.Override
        public ResponseRecallResult parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<ResponseRecallResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ResponseRecallResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.ResponseRecallResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
