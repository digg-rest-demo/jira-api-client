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


import se.phaseshift.jira.rest.client.model.CustomFieldValueUpdateDetails;
import se.phaseshift.jira.rest.client.model.MultipleCustomFieldValuesUpdateDetails;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IssueCustomFieldValuesAppsApi {
    private ApiClient apiClient;

    public IssueCustomFieldValuesAppsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public IssueCustomFieldValuesAppsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for updateCustomFieldValue
     * @param body  (required)
     * @param fieldIdOrKey The ID or key of the custom field. For example, &#x60;customfield_10010&#x60;. (required)
     * @param generateChangelog Whether to generate a changelog for this update. (optional, default to true)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateCustomFieldValueCall(CustomFieldValueUpdateDetails body, String fieldIdOrKey, Boolean generateChangelog, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/rest/api/3/app/field/{fieldIdOrKey}/value"
            .replaceAll("\\{" + "fieldIdOrKey" + "\\}", apiClient.escapeString(fieldIdOrKey.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (generateChangelog != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("generateChangelog", generateChangelog));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

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

        String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateCustomFieldValueValidateBeforeCall(CustomFieldValueUpdateDetails body, String fieldIdOrKey, Boolean generateChangelog, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updateCustomFieldValue(Async)");
        }
        // verify the required parameter 'fieldIdOrKey' is set
        if (fieldIdOrKey == null) {
            throw new ApiException("Missing the required parameter 'fieldIdOrKey' when calling updateCustomFieldValue(Async)");
        }
        
        com.squareup.okhttp.Call call = updateCustomFieldValueCall(body, fieldIdOrKey, generateChangelog, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Update custom field value
     * Updates the value of a custom field on one or more issues.  Apps can only perform this operation on [custom fields](https://developer.atlassian.com/platform/forge/manifest-reference/modules/jira-custom-field/) and [custom field types](https://developer.atlassian.com/platform/forge/manifest-reference/modules/jira-custom-field-type/) declared in their own manifests.  **[Permissions](#permissions) required:** Only the app that owns the custom field or custom field type can update its values with this operation.
     * @param body  (required)
     * @param fieldIdOrKey The ID or key of the custom field. For example, &#x60;customfield_10010&#x60;. (required)
     * @param generateChangelog Whether to generate a changelog for this update. (optional, default to true)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Object updateCustomFieldValue(CustomFieldValueUpdateDetails body, String fieldIdOrKey, Boolean generateChangelog) throws ApiException {
        ApiResponse<Object> resp = updateCustomFieldValueWithHttpInfo(body, fieldIdOrKey, generateChangelog);
        return resp.getData();
    }

    /**
     * Update custom field value
     * Updates the value of a custom field on one or more issues.  Apps can only perform this operation on [custom fields](https://developer.atlassian.com/platform/forge/manifest-reference/modules/jira-custom-field/) and [custom field types](https://developer.atlassian.com/platform/forge/manifest-reference/modules/jira-custom-field-type/) declared in their own manifests.  **[Permissions](#permissions) required:** Only the app that owns the custom field or custom field type can update its values with this operation.
     * @param body  (required)
     * @param fieldIdOrKey The ID or key of the custom field. For example, &#x60;customfield_10010&#x60;. (required)
     * @param generateChangelog Whether to generate a changelog for this update. (optional, default to true)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Object> updateCustomFieldValueWithHttpInfo(CustomFieldValueUpdateDetails body, String fieldIdOrKey, Boolean generateChangelog) throws ApiException {
        com.squareup.okhttp.Call call = updateCustomFieldValueValidateBeforeCall(body, fieldIdOrKey, generateChangelog, null, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update custom field value (asynchronously)
     * Updates the value of a custom field on one or more issues.  Apps can only perform this operation on [custom fields](https://developer.atlassian.com/platform/forge/manifest-reference/modules/jira-custom-field/) and [custom field types](https://developer.atlassian.com/platform/forge/manifest-reference/modules/jira-custom-field-type/) declared in their own manifests.  **[Permissions](#permissions) required:** Only the app that owns the custom field or custom field type can update its values with this operation.
     * @param body  (required)
     * @param fieldIdOrKey The ID or key of the custom field. For example, &#x60;customfield_10010&#x60;. (required)
     * @param generateChangelog Whether to generate a changelog for this update. (optional, default to true)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateCustomFieldValueAsync(CustomFieldValueUpdateDetails body, String fieldIdOrKey, Boolean generateChangelog, final ApiCallback<Object> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateCustomFieldValueValidateBeforeCall(body, fieldIdOrKey, generateChangelog, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateMultipleCustomFieldValues
     * @param body  (required)
     * @param generateChangelog Whether to generate a changelog for this update. (optional, default to true)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateMultipleCustomFieldValuesCall(MultipleCustomFieldValuesUpdateDetails body, Boolean generateChangelog, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/rest/api/3/app/field/value";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (generateChangelog != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("generateChangelog", generateChangelog));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

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

        String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateMultipleCustomFieldValuesValidateBeforeCall(MultipleCustomFieldValuesUpdateDetails body, Boolean generateChangelog, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updateMultipleCustomFieldValues(Async)");
        }
        
        com.squareup.okhttp.Call call = updateMultipleCustomFieldValuesCall(body, generateChangelog, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Update custom fields
     * Updates the value of one or more custom fields on one or more issues. Combinations of custom field and issue should be unique within the request.  Apps can only perform this operation on [custom fields](https://developer.atlassian.com/platform/forge/manifest-reference/modules/jira-custom-field/) and [custom field types](https://developer.atlassian.com/platform/forge/manifest-reference/modules/jira-custom-field-type/) declared in their own manifests.  **[Permissions](#permissions) required:** Only the app that owns the custom field or custom field type can update its values with this operation.
     * @param body  (required)
     * @param generateChangelog Whether to generate a changelog for this update. (optional, default to true)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Object updateMultipleCustomFieldValues(MultipleCustomFieldValuesUpdateDetails body, Boolean generateChangelog) throws ApiException {
        ApiResponse<Object> resp = updateMultipleCustomFieldValuesWithHttpInfo(body, generateChangelog);
        return resp.getData();
    }

    /**
     * Update custom fields
     * Updates the value of one or more custom fields on one or more issues. Combinations of custom field and issue should be unique within the request.  Apps can only perform this operation on [custom fields](https://developer.atlassian.com/platform/forge/manifest-reference/modules/jira-custom-field/) and [custom field types](https://developer.atlassian.com/platform/forge/manifest-reference/modules/jira-custom-field-type/) declared in their own manifests.  **[Permissions](#permissions) required:** Only the app that owns the custom field or custom field type can update its values with this operation.
     * @param body  (required)
     * @param generateChangelog Whether to generate a changelog for this update. (optional, default to true)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Object> updateMultipleCustomFieldValuesWithHttpInfo(MultipleCustomFieldValuesUpdateDetails body, Boolean generateChangelog) throws ApiException {
        com.squareup.okhttp.Call call = updateMultipleCustomFieldValuesValidateBeforeCall(body, generateChangelog, null, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update custom fields (asynchronously)
     * Updates the value of one or more custom fields on one or more issues. Combinations of custom field and issue should be unique within the request.  Apps can only perform this operation on [custom fields](https://developer.atlassian.com/platform/forge/manifest-reference/modules/jira-custom-field/) and [custom field types](https://developer.atlassian.com/platform/forge/manifest-reference/modules/jira-custom-field-type/) declared in their own manifests.  **[Permissions](#permissions) required:** Only the app that owns the custom field or custom field type can update its values with this operation.
     * @param body  (required)
     * @param generateChangelog Whether to generate a changelog for this update. (optional, default to true)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateMultipleCustomFieldValuesAsync(MultipleCustomFieldValuesUpdateDetails body, Boolean generateChangelog, final ApiCallback<Object> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateMultipleCustomFieldValuesValidateBeforeCall(body, generateChangelog, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
