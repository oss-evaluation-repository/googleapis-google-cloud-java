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
// source: google/cloud/batch/v1alpha/job.proto

package com.google.cloud.batch.v1alpha;

public interface AllocationPolicyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.batch.v1alpha.AllocationPolicy)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Location where compute resources should be allocated for the Job.
   * </pre>
   *
   * <code>.google.cloud.batch.v1alpha.AllocationPolicy.LocationPolicy location = 1;</code>
   *
   * @return Whether the location field is set.
   */
  boolean hasLocation();
  /**
   *
   *
   * <pre>
   * Location where compute resources should be allocated for the Job.
   * </pre>
   *
   * <code>.google.cloud.batch.v1alpha.AllocationPolicy.LocationPolicy location = 1;</code>
   *
   * @return The location.
   */
  com.google.cloud.batch.v1alpha.AllocationPolicy.LocationPolicy getLocation();
  /**
   *
   *
   * <pre>
   * Location where compute resources should be allocated for the Job.
   * </pre>
   *
   * <code>.google.cloud.batch.v1alpha.AllocationPolicy.LocationPolicy location = 1;</code>
   */
  com.google.cloud.batch.v1alpha.AllocationPolicy.LocationPolicyOrBuilder getLocationOrBuilder();

  /**
   *
   *
   * <pre>
   * Deprecated: please use instances[0].policy instead.
   * </pre>
   *
   * <code>
   * .google.cloud.batch.v1alpha.AllocationPolicy.InstancePolicy instance = 2 [deprecated = true];
   * </code>
   *
   * @deprecated google.cloud.batch.v1alpha.AllocationPolicy.instance is deprecated. See
   *     google/cloud/batch/v1alpha/job.proto;l=551
   * @return Whether the instance field is set.
   */
  @java.lang.Deprecated
  boolean hasInstance();
  /**
   *
   *
   * <pre>
   * Deprecated: please use instances[0].policy instead.
   * </pre>
   *
   * <code>
   * .google.cloud.batch.v1alpha.AllocationPolicy.InstancePolicy instance = 2 [deprecated = true];
   * </code>
   *
   * @deprecated google.cloud.batch.v1alpha.AllocationPolicy.instance is deprecated. See
   *     google/cloud/batch/v1alpha/job.proto;l=551
   * @return The instance.
   */
  @java.lang.Deprecated
  com.google.cloud.batch.v1alpha.AllocationPolicy.InstancePolicy getInstance();
  /**
   *
   *
   * <pre>
   * Deprecated: please use instances[0].policy instead.
   * </pre>
   *
   * <code>
   * .google.cloud.batch.v1alpha.AllocationPolicy.InstancePolicy instance = 2 [deprecated = true];
   * </code>
   */
  @java.lang.Deprecated
  com.google.cloud.batch.v1alpha.AllocationPolicy.InstancePolicyOrBuilder getInstanceOrBuilder();

  /**
   *
   *
   * <pre>
   * Describe instances that can be created by this AllocationPolicy.
   * Only instances[0] is supported now.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.batch.v1alpha.AllocationPolicy.InstancePolicyOrTemplate instances = 8;
   * </code>
   */
  java.util.List<com.google.cloud.batch.v1alpha.AllocationPolicy.InstancePolicyOrTemplate>
      getInstancesList();
  /**
   *
   *
   * <pre>
   * Describe instances that can be created by this AllocationPolicy.
   * Only instances[0] is supported now.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.batch.v1alpha.AllocationPolicy.InstancePolicyOrTemplate instances = 8;
   * </code>
   */
  com.google.cloud.batch.v1alpha.AllocationPolicy.InstancePolicyOrTemplate getInstances(int index);
  /**
   *
   *
   * <pre>
   * Describe instances that can be created by this AllocationPolicy.
   * Only instances[0] is supported now.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.batch.v1alpha.AllocationPolicy.InstancePolicyOrTemplate instances = 8;
   * </code>
   */
  int getInstancesCount();
  /**
   *
   *
   * <pre>
   * Describe instances that can be created by this AllocationPolicy.
   * Only instances[0] is supported now.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.batch.v1alpha.AllocationPolicy.InstancePolicyOrTemplate instances = 8;
   * </code>
   */
  java.util.List<
          ? extends
              com.google.cloud.batch.v1alpha.AllocationPolicy.InstancePolicyOrTemplateOrBuilder>
      getInstancesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Describe instances that can be created by this AllocationPolicy.
   * Only instances[0] is supported now.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.batch.v1alpha.AllocationPolicy.InstancePolicyOrTemplate instances = 8;
   * </code>
   */
  com.google.cloud.batch.v1alpha.AllocationPolicy.InstancePolicyOrTemplateOrBuilder
      getInstancesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Deprecated: please use instances[0].template instead.
   * </pre>
   *
   * <code>repeated string instance_templates = 3 [deprecated = true];</code>
   *
   * @deprecated google.cloud.batch.v1alpha.AllocationPolicy.instance_templates is deprecated. See
   *     google/cloud/batch/v1alpha/job.proto;l=558
   * @return A list containing the instanceTemplates.
   */
  @java.lang.Deprecated
  java.util.List<java.lang.String> getInstanceTemplatesList();
  /**
   *
   *
   * <pre>
   * Deprecated: please use instances[0].template instead.
   * </pre>
   *
   * <code>repeated string instance_templates = 3 [deprecated = true];</code>
   *
   * @deprecated google.cloud.batch.v1alpha.AllocationPolicy.instance_templates is deprecated. See
   *     google/cloud/batch/v1alpha/job.proto;l=558
   * @return The count of instanceTemplates.
   */
  @java.lang.Deprecated
  int getInstanceTemplatesCount();
  /**
   *
   *
   * <pre>
   * Deprecated: please use instances[0].template instead.
   * </pre>
   *
   * <code>repeated string instance_templates = 3 [deprecated = true];</code>
   *
   * @deprecated google.cloud.batch.v1alpha.AllocationPolicy.instance_templates is deprecated. See
   *     google/cloud/batch/v1alpha/job.proto;l=558
   * @param index The index of the element to return.
   * @return The instanceTemplates at the given index.
   */
  @java.lang.Deprecated
  java.lang.String getInstanceTemplates(int index);
  /**
   *
   *
   * <pre>
   * Deprecated: please use instances[0].template instead.
   * </pre>
   *
   * <code>repeated string instance_templates = 3 [deprecated = true];</code>
   *
   * @deprecated google.cloud.batch.v1alpha.AllocationPolicy.instance_templates is deprecated. See
   *     google/cloud/batch/v1alpha/job.proto;l=558
   * @param index The index of the value to return.
   * @return The bytes of the instanceTemplates at the given index.
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getInstanceTemplatesBytes(int index);

  /**
   *
   *
   * <pre>
   * Deprecated: please use instances[0].policy.provisioning_model instead.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.batch.v1alpha.AllocationPolicy.ProvisioningModel provisioning_models = 4 [deprecated = true];
   * </code>
   *
   * @deprecated google.cloud.batch.v1alpha.AllocationPolicy.provisioning_models is deprecated. See
   *     google/cloud/batch/v1alpha/job.proto;l=561
   * @return A list containing the provisioningModels.
   */
  @java.lang.Deprecated
  java.util.List<com.google.cloud.batch.v1alpha.AllocationPolicy.ProvisioningModel>
      getProvisioningModelsList();
  /**
   *
   *
   * <pre>
   * Deprecated: please use instances[0].policy.provisioning_model instead.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.batch.v1alpha.AllocationPolicy.ProvisioningModel provisioning_models = 4 [deprecated = true];
   * </code>
   *
   * @deprecated google.cloud.batch.v1alpha.AllocationPolicy.provisioning_models is deprecated. See
   *     google/cloud/batch/v1alpha/job.proto;l=561
   * @return The count of provisioningModels.
   */
  @java.lang.Deprecated
  int getProvisioningModelsCount();
  /**
   *
   *
   * <pre>
   * Deprecated: please use instances[0].policy.provisioning_model instead.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.batch.v1alpha.AllocationPolicy.ProvisioningModel provisioning_models = 4 [deprecated = true];
   * </code>
   *
   * @deprecated google.cloud.batch.v1alpha.AllocationPolicy.provisioning_models is deprecated. See
   *     google/cloud/batch/v1alpha/job.proto;l=561
   * @param index The index of the element to return.
   * @return The provisioningModels at the given index.
   */
  @java.lang.Deprecated
  com.google.cloud.batch.v1alpha.AllocationPolicy.ProvisioningModel getProvisioningModels(
      int index);
  /**
   *
   *
   * <pre>
   * Deprecated: please use instances[0].policy.provisioning_model instead.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.batch.v1alpha.AllocationPolicy.ProvisioningModel provisioning_models = 4 [deprecated = true];
   * </code>
   *
   * @deprecated google.cloud.batch.v1alpha.AllocationPolicy.provisioning_models is deprecated. See
   *     google/cloud/batch/v1alpha/job.proto;l=561
   * @return A list containing the enum numeric values on the wire for provisioningModels.
   */
  @java.lang.Deprecated
  java.util.List<java.lang.Integer> getProvisioningModelsValueList();
  /**
   *
   *
   * <pre>
   * Deprecated: please use instances[0].policy.provisioning_model instead.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.batch.v1alpha.AllocationPolicy.ProvisioningModel provisioning_models = 4 [deprecated = true];
   * </code>
   *
   * @deprecated google.cloud.batch.v1alpha.AllocationPolicy.provisioning_models is deprecated. See
   *     google/cloud/batch/v1alpha/job.proto;l=561
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of provisioningModels at the given index.
   */
  @java.lang.Deprecated
  int getProvisioningModelsValue(int index);

  /**
   *
   *
   * <pre>
   * Deprecated: please use service_account instead.
   * </pre>
   *
   * <code>string service_account_email = 5 [deprecated = true];</code>
   *
   * @deprecated google.cloud.batch.v1alpha.AllocationPolicy.service_account_email is deprecated.
   *     See google/cloud/batch/v1alpha/job.proto;l=564
   * @return The serviceAccountEmail.
   */
  @java.lang.Deprecated
  java.lang.String getServiceAccountEmail();
  /**
   *
   *
   * <pre>
   * Deprecated: please use service_account instead.
   * </pre>
   *
   * <code>string service_account_email = 5 [deprecated = true];</code>
   *
   * @deprecated google.cloud.batch.v1alpha.AllocationPolicy.service_account_email is deprecated.
   *     See google/cloud/batch/v1alpha/job.proto;l=564
   * @return The bytes for serviceAccountEmail.
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getServiceAccountEmailBytes();

  /**
   *
   *
   * <pre>
   * Service account that VMs will run as.
   * </pre>
   *
   * <code>.google.cloud.batch.v1alpha.ServiceAccount service_account = 9;</code>
   *
   * @return Whether the serviceAccount field is set.
   */
  boolean hasServiceAccount();
  /**
   *
   *
   * <pre>
   * Service account that VMs will run as.
   * </pre>
   *
   * <code>.google.cloud.batch.v1alpha.ServiceAccount service_account = 9;</code>
   *
   * @return The serviceAccount.
   */
  com.google.cloud.batch.v1alpha.ServiceAccount getServiceAccount();
  /**
   *
   *
   * <pre>
   * Service account that VMs will run as.
   * </pre>
   *
   * <code>.google.cloud.batch.v1alpha.ServiceAccount service_account = 9;</code>
   */
  com.google.cloud.batch.v1alpha.ServiceAccountOrBuilder getServiceAccountOrBuilder();

  /**
   *
   *
   * <pre>
   * Labels applied to all VM instances and other resources
   * created by AllocationPolicy.
   * Labels could be user provided or system generated.
   * You can assign up to 64 labels. [Google Compute Engine label
   * restrictions](https://cloud.google.com/compute/docs/labeling-resources#restrictions)
   * apply.
   * Label names that start with "goog-" or "google-" are reserved.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Labels applied to all VM instances and other resources
   * created by AllocationPolicy.
   * Labels could be user provided or system generated.
   * You can assign up to 64 labels. [Google Compute Engine label
   * restrictions](https://cloud.google.com/compute/docs/labeling-resources#restrictions)
   * apply.
   * Label names that start with "goog-" or "google-" are reserved.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Labels applied to all VM instances and other resources
   * created by AllocationPolicy.
   * Labels could be user provided or system generated.
   * You can assign up to 64 labels. [Google Compute Engine label
   * restrictions](https://cloud.google.com/compute/docs/labeling-resources#restrictions)
   * apply.
   * Label names that start with "goog-" or "google-" are reserved.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Labels applied to all VM instances and other resources
   * created by AllocationPolicy.
   * Labels could be user provided or system generated.
   * You can assign up to 64 labels. [Google Compute Engine label
   * restrictions](https://cloud.google.com/compute/docs/labeling-resources#restrictions)
   * apply.
   * Label names that start with "goog-" or "google-" are reserved.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6;</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Labels applied to all VM instances and other resources
   * created by AllocationPolicy.
   * Labels could be user provided or system generated.
   * You can assign up to 64 labels. [Google Compute Engine label
   * restrictions](https://cloud.google.com/compute/docs/labeling-resources#restrictions)
   * apply.
   * Label names that start with "goog-" or "google-" are reserved.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * The network policy.
   * </pre>
   *
   * <code>.google.cloud.batch.v1alpha.AllocationPolicy.NetworkPolicy network = 7;</code>
   *
   * @return Whether the network field is set.
   */
  boolean hasNetwork();
  /**
   *
   *
   * <pre>
   * The network policy.
   * </pre>
   *
   * <code>.google.cloud.batch.v1alpha.AllocationPolicy.NetworkPolicy network = 7;</code>
   *
   * @return The network.
   */
  com.google.cloud.batch.v1alpha.AllocationPolicy.NetworkPolicy getNetwork();
  /**
   *
   *
   * <pre>
   * The network policy.
   * </pre>
   *
   * <code>.google.cloud.batch.v1alpha.AllocationPolicy.NetworkPolicy network = 7;</code>
   */
  com.google.cloud.batch.v1alpha.AllocationPolicy.NetworkPolicyOrBuilder getNetworkOrBuilder();

  /**
   *
   *
   * <pre>
   * The placement policy.
   * </pre>
   *
   * <code>.google.cloud.batch.v1alpha.AllocationPolicy.PlacementPolicy placement = 10;</code>
   *
   * @return Whether the placement field is set.
   */
  boolean hasPlacement();
  /**
   *
   *
   * <pre>
   * The placement policy.
   * </pre>
   *
   * <code>.google.cloud.batch.v1alpha.AllocationPolicy.PlacementPolicy placement = 10;</code>
   *
   * @return The placement.
   */
  com.google.cloud.batch.v1alpha.AllocationPolicy.PlacementPolicy getPlacement();
  /**
   *
   *
   * <pre>
   * The placement policy.
   * </pre>
   *
   * <code>.google.cloud.batch.v1alpha.AllocationPolicy.PlacementPolicy placement = 10;</code>
   */
  com.google.cloud.batch.v1alpha.AllocationPolicy.PlacementPolicyOrBuilder getPlacementOrBuilder();
}
