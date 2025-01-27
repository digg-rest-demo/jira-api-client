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
import se.phaseshift.jira.rest.client.model.ProjectAndIssueTypePair;
/**
 * A reference to the location of the error. This will be null if the error does not refer to a specific element.
 */
@Schema(description = "A reference to the location of the error. This will be null if the error does not refer to a specific element.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class WorkflowElementReference {
  @SerializedName("propertyKey")
  private String propertyKey = null;

  @SerializedName("ruleId")
  private String ruleId = null;

  @SerializedName("statusMappingReference")
  private ProjectAndIssueTypePair statusMappingReference = null;

  @SerializedName("statusReference")
  private String statusReference = null;

  @SerializedName("transitionId")
  private String transitionId = null;

  public WorkflowElementReference propertyKey(String propertyKey) {
    this.propertyKey = propertyKey;
    return this;
  }

   /**
   * A property key.
   * @return propertyKey
  **/
  @Schema(description = "A property key.")
  public String getPropertyKey() {
    return propertyKey;
  }

  public void setPropertyKey(String propertyKey) {
    this.propertyKey = propertyKey;
  }

  public WorkflowElementReference ruleId(String ruleId) {
    this.ruleId = ruleId;
    return this;
  }

   /**
   * A rule ID.
   * @return ruleId
  **/
  @Schema(description = "A rule ID.")
  public String getRuleId() {
    return ruleId;
  }

  public void setRuleId(String ruleId) {
    this.ruleId = ruleId;
  }

  public WorkflowElementReference statusMappingReference(ProjectAndIssueTypePair statusMappingReference) {
    this.statusMappingReference = statusMappingReference;
    return this;
  }

   /**
   * Get statusMappingReference
   * @return statusMappingReference
  **/
  @Schema(description = "")
  public ProjectAndIssueTypePair getStatusMappingReference() {
    return statusMappingReference;
  }

  public void setStatusMappingReference(ProjectAndIssueTypePair statusMappingReference) {
    this.statusMappingReference = statusMappingReference;
  }

  public WorkflowElementReference statusReference(String statusReference) {
    this.statusReference = statusReference;
    return this;
  }

   /**
   * A status reference.
   * @return statusReference
  **/
  @Schema(description = "A status reference.")
  public String getStatusReference() {
    return statusReference;
  }

  public void setStatusReference(String statusReference) {
    this.statusReference = statusReference;
  }

  public WorkflowElementReference transitionId(String transitionId) {
    this.transitionId = transitionId;
    return this;
  }

   /**
   * A transition ID.
   * @return transitionId
  **/
  @Schema(description = "A transition ID.")
  public String getTransitionId() {
    return transitionId;
  }

  public void setTransitionId(String transitionId) {
    this.transitionId = transitionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowElementReference workflowElementReference = (WorkflowElementReference) o;
    return Objects.equals(this.propertyKey, workflowElementReference.propertyKey) &&
        Objects.equals(this.ruleId, workflowElementReference.ruleId) &&
        Objects.equals(this.statusMappingReference, workflowElementReference.statusMappingReference) &&
        Objects.equals(this.statusReference, workflowElementReference.statusReference) &&
        Objects.equals(this.transitionId, workflowElementReference.transitionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(propertyKey, ruleId, statusMappingReference, statusReference, transitionId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowElementReference {\n");
    
    sb.append("    propertyKey: ").append(toIndentedString(propertyKey)).append("\n");
    sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
    sb.append("    statusMappingReference: ").append(toIndentedString(statusMappingReference)).append("\n");
    sb.append("    statusReference: ").append(toIndentedString(statusReference)).append("\n");
    sb.append("    transitionId: ").append(toIndentedString(transitionId)).append("\n");
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
