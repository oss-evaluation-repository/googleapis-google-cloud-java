/*
 * Copyright 2024 Google LLC
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
// source: google/container/v1beta1/cluster_service.proto

// Protobuf Java Version: 3.25.2
package com.google.container.v1beta1;

public interface DatabaseEncryptionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.container.v1beta1.DatabaseEncryption)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Name of CloudKMS key to use for the encryption of secrets in etcd.
   * Ex. projects/my-project/locations/global/keyRings/my-ring/cryptoKeys/my-key
   * </pre>
   *
   * <code>string key_name = 1;</code>
   *
   * @return The keyName.
   */
  java.lang.String getKeyName();
  /**
   *
   *
   * <pre>
   * Name of CloudKMS key to use for the encryption of secrets in etcd.
   * Ex. projects/my-project/locations/global/keyRings/my-ring/cryptoKeys/my-key
   * </pre>
   *
   * <code>string key_name = 1;</code>
   *
   * @return The bytes for keyName.
   */
  com.google.protobuf.ByteString getKeyNameBytes();

  /**
   *
   *
   * <pre>
   * The desired state of etcd encryption.
   * </pre>
   *
   * <code>.google.container.v1beta1.DatabaseEncryption.State state = 2;</code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * The desired state of etcd encryption.
   * </pre>
   *
   * <code>.google.container.v1beta1.DatabaseEncryption.State state = 2;</code>
   *
   * @return The state.
   */
  com.google.container.v1beta1.DatabaseEncryption.State getState();

  /**
   *
   *
   * <pre>
   * Output only. The current state of etcd encryption.
   * </pre>
   *
   * <code>
   * optional .google.container.v1beta1.DatabaseEncryption.CurrentState current_state = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the currentState field is set.
   */
  boolean hasCurrentState();
  /**
   *
   *
   * <pre>
   * Output only. The current state of etcd encryption.
   * </pre>
   *
   * <code>
   * optional .google.container.v1beta1.DatabaseEncryption.CurrentState current_state = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for currentState.
   */
  int getCurrentStateValue();
  /**
   *
   *
   * <pre>
   * Output only. The current state of etcd encryption.
   * </pre>
   *
   * <code>
   * optional .google.container.v1beta1.DatabaseEncryption.CurrentState current_state = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The currentState.
   */
  com.google.container.v1beta1.DatabaseEncryption.CurrentState getCurrentState();

  /**
   *
   *
   * <pre>
   * Output only. Keys in use by the cluster for decrypting
   * existing objects, in addition to the key in `key_name`.
   *
   * Each item is a CloudKMS key resource.
   * </pre>
   *
   * <code>repeated string decryption_keys = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return A list containing the decryptionKeys.
   */
  java.util.List<java.lang.String> getDecryptionKeysList();
  /**
   *
   *
   * <pre>
   * Output only. Keys in use by the cluster for decrypting
   * existing objects, in addition to the key in `key_name`.
   *
   * Each item is a CloudKMS key resource.
   * </pre>
   *
   * <code>repeated string decryption_keys = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The count of decryptionKeys.
   */
  int getDecryptionKeysCount();
  /**
   *
   *
   * <pre>
   * Output only. Keys in use by the cluster for decrypting
   * existing objects, in addition to the key in `key_name`.
   *
   * Each item is a CloudKMS key resource.
   * </pre>
   *
   * <code>repeated string decryption_keys = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @param index The index of the element to return.
   * @return The decryptionKeys at the given index.
   */
  java.lang.String getDecryptionKeys(int index);
  /**
   *
   *
   * <pre>
   * Output only. Keys in use by the cluster for decrypting
   * existing objects, in addition to the key in `key_name`.
   *
   * Each item is a CloudKMS key resource.
   * </pre>
   *
   * <code>repeated string decryption_keys = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the decryptionKeys at the given index.
   */
  com.google.protobuf.ByteString getDecryptionKeysBytes(int index);

  /**
   *
   *
   * <pre>
   * Output only. Records errors seen during DatabaseEncryption update
   * operations.
   * </pre>
   *
   * <code>
   * repeated .google.container.v1beta1.DatabaseEncryption.OperationError last_operation_errors = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.container.v1beta1.DatabaseEncryption.OperationError>
      getLastOperationErrorsList();
  /**
   *
   *
   * <pre>
   * Output only. Records errors seen during DatabaseEncryption update
   * operations.
   * </pre>
   *
   * <code>
   * repeated .google.container.v1beta1.DatabaseEncryption.OperationError last_operation_errors = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.container.v1beta1.DatabaseEncryption.OperationError getLastOperationErrors(int index);
  /**
   *
   *
   * <pre>
   * Output only. Records errors seen during DatabaseEncryption update
   * operations.
   * </pre>
   *
   * <code>
   * repeated .google.container.v1beta1.DatabaseEncryption.OperationError last_operation_errors = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getLastOperationErrorsCount();
  /**
   *
   *
   * <pre>
   * Output only. Records errors seen during DatabaseEncryption update
   * operations.
   * </pre>
   *
   * <code>
   * repeated .google.container.v1beta1.DatabaseEncryption.OperationError last_operation_errors = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.container.v1beta1.DatabaseEncryption.OperationErrorOrBuilder>
      getLastOperationErrorsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. Records errors seen during DatabaseEncryption update
   * operations.
   * </pre>
   *
   * <code>
   * repeated .google.container.v1beta1.DatabaseEncryption.OperationError last_operation_errors = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.container.v1beta1.DatabaseEncryption.OperationErrorOrBuilder
      getLastOperationErrorsOrBuilder(int index);
}
