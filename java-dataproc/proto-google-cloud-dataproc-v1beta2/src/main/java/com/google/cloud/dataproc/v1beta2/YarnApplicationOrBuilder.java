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
// source: google/cloud/dataproc/v1beta2/jobs.proto

package com.google.cloud.dataproc.v1beta2;

public interface YarnApplicationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1beta2.YarnApplication)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The application name.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. The application name.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. The application state.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1beta2.YarnApplication.State state = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. The application state.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1beta2.YarnApplication.State state = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.dataproc.v1beta2.YarnApplication.State getState();

  /**
   *
   *
   * <pre>
   * Output only. The numerical progress of the application, from 1 to 100.
   * </pre>
   *
   * <code>float progress = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The progress.
   */
  float getProgress();

  /**
   *
   *
   * <pre>
   * Output only. The HTTP URL of the ApplicationMaster, HistoryServer, or
   * TimelineServer that provides application-specific information. The URL uses
   * the internal hostname, and requires a proxy server for resolution and,
   * possibly, access.
   * </pre>
   *
   * <code>string tracking_url = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The trackingUrl.
   */
  java.lang.String getTrackingUrl();
  /**
   *
   *
   * <pre>
   * Output only. The HTTP URL of the ApplicationMaster, HistoryServer, or
   * TimelineServer that provides application-specific information. The URL uses
   * the internal hostname, and requires a proxy server for resolution and,
   * possibly, access.
   * </pre>
   *
   * <code>string tracking_url = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for trackingUrl.
   */
  com.google.protobuf.ByteString getTrackingUrlBytes();
}
