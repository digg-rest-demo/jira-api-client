# FilterDetails

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**approximateLastUsed** | [**OffsetDateTime**](OffsetDateTime.md) | \\[Experimental\\] Approximate last used time. Returns the date and time when the filter was last used. Returns &#x60;null&#x60; if the filter hasn&#x27;t been used after tracking was enabled. For performance reasons, timestamps aren&#x27;t updated in real time and therefore may not be exactly accurate. |  [optional]
**description** | **String** | The description of the filter. |  [optional]
**editPermissions** | [**List&lt;SharePermission&gt;**](SharePermission.md) | The groups and projects that can edit the filter. This can be specified when updating a filter, but not when creating a filter. |  [optional]
**expand** | **String** | Expand options that include additional filter details in the response. |  [optional]
**favourite** | **Boolean** | Whether the filter is selected as a favorite by any users, not including the filter owner. |  [optional]
**favouritedCount** | **Long** | The count of how many users have selected this filter as a favorite, including the filter owner. |  [optional]
**id** | **String** | The unique identifier for the filter. |  [optional]
**jql** | **String** | The JQL query for the filter. For example, *project &#x3D; SSP AND issuetype &#x3D; Bug*. |  [optional]
**name** | **String** | The name of the filter. | 
**owner** | **AllOfFilterDetailsOwner** | The user who owns the filter. Defaults to the creator of the filter, however, Jira administrators can change the owner of a shared filter in the admin settings. |  [optional]
**searchUrl** | **String** | A URL to view the filter results in Jira, using the [Search for issues using JQL](#api-rest-api-3-filter-search-get) operation with the filter&#x27;s JQL string to return the filter results. For example, *https://your-domain.atlassian.net/rest/api/3/search?jql&#x3D;project+%3D+SSP+AND+issuetype+%3D+Bug*. |  [optional]
**self** | **String** | The URL of the filter. |  [optional]
**sharePermissions** | [**List&lt;SharePermission&gt;**](SharePermission.md) | The groups and projects that the filter is shared with. This can be specified when updating a filter, but not when creating a filter. |  [optional]
**subscriptions** | [**List&lt;FilterSubscription&gt;**](FilterSubscription.md) | The users that are subscribed to the filter. |  [optional]
**viewUrl** | **String** | A URL to view the filter results in Jira, using the ID of the filter. For example, *https://your-domain.atlassian.net/issues/?filter&#x3D;10100*. |  [optional]
