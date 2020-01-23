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
// source: google/cloud/talent/v4beta1/application_service.proto

package com.google.cloud.talent.v4beta1;

/**
 *
 *
 * <pre>
 * The Request of the CreateApplication method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.talent.v4beta1.CreateApplicationRequest}
 */
public final class CreateApplicationRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.talent.v4beta1.CreateApplicationRequest)
    CreateApplicationRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateApplicationRequest.newBuilder() to construct.
  private CreateApplicationRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateApplicationRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateApplicationRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private CreateApplicationRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
              java.lang.String s = input.readStringRequireUtf8();

              parent_ = s;
              break;
            }
          case 18:
            {
              com.google.cloud.talent.v4beta1.Application.Builder subBuilder = null;
              if (application_ != null) {
                subBuilder = application_.toBuilder();
              }
              application_ =
                  input.readMessage(
                      com.google.cloud.talent.v4beta1.Application.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(application_);
                application_ = subBuilder.buildPartial();
              }

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
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.talent.v4beta1.ApplicationServiceProto
        .internal_static_google_cloud_talent_v4beta1_CreateApplicationRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.talent.v4beta1.ApplicationServiceProto
        .internal_static_google_cloud_talent_v4beta1_CreateApplicationRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.talent.v4beta1.CreateApplicationRequest.class,
            com.google.cloud.talent.v4beta1.CreateApplicationRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * Required. Resource name of the profile under which the application is created.
   * The format is
   * "projects/{project_id}/tenants/{tenant_id}/profiles/{profile_id}".
   * For example, "projects/foo/tenants/bar/profiles/baz".
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. Resource name of the profile under which the application is created.
   * The format is
   * "projects/{project_id}/tenants/{tenant_id}/profiles/{profile_id}".
   * For example, "projects/foo/tenants/bar/profiles/baz".
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int APPLICATION_FIELD_NUMBER = 2;
  private com.google.cloud.talent.v4beta1.Application application_;
  /**
   *
   *
   * <pre>
   * Required. The application to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.talent.v4beta1.Application application = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the application field is set.
   */
  public boolean hasApplication() {
    return application_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The application to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.talent.v4beta1.Application application = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The application.
   */
  public com.google.cloud.talent.v4beta1.Application getApplication() {
    return application_ == null
        ? com.google.cloud.talent.v4beta1.Application.getDefaultInstance()
        : application_;
  }
  /**
   *
   *
   * <pre>
   * Required. The application to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.talent.v4beta1.Application application = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  public com.google.cloud.talent.v4beta1.ApplicationOrBuilder getApplicationOrBuilder() {
    return getApplication();
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
    if (!getParentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (application_ != null) {
      output.writeMessage(2, getApplication());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getParentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (application_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getApplication());
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
    if (!(obj instanceof com.google.cloud.talent.v4beta1.CreateApplicationRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.talent.v4beta1.CreateApplicationRequest other =
        (com.google.cloud.talent.v4beta1.CreateApplicationRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasApplication() != other.hasApplication()) return false;
    if (hasApplication()) {
      if (!getApplication().equals(other.getApplication())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasApplication()) {
      hash = (37 * hash) + APPLICATION_FIELD_NUMBER;
      hash = (53 * hash) + getApplication().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.talent.v4beta1.CreateApplicationRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.talent.v4beta1.CreateApplicationRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.CreateApplicationRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.talent.v4beta1.CreateApplicationRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.CreateApplicationRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.talent.v4beta1.CreateApplicationRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.CreateApplicationRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.talent.v4beta1.CreateApplicationRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.CreateApplicationRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.talent.v4beta1.CreateApplicationRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.CreateApplicationRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.talent.v4beta1.CreateApplicationRequest parseFrom(
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
      com.google.cloud.talent.v4beta1.CreateApplicationRequest prototype) {
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
   * The Request of the CreateApplication method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.talent.v4beta1.CreateApplicationRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.talent.v4beta1.CreateApplicationRequest)
      com.google.cloud.talent.v4beta1.CreateApplicationRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.talent.v4beta1.ApplicationServiceProto
          .internal_static_google_cloud_talent_v4beta1_CreateApplicationRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.talent.v4beta1.ApplicationServiceProto
          .internal_static_google_cloud_talent_v4beta1_CreateApplicationRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.talent.v4beta1.CreateApplicationRequest.class,
              com.google.cloud.talent.v4beta1.CreateApplicationRequest.Builder.class);
    }

    // Construct using com.google.cloud.talent.v4beta1.CreateApplicationRequest.newBuilder()
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
      parent_ = "";

      if (applicationBuilder_ == null) {
        application_ = null;
      } else {
        application_ = null;
        applicationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.talent.v4beta1.ApplicationServiceProto
          .internal_static_google_cloud_talent_v4beta1_CreateApplicationRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.talent.v4beta1.CreateApplicationRequest getDefaultInstanceForType() {
      return com.google.cloud.talent.v4beta1.CreateApplicationRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.talent.v4beta1.CreateApplicationRequest build() {
      com.google.cloud.talent.v4beta1.CreateApplicationRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.talent.v4beta1.CreateApplicationRequest buildPartial() {
      com.google.cloud.talent.v4beta1.CreateApplicationRequest result =
          new com.google.cloud.talent.v4beta1.CreateApplicationRequest(this);
      result.parent_ = parent_;
      if (applicationBuilder_ == null) {
        result.application_ = application_;
      } else {
        result.application_ = applicationBuilder_.build();
      }
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
      if (other instanceof com.google.cloud.talent.v4beta1.CreateApplicationRequest) {
        return mergeFrom((com.google.cloud.talent.v4beta1.CreateApplicationRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.talent.v4beta1.CreateApplicationRequest other) {
      if (other == com.google.cloud.talent.v4beta1.CreateApplicationRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasApplication()) {
        mergeApplication(other.getApplication());
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
      com.google.cloud.talent.v4beta1.CreateApplicationRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.talent.v4beta1.CreateApplicationRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. Resource name of the profile under which the application is created.
     * The format is
     * "projects/{project_id}/tenants/{tenant_id}/profiles/{profile_id}".
     * For example, "projects/foo/tenants/bar/profiles/baz".
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Resource name of the profile under which the application is created.
     * The format is
     * "projects/{project_id}/tenants/{tenant_id}/profiles/{profile_id}".
     * For example, "projects/foo/tenants/bar/profiles/baz".
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Resource name of the profile under which the application is created.
     * The format is
     * "projects/{project_id}/tenants/{tenant_id}/profiles/{profile_id}".
     * For example, "projects/foo/tenants/bar/profiles/baz".
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      parent_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Resource name of the profile under which the application is created.
     * The format is
     * "projects/{project_id}/tenants/{tenant_id}/profiles/{profile_id}".
     * For example, "projects/foo/tenants/bar/profiles/baz".
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {

      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Resource name of the profile under which the application is created.
     * The format is
     * "projects/{project_id}/tenants/{tenant_id}/profiles/{profile_id}".
     * For example, "projects/foo/tenants/bar/profiles/baz".
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      parent_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.talent.v4beta1.Application application_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.talent.v4beta1.Application,
            com.google.cloud.talent.v4beta1.Application.Builder,
            com.google.cloud.talent.v4beta1.ApplicationOrBuilder>
        applicationBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The application to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.talent.v4beta1.Application application = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the application field is set.
     */
    public boolean hasApplication() {
      return applicationBuilder_ != null || application_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The application to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.talent.v4beta1.Application application = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The application.
     */
    public com.google.cloud.talent.v4beta1.Application getApplication() {
      if (applicationBuilder_ == null) {
        return application_ == null
            ? com.google.cloud.talent.v4beta1.Application.getDefaultInstance()
            : application_;
      } else {
        return applicationBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The application to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.talent.v4beta1.Application application = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setApplication(com.google.cloud.talent.v4beta1.Application value) {
      if (applicationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        application_ = value;
        onChanged();
      } else {
        applicationBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The application to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.talent.v4beta1.Application application = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setApplication(
        com.google.cloud.talent.v4beta1.Application.Builder builderForValue) {
      if (applicationBuilder_ == null) {
        application_ = builderForValue.build();
        onChanged();
      } else {
        applicationBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The application to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.talent.v4beta1.Application application = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeApplication(com.google.cloud.talent.v4beta1.Application value) {
      if (applicationBuilder_ == null) {
        if (application_ != null) {
          application_ =
              com.google.cloud.talent.v4beta1.Application.newBuilder(application_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          application_ = value;
        }
        onChanged();
      } else {
        applicationBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The application to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.talent.v4beta1.Application application = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearApplication() {
      if (applicationBuilder_ == null) {
        application_ = null;
        onChanged();
      } else {
        application_ = null;
        applicationBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The application to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.talent.v4beta1.Application application = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.talent.v4beta1.Application.Builder getApplicationBuilder() {

      onChanged();
      return getApplicationFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The application to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.talent.v4beta1.Application application = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.talent.v4beta1.ApplicationOrBuilder getApplicationOrBuilder() {
      if (applicationBuilder_ != null) {
        return applicationBuilder_.getMessageOrBuilder();
      } else {
        return application_ == null
            ? com.google.cloud.talent.v4beta1.Application.getDefaultInstance()
            : application_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The application to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.talent.v4beta1.Application application = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.talent.v4beta1.Application,
            com.google.cloud.talent.v4beta1.Application.Builder,
            com.google.cloud.talent.v4beta1.ApplicationOrBuilder>
        getApplicationFieldBuilder() {
      if (applicationBuilder_ == null) {
        applicationBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.talent.v4beta1.Application,
                com.google.cloud.talent.v4beta1.Application.Builder,
                com.google.cloud.talent.v4beta1.ApplicationOrBuilder>(
                getApplication(), getParentForChildren(), isClean());
        application_ = null;
      }
      return applicationBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.talent.v4beta1.CreateApplicationRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.talent.v4beta1.CreateApplicationRequest)
  private static final com.google.cloud.talent.v4beta1.CreateApplicationRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.talent.v4beta1.CreateApplicationRequest();
  }

  public static com.google.cloud.talent.v4beta1.CreateApplicationRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateApplicationRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateApplicationRequest>() {
        @java.lang.Override
        public CreateApplicationRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new CreateApplicationRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<CreateApplicationRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateApplicationRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.talent.v4beta1.CreateApplicationRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
