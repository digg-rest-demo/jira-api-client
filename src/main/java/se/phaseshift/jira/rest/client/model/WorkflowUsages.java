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
/**
 * The workflows that use this status. Only available if the &#x60;workflowUsages&#x60; expand is requested.
 */
@Schema(description = "The workflows that use this status. Only available if the `workflowUsages` expand is requested.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class WorkflowUsages {
  @SerializedName("workflowId")
  private String workflowId = null;

  @SerializedName("workflowName")
  private String workflowName = null;

  public WorkflowUsages workflowId(String workflowId) {
    this.workflowId = workflowId;
    return this;
  }

   /**
   * Workflow ID.
   * @return workflowId
  **/
  @Schema(description = "Workflow ID.")
  public String getWorkflowId() {
    return workflowId;
  }

  public void setWorkflowId(String workflowId) {
    this.workflowId = workflowId;
  }

  public WorkflowUsages workflowName(String workflowName) {
    this.workflowName = workflowName;
    return this;
  }

   /**
   * Workflow name.
   * @return workflowName
  **/
  @Schema(description = "Workflow name.")
  public String getWorkflowName() {
    return workflowName;
  }

  public void setWorkflowName(String workflowName) {
    this.workflowName = workflowName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowUsages workflowUsages = (WorkflowUsages) o;
    return Objects.equals(this.workflowId, workflowUsages.workflowId) &&
        Objects.equals(this.workflowName, workflowUsages.workflowName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workflowId, workflowName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowUsages {\n");
    
    sb.append("    workflowId: ").append(toIndentedString(workflowId)).append("\n");
    sb.append("    workflowName: ").append(toIndentedString(workflowName)).append("\n");
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
