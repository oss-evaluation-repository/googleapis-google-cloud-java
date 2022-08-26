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
// source: google/cloud/datalabeling/v1beta1/data_labeling_service.proto

package com.google.cloud.datalabeling.v1beta1;

public interface CreateAnnotationSpecSetRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datalabeling.v1beta1.CreateAnnotationSpecSetRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. AnnotationSpecSet resource parent, format:
   * projects/{project_id}
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. AnnotationSpecSet resource parent, format:
   * projects/{project_id}
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. Annotation spec set to create. Annotation specs must be included.
   * Only one annotation spec will be accepted for annotation specs with same
   * display_name.
   * </pre>
   *
   * <code>
   * .google.cloud.datalabeling.v1beta1.AnnotationSpecSet annotation_spec_set = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the annotationSpecSet field is set.
   */
  boolean hasAnnotationSpecSet();
  /**
   *
   *
   * <pre>
   * Required. Annotation spec set to create. Annotation specs must be included.
   * Only one annotation spec will be accepted for annotation specs with same
   * display_name.
   * </pre>
   *
   * <code>
   * .google.cloud.datalabeling.v1beta1.AnnotationSpecSet annotation_spec_set = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The annotationSpecSet.
   */
  com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet getAnnotationSpecSet();
  /**
   *
   *
   * <pre>
   * Required. Annotation spec set to create. Annotation specs must be included.
   * Only one annotation spec will be accepted for annotation specs with same
   * display_name.
   * </pre>
   *
   * <code>
   * .google.cloud.datalabeling.v1beta1.AnnotationSpecSet annotation_spec_set = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.datalabeling.v1beta1.AnnotationSpecSetOrBuilder getAnnotationSpecSetOrBuilder();
}
