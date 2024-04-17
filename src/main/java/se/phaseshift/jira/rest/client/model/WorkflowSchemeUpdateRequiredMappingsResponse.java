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
import se.phaseshift.jira.rest.client.model.RequiredMappingByIssueType;
import se.phaseshift.jira.rest.client.model.RequiredMappingByWorkflows;
import se.phaseshift.jira.rest.client.model.StatusMetadata;
import se.phaseshift.jira.rest.client.model.StatusesPerWorkflow;
/**
 * WorkflowSchemeUpdateRequiredMappingsResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class WorkflowSchemeUpdateRequiredMappingsResponse {
  @SerializedName("statusMappingsByIssueTypes")
  private List<RequiredMappingByIssueType> statusMappingsByIssueTypes = null;

  @SerializedName("statusMappingsByWorkflows")
  private List<RequiredMappingByWorkflows> statusMappingsByWorkflows = null;

  @SerializedName("statuses")
  private List<StatusMetadata> statuses = null;

  @SerializedName("statusesPerWorkflow")
  private List<StatusesPerWorkflow> statusesPerWorkflow = null;

  public WorkflowSchemeUpdateRequiredMappingsResponse statusMappingsByIssueTypes(List<RequiredMappingByIssueType> statusMappingsByIssueTypes) {
    this.statusMappingsByIssueTypes = statusMappingsByIssueTypes;
    return this;
  }

  public WorkflowSchemeUpdateRequiredMappingsResponse addStatusMappingsByIssueTypesItem(RequiredMappingByIssueType statusMappingsByIssueTypesItem) {
    if (this.statusMappingsByIssueTypes == null) {
      this.statusMappingsByIssueTypes = new ArrayList<RequiredMappingByIssueType>();
    }
    this.statusMappingsByIssueTypes.add(statusMappingsByIssueTypesItem);
    return this;
  }

   /**
   * The list of required status mappings by issue type.
   * @return statusMappingsByIssueTypes
  **/
  @Schema(description = "The list of required status mappings by issue type.")
  public List<RequiredMappingByIssueType> getStatusMappingsByIssueTypes() {
    return statusMappingsByIssueTypes;
  }

  public void setStatusMappingsByIssueTypes(List<RequiredMappingByIssueType> statusMappingsByIssueTypes) {
    this.statusMappingsByIssueTypes = statusMappingsByIssueTypes;
  }

  public WorkflowSchemeUpdateRequiredMappingsResponse statusMappingsByWorkflows(List<RequiredMappingByWorkflows> statusMappingsByWorkflows) {
    this.statusMappingsByWorkflows = statusMappingsByWorkflows;
    return this;
  }

  public WorkflowSchemeUpdateRequiredMappingsResponse addStatusMappingsByWorkflowsItem(RequiredMappingByWorkflows statusMappingsByWorkflowsItem) {
    if (this.statusMappingsByWorkflows == null) {
      this.statusMappingsByWorkflows = new ArrayList<RequiredMappingByWorkflows>();
    }
    this.statusMappingsByWorkflows.add(statusMappingsByWorkflowsItem);
    return this;
  }

   /**
   * The list of required status mappings by workflow.
   * @return statusMappingsByWorkflows
  **/
  @Schema(description = "The list of required status mappings by workflow.")
  public List<RequiredMappingByWorkflows> getStatusMappingsByWorkflows() {
    return statusMappingsByWorkflows;
  }

  public void setStatusMappingsByWorkflows(List<RequiredMappingByWorkflows> statusMappingsByWorkflows) {
    this.statusMappingsByWorkflows = statusMappingsByWorkflows;
  }

  public WorkflowSchemeUpdateRequiredMappingsResponse statuses(List<StatusMetadata> statuses) {
    this.statuses = statuses;
    return this;
  }

  public WorkflowSchemeUpdateRequiredMappingsResponse addStatusesItem(StatusMetadata statusesItem) {
    if (this.statuses == null) {
      this.statuses = new ArrayList<StatusMetadata>();
    }
    this.statuses.add(statusesItem);
    return this;
  }

   /**
   * The details of the statuses in the associated workflows.
   * @return statuses
  **/
  @Schema(description = "The details of the statuses in the associated workflows.")
  public List<StatusMetadata> getStatuses() {
    return statuses;
  }

  public void setStatuses(List<StatusMetadata> statuses) {
    this.statuses = statuses;
  }

  public WorkflowSchemeUpdateRequiredMappingsResponse statusesPerWorkflow(List<StatusesPerWorkflow> statusesPerWorkflow) {
    this.statusesPerWorkflow = statusesPerWorkflow;
    return this;
  }

  public WorkflowSchemeUpdateRequiredMappingsResponse addStatusesPerWorkflowItem(StatusesPerWorkflow statusesPerWorkflowItem) {
    if (this.statusesPerWorkflow == null) {
      this.statusesPerWorkflow = new ArrayList<StatusesPerWorkflow>();
    }
    this.statusesPerWorkflow.add(statusesPerWorkflowItem);
    return this;
  }

   /**
   * The statuses associated with each workflow.
   * @return statusesPerWorkflow
  **/
  @Schema(description = "The statuses associated with each workflow.")
  public List<StatusesPerWorkflow> getStatusesPerWorkflow() {
    return statusesPerWorkflow;
  }

  public void setStatusesPerWorkflow(List<StatusesPerWorkflow> statusesPerWorkflow) {
    this.statusesPerWorkflow = statusesPerWorkflow;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowSchemeUpdateRequiredMappingsResponse workflowSchemeUpdateRequiredMappingsResponse = (WorkflowSchemeUpdateRequiredMappingsResponse) o;
    return Objects.equals(this.statusMappingsByIssueTypes, workflowSchemeUpdateRequiredMappingsResponse.statusMappingsByIssueTypes) &&
        Objects.equals(this.statusMappingsByWorkflows, workflowSchemeUpdateRequiredMappingsResponse.statusMappingsByWorkflows) &&
        Objects.equals(this.statuses, workflowSchemeUpdateRequiredMappingsResponse.statuses) &&
        Objects.equals(this.statusesPerWorkflow, workflowSchemeUpdateRequiredMappingsResponse.statusesPerWorkflow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusMappingsByIssueTypes, statusMappingsByWorkflows, statuses, statusesPerWorkflow);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowSchemeUpdateRequiredMappingsResponse {\n");
    
    sb.append("    statusMappingsByIssueTypes: ").append(toIndentedString(statusMappingsByIssueTypes)).append("\n");
    sb.append("    statusMappingsByWorkflows: ").append(toIndentedString(statusMappingsByWorkflows)).append("\n");
    sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
    sb.append("    statusesPerWorkflow: ").append(toIndentedString(statusesPerWorkflow)).append("\n");
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
