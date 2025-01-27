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
 * SharePermissionInputBean
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class SharePermissionInputBean {
  @SerializedName("accountId")
  private String accountId = null;

  @SerializedName("groupId")
  private String groupId = null;

  @SerializedName("groupname")
  private String groupname = null;

  @SerializedName("projectId")
  private String projectId = null;

  @SerializedName("projectRoleId")
  private String projectRoleId = null;

  @SerializedName("rights")
  private Integer rights = null;

  /**
   * The type of the share permission.Specify the type as follows:   *  &#x60;user&#x60; Share with a user.  *  &#x60;group&#x60; Share with a group. Specify &#x60;groupname&#x60; as well.  *  &#x60;project&#x60; Share with a project. Specify &#x60;projectId&#x60; as well.  *  &#x60;projectRole&#x60; Share with a project role in a project. Specify &#x60;projectId&#x60; and &#x60;projectRoleId&#x60; as well.  *  &#x60;global&#x60; Share globally, including anonymous users. If set, this type overrides all existing share permissions and must be deleted before any non-global share permissions is set.  *  &#x60;authenticated&#x60; Share with all logged-in users. This shows as &#x60;loggedin&#x60; in the response. If set, this type overrides all existing share permissions and must be deleted before any non-global share permissions is set.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    @SerializedName("user")
    USER("user"),
    @SerializedName("project")
    PROJECT("project"),
    @SerializedName("group")
    GROUP("group"),
    @SerializedName("projectRole")
    PROJECTROLE("projectRole"),
    @SerializedName("global")
    GLOBAL("global"),
    @SerializedName("authenticated")
    AUTHENTICATED("authenticated");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TypeEnum fromValue(String input) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return TypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("type")
  private TypeEnum type = null;

  public SharePermissionInputBean accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * The user account ID that the filter is shared with. For a request, specify the &#x60;accountId&#x60; property for the user.
   * @return accountId
  **/
  @Schema(description = "The user account ID that the filter is shared with. For a request, specify the `accountId` property for the user.")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public SharePermissionInputBean groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * The ID of the group, which uniquely identifies the group across all Atlassian products.For example, *952d12c3-5b5b-4d04-bb32-44d383afc4b2*. Cannot be provided with &#x60;groupname&#x60;.
   * @return groupId
  **/
  @Schema(description = "The ID of the group, which uniquely identifies the group across all Atlassian products.For example, *952d12c3-5b5b-4d04-bb32-44d383afc4b2*. Cannot be provided with `groupname`.")
  public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  public SharePermissionInputBean groupname(String groupname) {
    this.groupname = groupname;
    return this;
  }

   /**
   * The name of the group to share the filter with. Set &#x60;type&#x60; to &#x60;group&#x60;. Please note that the name of a group is mutable, to reliably identify a group use &#x60;groupId&#x60;.
   * @return groupname
  **/
  @Schema(description = "The name of the group to share the filter with. Set `type` to `group`. Please note that the name of a group is mutable, to reliably identify a group use `groupId`.")
  public String getGroupname() {
    return groupname;
  }

  public void setGroupname(String groupname) {
    this.groupname = groupname;
  }

  public SharePermissionInputBean projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

   /**
   * The ID of the project to share the filter with. Set &#x60;type&#x60; to &#x60;project&#x60;.
   * @return projectId
  **/
  @Schema(description = "The ID of the project to share the filter with. Set `type` to `project`.")
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public SharePermissionInputBean projectRoleId(String projectRoleId) {
    this.projectRoleId = projectRoleId;
    return this;
  }

   /**
   * The ID of the project role to share the filter with. Set &#x60;type&#x60; to &#x60;projectRole&#x60; and the &#x60;projectId&#x60; for the project that the role is in.
   * @return projectRoleId
  **/
  @Schema(description = "The ID of the project role to share the filter with. Set `type` to `projectRole` and the `projectId` for the project that the role is in.")
  public String getProjectRoleId() {
    return projectRoleId;
  }

  public void setProjectRoleId(String projectRoleId) {
    this.projectRoleId = projectRoleId;
  }

  public SharePermissionInputBean rights(Integer rights) {
    this.rights = rights;
    return this;
  }

   /**
   * The rights for the share permission.
   * @return rights
  **/
  @Schema(description = "The rights for the share permission.")
  public Integer getRights() {
    return rights;
  }

  public void setRights(Integer rights) {
    this.rights = rights;
  }

  public SharePermissionInputBean type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the share permission.Specify the type as follows:   *  &#x60;user&#x60; Share with a user.  *  &#x60;group&#x60; Share with a group. Specify &#x60;groupname&#x60; as well.  *  &#x60;project&#x60; Share with a project. Specify &#x60;projectId&#x60; as well.  *  &#x60;projectRole&#x60; Share with a project role in a project. Specify &#x60;projectId&#x60; and &#x60;projectRoleId&#x60; as well.  *  &#x60;global&#x60; Share globally, including anonymous users. If set, this type overrides all existing share permissions and must be deleted before any non-global share permissions is set.  *  &#x60;authenticated&#x60; Share with all logged-in users. This shows as &#x60;loggedin&#x60; in the response. If set, this type overrides all existing share permissions and must be deleted before any non-global share permissions is set.
   * @return type
  **/
  @Schema(required = true, description = "The type of the share permission.Specify the type as follows:   *  `user` Share with a user.  *  `group` Share with a group. Specify `groupname` as well.  *  `project` Share with a project. Specify `projectId` as well.  *  `projectRole` Share with a project role in a project. Specify `projectId` and `projectRoleId` as well.  *  `global` Share globally, including anonymous users. If set, this type overrides all existing share permissions and must be deleted before any non-global share permissions is set.  *  `authenticated` Share with all logged-in users. This shows as `loggedin` in the response. If set, this type overrides all existing share permissions and must be deleted before any non-global share permissions is set.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharePermissionInputBean sharePermissionInputBean = (SharePermissionInputBean) o;
    return Objects.equals(this.accountId, sharePermissionInputBean.accountId) &&
        Objects.equals(this.groupId, sharePermissionInputBean.groupId) &&
        Objects.equals(this.groupname, sharePermissionInputBean.groupname) &&
        Objects.equals(this.projectId, sharePermissionInputBean.projectId) &&
        Objects.equals(this.projectRoleId, sharePermissionInputBean.projectRoleId) &&
        Objects.equals(this.rights, sharePermissionInputBean.rights) &&
        Objects.equals(this.type, sharePermissionInputBean.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, groupId, groupname, projectId, projectRoleId, rights, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SharePermissionInputBean {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    groupname: ").append(toIndentedString(groupname)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    projectRoleId: ").append(toIndentedString(projectRoleId)).append("\n");
    sb.append("    rights: ").append(toIndentedString(rights)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
