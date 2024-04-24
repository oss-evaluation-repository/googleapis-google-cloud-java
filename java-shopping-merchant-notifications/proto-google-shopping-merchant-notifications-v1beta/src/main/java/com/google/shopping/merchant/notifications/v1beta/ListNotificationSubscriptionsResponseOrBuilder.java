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

public interface ListNotificationSubscriptionsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.shopping.merchant.notifications.v1beta.ListNotificationSubscriptionsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The list of notification subscriptions requested by the merchant.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.merchant.notifications.v1beta.NotificationSubscription notification_subscriptions = 1;
   * </code>
   */
  java.util.List<com.google.shopping.merchant.notifications.v1beta.NotificationSubscription>
      getNotificationSubscriptionsList();
  /**
   *
   *
   * <pre>
   * The list of notification subscriptions requested by the merchant.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.merchant.notifications.v1beta.NotificationSubscription notification_subscriptions = 1;
   * </code>
   */
  com.google.shopping.merchant.notifications.v1beta.NotificationSubscription
      getNotificationSubscriptions(int index);
  /**
   *
   *
   * <pre>
   * The list of notification subscriptions requested by the merchant.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.merchant.notifications.v1beta.NotificationSubscription notification_subscriptions = 1;
   * </code>
   */
  int getNotificationSubscriptionsCount();
  /**
   *
   *
   * <pre>
   * The list of notification subscriptions requested by the merchant.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.merchant.notifications.v1beta.NotificationSubscription notification_subscriptions = 1;
   * </code>
   */
  java.util.List<
          ? extends
              com.google.shopping.merchant.notifications.v1beta.NotificationSubscriptionOrBuilder>
      getNotificationSubscriptionsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of notification subscriptions requested by the merchant.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.merchant.notifications.v1beta.NotificationSubscription notification_subscriptions = 1;
   * </code>
   */
  com.google.shopping.merchant.notifications.v1beta.NotificationSubscriptionOrBuilder
      getNotificationSubscriptionsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
