# JqlFunctionsAppsApi

All URIs are relative to *https://your-domain.atlassian.net*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPrecomputations**](JqlFunctionsAppsApi.md#getPrecomputations) | **GET** /rest/api/3/jql/function/computation | Get precomputations (apps)
[**updatePrecomputations**](JqlFunctionsAppsApi.md#updatePrecomputations) | **POST** /rest/api/3/jql/function/computation | Update precomputations (apps)

<a name="getPrecomputations"></a>
# **getPrecomputations**
> PageBeanJqlFunctionPrecomputationBean getPrecomputations(functionKey, startAt, maxResults, orderBy)

Get precomputations (apps)

Returns the list of a function&#x27;s precomputations along with information about when they were created, updated, and last used. Each precomputation has a &#x60;value&#x60; \\- the JQL fragment to replace the custom function clause with.  **[Permissions](#permissions) required:** This API is only accessible to apps and apps can only inspect their own functions.

### Example
```java
// Import classes:
//import se.phaseshift.jira.rest.client.ApiClient;
//import se.phaseshift.jira.rest.client.ApiException;
//import se.phaseshift.jira.rest.client.Configuration;
//import se.phaseshift.jira.rest.client.auth.*;
//import se.phaseshift.jira.rest.client.api.JqlFunctionsAppsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

JqlFunctionsAppsApi apiInstance = new JqlFunctionsAppsApi();
List<String> functionKey = Arrays.asList("functionKey_example"); // List<String> | The function key in format:   *  Forge: `ari:cloud:ecosystem::extension/[App ID]/[Environment ID]/static/[Function key from manifest]`  *  Connect: `[App key]__[Module key]`
Long startAt = 0L; // Long | The index of the first item to return in a page of results (page offset).
Integer maxResults = 100; // Integer | The maximum number of items to return per page.
String orderBy = "orderBy_example"; // String | [Order](#ordering) the results by a field:   *  `functionKey` Sorts by the functionKey.  *  `used` Sorts by the used timestamp.  *  `created` Sorts by the created timestamp.  *  `updated` Sorts by the updated timestamp.
try {
    PageBeanJqlFunctionPrecomputationBean result = apiInstance.getPrecomputations(functionKey, startAt, maxResults, orderBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JqlFunctionsAppsApi#getPrecomputations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **functionKey** | [**List&lt;String&gt;**](String.md)| The function key in format:   *  Forge: &#x60;ari:cloud:ecosystem::extension/[App ID]/[Environment ID]/static/[Function key from manifest]&#x60;  *  Connect: &#x60;[App key]__[Module key]&#x60; | [optional]
 **startAt** | **Long**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0]
 **maxResults** | **Integer**| The maximum number of items to return per page. | [optional] [default to 100]
 **orderBy** | **String**| [Order](#ordering) the results by a field:   *  &#x60;functionKey&#x60; Sorts by the functionKey.  *  &#x60;used&#x60; Sorts by the used timestamp.  *  &#x60;created&#x60; Sorts by the created timestamp.  *  &#x60;updated&#x60; Sorts by the updated timestamp. | [optional]

### Return type

[**PageBeanJqlFunctionPrecomputationBean**](PageBeanJqlFunctionPrecomputationBean.md)

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updatePrecomputations"></a>
# **updatePrecomputations**
> Object updatePrecomputations(body)

Update precomputations (apps)

Update the precomputation value of a function created by a Forge/Connect app.  **[Permissions](#permissions) required:** An API for apps to update their own precomputations.

### Example
```java
// Import classes:
//import se.phaseshift.jira.rest.client.ApiClient;
//import se.phaseshift.jira.rest.client.ApiException;
//import se.phaseshift.jira.rest.client.Configuration;
//import se.phaseshift.jira.rest.client.auth.*;
//import se.phaseshift.jira.rest.client.api.JqlFunctionsAppsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

JqlFunctionsAppsApi apiInstance = new JqlFunctionsAppsApi();
JqlFunctionPrecomputationUpdateRequestBean body = new JqlFunctionPrecomputationUpdateRequestBean(); // JqlFunctionPrecomputationUpdateRequestBean | 
try {
    Object result = apiInstance.updatePrecomputations(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JqlFunctionsAppsApi#updatePrecomputations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JqlFunctionPrecomputationUpdateRequestBean**](JqlFunctionPrecomputationUpdateRequestBean.md)|  |

### Return type

**Object**

### Authorization

[OAuth2](../README.md#OAuth2)[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

