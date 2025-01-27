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
import java.util.UUID;
import se.phaseshift.jira.rest.client.model.IssueTypeInfo;
/**
 * Details of an issue type hierarchy level.
 */
@Schema(description = "Details of an issue type hierarchy level.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class ProjectIssueTypesHierarchyLevel {
  @SerializedName("entityId")
  private UUID entityId = null;

  @SerializedName("issueTypes")
  private List<IssueTypeInfo> issueTypes = null;

  @SerializedName("level")
  private Integer level = null;

  @SerializedName("name")
  private String name = null;

   /**
   * The ID of the issue type hierarchy level. This property is deprecated, see [Change notice: Removing hierarchy level IDs from next-gen APIs](https://developer.atlassian.com/cloud/jira/platform/change-notice-removing-hierarchy-level-ids-from-next-gen-apis/).
   * @return entityId
  **/
  @Schema(description = "The ID of the issue type hierarchy level. This property is deprecated, see [Change notice: Removing hierarchy level IDs from next-gen APIs](https://developer.atlassian.com/cloud/jira/platform/change-notice-removing-hierarchy-level-ids-from-next-gen-apis/).")
  public UUID getEntityId() {
    return entityId;
  }

   /**
   * The list of issue types in the hierarchy level.
   * @return issueTypes
  **/
  @Schema(description = "The list of issue types in the hierarchy level.")
  public List<IssueTypeInfo> getIssueTypes() {
    return issueTypes;
  }

   /**
   * The level of the issue type hierarchy level.
   * @return level
  **/
  @Schema(description = "The level of the issue type hierarchy level.")
  public Integer getLevel() {
    return level;
  }

   /**
   * The name of the issue type hierarchy level.
   * @return name
  **/
  @Schema(description = "The name of the issue type hierarchy level.")
  public String getName() {
    return name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectIssueTypesHierarchyLevel projectIssueTypesHierarchyLevel = (ProjectIssueTypesHierarchyLevel) o;
    return Objects.equals(this.entityId, projectIssueTypesHierarchyLevel.entityId) &&
        Objects.equals(this.issueTypes, projectIssueTypesHierarchyLevel.issueTypes) &&
        Objects.equals(this.level, projectIssueTypesHierarchyLevel.level) &&
        Objects.equals(this.name, projectIssueTypesHierarchyLevel.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityId, issueTypes, level, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectIssueTypesHierarchyLevel {\n");
    
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    issueTypes: ").append(toIndentedString(issueTypes)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
