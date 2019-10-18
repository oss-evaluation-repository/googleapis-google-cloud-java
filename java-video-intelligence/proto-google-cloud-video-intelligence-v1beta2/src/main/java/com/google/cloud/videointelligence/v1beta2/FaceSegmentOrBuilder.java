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
// source: google/cloud/videointelligence/v1beta2/video_intelligence.proto

package com.google.cloud.videointelligence.v1beta2;

public interface FaceSegmentOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.videointelligence.v1beta2.FaceSegment)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Video segment where a face was detected.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1beta2.VideoSegment segment = 1;</code>
   */
  boolean hasSegment();
  /**
   *
   *
   * <pre>
   * Video segment where a face was detected.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1beta2.VideoSegment segment = 1;</code>
   */
  com.google.cloud.videointelligence.v1beta2.VideoSegment getSegment();
  /**
   *
   *
   * <pre>
   * Video segment where a face was detected.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1beta2.VideoSegment segment = 1;</code>
   */
  com.google.cloud.videointelligence.v1beta2.VideoSegmentOrBuilder getSegmentOrBuilder();
}
