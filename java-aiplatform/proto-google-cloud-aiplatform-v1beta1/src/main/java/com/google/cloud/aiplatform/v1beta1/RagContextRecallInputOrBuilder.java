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

public interface RagContextRecallInputOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.RagContextRecallInput)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Spec for rag context recall metric.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.RagContextRecallSpec metric_spec = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the metricSpec field is set.
   */
  boolean hasMetricSpec();
  /**
   *
   *
   * <pre>
   * Required. Spec for rag context recall metric.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.RagContextRecallSpec metric_spec = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The metricSpec.
   */
  com.google.cloud.aiplatform.v1beta1.RagContextRecallSpec getMetricSpec();
  /**
   *
   *
   * <pre>
   * Required. Spec for rag context recall metric.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.RagContextRecallSpec metric_spec = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.RagContextRecallSpecOrBuilder getMetricSpecOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Rag context recall instance.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.RagContextRecallInstance instance = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the instance field is set.
   */
  boolean hasInstance();
  /**
   *
   *
   * <pre>
   * Required. Rag context recall instance.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.RagContextRecallInstance instance = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The instance.
   */
  com.google.cloud.aiplatform.v1beta1.RagContextRecallInstance getInstance();
  /**
   *
   *
   * <pre>
   * Required. Rag context recall instance.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.RagContextRecallInstance instance = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.RagContextRecallInstanceOrBuilder getInstanceOrBuilder();
}
