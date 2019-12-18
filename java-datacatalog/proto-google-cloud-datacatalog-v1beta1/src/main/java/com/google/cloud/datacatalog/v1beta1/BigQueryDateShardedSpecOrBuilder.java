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
// source: google/cloud/datacatalog/v1beta1/table_spec.proto

package com.google.cloud.datacatalog.v1beta1;

public interface BigQueryDateShardedSpecOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1beta1.BigQueryDateShardedSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The Data Catalog resource name of the dataset entry the current table
   * belongs to, for example,
   * `projects/{project_id}/locations/{location}/entrygroups/{entry_group_id}/entries/{entry_id}`.
   * </pre>
   *
   * <code>
   * string dataset = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The dataset.
   */
  java.lang.String getDataset();
  /**
   *
   *
   * <pre>
   * Output only. The Data Catalog resource name of the dataset entry the current table
   * belongs to, for example,
   * `projects/{project_id}/locations/{location}/entrygroups/{entry_group_id}/entries/{entry_id}`.
   * </pre>
   *
   * <code>
   * string dataset = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for dataset.
   */
  com.google.protobuf.ByteString getDatasetBytes();

  /**
   *
   *
   * <pre>
   * Output only. The table name prefix of the shards. The name of any given shard is
   * `[table_prefix]YYYYMMDD`, for example, for shard `MyTable20180101`, the
   * `table_prefix` is `MyTable`.
   * </pre>
   *
   * <code>string table_prefix = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The tablePrefix.
   */
  java.lang.String getTablePrefix();
  /**
   *
   *
   * <pre>
   * Output only. The table name prefix of the shards. The name of any given shard is
   * `[table_prefix]YYYYMMDD`, for example, for shard `MyTable20180101`, the
   * `table_prefix` is `MyTable`.
   * </pre>
   *
   * <code>string table_prefix = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for tablePrefix.
   */
  com.google.protobuf.ByteString getTablePrefixBytes();

  /**
   *
   *
   * <pre>
   * Output only. Total number of shards.
   * </pre>
   *
   * <code>int64 shard_count = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The shardCount.
   */
  long getShardCount();
}
