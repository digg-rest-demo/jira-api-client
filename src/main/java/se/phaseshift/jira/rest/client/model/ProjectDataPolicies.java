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
import se.phaseshift.jira.rest.client.model.ProjectWithDataPolicy;
/**
 * Details about data policies for a list of projects.
 */
@Schema(description = "Details about data policies for a list of projects.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class ProjectDataPolicies {
  @SerializedName("projectDataPolicies")
  private List<ProjectWithDataPolicy> projectDataPolicies = null;

   /**
   * List of projects with data policies.
   * @return projectDataPolicies
  **/
  @Schema(description = "List of projects with data policies.")
  public List<ProjectWithDataPolicy> getProjectDataPolicies() {
    return projectDataPolicies;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectDataPolicies projectDataPolicies = (ProjectDataPolicies) o;
    return Objects.equals(this.projectDataPolicies, projectDataPolicies.projectDataPolicies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectDataPolicies);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectDataPolicies {\n");
    
    sb.append("    projectDataPolicies: ").append(toIndentedString(projectDataPolicies)).append("\n");
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
