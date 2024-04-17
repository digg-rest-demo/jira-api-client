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


import se.phaseshift.jira.rest.client.model.PageBeanString;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LabelsApi {
    private ApiClient apiClient;

    public LabelsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public LabelsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getAllLabels
     * @param startAt The index of the first item to return in a page of results (page offset). (optional, default to 0)
     * @param maxResults The maximum number of items to return per page. (optional, default to 1000)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAllLabelsCall(Long startAt, Integer maxResults, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/rest/api/3/label";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (startAt != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("startAt", startAt));
        if (maxResults != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("maxResults", maxResults));

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
    private com.squareup.okhttp.Call getAllLabelsValidateBeforeCall(Long startAt, Integer maxResults, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getAllLabelsCall(startAt, maxResults, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get all labels
     * Returns a [paginated](#pagination) list of labels.
     * @param startAt The index of the first item to return in a page of results (page offset). (optional, default to 0)
     * @param maxResults The maximum number of items to return per page. (optional, default to 1000)
     * @return PageBeanString
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PageBeanString getAllLabels(Long startAt, Integer maxResults) throws ApiException {
        ApiResponse<PageBeanString> resp = getAllLabelsWithHttpInfo(startAt, maxResults);
        return resp.getData();
    }

    /**
     * Get all labels
     * Returns a [paginated](#pagination) list of labels.
     * @param startAt The index of the first item to return in a page of results (page offset). (optional, default to 0)
     * @param maxResults The maximum number of items to return per page. (optional, default to 1000)
     * @return ApiResponse&lt;PageBeanString&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PageBeanString> getAllLabelsWithHttpInfo(Long startAt, Integer maxResults) throws ApiException {
        com.squareup.okhttp.Call call = getAllLabelsValidateBeforeCall(startAt, maxResults, null, null);
        Type localVarReturnType = new TypeToken<PageBeanString>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get all labels (asynchronously)
     * Returns a [paginated](#pagination) list of labels.
     * @param startAt The index of the first item to return in a page of results (page offset). (optional, default to 0)
     * @param maxResults The maximum number of items to return per page. (optional, default to 1000)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAllLabelsAsync(Long startAt, Integer maxResults, final ApiCallback<PageBeanString> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAllLabelsValidateBeforeCall(startAt, maxResults, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PageBeanString>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
