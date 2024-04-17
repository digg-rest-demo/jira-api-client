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
import se.phaseshift.jira.rest.client.model.WorkflowStatusUpdate;
import se.phaseshift.jira.rest.client.model.WorkflowUpdate;
/**
 * The update workflows payload.
 */
@Schema(description = "The update workflows payload.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class WorkflowUpdateRequest {
  @SerializedName("statuses")
  private List<WorkflowStatusUpdate> statuses = new ArrayList<WorkflowStatusUpdate>();

  @SerializedName("workflows")
  private List<WorkflowUpdate> workflows = new ArrayList<WorkflowUpdate>();

  public WorkflowUpdateRequest statuses(List<WorkflowStatusUpdate> statuses) {
    this.statuses = statuses;
    return this;
  }

  public WorkflowUpdateRequest addStatusesItem(WorkflowStatusUpdate statusesItem) {
    this.statuses.add(statusesItem);
    return this;
  }

   /**
   * The statuses to associate with the workflows.
   * @return statuses
  **/
  @Schema(required = true, description = "The statuses to associate with the workflows.")
  public List<WorkflowStatusUpdate> getStatuses() {
    return statuses;
  }

  public void setStatuses(List<WorkflowStatusUpdate> statuses) {
    this.statuses = statuses;
  }

  public WorkflowUpdateRequest workflows(List<WorkflowUpdate> workflows) {
    this.workflows = workflows;
    return this;
  }

  public WorkflowUpdateRequest addWorkflowsItem(WorkflowUpdate workflowsItem) {
    this.workflows.add(workflowsItem);
    return this;
  }

   /**
   * The details of the workflows to update.
   * @return workflows
  **/
  @Schema(required = true, description = "The details of the workflows to update.")
  public List<WorkflowUpdate> getWorkflows() {
    return workflows;
  }

  public void setWorkflows(List<WorkflowUpdate> workflows) {
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
    WorkflowUpdateRequest workflowUpdateRequest = (WorkflowUpdateRequest) o;
    return Objects.equals(this.statuses, workflowUpdateRequest.statuses) &&
        Objects.equals(this.workflows, workflowUpdateRequest.workflows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statuses, workflows);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowUpdateRequest {\n");
    
    sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
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