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
 * Details of the group associated with the role.
 */
@Schema(description = "Details of the group associated with the role.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class ProjectRoleGroup {
  @SerializedName("displayName")
  private String displayName = null;

  @SerializedName("groupId")
  private String groupId = null;

  @SerializedName("name")
  private String name = null;

  public ProjectRoleGroup displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * The display name of the group.
   * @return displayName
  **/
  @Schema(description = "The display name of the group.")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public ProjectRoleGroup groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * The ID of the group.
   * @return groupId
  **/
  @Schema(description = "The ID of the group.")
  public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  public ProjectRoleGroup name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the group. As a group&#x27;s name can change, use of &#x60;groupId&#x60; is recommended to identify the group.
   * @return name
  **/
  @Schema(description = "The name of the group. As a group's name can change, use of `groupId` is recommended to identify the group.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectRoleGroup projectRoleGroup = (ProjectRoleGroup) o;
    return Objects.equals(this.displayName, projectRoleGroup.displayName) &&
        Objects.equals(this.groupId, projectRoleGroup.groupId) &&
        Objects.equals(this.name, projectRoleGroup.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, groupId, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectRoleGroup {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
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
