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
// source: google/cloud/metastore/v1/metastore.proto

package com.google.cloud.metastore.v1;

public interface UpdateServiceRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.metastore.v1.UpdateServiceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. A field mask used to specify the fields to be overwritten in the
   * metastore service resource by the update.
   * Fields specified in the `update_mask` are relative to the resource (not
   * to the full request). A field is overwritten if it is in the mask.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. A field mask used to specify the fields to be overwritten in the
   * metastore service resource by the update.
   * Fields specified in the `update_mask` are relative to the resource (not
   * to the full request). A field is overwritten if it is in the mask.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. A field mask used to specify the fields to be overwritten in the
   * metastore service resource by the update.
   * Fields specified in the `update_mask` are relative to the resource (not
   * to the full request). A field is overwritten if it is in the mask.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The metastore service to update. The server only merges fields
   * in the service if they are specified in `update_mask`.
   * The metastore service's `name` field is used to identify the metastore
   * service to be updated.
   * </pre>
   *
   * <code>.google.cloud.metastore.v1.Service service = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the service field is set.
   */
  boolean hasService();
  /**
   *
   *
   * <pre>
   * Required. The metastore service to update. The server only merges fields
   * in the service if they are specified in `update_mask`.
   * The metastore service's `name` field is used to identify the metastore
   * service to be updated.
   * </pre>
   *
   * <code>.google.cloud.metastore.v1.Service service = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The service.
   */
  com.google.cloud.metastore.v1.Service getService();
  /**
   *
   *
   * <pre>
   * Required. The metastore service to update. The server only merges fields
   * in the service if they are specified in `update_mask`.
   * The metastore service's `name` field is used to identify the metastore
   * service to be updated.
   * </pre>
   *
   * <code>.google.cloud.metastore.v1.Service service = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.metastore.v1.ServiceOrBuilder getServiceOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. A request ID. Specify a unique request ID to allow the server to
   * ignore the request if it has completed. The server will ignore subsequent
   * requests that provide a duplicate request ID for at least 60 minutes after
   * the first request.
   * For example, if an initial request times out, followed by another request
   * with the same request ID, the server ignores the second request to prevent
   * the creation of duplicate commitments.
   * The request ID must be a valid
   * [UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Format)
   * A zero UUID (00000000-0000-0000-0000-000000000000) is not supported.
   * </pre>
   *
   * <code>string request_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   *
   *
   * <pre>
   * Optional. A request ID. Specify a unique request ID to allow the server to
   * ignore the request if it has completed. The server will ignore subsequent
   * requests that provide a duplicate request ID for at least 60 minutes after
   * the first request.
   * For example, if an initial request times out, followed by another request
   * with the same request ID, the server ignores the second request to prevent
   * the creation of duplicate commitments.
   * The request ID must be a valid
   * [UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Format)
   * A zero UUID (00000000-0000-0000-0000-000000000000) is not supported.
   * </pre>
   *
   * <code>string request_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString getRequestIdBytes();
}
