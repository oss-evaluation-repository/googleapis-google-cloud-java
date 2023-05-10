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
// source: google/cloud/functions/v1/functions.proto

package com.google.cloud.functions.v1;

/**
 *
 *
 * <pre>
 * Describes SourceRepository, used to represent parameters related to
 * source repository where a function is hosted.
 * </pre>
 *
 * Protobuf type {@code google.cloud.functions.v1.SourceRepository}
 */
public final class SourceRepository extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.functions.v1.SourceRepository)
    SourceRepositoryOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SourceRepository.newBuilder() to construct.
  private SourceRepository(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SourceRepository() {
    url_ = "";
    deployedUrl_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SourceRepository();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.functions.v1.FunctionsProto
        .internal_static_google_cloud_functions_v1_SourceRepository_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.functions.v1.FunctionsProto
        .internal_static_google_cloud_functions_v1_SourceRepository_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.functions.v1.SourceRepository.class,
            com.google.cloud.functions.v1.SourceRepository.Builder.class);
  }

  public static final int URL_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object url_ = "";
  /**
   *
   *
   * <pre>
   * The URL pointing to the hosted repository where the function is defined.
   * There are supported Cloud Source Repository URLs in the following
   * formats:
   * To refer to a specific commit:
   * `https://source.developers.google.com/projects/&#42;&#47;repos/&#42;&#47;revisions/&#42;&#47;paths/&#42;`
   * To refer to a moveable alias (branch):
   * `https://source.developers.google.com/projects/&#42;&#47;repos/&#42;&#47;moveable-aliases/&#42;&#47;paths/&#42;`
   * In particular, to refer to HEAD use `master` moveable alias.
   * To refer to a specific fixed alias (tag):
   * `https://source.developers.google.com/projects/&#42;&#47;repos/&#42;&#47;fixed-aliases/&#42;&#47;paths/&#42;`
   * You can omit `paths/&#42;` if you want to use the main directory.
   * </pre>
   *
   * <code>string url = 1;</code>
   *
   * @return The url.
   */
  @java.lang.Override
  public java.lang.String getUrl() {
    java.lang.Object ref = url_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      url_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The URL pointing to the hosted repository where the function is defined.
   * There are supported Cloud Source Repository URLs in the following
   * formats:
   * To refer to a specific commit:
   * `https://source.developers.google.com/projects/&#42;&#47;repos/&#42;&#47;revisions/&#42;&#47;paths/&#42;`
   * To refer to a moveable alias (branch):
   * `https://source.developers.google.com/projects/&#42;&#47;repos/&#42;&#47;moveable-aliases/&#42;&#47;paths/&#42;`
   * In particular, to refer to HEAD use `master` moveable alias.
   * To refer to a specific fixed alias (tag):
   * `https://source.developers.google.com/projects/&#42;&#47;repos/&#42;&#47;fixed-aliases/&#42;&#47;paths/&#42;`
   * You can omit `paths/&#42;` if you want to use the main directory.
   * </pre>
   *
   * <code>string url = 1;</code>
   *
   * @return The bytes for url.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getUrlBytes() {
    java.lang.Object ref = url_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      url_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DEPLOYED_URL_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object deployedUrl_ = "";
  /**
   *
   *
   * <pre>
   * Output only. The URL pointing to the hosted repository where the function
   * were defined at the time of deployment. It always points to a specific
   * commit in the format described above.
   * </pre>
   *
   * <code>string deployed_url = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The deployedUrl.
   */
  @java.lang.Override
  public java.lang.String getDeployedUrl() {
    java.lang.Object ref = deployedUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      deployedUrl_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only. The URL pointing to the hosted repository where the function
   * were defined at the time of deployment. It always points to a specific
   * commit in the format described above.
   * </pre>
   *
   * <code>string deployed_url = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for deployedUrl.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDeployedUrlBytes() {
    java.lang.Object ref = deployedUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      deployedUrl_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(url_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, url_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(deployedUrl_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, deployedUrl_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(url_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, url_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(deployedUrl_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, deployedUrl_);
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
    if (!(obj instanceof com.google.cloud.functions.v1.SourceRepository)) {
      return super.equals(obj);
    }
    com.google.cloud.functions.v1.SourceRepository other =
        (com.google.cloud.functions.v1.SourceRepository) obj;

    if (!getUrl().equals(other.getUrl())) return false;
    if (!getDeployedUrl().equals(other.getDeployedUrl())) return false;
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
    hash = (37 * hash) + URL_FIELD_NUMBER;
    hash = (53 * hash) + getUrl().hashCode();
    hash = (37 * hash) + DEPLOYED_URL_FIELD_NUMBER;
    hash = (53 * hash) + getDeployedUrl().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.functions.v1.SourceRepository parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.functions.v1.SourceRepository parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.functions.v1.SourceRepository parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.functions.v1.SourceRepository parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.functions.v1.SourceRepository parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.functions.v1.SourceRepository parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.functions.v1.SourceRepository parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.functions.v1.SourceRepository parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.functions.v1.SourceRepository parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.functions.v1.SourceRepository parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.functions.v1.SourceRepository parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.functions.v1.SourceRepository parseFrom(
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

  public static Builder newBuilder(com.google.cloud.functions.v1.SourceRepository prototype) {
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
   * Describes SourceRepository, used to represent parameters related to
   * source repository where a function is hosted.
   * </pre>
   *
   * Protobuf type {@code google.cloud.functions.v1.SourceRepository}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.functions.v1.SourceRepository)
      com.google.cloud.functions.v1.SourceRepositoryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.functions.v1.FunctionsProto
          .internal_static_google_cloud_functions_v1_SourceRepository_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.functions.v1.FunctionsProto
          .internal_static_google_cloud_functions_v1_SourceRepository_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.functions.v1.SourceRepository.class,
              com.google.cloud.functions.v1.SourceRepository.Builder.class);
    }

    // Construct using com.google.cloud.functions.v1.SourceRepository.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      url_ = "";
      deployedUrl_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.functions.v1.FunctionsProto
          .internal_static_google_cloud_functions_v1_SourceRepository_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.functions.v1.SourceRepository getDefaultInstanceForType() {
      return com.google.cloud.functions.v1.SourceRepository.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.functions.v1.SourceRepository build() {
      com.google.cloud.functions.v1.SourceRepository result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.functions.v1.SourceRepository buildPartial() {
      com.google.cloud.functions.v1.SourceRepository result =
          new com.google.cloud.functions.v1.SourceRepository(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.functions.v1.SourceRepository result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.url_ = url_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.deployedUrl_ = deployedUrl_;
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
      if (other instanceof com.google.cloud.functions.v1.SourceRepository) {
        return mergeFrom((com.google.cloud.functions.v1.SourceRepository) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.functions.v1.SourceRepository other) {
      if (other == com.google.cloud.functions.v1.SourceRepository.getDefaultInstance()) return this;
      if (!other.getUrl().isEmpty()) {
        url_ = other.url_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getDeployedUrl().isEmpty()) {
        deployedUrl_ = other.deployedUrl_;
        bitField0_ |= 0x00000002;
        onChanged();
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
                url_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                deployedUrl_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
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

    private java.lang.Object url_ = "";
    /**
     *
     *
     * <pre>
     * The URL pointing to the hosted repository where the function is defined.
     * There are supported Cloud Source Repository URLs in the following
     * formats:
     * To refer to a specific commit:
     * `https://source.developers.google.com/projects/&#42;&#47;repos/&#42;&#47;revisions/&#42;&#47;paths/&#42;`
     * To refer to a moveable alias (branch):
     * `https://source.developers.google.com/projects/&#42;&#47;repos/&#42;&#47;moveable-aliases/&#42;&#47;paths/&#42;`
     * In particular, to refer to HEAD use `master` moveable alias.
     * To refer to a specific fixed alias (tag):
     * `https://source.developers.google.com/projects/&#42;&#47;repos/&#42;&#47;fixed-aliases/&#42;&#47;paths/&#42;`
     * You can omit `paths/&#42;` if you want to use the main directory.
     * </pre>
     *
     * <code>string url = 1;</code>
     *
     * @return The url.
     */
    public java.lang.String getUrl() {
      java.lang.Object ref = url_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        url_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The URL pointing to the hosted repository where the function is defined.
     * There are supported Cloud Source Repository URLs in the following
     * formats:
     * To refer to a specific commit:
     * `https://source.developers.google.com/projects/&#42;&#47;repos/&#42;&#47;revisions/&#42;&#47;paths/&#42;`
     * To refer to a moveable alias (branch):
     * `https://source.developers.google.com/projects/&#42;&#47;repos/&#42;&#47;moveable-aliases/&#42;&#47;paths/&#42;`
     * In particular, to refer to HEAD use `master` moveable alias.
     * To refer to a specific fixed alias (tag):
     * `https://source.developers.google.com/projects/&#42;&#47;repos/&#42;&#47;fixed-aliases/&#42;&#47;paths/&#42;`
     * You can omit `paths/&#42;` if you want to use the main directory.
     * </pre>
     *
     * <code>string url = 1;</code>
     *
     * @return The bytes for url.
     */
    public com.google.protobuf.ByteString getUrlBytes() {
      java.lang.Object ref = url_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        url_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The URL pointing to the hosted repository where the function is defined.
     * There are supported Cloud Source Repository URLs in the following
     * formats:
     * To refer to a specific commit:
     * `https://source.developers.google.com/projects/&#42;&#47;repos/&#42;&#47;revisions/&#42;&#47;paths/&#42;`
     * To refer to a moveable alias (branch):
     * `https://source.developers.google.com/projects/&#42;&#47;repos/&#42;&#47;moveable-aliases/&#42;&#47;paths/&#42;`
     * In particular, to refer to HEAD use `master` moveable alias.
     * To refer to a specific fixed alias (tag):
     * `https://source.developers.google.com/projects/&#42;&#47;repos/&#42;&#47;fixed-aliases/&#42;&#47;paths/&#42;`
     * You can omit `paths/&#42;` if you want to use the main directory.
     * </pre>
     *
     * <code>string url = 1;</code>
     *
     * @param value The url to set.
     * @return This builder for chaining.
     */
    public Builder setUrl(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      url_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The URL pointing to the hosted repository where the function is defined.
     * There are supported Cloud Source Repository URLs in the following
     * formats:
     * To refer to a specific commit:
     * `https://source.developers.google.com/projects/&#42;&#47;repos/&#42;&#47;revisions/&#42;&#47;paths/&#42;`
     * To refer to a moveable alias (branch):
     * `https://source.developers.google.com/projects/&#42;&#47;repos/&#42;&#47;moveable-aliases/&#42;&#47;paths/&#42;`
     * In particular, to refer to HEAD use `master` moveable alias.
     * To refer to a specific fixed alias (tag):
     * `https://source.developers.google.com/projects/&#42;&#47;repos/&#42;&#47;fixed-aliases/&#42;&#47;paths/&#42;`
     * You can omit `paths/&#42;` if you want to use the main directory.
     * </pre>
     *
     * <code>string url = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearUrl() {
      url_ = getDefaultInstance().getUrl();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The URL pointing to the hosted repository where the function is defined.
     * There are supported Cloud Source Repository URLs in the following
     * formats:
     * To refer to a specific commit:
     * `https://source.developers.google.com/projects/&#42;&#47;repos/&#42;&#47;revisions/&#42;&#47;paths/&#42;`
     * To refer to a moveable alias (branch):
     * `https://source.developers.google.com/projects/&#42;&#47;repos/&#42;&#47;moveable-aliases/&#42;&#47;paths/&#42;`
     * In particular, to refer to HEAD use `master` moveable alias.
     * To refer to a specific fixed alias (tag):
     * `https://source.developers.google.com/projects/&#42;&#47;repos/&#42;&#47;fixed-aliases/&#42;&#47;paths/&#42;`
     * You can omit `paths/&#42;` if you want to use the main directory.
     * </pre>
     *
     * <code>string url = 1;</code>
     *
     * @param value The bytes for url to set.
     * @return This builder for chaining.
     */
    public Builder setUrlBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      url_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object deployedUrl_ = "";
    /**
     *
     *
     * <pre>
     * Output only. The URL pointing to the hosted repository where the function
     * were defined at the time of deployment. It always points to a specific
     * commit in the format described above.
     * </pre>
     *
     * <code>string deployed_url = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The deployedUrl.
     */
    public java.lang.String getDeployedUrl() {
      java.lang.Object ref = deployedUrl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        deployedUrl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The URL pointing to the hosted repository where the function
     * were defined at the time of deployment. It always points to a specific
     * commit in the format described above.
     * </pre>
     *
     * <code>string deployed_url = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The bytes for deployedUrl.
     */
    public com.google.protobuf.ByteString getDeployedUrlBytes() {
      java.lang.Object ref = deployedUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        deployedUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The URL pointing to the hosted repository where the function
     * were defined at the time of deployment. It always points to a specific
     * commit in the format described above.
     * </pre>
     *
     * <code>string deployed_url = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The deployedUrl to set.
     * @return This builder for chaining.
     */
    public Builder setDeployedUrl(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      deployedUrl_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The URL pointing to the hosted repository where the function
     * were defined at the time of deployment. It always points to a specific
     * commit in the format described above.
     * </pre>
     *
     * <code>string deployed_url = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDeployedUrl() {
      deployedUrl_ = getDefaultInstance().getDeployedUrl();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The URL pointing to the hosted repository where the function
     * were defined at the time of deployment. It always points to a specific
     * commit in the format described above.
     * </pre>
     *
     * <code>string deployed_url = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The bytes for deployedUrl to set.
     * @return This builder for chaining.
     */
    public Builder setDeployedUrlBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      deployedUrl_ = value;
      bitField0_ |= 0x00000002;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.functions.v1.SourceRepository)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.functions.v1.SourceRepository)
  private static final com.google.cloud.functions.v1.SourceRepository DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.functions.v1.SourceRepository();
  }

  public static com.google.cloud.functions.v1.SourceRepository getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SourceRepository> PARSER =
      new com.google.protobuf.AbstractParser<SourceRepository>() {
        @java.lang.Override
        public SourceRepository parsePartialFrom(
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

  public static com.google.protobuf.Parser<SourceRepository> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SourceRepository> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.functions.v1.SourceRepository getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
