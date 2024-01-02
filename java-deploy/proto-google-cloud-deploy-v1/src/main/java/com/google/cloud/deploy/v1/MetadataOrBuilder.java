/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/deploy/v1/cloud_deploy.proto

package com.google.cloud.deploy.v1;

public interface MetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.deploy.v1.Metadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The name of the Cloud Run Service that is associated with a
   * `Rollout`.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.CloudRunMetadata cloud_run = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the cloudRun field is set.
   */
  boolean hasCloudRun();
  /**
   *
   *
   * <pre>
   * Output only. The name of the Cloud Run Service that is associated with a
   * `Rollout`.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.CloudRunMetadata cloud_run = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The cloudRun.
   */
  com.google.cloud.deploy.v1.CloudRunMetadata getCloudRun();
  /**
   *
   *
   * <pre>
   * Output only. The name of the Cloud Run Service that is associated with a
   * `Rollout`.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.CloudRunMetadata cloud_run = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.deploy.v1.CloudRunMetadataOrBuilder getCloudRunOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. AutomationRolloutMetadata contains the information about the
   * interactions between Automation service and this rollout.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.AutomationRolloutMetadata automation = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the automation field is set.
   */
  boolean hasAutomation();
  /**
   *
   *
   * <pre>
   * Output only. AutomationRolloutMetadata contains the information about the
   * interactions between Automation service and this rollout.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.AutomationRolloutMetadata automation = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The automation.
   */
  com.google.cloud.deploy.v1.AutomationRolloutMetadata getAutomation();
  /**
   *
   *
   * <pre>
   * Output only. AutomationRolloutMetadata contains the information about the
   * interactions between Automation service and this rollout.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.AutomationRolloutMetadata automation = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.deploy.v1.AutomationRolloutMetadataOrBuilder getAutomationOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Custom metadata provided by user defined `Rollout` operations.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.CustomMetadata custom = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the custom field is set.
   */
  boolean hasCustom();
  /**
   *
   *
   * <pre>
   * Output only. Custom metadata provided by user defined `Rollout` operations.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.CustomMetadata custom = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The custom.
   */
  com.google.cloud.deploy.v1.CustomMetadata getCustom();
  /**
   *
   *
   * <pre>
   * Output only. Custom metadata provided by user defined `Rollout` operations.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.CustomMetadata custom = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.deploy.v1.CustomMetadataOrBuilder getCustomOrBuilder();
}
