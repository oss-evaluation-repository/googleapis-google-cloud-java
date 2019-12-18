/*
 * Copyright 2019 Google LLC
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
// source: google/cloud/datalabeling/v1beta1/evaluation.proto

package com.google.cloud.datalabeling.v1beta1;

public interface BoundingBoxEvaluationOptionsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Minimize IoU required to consider 2 bounding boxes are matched.
   * </pre>
   *
   * <code>float iou_threshold = 1;</code>
   *
   * @return The iouThreshold.
   */
  float getIouThreshold();
}
