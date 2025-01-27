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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Details of an avatar.
 */
@Schema(description = "Details of an avatar.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class Avatar extends HashMap<String, Object> {
  @SerializedName("fileName")
  private String fileName = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("isDeletable")
  private Boolean isDeletable = null;

  @SerializedName("isSelected")
  private Boolean isSelected = null;

  @SerializedName("isSystemAvatar")
  private Boolean isSystemAvatar = null;

  @SerializedName("owner")
  private String owner = null;

  @SerializedName("urls")
  private Map<String, String> urls = null;

   /**
   * The file name of the avatar icon. Returned for system avatars.
   * @return fileName
  **/
  @Schema(description = "The file name of the avatar icon. Returned for system avatars.")
  public String getFileName() {
    return fileName;
  }

  public Avatar id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the avatar.
   * @return id
  **/
  @Schema(required = true, description = "The ID of the avatar.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

   /**
   * Whether the avatar can be deleted.
   * @return isDeletable
  **/
  @Schema(description = "Whether the avatar can be deleted.")
  public Boolean isIsDeletable() {
    return isDeletable;
  }

   /**
   * Whether the avatar is used in Jira. For example, shown as a project&#x27;s avatar.
   * @return isSelected
  **/
  @Schema(description = "Whether the avatar is used in Jira. For example, shown as a project's avatar.")
  public Boolean isIsSelected() {
    return isSelected;
  }

   /**
   * Whether the avatar is a system avatar.
   * @return isSystemAvatar
  **/
  @Schema(description = "Whether the avatar is a system avatar.")
  public Boolean isIsSystemAvatar() {
    return isSystemAvatar;
  }

   /**
   * The owner of the avatar. For a system avatar the owner is null (and nothing is returned). For non-system avatars this is the appropriate identifier, such as the ID for a project or the account ID for a user.
   * @return owner
  **/
  @Schema(description = "The owner of the avatar. For a system avatar the owner is null (and nothing is returned). For non-system avatars this is the appropriate identifier, such as the ID for a project or the account ID for a user.")
  public String getOwner() {
    return owner;
  }

   /**
   * The list of avatar icon URLs.
   * @return urls
  **/
  @Schema(description = "The list of avatar icon URLs.")
  public Map<String, String> getUrls() {
    return urls;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Avatar avatar = (Avatar) o;
    return Objects.equals(this.fileName, avatar.fileName) &&
        Objects.equals(this.id, avatar.id) &&
        Objects.equals(this.isDeletable, avatar.isDeletable) &&
        Objects.equals(this.isSelected, avatar.isSelected) &&
        Objects.equals(this.isSystemAvatar, avatar.isSystemAvatar) &&
        Objects.equals(this.owner, avatar.owner) &&
        Objects.equals(this.urls, avatar.urls) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileName, id, isDeletable, isSelected, isSystemAvatar, owner, urls, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Avatar {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isDeletable: ").append(toIndentedString(isDeletable)).append("\n");
    sb.append("    isSelected: ").append(toIndentedString(isSelected)).append("\n");
    sb.append("    isSystemAvatar: ").append(toIndentedString(isSystemAvatar)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
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
