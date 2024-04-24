/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.shopping.merchant.notifications.v1beta.samples;

// [START merchantapi_v1beta_generated_NotificationsApiService_ListNotificationSubscriptions_async]
import com.google.api.core.ApiFuture;
import com.google.shopping.merchant.notifications.v1beta.AccountName;
import com.google.shopping.merchant.notifications.v1beta.ListNotificationSubscriptionsRequest;
import com.google.shopping.merchant.notifications.v1beta.NotificationSubscription;
import com.google.shopping.merchant.notifications.v1beta.NotificationsApiServiceClient;

public class AsyncListNotificationSubscriptions {

  public static void main(String[] args) throws Exception {
    asyncListNotificationSubscriptions();
  }

  public static void asyncListNotificationSubscriptions() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (NotificationsApiServiceClient notificationsApiServiceClient =
        NotificationsApiServiceClient.create()) {
      ListNotificationSubscriptionsRequest request =
          ListNotificationSubscriptionsRequest.newBuilder()
              .setParent(AccountName.of("[ACCOUNT]").toString())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .build();
      ApiFuture<NotificationSubscription> future =
          notificationsApiServiceClient
              .listNotificationSubscriptionsPagedCallable()
              .futureCall(request);
      // Do something.
      for (NotificationSubscription element : future.get().iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END merchantapi_v1beta_generated_NotificationsApiService_ListNotificationSubscriptions_async]
