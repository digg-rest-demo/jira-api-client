# WorkflowSchemeReadResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**defaultWorkflow** | [**WorkflowMetadataRestModel**](WorkflowMetadataRestModel.md) |  |  [optional]
**description** | **String** | The description of the workflow scheme. |  [optional]
**id** | **String** | The ID of the workflow scheme. | 
**name** | **String** | The name of the workflow scheme. | 
**projectIdsUsingScheme** | **List&lt;String&gt;** | The IDs of projects using the workflow scheme. | 
**scope** | [**WorkflowScope**](WorkflowScope.md) |  | 
**taskId** | **String** | Indicates if there&#x27;s an [asynchronous task](#async-operations) for this workflow scheme. |  [optional]
**version** | [**DocumentVersion**](DocumentVersion.md) |  | 
**workflowsForIssueTypes** | [**List&lt;WorkflowMetadataAndIssueTypeRestModel&gt;**](WorkflowMetadataAndIssueTypeRestModel.md) | Mappings from workflows to issue types. | 
