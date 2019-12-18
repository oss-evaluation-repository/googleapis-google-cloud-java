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
// source: google/cloud/datacatalog/v1beta1/tags.proto

package com.google.cloud.datacatalog.v1beta1;

public interface TagTemplateOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1beta1.TagTemplate)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The resource name of the tag template in URL format. Example:
   * * projects/{project_id}/locations/{location}/tagTemplates/{tag_template_id}
   * Note that this TagTemplate and its child resources may not actually be
   * stored in the location in this name.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The resource name of the tag template in URL format. Example:
   * * projects/{project_id}/locations/{location}/tagTemplates/{tag_template_id}
   * Note that this TagTemplate and its child resources may not actually be
   * stored in the location in this name.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The display name for this template. Defaults to an empty string.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * The display name for this template. Defaults to an empty string.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Required. Map of tag template field IDs to the settings for the field.
   * This map is an exhaustive list of the allowed fields. This map must contain
   * at least one field and at most 500 fields.
   * The keys to this map are tag template field IDs. Field IDs can contain
   * letters (both uppercase and lowercase), numbers (0-9) and underscores (_).
   * Field IDs must be at least 1 character long and at most
   * 64 characters long. Field IDs must start with a letter or underscore.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.datacatalog.v1beta1.TagTemplateField&gt; fields = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getFieldsCount();
  /**
   *
   *
   * <pre>
   * Required. Map of tag template field IDs to the settings for the field.
   * This map is an exhaustive list of the allowed fields. This map must contain
   * at least one field and at most 500 fields.
   * The keys to this map are tag template field IDs. Field IDs can contain
   * letters (both uppercase and lowercase), numbers (0-9) and underscores (_).
   * Field IDs must be at least 1 character long and at most
   * 64 characters long. Field IDs must start with a letter or underscore.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.datacatalog.v1beta1.TagTemplateField&gt; fields = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  boolean containsFields(java.lang.String key);
  /** Use {@link #getFieldsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.datacatalog.v1beta1.TagTemplateField>
      getFields();
  /**
   *
   *
   * <pre>
   * Required. Map of tag template field IDs to the settings for the field.
   * This map is an exhaustive list of the allowed fields. This map must contain
   * at least one field and at most 500 fields.
   * The keys to this map are tag template field IDs. Field IDs can contain
   * letters (both uppercase and lowercase), numbers (0-9) and underscores (_).
   * Field IDs must be at least 1 character long and at most
   * 64 characters long. Field IDs must start with a letter or underscore.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.datacatalog.v1beta1.TagTemplateField&gt; fields = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.Map<java.lang.String, com.google.cloud.datacatalog.v1beta1.TagTemplateField>
      getFieldsMap();
  /**
   *
   *
   * <pre>
   * Required. Map of tag template field IDs to the settings for the field.
   * This map is an exhaustive list of the allowed fields. This map must contain
   * at least one field and at most 500 fields.
   * The keys to this map are tag template field IDs. Field IDs can contain
   * letters (both uppercase and lowercase), numbers (0-9) and underscores (_).
   * Field IDs must be at least 1 character long and at most
   * 64 characters long. Field IDs must start with a letter or underscore.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.datacatalog.v1beta1.TagTemplateField&gt; fields = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.datacatalog.v1beta1.TagTemplateField getFieldsOrDefault(
      java.lang.String key, com.google.cloud.datacatalog.v1beta1.TagTemplateField defaultValue);
  /**
   *
   *
   * <pre>
   * Required. Map of tag template field IDs to the settings for the field.
   * This map is an exhaustive list of the allowed fields. This map must contain
   * at least one field and at most 500 fields.
   * The keys to this map are tag template field IDs. Field IDs can contain
   * letters (both uppercase and lowercase), numbers (0-9) and underscores (_).
   * Field IDs must be at least 1 character long and at most
   * 64 characters long. Field IDs must start with a letter or underscore.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.datacatalog.v1beta1.TagTemplateField&gt; fields = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.datacatalog.v1beta1.TagTemplateField getFieldsOrThrow(java.lang.String key);
}
