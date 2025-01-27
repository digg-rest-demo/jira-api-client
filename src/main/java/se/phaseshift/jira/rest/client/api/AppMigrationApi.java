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


import se.phaseshift.jira.rest.client.model.ConnectCustomFieldValues;
import se.phaseshift.jira.rest.client.model.EntityPropertyDetails;
import java.util.UUID;
import se.phaseshift.jira.rest.client.model.WorkflowRulesSearch;
import se.phaseshift.jira.rest.client.model.WorkflowRulesSearchDetails;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AppMigrationApi {
    private ApiClient apiClient;

    public AppMigrationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AppMigrationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for appIssueFieldValueUpdateResourceUpdateIssueFieldsPut
     * @param body  (required)
     * @param atlassianTransferId The ID of the transfer. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call appIssueFieldValueUpdateResourceUpdateIssueFieldsPutCall(ConnectCustomFieldValues body, UUID atlassianTransferId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/rest/atlassian-connect/1/migration/field";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (atlassianTransferId != null)
        localVarHeaderParams.put("Atlassian-Transfer-Id", apiClient.parameterToString(atlassianTransferId));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
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
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call appIssueFieldValueUpdateResourceUpdateIssueFieldsPutValidateBeforeCall(ConnectCustomFieldValues body, UUID atlassianTransferId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling appIssueFieldValueUpdateResourceUpdateIssueFieldsPut(Async)");
        }
        // verify the required parameter 'atlassianTransferId' is set
        if (atlassianTransferId == null) {
            throw new ApiException("Missing the required parameter 'atlassianTransferId' when calling appIssueFieldValueUpdateResourceUpdateIssueFieldsPut(Async)");
        }
        
        com.squareup.okhttp.Call call = appIssueFieldValueUpdateResourceUpdateIssueFieldsPutCall(body, atlassianTransferId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Bulk update custom field value
     * Updates the value of a custom field added by Connect apps on one or more issues. The values of up to 200 custom fields can be updated.  **[Permissions](#permissions) required:** Only Connect apps can make this request
     * @param body  (required)
     * @param atlassianTransferId The ID of the transfer. (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Object appIssueFieldValueUpdateResourceUpdateIssueFieldsPut(ConnectCustomFieldValues body, UUID atlassianTransferId) throws ApiException {
        ApiResponse<Object> resp = appIssueFieldValueUpdateResourceUpdateIssueFieldsPutWithHttpInfo(body, atlassianTransferId);
        return resp.getData();
    }

    /**
     * Bulk update custom field value
     * Updates the value of a custom field added by Connect apps on one or more issues. The values of up to 200 custom fields can be updated.  **[Permissions](#permissions) required:** Only Connect apps can make this request
     * @param body  (required)
     * @param atlassianTransferId The ID of the transfer. (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Object> appIssueFieldValueUpdateResourceUpdateIssueFieldsPutWithHttpInfo(ConnectCustomFieldValues body, UUID atlassianTransferId) throws ApiException {
        com.squareup.okhttp.Call call = appIssueFieldValueUpdateResourceUpdateIssueFieldsPutValidateBeforeCall(body, atlassianTransferId, null, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Bulk update custom field value (asynchronously)
     * Updates the value of a custom field added by Connect apps on one or more issues. The values of up to 200 custom fields can be updated.  **[Permissions](#permissions) required:** Only Connect apps can make this request
     * @param body  (required)
     * @param atlassianTransferId The ID of the transfer. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call appIssueFieldValueUpdateResourceUpdateIssueFieldsPutAsync(ConnectCustomFieldValues body, UUID atlassianTransferId, final ApiCallback<Object> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = appIssueFieldValueUpdateResourceUpdateIssueFieldsPutValidateBeforeCall(body, atlassianTransferId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for migrationResourceUpdateEntityPropertiesValuePut
     * @param body  (required)
     * @param atlassianTransferId The app migration transfer ID. (required)
     * @param entityType The type indicating the object that contains the entity properties. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call migrationResourceUpdateEntityPropertiesValuePutCall(List<EntityPropertyDetails> body, UUID atlassianTransferId, String entityType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/rest/atlassian-connect/1/migration/properties/{entityType}"
            .replaceAll("\\{" + "entityType" + "\\}", apiClient.escapeString(entityType.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (atlassianTransferId != null)
        localVarHeaderParams.put("Atlassian-Transfer-Id", apiClient.parameterToString(atlassianTransferId));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
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
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call migrationResourceUpdateEntityPropertiesValuePutValidateBeforeCall(List<EntityPropertyDetails> body, UUID atlassianTransferId, String entityType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling migrationResourceUpdateEntityPropertiesValuePut(Async)");
        }
        // verify the required parameter 'atlassianTransferId' is set
        if (atlassianTransferId == null) {
            throw new ApiException("Missing the required parameter 'atlassianTransferId' when calling migrationResourceUpdateEntityPropertiesValuePut(Async)");
        }
        // verify the required parameter 'entityType' is set
        if (entityType == null) {
            throw new ApiException("Missing the required parameter 'entityType' when calling migrationResourceUpdateEntityPropertiesValuePut(Async)");
        }
        
        com.squareup.okhttp.Call call = migrationResourceUpdateEntityPropertiesValuePutCall(body, atlassianTransferId, entityType, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Bulk update entity properties
     * Updates the values of multiple entity properties for an object, up to 50 updates per request. This operation is for use by Connect apps during app migration.
     * @param body  (required)
     * @param atlassianTransferId The app migration transfer ID. (required)
     * @param entityType The type indicating the object that contains the entity properties. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void migrationResourceUpdateEntityPropertiesValuePut(List<EntityPropertyDetails> body, UUID atlassianTransferId, String entityType) throws ApiException {
        migrationResourceUpdateEntityPropertiesValuePutWithHttpInfo(body, atlassianTransferId, entityType);
    }

    /**
     * Bulk update entity properties
     * Updates the values of multiple entity properties for an object, up to 50 updates per request. This operation is for use by Connect apps during app migration.
     * @param body  (required)
     * @param atlassianTransferId The app migration transfer ID. (required)
     * @param entityType The type indicating the object that contains the entity properties. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> migrationResourceUpdateEntityPropertiesValuePutWithHttpInfo(List<EntityPropertyDetails> body, UUID atlassianTransferId, String entityType) throws ApiException {
        com.squareup.okhttp.Call call = migrationResourceUpdateEntityPropertiesValuePutValidateBeforeCall(body, atlassianTransferId, entityType, null, null);
        return apiClient.execute(call);
    }

    /**
     * Bulk update entity properties (asynchronously)
     * Updates the values of multiple entity properties for an object, up to 50 updates per request. This operation is for use by Connect apps during app migration.
     * @param body  (required)
     * @param atlassianTransferId The app migration transfer ID. (required)
     * @param entityType The type indicating the object that contains the entity properties. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call migrationResourceUpdateEntityPropertiesValuePutAsync(List<EntityPropertyDetails> body, UUID atlassianTransferId, String entityType, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = migrationResourceUpdateEntityPropertiesValuePutValidateBeforeCall(body, atlassianTransferId, entityType, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for migrationResourceWorkflowRuleSearchPost
     * @param body  (required)
     * @param atlassianTransferId The app migration transfer ID. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call migrationResourceWorkflowRuleSearchPostCall(WorkflowRulesSearch body, UUID atlassianTransferId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/rest/atlassian-connect/1/migration/workflow/rule/search";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (atlassianTransferId != null)
        localVarHeaderParams.put("Atlassian-Transfer-Id", apiClient.parameterToString(atlassianTransferId));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call migrationResourceWorkflowRuleSearchPostValidateBeforeCall(WorkflowRulesSearch body, UUID atlassianTransferId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling migrationResourceWorkflowRuleSearchPost(Async)");
        }
        // verify the required parameter 'atlassianTransferId' is set
        if (atlassianTransferId == null) {
            throw new ApiException("Missing the required parameter 'atlassianTransferId' when calling migrationResourceWorkflowRuleSearchPost(Async)");
        }
        
        com.squareup.okhttp.Call call = migrationResourceWorkflowRuleSearchPostCall(body, atlassianTransferId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get workflow transition rule configurations
     * Returns configurations for workflow transition rules migrated from server to cloud and owned by the calling Connect app.
     * @param body  (required)
     * @param atlassianTransferId The app migration transfer ID. (required)
     * @return WorkflowRulesSearchDetails
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public WorkflowRulesSearchDetails migrationResourceWorkflowRuleSearchPost(WorkflowRulesSearch body, UUID atlassianTransferId) throws ApiException {
        ApiResponse<WorkflowRulesSearchDetails> resp = migrationResourceWorkflowRuleSearchPostWithHttpInfo(body, atlassianTransferId);
        return resp.getData();
    }

    /**
     * Get workflow transition rule configurations
     * Returns configurations for workflow transition rules migrated from server to cloud and owned by the calling Connect app.
     * @param body  (required)
     * @param atlassianTransferId The app migration transfer ID. (required)
     * @return ApiResponse&lt;WorkflowRulesSearchDetails&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<WorkflowRulesSearchDetails> migrationResourceWorkflowRuleSearchPostWithHttpInfo(WorkflowRulesSearch body, UUID atlassianTransferId) throws ApiException {
        com.squareup.okhttp.Call call = migrationResourceWorkflowRuleSearchPostValidateBeforeCall(body, atlassianTransferId, null, null);
        Type localVarReturnType = new TypeToken<WorkflowRulesSearchDetails>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get workflow transition rule configurations (asynchronously)
     * Returns configurations for workflow transition rules migrated from server to cloud and owned by the calling Connect app.
     * @param body  (required)
     * @param atlassianTransferId The app migration transfer ID. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call migrationResourceWorkflowRuleSearchPostAsync(WorkflowRulesSearch body, UUID atlassianTransferId, final ApiCallback<WorkflowRulesSearchDetails> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = migrationResourceWorkflowRuleSearchPostValidateBeforeCall(body, atlassianTransferId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<WorkflowRulesSearchDetails>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
