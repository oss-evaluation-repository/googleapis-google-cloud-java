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
// source: google/cloud/advisorynotifications/v1/service.proto

package com.google.cloud.advisorynotifications.v1;

public interface ListNotificationsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.advisorynotifications.v1.ListNotificationsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent, which owns this collection of notifications.
   * Must be of the form "organizations/{organization}/locations/{location}".
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The parent, which owns this collection of notifications.
   * Must be of the form "organizations/{organization}/locations/{location}".
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * The maximum number of notifications to return. The service may return
   * fewer than this value. If unspecified or equal to 0, at most 50
   * notifications will be returned. The maximum value is 50; values above 50
   * will be coerced to 50.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * A page token returned from a previous request.
   * When paginating, all other parameters provided in the request
   * must match the call that returned the page token.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * A page token returned from a previous request.
   * When paginating, all other parameters provided in the request
   * must match the call that returned the page token.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Specifies which parts of the notification resource should be returned
   * in the response.
   * </pre>
   *
   * <code>.google.cloud.advisorynotifications.v1.NotificationView view = 4;</code>
   *
   * @return The enum numeric value on the wire for view.
   */
  int getViewValue();
  /**
   *
   *
   * <pre>
   * Specifies which parts of the notification resource should be returned
   * in the response.
   * </pre>
   *
   * <code>.google.cloud.advisorynotifications.v1.NotificationView view = 4;</code>
   *
   * @return The view.
   */
  com.google.cloud.advisorynotifications.v1.NotificationView getView();

  /**
   *
   *
   * <pre>
   * ISO code for requested localization language.  If unset, will be
   * interpereted as "en". If the requested language is valid, but not supported
   * for this notification, English will be returned with an "Not applicable"
   * LocalizationState. If the ISO code is invalid (i.e. not a real language),
   * this RPC will throw an error.
   * </pre>
   *
   * <code>string language_code = 5;</code>
   *
   * @return The languageCode.
   */
  java.lang.String getLanguageCode();
  /**
   *
   *
   * <pre>
   * ISO code for requested localization language.  If unset, will be
   * interpereted as "en". If the requested language is valid, but not supported
   * for this notification, English will be returned with an "Not applicable"
   * LocalizationState. If the ISO code is invalid (i.e. not a real language),
   * this RPC will throw an error.
   * </pre>
   *
   * <code>string language_code = 5;</code>
   *
   * @return The bytes for languageCode.
   */
  com.google.protobuf.ByteString getLanguageCodeBytes();
}
