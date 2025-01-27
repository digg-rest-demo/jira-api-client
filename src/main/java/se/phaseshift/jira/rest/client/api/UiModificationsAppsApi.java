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


import se.phaseshift.jira.rest.client.model.CreateUiModificationDetails;
import se.phaseshift.jira.rest.client.model.DetailedErrorCollection;
import se.phaseshift.jira.rest.client.model.PageBeanUiModificationDetails;
import se.phaseshift.jira.rest.client.model.UiModificationIdentifiers;
import se.phaseshift.jira.rest.client.model.UpdateUiModificationDetails;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UiModificationsAppsApi {
    private ApiClient apiClient;

    public UiModificationsAppsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public UiModificationsAppsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createUiModification
     * @param body Details of the UI modification. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createUiModificationCall(CreateUiModificationDetails body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/rest/api/3/uiModifications";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

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
    private com.squareup.okhttp.Call createUiModificationValidateBeforeCall(CreateUiModificationDetails body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createUiModification(Async)");
        }
        
        com.squareup.okhttp.Call call = createUiModificationCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create UI modification
     * Creates a UI modification. UI modification can only be created by Forge apps.  Each app can define up to 3000 UI modifications. Each UI modification can define up to 1000 contexts. The same context can be assigned to maximum 100 UI modifications.  **[Permissions](#permissions) required:**   *  *None* if the UI modification is created without contexts.  *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for one or more projects, if the UI modification is created with contexts.
     * @param body Details of the UI modification. (required)
     * @return UiModificationIdentifiers
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public UiModificationIdentifiers createUiModification(CreateUiModificationDetails body) throws ApiException {
        ApiResponse<UiModificationIdentifiers> resp = createUiModificationWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Create UI modification
     * Creates a UI modification. UI modification can only be created by Forge apps.  Each app can define up to 3000 UI modifications. Each UI modification can define up to 1000 contexts. The same context can be assigned to maximum 100 UI modifications.  **[Permissions](#permissions) required:**   *  *None* if the UI modification is created without contexts.  *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for one or more projects, if the UI modification is created with contexts.
     * @param body Details of the UI modification. (required)
     * @return ApiResponse&lt;UiModificationIdentifiers&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<UiModificationIdentifiers> createUiModificationWithHttpInfo(CreateUiModificationDetails body) throws ApiException {
        com.squareup.okhttp.Call call = createUiModificationValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<UiModificationIdentifiers>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create UI modification (asynchronously)
     * Creates a UI modification. UI modification can only be created by Forge apps.  Each app can define up to 3000 UI modifications. Each UI modification can define up to 1000 contexts. The same context can be assigned to maximum 100 UI modifications.  **[Permissions](#permissions) required:**   *  *None* if the UI modification is created without contexts.  *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for one or more projects, if the UI modification is created with contexts.
     * @param body Details of the UI modification. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createUiModificationAsync(CreateUiModificationDetails body, final ApiCallback<UiModificationIdentifiers> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createUiModificationValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<UiModificationIdentifiers>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteUiModification
     * @param uiModificationId The ID of the UI modification. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteUiModificationCall(String uiModificationId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/rest/api/3/uiModifications/{uiModificationId}"
            .replaceAll("\\{" + "uiModificationId" + "\\}", apiClient.escapeString(uiModificationId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

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

        String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteUiModificationValidateBeforeCall(String uiModificationId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'uiModificationId' is set
        if (uiModificationId == null) {
            throw new ApiException("Missing the required parameter 'uiModificationId' when calling deleteUiModification(Async)");
        }
        
        com.squareup.okhttp.Call call = deleteUiModificationCall(uiModificationId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete UI modification
     * Deletes a UI modification. All the contexts that belong to the UI modification are deleted too. UI modification can only be deleted by Forge apps.  **[Permissions](#permissions) required:** None.
     * @param uiModificationId The ID of the UI modification. (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Object deleteUiModification(String uiModificationId) throws ApiException {
        ApiResponse<Object> resp = deleteUiModificationWithHttpInfo(uiModificationId);
        return resp.getData();
    }

    /**
     * Delete UI modification
     * Deletes a UI modification. All the contexts that belong to the UI modification are deleted too. UI modification can only be deleted by Forge apps.  **[Permissions](#permissions) required:** None.
     * @param uiModificationId The ID of the UI modification. (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Object> deleteUiModificationWithHttpInfo(String uiModificationId) throws ApiException {
        com.squareup.okhttp.Call call = deleteUiModificationValidateBeforeCall(uiModificationId, null, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete UI modification (asynchronously)
     * Deletes a UI modification. All the contexts that belong to the UI modification are deleted too. UI modification can only be deleted by Forge apps.  **[Permissions](#permissions) required:** None.
     * @param uiModificationId The ID of the UI modification. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteUiModificationAsync(String uiModificationId, final ApiCallback<Object> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteUiModificationValidateBeforeCall(uiModificationId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getUiModifications
     * @param startAt The index of the first item to return in a page of results (page offset). (optional, default to 0)
     * @param maxResults The maximum number of items to return per page. (optional, default to 50)
     * @param expand Use expand to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  &#x60;data&#x60; Returns UI modification data.  *  &#x60;contexts&#x60; Returns UI modification contexts. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getUiModificationsCall(Long startAt, Integer maxResults, String expand, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/rest/api/3/uiModifications";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (startAt != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("startAt", startAt));
        if (maxResults != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("maxResults", maxResults));
        if (expand != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("expand", expand));

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

        String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getUiModificationsValidateBeforeCall(Long startAt, Integer maxResults, String expand, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getUiModificationsCall(startAt, maxResults, expand, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get UI modifications
     * Gets UI modifications. UI modifications can only be retrieved by Forge apps.  **[Permissions](#permissions) required:** None.
     * @param startAt The index of the first item to return in a page of results (page offset). (optional, default to 0)
     * @param maxResults The maximum number of items to return per page. (optional, default to 50)
     * @param expand Use expand to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  &#x60;data&#x60; Returns UI modification data.  *  &#x60;contexts&#x60; Returns UI modification contexts. (optional)
     * @return PageBeanUiModificationDetails
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PageBeanUiModificationDetails getUiModifications(Long startAt, Integer maxResults, String expand) throws ApiException {
        ApiResponse<PageBeanUiModificationDetails> resp = getUiModificationsWithHttpInfo(startAt, maxResults, expand);
        return resp.getData();
    }

    /**
     * Get UI modifications
     * Gets UI modifications. UI modifications can only be retrieved by Forge apps.  **[Permissions](#permissions) required:** None.
     * @param startAt The index of the first item to return in a page of results (page offset). (optional, default to 0)
     * @param maxResults The maximum number of items to return per page. (optional, default to 50)
     * @param expand Use expand to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  &#x60;data&#x60; Returns UI modification data.  *  &#x60;contexts&#x60; Returns UI modification contexts. (optional)
     * @return ApiResponse&lt;PageBeanUiModificationDetails&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PageBeanUiModificationDetails> getUiModificationsWithHttpInfo(Long startAt, Integer maxResults, String expand) throws ApiException {
        com.squareup.okhttp.Call call = getUiModificationsValidateBeforeCall(startAt, maxResults, expand, null, null);
        Type localVarReturnType = new TypeToken<PageBeanUiModificationDetails>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get UI modifications (asynchronously)
     * Gets UI modifications. UI modifications can only be retrieved by Forge apps.  **[Permissions](#permissions) required:** None.
     * @param startAt The index of the first item to return in a page of results (page offset). (optional, default to 0)
     * @param maxResults The maximum number of items to return per page. (optional, default to 50)
     * @param expand Use expand to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  &#x60;data&#x60; Returns UI modification data.  *  &#x60;contexts&#x60; Returns UI modification contexts. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getUiModificationsAsync(Long startAt, Integer maxResults, String expand, final ApiCallback<PageBeanUiModificationDetails> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getUiModificationsValidateBeforeCall(startAt, maxResults, expand, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PageBeanUiModificationDetails>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateUiModification
     * @param body Details of the UI modification. (required)
     * @param uiModificationId The ID of the UI modification. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateUiModificationCall(UpdateUiModificationDetails body, String uiModificationId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/rest/api/3/uiModifications/{uiModificationId}"
            .replaceAll("\\{" + "uiModificationId" + "\\}", apiClient.escapeString(uiModificationId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

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
    private com.squareup.okhttp.Call updateUiModificationValidateBeforeCall(UpdateUiModificationDetails body, String uiModificationId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updateUiModification(Async)");
        }
        // verify the required parameter 'uiModificationId' is set
        if (uiModificationId == null) {
            throw new ApiException("Missing the required parameter 'uiModificationId' when calling updateUiModification(Async)");
        }
        
        com.squareup.okhttp.Call call = updateUiModificationCall(body, uiModificationId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Update UI modification
     * Updates a UI modification. UI modification can only be updated by Forge apps.  Each UI modification can define up to 1000 contexts. The same context can be assigned to maximum 100 UI modifications.  **[Permissions](#permissions) required:**   *  *None* if the UI modification is created without contexts.  *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for one or more projects, if the UI modification is created with contexts.
     * @param body Details of the UI modification. (required)
     * @param uiModificationId The ID of the UI modification. (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Object updateUiModification(UpdateUiModificationDetails body, String uiModificationId) throws ApiException {
        ApiResponse<Object> resp = updateUiModificationWithHttpInfo(body, uiModificationId);
        return resp.getData();
    }

    /**
     * Update UI modification
     * Updates a UI modification. UI modification can only be updated by Forge apps.  Each UI modification can define up to 1000 contexts. The same context can be assigned to maximum 100 UI modifications.  **[Permissions](#permissions) required:**   *  *None* if the UI modification is created without contexts.  *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for one or more projects, if the UI modification is created with contexts.
     * @param body Details of the UI modification. (required)
     * @param uiModificationId The ID of the UI modification. (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Object> updateUiModificationWithHttpInfo(UpdateUiModificationDetails body, String uiModificationId) throws ApiException {
        com.squareup.okhttp.Call call = updateUiModificationValidateBeforeCall(body, uiModificationId, null, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update UI modification (asynchronously)
     * Updates a UI modification. UI modification can only be updated by Forge apps.  Each UI modification can define up to 1000 contexts. The same context can be assigned to maximum 100 UI modifications.  **[Permissions](#permissions) required:**   *  *None* if the UI modification is created without contexts.  *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for one or more projects, if the UI modification is created with contexts.
     * @param body Details of the UI modification. (required)
     * @param uiModificationId The ID of the UI modification. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateUiModificationAsync(UpdateUiModificationDetails body, String uiModificationId, final ApiCallback<Object> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateUiModificationValidateBeforeCall(body, uiModificationId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
