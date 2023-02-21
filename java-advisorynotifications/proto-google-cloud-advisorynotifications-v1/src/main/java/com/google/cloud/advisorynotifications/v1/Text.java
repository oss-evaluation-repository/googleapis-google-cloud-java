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
// source: google/cloud/advisorynotifications/v1/service.proto

package com.google.cloud.advisorynotifications.v1;

/**
 *
 *
 * <pre>
 * A text object containing the English text and its localized copies.
 * </pre>
 *
 * Protobuf type {@code google.cloud.advisorynotifications.v1.Text}
 */
public final class Text extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.advisorynotifications.v1.Text)
    TextOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Text.newBuilder() to construct.
  private Text(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Text() {
    enText_ = "";
    localizedText_ = "";
    localizationState_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Text();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.advisorynotifications.v1.ServiceProto
        .internal_static_google_cloud_advisorynotifications_v1_Text_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.advisorynotifications.v1.ServiceProto
        .internal_static_google_cloud_advisorynotifications_v1_Text_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.advisorynotifications.v1.Text.class,
            com.google.cloud.advisorynotifications.v1.Text.Builder.class);
  }

  public static final int EN_TEXT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object enText_ = "";
  /**
   *
   *
   * <pre>
   * The English copy.
   * </pre>
   *
   * <code>string en_text = 1;</code>
   *
   * @return The enText.
   */
  @java.lang.Override
  public java.lang.String getEnText() {
    java.lang.Object ref = enText_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      enText_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The English copy.
   * </pre>
   *
   * <code>string en_text = 1;</code>
   *
   * @return The bytes for enText.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getEnTextBytes() {
    java.lang.Object ref = enText_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      enText_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LOCALIZED_TEXT_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object localizedText_ = "";
  /**
   *
   *
   * <pre>
   * The requested localized copy (if applicable).
   * </pre>
   *
   * <code>string localized_text = 2;</code>
   *
   * @return The localizedText.
   */
  @java.lang.Override
  public java.lang.String getLocalizedText() {
    java.lang.Object ref = localizedText_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      localizedText_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The requested localized copy (if applicable).
   * </pre>
   *
   * <code>string localized_text = 2;</code>
   *
   * @return The bytes for localizedText.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getLocalizedTextBytes() {
    java.lang.Object ref = localizedText_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      localizedText_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LOCALIZATION_STATE_FIELD_NUMBER = 3;
  private int localizationState_ = 0;
  /**
   *
   *
   * <pre>
   * Status of the localization.
   * </pre>
   *
   * <code>.google.cloud.advisorynotifications.v1.LocalizationState localization_state = 3;</code>
   *
   * @return The enum numeric value on the wire for localizationState.
   */
  @java.lang.Override
  public int getLocalizationStateValue() {
    return localizationState_;
  }
  /**
   *
   *
   * <pre>
   * Status of the localization.
   * </pre>
   *
   * <code>.google.cloud.advisorynotifications.v1.LocalizationState localization_state = 3;</code>
   *
   * @return The localizationState.
   */
  @java.lang.Override
  public com.google.cloud.advisorynotifications.v1.LocalizationState getLocalizationState() {
    com.google.cloud.advisorynotifications.v1.LocalizationState result =
        com.google.cloud.advisorynotifications.v1.LocalizationState.forNumber(localizationState_);
    return result == null
        ? com.google.cloud.advisorynotifications.v1.LocalizationState.UNRECOGNIZED
        : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(enText_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, enText_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(localizedText_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, localizedText_);
    }
    if (localizationState_
        != com.google.cloud.advisorynotifications.v1.LocalizationState
            .LOCALIZATION_STATE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(3, localizationState_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(enText_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, enText_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(localizedText_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, localizedText_);
    }
    if (localizationState_
        != com.google.cloud.advisorynotifications.v1.LocalizationState
            .LOCALIZATION_STATE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(3, localizationState_);
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
    if (!(obj instanceof com.google.cloud.advisorynotifications.v1.Text)) {
      return super.equals(obj);
    }
    com.google.cloud.advisorynotifications.v1.Text other =
        (com.google.cloud.advisorynotifications.v1.Text) obj;

    if (!getEnText().equals(other.getEnText())) return false;
    if (!getLocalizedText().equals(other.getLocalizedText())) return false;
    if (localizationState_ != other.localizationState_) return false;
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
    hash = (37 * hash) + EN_TEXT_FIELD_NUMBER;
    hash = (53 * hash) + getEnText().hashCode();
    hash = (37 * hash) + LOCALIZED_TEXT_FIELD_NUMBER;
    hash = (53 * hash) + getLocalizedText().hashCode();
    hash = (37 * hash) + LOCALIZATION_STATE_FIELD_NUMBER;
    hash = (53 * hash) + localizationState_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.advisorynotifications.v1.Text parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.advisorynotifications.v1.Text parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.advisorynotifications.v1.Text parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.advisorynotifications.v1.Text parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.advisorynotifications.v1.Text parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.advisorynotifications.v1.Text parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.advisorynotifications.v1.Text parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.advisorynotifications.v1.Text parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.advisorynotifications.v1.Text parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.advisorynotifications.v1.Text parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.advisorynotifications.v1.Text parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.advisorynotifications.v1.Text parseFrom(
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

  public static Builder newBuilder(com.google.cloud.advisorynotifications.v1.Text prototype) {
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
   * A text object containing the English text and its localized copies.
   * </pre>
   *
   * Protobuf type {@code google.cloud.advisorynotifications.v1.Text}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.advisorynotifications.v1.Text)
      com.google.cloud.advisorynotifications.v1.TextOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.advisorynotifications.v1.ServiceProto
          .internal_static_google_cloud_advisorynotifications_v1_Text_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.advisorynotifications.v1.ServiceProto
          .internal_static_google_cloud_advisorynotifications_v1_Text_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.advisorynotifications.v1.Text.class,
              com.google.cloud.advisorynotifications.v1.Text.Builder.class);
    }

    // Construct using com.google.cloud.advisorynotifications.v1.Text.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      enText_ = "";
      localizedText_ = "";
      localizationState_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.advisorynotifications.v1.ServiceProto
          .internal_static_google_cloud_advisorynotifications_v1_Text_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.advisorynotifications.v1.Text getDefaultInstanceForType() {
      return com.google.cloud.advisorynotifications.v1.Text.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.advisorynotifications.v1.Text build() {
      com.google.cloud.advisorynotifications.v1.Text result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.advisorynotifications.v1.Text buildPartial() {
      com.google.cloud.advisorynotifications.v1.Text result =
          new com.google.cloud.advisorynotifications.v1.Text(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.advisorynotifications.v1.Text result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.enText_ = enText_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.localizedText_ = localizedText_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.localizationState_ = localizationState_;
      }
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
      if (other instanceof com.google.cloud.advisorynotifications.v1.Text) {
        return mergeFrom((com.google.cloud.advisorynotifications.v1.Text) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.advisorynotifications.v1.Text other) {
      if (other == com.google.cloud.advisorynotifications.v1.Text.getDefaultInstance()) return this;
      if (!other.getEnText().isEmpty()) {
        enText_ = other.enText_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getLocalizedText().isEmpty()) {
        localizedText_ = other.localizedText_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.localizationState_ != 0) {
        setLocalizationStateValue(other.getLocalizationStateValue());
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
            case 10:
              {
                enText_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                localizedText_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 24:
              {
                localizationState_ = input.readEnum();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
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

    private java.lang.Object enText_ = "";
    /**
     *
     *
     * <pre>
     * The English copy.
     * </pre>
     *
     * <code>string en_text = 1;</code>
     *
     * @return The enText.
     */
    public java.lang.String getEnText() {
      java.lang.Object ref = enText_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        enText_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The English copy.
     * </pre>
     *
     * <code>string en_text = 1;</code>
     *
     * @return The bytes for enText.
     */
    public com.google.protobuf.ByteString getEnTextBytes() {
      java.lang.Object ref = enText_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        enText_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The English copy.
     * </pre>
     *
     * <code>string en_text = 1;</code>
     *
     * @param value The enText to set.
     * @return This builder for chaining.
     */
    public Builder setEnText(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      enText_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The English copy.
     * </pre>
     *
     * <code>string en_text = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEnText() {
      enText_ = getDefaultInstance().getEnText();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The English copy.
     * </pre>
     *
     * <code>string en_text = 1;</code>
     *
     * @param value The bytes for enText to set.
     * @return This builder for chaining.
     */
    public Builder setEnTextBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      enText_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object localizedText_ = "";
    /**
     *
     *
     * <pre>
     * The requested localized copy (if applicable).
     * </pre>
     *
     * <code>string localized_text = 2;</code>
     *
     * @return The localizedText.
     */
    public java.lang.String getLocalizedText() {
      java.lang.Object ref = localizedText_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        localizedText_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The requested localized copy (if applicable).
     * </pre>
     *
     * <code>string localized_text = 2;</code>
     *
     * @return The bytes for localizedText.
     */
    public com.google.protobuf.ByteString getLocalizedTextBytes() {
      java.lang.Object ref = localizedText_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        localizedText_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The requested localized copy (if applicable).
     * </pre>
     *
     * <code>string localized_text = 2;</code>
     *
     * @param value The localizedText to set.
     * @return This builder for chaining.
     */
    public Builder setLocalizedText(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      localizedText_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The requested localized copy (if applicable).
     * </pre>
     *
     * <code>string localized_text = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearLocalizedText() {
      localizedText_ = getDefaultInstance().getLocalizedText();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The requested localized copy (if applicable).
     * </pre>
     *
     * <code>string localized_text = 2;</code>
     *
     * @param value The bytes for localizedText to set.
     * @return This builder for chaining.
     */
    public Builder setLocalizedTextBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      localizedText_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private int localizationState_ = 0;
    /**
     *
     *
     * <pre>
     * Status of the localization.
     * </pre>
     *
     * <code>.google.cloud.advisorynotifications.v1.LocalizationState localization_state = 3;</code>
     *
     * @return The enum numeric value on the wire for localizationState.
     */
    @java.lang.Override
    public int getLocalizationStateValue() {
      return localizationState_;
    }
    /**
     *
     *
     * <pre>
     * Status of the localization.
     * </pre>
     *
     * <code>.google.cloud.advisorynotifications.v1.LocalizationState localization_state = 3;</code>
     *
     * @param value The enum numeric value on the wire for localizationState to set.
     * @return This builder for chaining.
     */
    public Builder setLocalizationStateValue(int value) {
      localizationState_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Status of the localization.
     * </pre>
     *
     * <code>.google.cloud.advisorynotifications.v1.LocalizationState localization_state = 3;</code>
     *
     * @return The localizationState.
     */
    @java.lang.Override
    public com.google.cloud.advisorynotifications.v1.LocalizationState getLocalizationState() {
      com.google.cloud.advisorynotifications.v1.LocalizationState result =
          com.google.cloud.advisorynotifications.v1.LocalizationState.forNumber(localizationState_);
      return result == null
          ? com.google.cloud.advisorynotifications.v1.LocalizationState.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Status of the localization.
     * </pre>
     *
     * <code>.google.cloud.advisorynotifications.v1.LocalizationState localization_state = 3;</code>
     *
     * @param value The localizationState to set.
     * @return This builder for chaining.
     */
    public Builder setLocalizationState(
        com.google.cloud.advisorynotifications.v1.LocalizationState value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      localizationState_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Status of the localization.
     * </pre>
     *
     * <code>.google.cloud.advisorynotifications.v1.LocalizationState localization_state = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearLocalizationState() {
      bitField0_ = (bitField0_ & ~0x00000004);
      localizationState_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.advisorynotifications.v1.Text)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.advisorynotifications.v1.Text)
  private static final com.google.cloud.advisorynotifications.v1.Text DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.advisorynotifications.v1.Text();
  }

  public static com.google.cloud.advisorynotifications.v1.Text getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Text> PARSER =
      new com.google.protobuf.AbstractParser<Text>() {
        @java.lang.Override
        public Text parsePartialFrom(
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

  public static com.google.protobuf.Parser<Text> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Text> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.advisorynotifications.v1.Text getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
