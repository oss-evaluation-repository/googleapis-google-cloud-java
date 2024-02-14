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
// source: google/cloud/aiplatform/v1beta1/index_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public interface UpsertDatapointsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.UpsertDatapointsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the Index resource to be updated.
   * Format:
   * `projects/{project}/locations/{location}/indexes/{index}`
   * </pre>
   *
   * <code>
   * string index = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The index.
   */
  java.lang.String getIndex();
  /**
   *
   *
   * <pre>
   * Required. The name of the Index resource to be updated.
   * Format:
   * `projects/{project}/locations/{location}/indexes/{index}`
   * </pre>
   *
   * <code>
   * string index = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for index.
   */
  com.google.protobuf.ByteString getIndexBytes();

  /**
   *
   *
   * <pre>
   * A list of datapoints to be created/updated.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.IndexDatapoint datapoints = 2;</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1beta1.IndexDatapoint> getDatapointsList();
  /**
   *
   *
   * <pre>
   * A list of datapoints to be created/updated.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.IndexDatapoint datapoints = 2;</code>
   */
  com.google.cloud.aiplatform.v1beta1.IndexDatapoint getDatapoints(int index);
  /**
   *
   *
   * <pre>
   * A list of datapoints to be created/updated.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.IndexDatapoint datapoints = 2;</code>
   */
  int getDatapointsCount();
  /**
   *
   *
   * <pre>
   * A list of datapoints to be created/updated.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.IndexDatapoint datapoints = 2;</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1beta1.IndexDatapointOrBuilder>
      getDatapointsOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of datapoints to be created/updated.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.IndexDatapoint datapoints = 2;</code>
   */
  com.google.cloud.aiplatform.v1beta1.IndexDatapointOrBuilder getDatapointsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional. Update mask is used to specify the fields to be overwritten in
   * the datapoints by the update. The fields specified in the update_mask are
   * relative to each IndexDatapoint inside datapoints, not the full request.
   *
   * Updatable fields:
   *
   *   * Use `all_restricts` to update both restricts and numeric_restricts.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Optional. Update mask is used to specify the fields to be overwritten in
   * the datapoints by the update. The fields specified in the update_mask are
   * relative to each IndexDatapoint inside datapoints, not the full request.
   *
   * Updatable fields:
   *
   *   * Use `all_restricts` to update both restricts and numeric_restricts.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Optional. Update mask is used to specify the fields to be overwritten in
   * the datapoints by the update. The fields specified in the update_mask are
   * relative to each IndexDatapoint inside datapoints, not the full request.
   *
   * Updatable fields:
   *
   *   * Use `all_restricts` to update both restricts and numeric_restricts.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
