/*
 * The Jira Cloud platform REST API
 * Jira Cloud platform REST API documentation
 *
 * OpenAPI spec version: 1001.0.0-SNAPSHOT-d2bbf99a611e8c219fc0b1362289195366130541
 * Contact: ecosystem@atlassian.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package se.phaseshift.jira.rest.client.api;

import se.phaseshift.jira.rest.client.ApiCallback;
import se.phaseshift.jira.rest.client.ApiClient;
import se.phaseshift.jira.rest.client.ApiException;
import se.phaseshift.jira.rest.client.ApiResponse;
import se.phaseshift.jira.rest.client.Configuration;
import se.phaseshift.jira.rest.client.Pair;
import se.phaseshift.jira.rest.client.ProgressRequestBody;
import se.phaseshift.jira.rest.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import se.phaseshift.jira.rest.client.model.ServiceRegistry;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServiceRegistryApi {
    private ApiClient apiClient;

    public ServiceRegistryApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ServiceRegistryApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for serviceRegistryResourceServicesGet
     * @param serviceIds The ID of the services (the strings starting with \&quot;b:\&quot; need to be decoded in Base64). (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call serviceRegistryResourceServicesGetCall(List<String> serviceIds, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/rest/atlassian-connect/1/service-registry";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (serviceIds != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "serviceIds", serviceIds));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call serviceRegistryResourceServicesGetValidateBeforeCall(List<String> serviceIds, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'serviceIds' is set
        if (serviceIds == null) {
            throw new ApiException("Missing the required parameter 'serviceIds' when calling serviceRegistryResourceServicesGet(Async)");
        }
        
        com.squareup.okhttp.Call call = serviceRegistryResourceServicesGetCall(serviceIds, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Retrieve the attributes of service registries
     * Retrieve the attributes of given service registries.  **[Permissions](#permissions) required:** Only Connect apps can make this request and the servicesIds belong to the tenant you are requesting
     * @param serviceIds The ID of the services (the strings starting with \&quot;b:\&quot; need to be decoded in Base64). (required)
     * @return List&lt;ServiceRegistry&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<ServiceRegistry> serviceRegistryResourceServicesGet(List<String> serviceIds) throws ApiException {
        ApiResponse<List<ServiceRegistry>> resp = serviceRegistryResourceServicesGetWithHttpInfo(serviceIds);
        return resp.getData();
    }

    /**
     * Retrieve the attributes of service registries
     * Retrieve the attributes of given service registries.  **[Permissions](#permissions) required:** Only Connect apps can make this request and the servicesIds belong to the tenant you are requesting
     * @param serviceIds The ID of the services (the strings starting with \&quot;b:\&quot; need to be decoded in Base64). (required)
     * @return ApiResponse&lt;List&lt;ServiceRegistry&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<ServiceRegistry>> serviceRegistryResourceServicesGetWithHttpInfo(List<String> serviceIds) throws ApiException {
        com.squareup.okhttp.Call call = serviceRegistryResourceServicesGetValidateBeforeCall(serviceIds, null, null);
        Type localVarReturnType = new TypeToken<List<ServiceRegistry>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieve the attributes of service registries (asynchronously)
     * Retrieve the attributes of given service registries.  **[Permissions](#permissions) required:** Only Connect apps can make this request and the servicesIds belong to the tenant you are requesting
     * @param serviceIds The ID of the services (the strings starting with \&quot;b:\&quot; need to be decoded in Base64). (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call serviceRegistryResourceServicesGetAsync(List<String> serviceIds, final ApiCallback<List<ServiceRegistry>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = serviceRegistryResourceServicesGetValidateBeforeCall(serviceIds, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<ServiceRegistry>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
