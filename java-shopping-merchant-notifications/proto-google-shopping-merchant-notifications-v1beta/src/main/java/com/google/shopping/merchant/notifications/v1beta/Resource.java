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
// source: google/shopping/merchant/notifications/v1beta/notificationsapi.proto

// Protobuf Java Version: 3.25.3
package com.google.shopping.merchant.notifications.v1beta;

/**
 *
 *
 * <pre>
 * Enum to specify the resource that is being changed to notify the merchant
 * about.
 * </pre>
 *
 * Protobuf enum {@code google.shopping.merchant.notifications.v1beta.Resource}
 */
public enum Resource implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Unspecified resource
   * </pre>
   *
   * <code>RESOURCE_UNSPECIFIED = 0;</code>
   */
  RESOURCE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Resource type : product
   * </pre>
   *
   * <code>PRODUCT = 1;</code>
   */
  PRODUCT(1),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Unspecified resource
   * </pre>
   *
   * <code>RESOURCE_UNSPECIFIED = 0;</code>
   */
  public static final int RESOURCE_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Resource type : product
   * </pre>
   *
   * <code>PRODUCT = 1;</code>
   */
  public static final int PRODUCT_VALUE = 1;

  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static Resource valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Resource forNumber(int value) {
    switch (value) {
      case 0:
        return RESOURCE_UNSPECIFIED;
      case 1:
        return PRODUCT;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Resource> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<Resource> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<Resource>() {
        public Resource findValueByNumber(int number) {
          return Resource.forNumber(number);
        }
      };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }

  public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
    return getDescriptor();
  }

  public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
    return com.google.shopping.merchant.notifications.v1beta.NotificationsApiProto.getDescriptor()
        .getEnumTypes()
        .get(0);
  }

  private static final Resource[] VALUES = values();

  public static Resource valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private Resource(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.shopping.merchant.notifications.v1beta.Resource)
}
