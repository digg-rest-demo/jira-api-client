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

package se.phaseshift.jira.rest.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import se.phaseshift.jira.rest.client.model.DocumentVersion;
import se.phaseshift.jira.rest.client.model.WorkflowMetadataAndIssueTypeRestModel;
import se.phaseshift.jira.rest.client.model.WorkflowMetadataRestModel;
import se.phaseshift.jira.rest.client.model.WorkflowScope;
/**
 * WorkflowSchemeReadResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class WorkflowSchemeReadResponse {
  @SerializedName("defaultWorkflow")
  private WorkflowMetadataRestModel defaultWorkflow = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("projectIdsUsingScheme")
  private List<String> projectIdsUsingScheme = new ArrayList<String>();

  @SerializedName("scope")
  private WorkflowScope scope = null;

  @SerializedName("taskId")
  private String taskId = null;

  @SerializedName("version")
  private DocumentVersion version = null;

  @SerializedName("workflowsForIssueTypes")
  private List<WorkflowMetadataAndIssueTypeRestModel> workflowsForIssueTypes = new ArrayList<WorkflowMetadataAndIssueTypeRestModel>();

  public WorkflowSchemeReadResponse defaultWorkflow(WorkflowMetadataRestModel defaultWorkflow) {
    this.defaultWorkflow = defaultWorkflow;
    return this;
  }

   /**
   * Get defaultWorkflow
   * @return defaultWorkflow
  **/
  @Schema(description = "")
  public WorkflowMetadataRestModel getDefaultWorkflow() {
    return defaultWorkflow;
  }

  public void setDefaultWorkflow(WorkflowMetadataRestModel defaultWorkflow) {
    this.defaultWorkflow = defaultWorkflow;
  }

  public WorkflowSchemeReadResponse description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the workflow scheme.
   * @return description
  **/
  @Schema(description = "The description of the workflow scheme.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public WorkflowSchemeReadResponse id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the workflow scheme.
   * @return id
  **/
  @Schema(required = true, description = "The ID of the workflow scheme.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public WorkflowSchemeReadResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the workflow scheme.
   * @return name
  **/
  @Schema(required = true, description = "The name of the workflow scheme.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public WorkflowSchemeReadResponse projectIdsUsingScheme(List<String> projectIdsUsingScheme) {
    this.projectIdsUsingScheme = projectIdsUsingScheme;
    return this;
  }

  public WorkflowSchemeReadResponse addProjectIdsUsingSchemeItem(String projectIdsUsingSchemeItem) {
    this.projectIdsUsingScheme.add(projectIdsUsingSchemeItem);
    return this;
  }

   /**
   * The IDs of projects using the workflow scheme.
   * @return projectIdsUsingScheme
  **/
  @Schema(required = true, description = "The IDs of projects using the workflow scheme.")
  public List<String> getProjectIdsUsingScheme() {
    return projectIdsUsingScheme;
  }

  public void setProjectIdsUsingScheme(List<String> projectIdsUsingScheme) {
    this.projectIdsUsingScheme = projectIdsUsingScheme;
  }

  public WorkflowSchemeReadResponse scope(WorkflowScope scope) {
    this.scope = scope;
    return this;
  }

   /**
   * Get scope
   * @return scope
  **/
  @Schema(required = true, description = "")
  public WorkflowScope getScope() {
    return scope;
  }

  public void setScope(WorkflowScope scope) {
    this.scope = scope;
  }

  public WorkflowSchemeReadResponse taskId(String taskId) {
    this.taskId = taskId;
    return this;
  }

   /**
   * Indicates if there&#x27;s an [asynchronous task](#async-operations) for this workflow scheme.
   * @return taskId
  **/
  @Schema(description = "Indicates if there's an [asynchronous task](#async-operations) for this workflow scheme.")
  public String getTaskId() {
    return taskId;
  }

  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }

  public WorkflowSchemeReadResponse version(DocumentVersion version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @Schema(required = true, description = "")
  public DocumentVersion getVersion() {
    return version;
  }

  public void setVersion(DocumentVersion version) {
    this.version = version;
  }

  public WorkflowSchemeReadResponse workflowsForIssueTypes(List<WorkflowMetadataAndIssueTypeRestModel> workflowsForIssueTypes) {
    this.workflowsForIssueTypes = workflowsForIssueTypes;
    return this;
  }

  public WorkflowSchemeReadResponse addWorkflowsForIssueTypesItem(WorkflowMetadataAndIssueTypeRestModel workflowsForIssueTypesItem) {
    this.workflowsForIssueTypes.add(workflowsForIssueTypesItem);
    return this;
  }

   /**
   * Mappings from workflows to issue types.
   * @return workflowsForIssueTypes
  **/
  @Schema(required = true, description = "Mappings from workflows to issue types.")
  public List<WorkflowMetadataAndIssueTypeRestModel> getWorkflowsForIssueTypes() {
    return workflowsForIssueTypes;
  }

  public void setWorkflowsForIssueTypes(List<WorkflowMetadataAndIssueTypeRestModel> workflowsForIssueTypes) {
    this.workflowsForIssueTypes = workflowsForIssueTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowSchemeReadResponse workflowSchemeReadResponse = (WorkflowSchemeReadResponse) o;
    return Objects.equals(this.defaultWorkflow, workflowSchemeReadResponse.defaultWorkflow) &&
        Objects.equals(this.description, workflowSchemeReadResponse.description) &&
        Objects.equals(this.id, workflowSchemeReadResponse.id) &&
        Objects.equals(this.name, workflowSchemeReadResponse.name) &&
        Objects.equals(this.projectIdsUsingScheme, workflowSchemeReadResponse.projectIdsUsingScheme) &&
        Objects.equals(this.scope, workflowSchemeReadResponse.scope) &&
        Objects.equals(this.taskId, workflowSchemeReadResponse.taskId) &&
        Objects.equals(this.version, workflowSchemeReadResponse.version) &&
        Objects.equals(this.workflowsForIssueTypes, workflowSchemeReadResponse.workflowsForIssueTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultWorkflow, description, id, name, projectIdsUsingScheme, scope, taskId, version, workflowsForIssueTypes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowSchemeReadResponse {\n");
    
    sb.append("    defaultWorkflow: ").append(toIndentedString(defaultWorkflow)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    projectIdsUsingScheme: ").append(toIndentedString(projectIdsUsingScheme)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    workflowsForIssueTypes: ").append(toIndentedString(workflowsForIssueTypes)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
