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
import se.phaseshift.jira.rest.client.model.JiraWorkflow;
import se.phaseshift.jira.rest.client.model.JiraWorkflowStatus;
/**
 * WorkflowUpdateResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class WorkflowUpdateResponse {
  @SerializedName("statuses")
  private List<JiraWorkflowStatus> statuses = null;

  @SerializedName("taskId")
  private String taskId = null;

  @SerializedName("workflows")
  private List<JiraWorkflow> workflows = null;

  public WorkflowUpdateResponse statuses(List<JiraWorkflowStatus> statuses) {
    this.statuses = statuses;
    return this;
  }

  public WorkflowUpdateResponse addStatusesItem(JiraWorkflowStatus statusesItem) {
    if (this.statuses == null) {
      this.statuses = new ArrayList<JiraWorkflowStatus>();
    }
    this.statuses.add(statusesItem);
    return this;
  }

   /**
   * List of updated statuses.
   * @return statuses
  **/
  @Schema(description = "List of updated statuses.")
  public List<JiraWorkflowStatus> getStatuses() {
    return statuses;
  }

  public void setStatuses(List<JiraWorkflowStatus> statuses) {
    this.statuses = statuses;
  }

  public WorkflowUpdateResponse taskId(String taskId) {
    this.taskId = taskId;
    return this;
  }

   /**
   * If there is a [asynchronous task](#async-operations) operation, as a result of this update.
   * @return taskId
  **/
  @Schema(description = "If there is a [asynchronous task](#async-operations) operation, as a result of this update.")
  public String getTaskId() {
    return taskId;
  }

  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }

  public WorkflowUpdateResponse workflows(List<JiraWorkflow> workflows) {
    this.workflows = workflows;
    return this;
  }

  public WorkflowUpdateResponse addWorkflowsItem(JiraWorkflow workflowsItem) {
    if (this.workflows == null) {
      this.workflows = new ArrayList<JiraWorkflow>();
    }
    this.workflows.add(workflowsItem);
    return this;
  }

   /**
   * List of updated workflows.
   * @return workflows
  **/
  @Schema(description = "List of updated workflows.")
  public List<JiraWorkflow> getWorkflows() {
    return workflows;
  }

  public void setWorkflows(List<JiraWorkflow> workflows) {
    this.workflows = workflows;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowUpdateResponse workflowUpdateResponse = (WorkflowUpdateResponse) o;
    return Objects.equals(this.statuses, workflowUpdateResponse.statuses) &&
        Objects.equals(this.taskId, workflowUpdateResponse.taskId) &&
        Objects.equals(this.workflows, workflowUpdateResponse.workflows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statuses, taskId, workflows);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowUpdateResponse {\n");
    
    sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    workflows: ").append(toIndentedString(workflows)).append("\n");
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
