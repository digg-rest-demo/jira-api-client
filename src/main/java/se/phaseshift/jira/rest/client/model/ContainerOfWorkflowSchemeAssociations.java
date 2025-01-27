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
import se.phaseshift.jira.rest.client.model.WorkflowSchemeAssociations;
/**
 * A container for a list of workflow schemes together with the projects they are associated with.
 */
@Schema(description = "A container for a list of workflow schemes together with the projects they are associated with.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class ContainerOfWorkflowSchemeAssociations {
  @SerializedName("values")
  private List<WorkflowSchemeAssociations> values = new ArrayList<WorkflowSchemeAssociations>();

  public ContainerOfWorkflowSchemeAssociations values(List<WorkflowSchemeAssociations> values) {
    this.values = values;
    return this;
  }

  public ContainerOfWorkflowSchemeAssociations addValuesItem(WorkflowSchemeAssociations valuesItem) {
    this.values.add(valuesItem);
    return this;
  }

   /**
   * A list of workflow schemes together with projects they are associated with.
   * @return values
  **/
  @Schema(required = true, description = "A list of workflow schemes together with projects they are associated with.")
  public List<WorkflowSchemeAssociations> getValues() {
    return values;
  }

  public void setValues(List<WorkflowSchemeAssociations> values) {
    this.values = values;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainerOfWorkflowSchemeAssociations containerOfWorkflowSchemeAssociations = (ContainerOfWorkflowSchemeAssociations) o;
    return Objects.equals(this.values, containerOfWorkflowSchemeAssociations.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerOfWorkflowSchemeAssociations {\n");
    
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
