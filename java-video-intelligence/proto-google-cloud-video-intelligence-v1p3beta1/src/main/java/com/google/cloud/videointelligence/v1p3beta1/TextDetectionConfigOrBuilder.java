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
// source: google/cloud/videointelligence/v1p3beta1/video_intelligence.proto

package com.google.cloud.videointelligence.v1p3beta1;

public interface TextDetectionConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.videointelligence.v1p3beta1.TextDetectionConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Language hint can be specified if the language to be detected is known a
   * priori. It can increase the accuracy of the detection. Language hint must
   * be language code in BCP-47 format.
   * Automatic language detection is performed if no hint is provided.
   * </pre>
   *
   * <code>repeated string language_hints = 1;</code>
   */
  java.util.List<java.lang.String> getLanguageHintsList();
  /**
   *
   *
   * <pre>
   * Language hint can be specified if the language to be detected is known a
   * priori. It can increase the accuracy of the detection. Language hint must
   * be language code in BCP-47 format.
   * Automatic language detection is performed if no hint is provided.
   * </pre>
   *
   * <code>repeated string language_hints = 1;</code>
   */
  int getLanguageHintsCount();
  /**
   *
   *
   * <pre>
   * Language hint can be specified if the language to be detected is known a
   * priori. It can increase the accuracy of the detection. Language hint must
   * be language code in BCP-47 format.
   * Automatic language detection is performed if no hint is provided.
   * </pre>
   *
   * <code>repeated string language_hints = 1;</code>
   */
  java.lang.String getLanguageHints(int index);
  /**
   *
   *
   * <pre>
   * Language hint can be specified if the language to be detected is known a
   * priori. It can increase the accuracy of the detection. Language hint must
   * be language code in BCP-47 format.
   * Automatic language detection is performed if no hint is provided.
   * </pre>
   *
   * <code>repeated string language_hints = 1;</code>
   */
  com.google.protobuf.ByteString getLanguageHintsBytes(int index);

  /**
   *
   *
   * <pre>
   * Model to use for text detection.
   * Supported values: "builtin/stable" (the default if unset) and
   * "builtin/latest".
   * </pre>
   *
   * <code>string model = 2;</code>
   */
  java.lang.String getModel();
  /**
   *
   *
   * <pre>
   * Model to use for text detection.
   * Supported values: "builtin/stable" (the default if unset) and
   * "builtin/latest".
   * </pre>
   *
   * <code>string model = 2;</code>
   */
  com.google.protobuf.ByteString getModelBytes();
}
