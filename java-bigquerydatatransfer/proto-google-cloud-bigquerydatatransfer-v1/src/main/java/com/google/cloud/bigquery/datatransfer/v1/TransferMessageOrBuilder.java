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
// source: google/cloud/bigquery/datatransfer/v1/transfer.proto

package com.google.cloud.bigquery.datatransfer.v1;

public interface TransferMessageOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.datatransfer.v1.TransferMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Time when message was logged.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp message_time = 1;</code>
   */
  boolean hasMessageTime();
  /**
   *
   *
   * <pre>
   * Time when message was logged.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp message_time = 1;</code>
   */
  com.google.protobuf.Timestamp getMessageTime();
  /**
   *
   *
   * <pre>
   * Time when message was logged.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp message_time = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getMessageTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Message severity.
   * </pre>
   *
   * <code>.google.cloud.bigquery.datatransfer.v1.TransferMessage.MessageSeverity severity = 2;
   * </code>
   */
  int getSeverityValue();
  /**
   *
   *
   * <pre>
   * Message severity.
   * </pre>
   *
   * <code>.google.cloud.bigquery.datatransfer.v1.TransferMessage.MessageSeverity severity = 2;
   * </code>
   */
  com.google.cloud.bigquery.datatransfer.v1.TransferMessage.MessageSeverity getSeverity();

  /**
   *
   *
   * <pre>
   * Message text.
   * </pre>
   *
   * <code>string message_text = 3;</code>
   */
  java.lang.String getMessageText();
  /**
   *
   *
   * <pre>
   * Message text.
   * </pre>
   *
   * <code>string message_text = 3;</code>
   */
  com.google.protobuf.ByteString getMessageTextBytes();
}
