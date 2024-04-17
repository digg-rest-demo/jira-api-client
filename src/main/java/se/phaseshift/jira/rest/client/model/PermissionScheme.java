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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import se.phaseshift.jira.rest.client.model.PermissionGrant;
/**
 * Details of a permission scheme.
 */
@Schema(description = "Details of a permission scheme.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class PermissionScheme extends HashMap<String, Object> {
  @SerializedName("description")
  private String description = null;

  @SerializedName("expand")
  private String expand = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("permissions")
  private List<PermissionGrant> permissions = null;

  @SerializedName("scope")
  private AllOfPermissionSchemeScope scope = null;

  @SerializedName("self")
  private String self = null;

  public PermissionScheme description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A description for the permission scheme.
   * @return description
  **/
  @Schema(description = "A description for the permission scheme.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

   /**
   * The expand options available for the permission scheme.
   * @return expand
  **/
  @Schema(description = "The expand options available for the permission scheme.")
  public String getExpand() {
    return expand;
  }

   /**
   * The ID of the permission scheme.
   * @return id
  **/
  @Schema(description = "The ID of the permission scheme.")
  public Long getId() {
    return id;
  }

  public PermissionScheme name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the permission scheme. Must be unique.
   * @return name
  **/
  @Schema(required = true, description = "The name of the permission scheme. Must be unique.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PermissionScheme permissions(List<PermissionGrant> permissions) {
    this.permissions = permissions;
    return this;
  }

  public PermissionScheme addPermissionsItem(PermissionGrant permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<PermissionGrant>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

   /**
   * The permission scheme to create or update. See [About permission schemes and grants](../api-group-permission-schemes/#about-permission-schemes-and-grants) for more information.
   * @return permissions
  **/
  @Schema(description = "The permission scheme to create or update. See [About permission schemes and grants](../api-group-permission-schemes/#about-permission-schemes-and-grants) for more information.")
  public List<PermissionGrant> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<PermissionGrant> permissions) {
    this.permissions = permissions;
  }

  public PermissionScheme scope(AllOfPermissionSchemeScope scope) {
    this.scope = scope;
    return this;
  }

   /**
   * The scope of the permission scheme.
   * @return scope
  **/
  @Schema(description = "The scope of the permission scheme.")
  public AllOfPermissionSchemeScope getScope() {
    return scope;
  }

  public void setScope(AllOfPermissionSchemeScope scope) {
    this.scope = scope;
  }

   /**
   * The URL of the permission scheme.
   * @return self
  **/
  @Schema(description = "The URL of the permission scheme.")
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
    PermissionScheme permissionScheme = (PermissionScheme) o;
    return Objects.equals(this.description, permissionScheme.description) &&
        Objects.equals(this.expand, permissionScheme.expand) &&
        Objects.equals(this.id, permissionScheme.id) &&
        Objects.equals(this.name, permissionScheme.name) &&
        Objects.equals(this.permissions, permissionScheme.permissions) &&
        Objects.equals(this.scope, permissionScheme.scope) &&
        Objects.equals(this.self, permissionScheme.self) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, expand, id, name, permissions, scope, self, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionScheme {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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