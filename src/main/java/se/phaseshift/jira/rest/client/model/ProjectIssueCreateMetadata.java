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
import se.phaseshift.jira.rest.client.model.IssueTypeIssueCreateMetadata;
/**
 * Details of the issue creation metadata for a project.
 */
@Schema(description = "Details of the issue creation metadata for a project.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class ProjectIssueCreateMetadata {
  @SerializedName("avatarUrls")
  private AllOfProjectIssueCreateMetadataAvatarUrls avatarUrls = null;

  @SerializedName("expand")
  private String expand = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("issuetypes")
  private List<IssueTypeIssueCreateMetadata> issuetypes = null;

  @SerializedName("key")
  private String key = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("self")
  private String self = null;

   /**
   * List of the project&#x27;s avatars, returning the avatar size and associated URL.
   * @return avatarUrls
  **/
  @Schema(description = "List of the project's avatars, returning the avatar size and associated URL.")
  public AllOfProjectIssueCreateMetadataAvatarUrls getAvatarUrls() {
    return avatarUrls;
  }

   /**
   * Expand options that include additional project issue create metadata details in the response.
   * @return expand
  **/
  @Schema(description = "Expand options that include additional project issue create metadata details in the response.")
  public String getExpand() {
    return expand;
  }

   /**
   * The ID of the project.
   * @return id
  **/
  @Schema(description = "The ID of the project.")
  public String getId() {
    return id;
  }

   /**
   * List of the issue types supported by the project.
   * @return issuetypes
  **/
  @Schema(description = "List of the issue types supported by the project.")
  public List<IssueTypeIssueCreateMetadata> getIssuetypes() {
    return issuetypes;
  }

   /**
   * The key of the project.
   * @return key
  **/
  @Schema(description = "The key of the project.")
  public String getKey() {
    return key;
  }

   /**
   * The name of the project.
   * @return name
  **/
  @Schema(description = "The name of the project.")
  public String getName() {
    return name;
  }

   /**
   * The URL of the project.
   * @return self
  **/
  @Schema(description = "The URL of the project.")
  public String getSelf() {
    return self;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectIssueCreateMetadata projectIssueCreateMetadata = (ProjectIssueCreateMetadata) o;
    return Objects.equals(this.avatarUrls, projectIssueCreateMetadata.avatarUrls) &&
        Objects.equals(this.expand, projectIssueCreateMetadata.expand) &&
        Objects.equals(this.id, projectIssueCreateMetadata.id) &&
        Objects.equals(this.issuetypes, projectIssueCreateMetadata.issuetypes) &&
        Objects.equals(this.key, projectIssueCreateMetadata.key) &&
        Objects.equals(this.name, projectIssueCreateMetadata.name) &&
        Objects.equals(this.self, projectIssueCreateMetadata.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avatarUrls, expand, id, issuetypes, key, name, self);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectIssueCreateMetadata {\n");
    
    sb.append("    avatarUrls: ").append(toIndentedString(avatarUrls)).append("\n");
    sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    issuetypes: ").append(toIndentedString(issuetypes)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
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
