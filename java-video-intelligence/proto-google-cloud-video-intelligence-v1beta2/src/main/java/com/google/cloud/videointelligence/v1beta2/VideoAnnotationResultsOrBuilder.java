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

public interface VideoAnnotationResultsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.videointelligence.v1beta2.VideoAnnotationResults)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Video file location in
   * [Google Cloud Storage](https://cloud.google.com/storage/).
   * </pre>
   *
   * <code>string input_uri = 1;</code>
   */
  java.lang.String getInputUri();
  /**
   *
   *
   * <pre>
   * Video file location in
   * [Google Cloud Storage](https://cloud.google.com/storage/).
   * </pre>
   *
   * <code>string input_uri = 1;</code>
   */
  com.google.protobuf.ByteString getInputUriBytes();

  /**
   *
   *
   * <pre>
   * Label annotations on video level or user specified segment level.
   * There is exactly one element for each unique label.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1beta2.LabelAnnotation segment_label_annotations = 2;
   * </code>
   */
  java.util.List<com.google.cloud.videointelligence.v1beta2.LabelAnnotation>
      getSegmentLabelAnnotationsList();
  /**
   *
   *
   * <pre>
   * Label annotations on video level or user specified segment level.
   * There is exactly one element for each unique label.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1beta2.LabelAnnotation segment_label_annotations = 2;
   * </code>
   */
  com.google.cloud.videointelligence.v1beta2.LabelAnnotation getSegmentLabelAnnotations(int index);
  /**
   *
   *
   * <pre>
   * Label annotations on video level or user specified segment level.
   * There is exactly one element for each unique label.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1beta2.LabelAnnotation segment_label_annotations = 2;
   * </code>
   */
  int getSegmentLabelAnnotationsCount();
  /**
   *
   *
   * <pre>
   * Label annotations on video level or user specified segment level.
   * There is exactly one element for each unique label.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1beta2.LabelAnnotation segment_label_annotations = 2;
   * </code>
   */
  java.util.List<? extends com.google.cloud.videointelligence.v1beta2.LabelAnnotationOrBuilder>
      getSegmentLabelAnnotationsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Label annotations on video level or user specified segment level.
   * There is exactly one element for each unique label.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1beta2.LabelAnnotation segment_label_annotations = 2;
   * </code>
   */
  com.google.cloud.videointelligence.v1beta2.LabelAnnotationOrBuilder
      getSegmentLabelAnnotationsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Label annotations on shot level.
   * There is exactly one element for each unique label.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1beta2.LabelAnnotation shot_label_annotations = 3;
   * </code>
   */
  java.util.List<com.google.cloud.videointelligence.v1beta2.LabelAnnotation>
      getShotLabelAnnotationsList();
  /**
   *
   *
   * <pre>
   * Label annotations on shot level.
   * There is exactly one element for each unique label.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1beta2.LabelAnnotation shot_label_annotations = 3;
   * </code>
   */
  com.google.cloud.videointelligence.v1beta2.LabelAnnotation getShotLabelAnnotations(int index);
  /**
   *
   *
   * <pre>
   * Label annotations on shot level.
   * There is exactly one element for each unique label.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1beta2.LabelAnnotation shot_label_annotations = 3;
   * </code>
   */
  int getShotLabelAnnotationsCount();
  /**
   *
   *
   * <pre>
   * Label annotations on shot level.
   * There is exactly one element for each unique label.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1beta2.LabelAnnotation shot_label_annotations = 3;
   * </code>
   */
  java.util.List<? extends com.google.cloud.videointelligence.v1beta2.LabelAnnotationOrBuilder>
      getShotLabelAnnotationsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Label annotations on shot level.
   * There is exactly one element for each unique label.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1beta2.LabelAnnotation shot_label_annotations = 3;
   * </code>
   */
  com.google.cloud.videointelligence.v1beta2.LabelAnnotationOrBuilder
      getShotLabelAnnotationsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Label annotations on frame level.
   * There is exactly one element for each unique label.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1beta2.LabelAnnotation frame_label_annotations = 4;
   * </code>
   */
  java.util.List<com.google.cloud.videointelligence.v1beta2.LabelAnnotation>
      getFrameLabelAnnotationsList();
  /**
   *
   *
   * <pre>
   * Label annotations on frame level.
   * There is exactly one element for each unique label.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1beta2.LabelAnnotation frame_label_annotations = 4;
   * </code>
   */
  com.google.cloud.videointelligence.v1beta2.LabelAnnotation getFrameLabelAnnotations(int index);
  /**
   *
   *
   * <pre>
   * Label annotations on frame level.
   * There is exactly one element for each unique label.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1beta2.LabelAnnotation frame_label_annotations = 4;
   * </code>
   */
  int getFrameLabelAnnotationsCount();
  /**
   *
   *
   * <pre>
   * Label annotations on frame level.
   * There is exactly one element for each unique label.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1beta2.LabelAnnotation frame_label_annotations = 4;
   * </code>
   */
  java.util.List<? extends com.google.cloud.videointelligence.v1beta2.LabelAnnotationOrBuilder>
      getFrameLabelAnnotationsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Label annotations on frame level.
   * There is exactly one element for each unique label.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1beta2.LabelAnnotation frame_label_annotations = 4;
   * </code>
   */
  com.google.cloud.videointelligence.v1beta2.LabelAnnotationOrBuilder
      getFrameLabelAnnotationsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Face annotations. There is exactly one element for each unique face.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1beta2.FaceAnnotation face_annotations = 5;
   * </code>
   */
  java.util.List<com.google.cloud.videointelligence.v1beta2.FaceAnnotation>
      getFaceAnnotationsList();
  /**
   *
   *
   * <pre>
   * Face annotations. There is exactly one element for each unique face.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1beta2.FaceAnnotation face_annotations = 5;
   * </code>
   */
  com.google.cloud.videointelligence.v1beta2.FaceAnnotation getFaceAnnotations(int index);
  /**
   *
   *
   * <pre>
   * Face annotations. There is exactly one element for each unique face.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1beta2.FaceAnnotation face_annotations = 5;
   * </code>
   */
  int getFaceAnnotationsCount();
  /**
   *
   *
   * <pre>
   * Face annotations. There is exactly one element for each unique face.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1beta2.FaceAnnotation face_annotations = 5;
   * </code>
   */
  java.util.List<? extends com.google.cloud.videointelligence.v1beta2.FaceAnnotationOrBuilder>
      getFaceAnnotationsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Face annotations. There is exactly one element for each unique face.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1beta2.FaceAnnotation face_annotations = 5;
   * </code>
   */
  com.google.cloud.videointelligence.v1beta2.FaceAnnotationOrBuilder getFaceAnnotationsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Shot annotations. Each shot is represented as a video segment.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1beta2.VideoSegment shot_annotations = 6;
   * </code>
   */
  java.util.List<com.google.cloud.videointelligence.v1beta2.VideoSegment> getShotAnnotationsList();
  /**
   *
   *
   * <pre>
   * Shot annotations. Each shot is represented as a video segment.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1beta2.VideoSegment shot_annotations = 6;
   * </code>
   */
  com.google.cloud.videointelligence.v1beta2.VideoSegment getShotAnnotations(int index);
  /**
   *
   *
   * <pre>
   * Shot annotations. Each shot is represented as a video segment.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1beta2.VideoSegment shot_annotations = 6;
   * </code>
   */
  int getShotAnnotationsCount();
  /**
   *
   *
   * <pre>
   * Shot annotations. Each shot is represented as a video segment.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1beta2.VideoSegment shot_annotations = 6;
   * </code>
   */
  java.util.List<? extends com.google.cloud.videointelligence.v1beta2.VideoSegmentOrBuilder>
      getShotAnnotationsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Shot annotations. Each shot is represented as a video segment.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1beta2.VideoSegment shot_annotations = 6;
   * </code>
   */
  com.google.cloud.videointelligence.v1beta2.VideoSegmentOrBuilder getShotAnnotationsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Explicit content annotation.
   * </pre>
   *
   * <code>
   * .google.cloud.videointelligence.v1beta2.ExplicitContentAnnotation explicit_annotation = 7;
   * </code>
   */
  boolean hasExplicitAnnotation();
  /**
   *
   *
   * <pre>
   * Explicit content annotation.
   * </pre>
   *
   * <code>
   * .google.cloud.videointelligence.v1beta2.ExplicitContentAnnotation explicit_annotation = 7;
   * </code>
   */
  com.google.cloud.videointelligence.v1beta2.ExplicitContentAnnotation getExplicitAnnotation();
  /**
   *
   *
   * <pre>
   * Explicit content annotation.
   * </pre>
   *
   * <code>
   * .google.cloud.videointelligence.v1beta2.ExplicitContentAnnotation explicit_annotation = 7;
   * </code>
   */
  com.google.cloud.videointelligence.v1beta2.ExplicitContentAnnotationOrBuilder
      getExplicitAnnotationOrBuilder();

  /**
   *
   *
   * <pre>
   * If set, indicates an error. Note that for a single `AnnotateVideoRequest`
   * some videos may succeed and some may fail.
   * </pre>
   *
   * <code>.google.rpc.Status error = 9;</code>
   */
  boolean hasError();
  /**
   *
   *
   * <pre>
   * If set, indicates an error. Note that for a single `AnnotateVideoRequest`
   * some videos may succeed and some may fail.
   * </pre>
   *
   * <code>.google.rpc.Status error = 9;</code>
   */
  com.google.rpc.Status getError();
  /**
   *
   *
   * <pre>
   * If set, indicates an error. Note that for a single `AnnotateVideoRequest`
   * some videos may succeed and some may fail.
   * </pre>
   *
   * <code>.google.rpc.Status error = 9;</code>
   */
  com.google.rpc.StatusOrBuilder getErrorOrBuilder();
}
