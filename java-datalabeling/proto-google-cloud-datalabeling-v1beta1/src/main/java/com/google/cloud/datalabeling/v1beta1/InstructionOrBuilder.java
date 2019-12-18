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
// source: google/cloud/datalabeling/v1beta1/instruction.proto

package com.google.cloud.datalabeling.v1beta1;

public interface InstructionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datalabeling.v1beta1.Instruction)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Instruction resource name, format:
   * projects/{project_id}/instructions/{instruction_id}
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
   * Output only. Instruction resource name, format:
   * projects/{project_id}/instructions/{instruction_id}
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
   * Required. The display name of the instruction. Maximum of 64 characters.
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
   * Required. The display name of the instruction. Maximum of 64 characters.
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
   * Optional. User-provided description of the instruction.
   * The description can be up to 10000 characters long.
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Optional. User-provided description of the instruction.
   * The description can be up to 10000 characters long.
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Output only. Creation time of instruction.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4;</code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Creation time of instruction.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4;</code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Creation time of instruction.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Last update time of instruction.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5;</code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Last update time of instruction.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5;</code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Last update time of instruction.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The data type of this instruction.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.DataType data_type = 6;</code>
   *
   * @return The enum numeric value on the wire for dataType.
   */
  int getDataTypeValue();
  /**
   *
   *
   * <pre>
   * Required. The data type of this instruction.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.DataType data_type = 6;</code>
   *
   * @return The dataType.
   */
  com.google.cloud.datalabeling.v1beta1.DataType getDataType();

  /**
   *
   *
   * <pre>
   * One of CSV or PDF instruction is required.
   * Instruction from a CSV file, such as for classification task.
   * The CSV file should have exact two columns, in the following format:
   * * The first column is labeled data, such as an image reference, text.
   * * The second column is comma separated labels associated with data.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.CsvInstruction csv_instruction = 7;</code>
   *
   * @return Whether the csvInstruction field is set.
   */
  boolean hasCsvInstruction();
  /**
   *
   *
   * <pre>
   * One of CSV or PDF instruction is required.
   * Instruction from a CSV file, such as for classification task.
   * The CSV file should have exact two columns, in the following format:
   * * The first column is labeled data, such as an image reference, text.
   * * The second column is comma separated labels associated with data.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.CsvInstruction csv_instruction = 7;</code>
   *
   * @return The csvInstruction.
   */
  com.google.cloud.datalabeling.v1beta1.CsvInstruction getCsvInstruction();
  /**
   *
   *
   * <pre>
   * One of CSV or PDF instruction is required.
   * Instruction from a CSV file, such as for classification task.
   * The CSV file should have exact two columns, in the following format:
   * * The first column is labeled data, such as an image reference, text.
   * * The second column is comma separated labels associated with data.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.CsvInstruction csv_instruction = 7;</code>
   */
  com.google.cloud.datalabeling.v1beta1.CsvInstructionOrBuilder getCsvInstructionOrBuilder();

  /**
   *
   *
   * <pre>
   * One of CSV or PDF instruction is required.
   * Instruction from a PDF document. The PDF should be in a Cloud Storage
   * bucket.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.PdfInstruction pdf_instruction = 9;</code>
   *
   * @return Whether the pdfInstruction field is set.
   */
  boolean hasPdfInstruction();
  /**
   *
   *
   * <pre>
   * One of CSV or PDF instruction is required.
   * Instruction from a PDF document. The PDF should be in a Cloud Storage
   * bucket.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.PdfInstruction pdf_instruction = 9;</code>
   *
   * @return The pdfInstruction.
   */
  com.google.cloud.datalabeling.v1beta1.PdfInstruction getPdfInstruction();
  /**
   *
   *
   * <pre>
   * One of CSV or PDF instruction is required.
   * Instruction from a PDF document. The PDF should be in a Cloud Storage
   * bucket.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.PdfInstruction pdf_instruction = 9;</code>
   */
  com.google.cloud.datalabeling.v1beta1.PdfInstructionOrBuilder getPdfInstructionOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The names of any related resources that are blocking changes
   * to the instruction.
   * </pre>
   *
   * <code>repeated string blocking_resources = 10;</code>
   *
   * @return A list containing the blockingResources.
   */
  java.util.List<java.lang.String> getBlockingResourcesList();
  /**
   *
   *
   * <pre>
   * Output only. The names of any related resources that are blocking changes
   * to the instruction.
   * </pre>
   *
   * <code>repeated string blocking_resources = 10;</code>
   *
   * @return The count of blockingResources.
   */
  int getBlockingResourcesCount();
  /**
   *
   *
   * <pre>
   * Output only. The names of any related resources that are blocking changes
   * to the instruction.
   * </pre>
   *
   * <code>repeated string blocking_resources = 10;</code>
   *
   * @param index The index of the element to return.
   * @return The blockingResources at the given index.
   */
  java.lang.String getBlockingResources(int index);
  /**
   *
   *
   * <pre>
   * Output only. The names of any related resources that are blocking changes
   * to the instruction.
   * </pre>
   *
   * <code>repeated string blocking_resources = 10;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the blockingResources at the given index.
   */
  com.google.protobuf.ByteString getBlockingResourcesBytes(int index);
}
