/*
 * Copyright 2023 Google LLC
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

package com.google.cloud.deploy.v1.samples;

// [START clouddeploy_v1_generated_CloudDeploy_UpdateCustomTargetType_LRO_async]
import com.google.api.gax.longrunning.OperationFuture;
import com.google.cloud.deploy.v1.CloudDeployClient;
import com.google.cloud.deploy.v1.CustomTargetType;
import com.google.cloud.deploy.v1.OperationMetadata;
import com.google.cloud.deploy.v1.UpdateCustomTargetTypeRequest;
import com.google.protobuf.FieldMask;

public class AsyncUpdateCustomTargetTypeLRO {

  public static void main(String[] args) throws Exception {
    asyncUpdateCustomTargetTypeLRO();
  }

  public static void asyncUpdateCustomTargetTypeLRO() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (CloudDeployClient cloudDeployClient = CloudDeployClient.create()) {
      UpdateCustomTargetTypeRequest request =
          UpdateCustomTargetTypeRequest.newBuilder()
              .setUpdateMask(FieldMask.newBuilder().build())
              .setCustomTargetType(CustomTargetType.newBuilder().build())
              .setRequestId("requestId693933066")
              .setAllowMissing(true)
              .setValidateOnly(true)
              .build();
      OperationFuture<CustomTargetType, OperationMetadata> future =
          cloudDeployClient.updateCustomTargetTypeOperationCallable().futureCall(request);
      // Do something.
      CustomTargetType response = future.get();
    }
  }
}
// [END clouddeploy_v1_generated_CloudDeploy_UpdateCustomTargetType_LRO_async]
