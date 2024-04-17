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
import se.phaseshift.jira.rest.client.model.OldToNewSecurityLevelMappingsBean;
/**
 * Issue security scheme, project, and remapping details.
 */
@Schema(description = "Issue security scheme, project, and remapping details.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class AssociateSecuritySchemeWithProjectDetails {
  @SerializedName("oldToNewSecurityLevelMappings")
  private List<OldToNewSecurityLevelMappingsBean> oldToNewSecurityLevelMappings = null;

  @SerializedName("projectId")
  private String projectId = null;

  @SerializedName("schemeId")
  private String schemeId = null;

  public AssociateSecuritySchemeWithProjectDetails oldToNewSecurityLevelMappings(List<OldToNewSecurityLevelMappingsBean> oldToNewSecurityLevelMappings) {
    this.oldToNewSecurityLevelMappings = oldToNewSecurityLevelMappings;
    return this;
  }

  public AssociateSecuritySchemeWithProjectDetails addOldToNewSecurityLevelMappingsItem(OldToNewSecurityLevelMappingsBean oldToNewSecurityLevelMappingsItem) {
    if (this.oldToNewSecurityLevelMappings == null) {
      this.oldToNewSecurityLevelMappings = new ArrayList<OldToNewSecurityLevelMappingsBean>();
    }
    this.oldToNewSecurityLevelMappings.add(oldToNewSecurityLevelMappingsItem);
    return this;
  }

   /**
   * The list of scheme levels which should be remapped to new levels of the issue security scheme.
   * @return oldToNewSecurityLevelMappings
  **/
  @Schema(description = "The list of scheme levels which should be remapped to new levels of the issue security scheme.")
  public List<OldToNewSecurityLevelMappingsBean> getOldToNewSecurityLevelMappings() {
    return oldToNewSecurityLevelMappings;
  }

  public void setOldToNewSecurityLevelMappings(List<OldToNewSecurityLevelMappingsBean> oldToNewSecurityLevelMappings) {
    this.oldToNewSecurityLevelMappings = oldToNewSecurityLevelMappings;
  }

  public AssociateSecuritySchemeWithProjectDetails projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

   /**
   * The ID of the project.
   * @return projectId
  **/
  @Schema(required = true, description = "The ID of the project.")
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public AssociateSecuritySchemeWithProjectDetails schemeId(String schemeId) {
    this.schemeId = schemeId;
    return this;
  }

   /**
   * The ID of the issue security scheme. Providing null will clear the association with the issue security scheme.
   * @return schemeId
  **/
  @Schema(required = true, description = "The ID of the issue security scheme. Providing null will clear the association with the issue security scheme.")
  public String getSchemeId() {
    return schemeId;
  }

  public void setSchemeId(String schemeId) {
    this.schemeId = schemeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssociateSecuritySchemeWithProjectDetails associateSecuritySchemeWithProjectDetails = (AssociateSecuritySchemeWithProjectDetails) o;
    return Objects.equals(this.oldToNewSecurityLevelMappings, associateSecuritySchemeWithProjectDetails.oldToNewSecurityLevelMappings) &&
        Objects.equals(this.projectId, associateSecuritySchemeWithProjectDetails.projectId) &&
        Objects.equals(this.schemeId, associateSecuritySchemeWithProjectDetails.schemeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oldToNewSecurityLevelMappings, projectId, schemeId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssociateSecuritySchemeWithProjectDetails {\n");
    
    sb.append("    oldToNewSecurityLevelMappings: ").append(toIndentedString(oldToNewSecurityLevelMappings)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    schemeId: ").append(toIndentedString(schemeId)).append("\n");
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