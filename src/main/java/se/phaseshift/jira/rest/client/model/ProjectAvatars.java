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
import se.phaseshift.jira.rest.client.model.Avatar;
/**
 * List of project avatars.
 */
@Schema(description = "List of project avatars.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class ProjectAvatars {
  @SerializedName("custom")
  private List<Avatar> custom = null;

  @SerializedName("system")
  private List<Avatar> system = null;

   /**
   * List of avatars added to Jira. These avatars may be deleted.
   * @return custom
  **/
  @Schema(description = "List of avatars added to Jira. These avatars may be deleted.")
  public List<Avatar> getCustom() {
    return custom;
  }

   /**
   * List of avatars included with Jira. These avatars cannot be deleted.
   * @return system
  **/
  @Schema(description = "List of avatars included with Jira. These avatars cannot be deleted.")
  public List<Avatar> getSystem() {
    return system;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectAvatars projectAvatars = (ProjectAvatars) o;
    return Objects.equals(this.custom, projectAvatars.custom) &&
        Objects.equals(this.system, projectAvatars.system);
  }

  @Override
  public int hashCode() {
    return Objects.hash(custom, system);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectAvatars {\n");
    
    sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
    sb.append("    system: ").append(toIndentedString(system)).append("\n");
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
