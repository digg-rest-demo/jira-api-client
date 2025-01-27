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
import se.phaseshift.jira.rest.client.model.WorkflowTransitionRules;
/**
 * Details about a workflow configuration update request.
 */
@Schema(description = "Details about a workflow configuration update request.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class WorkflowTransitionRulesUpdate {
  @SerializedName("workflows")
  private List<WorkflowTransitionRules> workflows = new ArrayList<WorkflowTransitionRules>();

  public WorkflowTransitionRulesUpdate workflows(List<WorkflowTransitionRules> workflows) {
    this.workflows = workflows;
    return this;
  }

  public WorkflowTransitionRulesUpdate addWorkflowsItem(WorkflowTransitionRules workflowsItem) {
    this.workflows.add(workflowsItem);
    return this;
  }

   /**
   * The list of workflows with transition rules to update.
   * @return workflows
  **/
  @Schema(required = true, description = "The list of workflows with transition rules to update.")
  public List<WorkflowTransitionRules> getWorkflows() {
    return workflows;
  }

  public void setWorkflows(List<WorkflowTransitionRules> workflows) {
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
    WorkflowTransitionRulesUpdate workflowTransitionRulesUpdate = (WorkflowTransitionRulesUpdate) o;
    return Objects.equals(this.workflows, workflowTransitionRulesUpdate.workflows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workflows);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowTransitionRulesUpdate {\n");
    
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
