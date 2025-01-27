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
import se.phaseshift.jira.rest.client.model.FieldConfigurationScheme;
/**
 * Project list with assigned field configuration schema.
 */
@Schema(description = "Project list with assigned field configuration schema.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class FieldConfigurationSchemeProjects {
  @SerializedName("fieldConfigurationScheme")
  private FieldConfigurationScheme fieldConfigurationScheme = null;

  @SerializedName("projectIds")
  private List<String> projectIds = new ArrayList<String>();

  public FieldConfigurationSchemeProjects fieldConfigurationScheme(FieldConfigurationScheme fieldConfigurationScheme) {
    this.fieldConfigurationScheme = fieldConfigurationScheme;
    return this;
  }

   /**
   * Get fieldConfigurationScheme
   * @return fieldConfigurationScheme
  **/
  @Schema(description = "")
  public FieldConfigurationScheme getFieldConfigurationScheme() {
    return fieldConfigurationScheme;
  }

  public void setFieldConfigurationScheme(FieldConfigurationScheme fieldConfigurationScheme) {
    this.fieldConfigurationScheme = fieldConfigurationScheme;
  }

  public FieldConfigurationSchemeProjects projectIds(List<String> projectIds) {
    this.projectIds = projectIds;
    return this;
  }

  public FieldConfigurationSchemeProjects addProjectIdsItem(String projectIdsItem) {
    this.projectIds.add(projectIdsItem);
    return this;
  }

   /**
   * The IDs of projects using the field configuration scheme.
   * @return projectIds
  **/
  @Schema(required = true, description = "The IDs of projects using the field configuration scheme.")
  public List<String> getProjectIds() {
    return projectIds;
  }

  public void setProjectIds(List<String> projectIds) {
    this.projectIds = projectIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldConfigurationSchemeProjects fieldConfigurationSchemeProjects = (FieldConfigurationSchemeProjects) o;
    return Objects.equals(this.fieldConfigurationScheme, fieldConfigurationSchemeProjects.fieldConfigurationScheme) &&
        Objects.equals(this.projectIds, fieldConfigurationSchemeProjects.projectIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldConfigurationScheme, projectIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldConfigurationSchemeProjects {\n");
    
    sb.append("    fieldConfigurationScheme: ").append(toIndentedString(fieldConfigurationScheme)).append("\n");
    sb.append("    projectIds: ").append(toIndentedString(projectIds)).append("\n");
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
