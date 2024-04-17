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
import se.phaseshift.jira.rest.client.model.SharePermission;
/**
 * Details for permissions of shareable entities
 */
@Schema(description = "Details for permissions of shareable entities")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class PermissionDetails {
  @SerializedName("editPermissions")
  private List<SharePermission> editPermissions = new ArrayList<SharePermission>();

  @SerializedName("sharePermissions")
  private List<SharePermission> sharePermissions = new ArrayList<SharePermission>();

  public PermissionDetails editPermissions(List<SharePermission> editPermissions) {
    this.editPermissions = editPermissions;
    return this;
  }

  public PermissionDetails addEditPermissionsItem(SharePermission editPermissionsItem) {
    this.editPermissions.add(editPermissionsItem);
    return this;
  }

   /**
   * The edit permissions for the shareable entities.
   * @return editPermissions
  **/
  @Schema(required = true, description = "The edit permissions for the shareable entities.")
  public List<SharePermission> getEditPermissions() {
    return editPermissions;
  }

  public void setEditPermissions(List<SharePermission> editPermissions) {
    this.editPermissions = editPermissions;
  }

  public PermissionDetails sharePermissions(List<SharePermission> sharePermissions) {
    this.sharePermissions = sharePermissions;
    return this;
  }

  public PermissionDetails addSharePermissionsItem(SharePermission sharePermissionsItem) {
    this.sharePermissions.add(sharePermissionsItem);
    return this;
  }

   /**
   * The share permissions for the shareable entities.
   * @return sharePermissions
  **/
  @Schema(required = true, description = "The share permissions for the shareable entities.")
  public List<SharePermission> getSharePermissions() {
    return sharePermissions;
  }

  public void setSharePermissions(List<SharePermission> sharePermissions) {
    this.sharePermissions = sharePermissions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PermissionDetails permissionDetails = (PermissionDetails) o;
    return Objects.equals(this.editPermissions, permissionDetails.editPermissions) &&
        Objects.equals(this.sharePermissions, permissionDetails.sharePermissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(editPermissions, sharePermissions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionDetails {\n");
    
    sb.append("    editPermissions: ").append(toIndentedString(editPermissions)).append("\n");
    sb.append("    sharePermissions: ").append(toIndentedString(sharePermissions)).append("\n");
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
