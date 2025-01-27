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
 * Details about the project.
 */
@Schema(description = "Details about the project.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class UpdateProjectDetails {
  /**
   * The default assignee when creating issues for this project.
   */
  @JsonAdapter(AssigneeTypeEnum.Adapter.class)
  public enum AssigneeTypeEnum {
    @SerializedName("PROJECT_LEAD")
    PROJECT_LEAD("PROJECT_LEAD"),
    @SerializedName("UNASSIGNED")
    UNASSIGNED("UNASSIGNED");

    private String value;

    AssigneeTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static AssigneeTypeEnum fromValue(String input) {
      for (AssigneeTypeEnum b : AssigneeTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<AssigneeTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AssigneeTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public AssigneeTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return AssigneeTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("assigneeType")
  private AssigneeTypeEnum assigneeType = null;

  @SerializedName("avatarId")
  private Long avatarId = null;

  @SerializedName("categoryId")
  private Long categoryId = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("issueSecurityScheme")
  private Long issueSecurityScheme = null;

  @SerializedName("key")
  private String key = null;

  @SerializedName("lead")
  private String lead = null;

  @SerializedName("leadAccountId")
  private String leadAccountId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("notificationScheme")
  private Long notificationScheme = null;

  @SerializedName("permissionScheme")
  private Long permissionScheme = null;

  @SerializedName("url")
  private String url = null;

  public UpdateProjectDetails assigneeType(AssigneeTypeEnum assigneeType) {
    this.assigneeType = assigneeType;
    return this;
  }

   /**
   * The default assignee when creating issues for this project.
   * @return assigneeType
  **/
  @Schema(description = "The default assignee when creating issues for this project.")
  public AssigneeTypeEnum getAssigneeType() {
    return assigneeType;
  }

  public void setAssigneeType(AssigneeTypeEnum assigneeType) {
    this.assigneeType = assigneeType;
  }

  public UpdateProjectDetails avatarId(Long avatarId) {
    this.avatarId = avatarId;
    return this;
  }

   /**
   * An integer value for the project&#x27;s avatar.
   * @return avatarId
  **/
  @Schema(description = "An integer value for the project's avatar.")
  public Long getAvatarId() {
    return avatarId;
  }

  public void setAvatarId(Long avatarId) {
    this.avatarId = avatarId;
  }

  public UpdateProjectDetails categoryId(Long categoryId) {
    this.categoryId = categoryId;
    return this;
  }

   /**
   * The ID of the project&#x27;s category. A complete list of category IDs is found using the [Get all project categories](#api-rest-api-3-projectCategory-get) operation. To remove the project category from the project, set the value to &#x60;-1.&#x60;
   * @return categoryId
  **/
  @Schema(description = "The ID of the project's category. A complete list of category IDs is found using the [Get all project categories](#api-rest-api-3-projectCategory-get) operation. To remove the project category from the project, set the value to `-1.`")
  public Long getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
  }

  public UpdateProjectDetails description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A brief description of the project.
   * @return description
  **/
  @Schema(description = "A brief description of the project.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public UpdateProjectDetails issueSecurityScheme(Long issueSecurityScheme) {
    this.issueSecurityScheme = issueSecurityScheme;
    return this;
  }

   /**
   * The ID of the issue security scheme for the project, which enables you to control who can and cannot view issues. Use the [Get issue security schemes](#api-rest-api-3-issuesecurityschemes-get) resource to get all issue security scheme IDs.
   * @return issueSecurityScheme
  **/
  @Schema(description = "The ID of the issue security scheme for the project, which enables you to control who can and cannot view issues. Use the [Get issue security schemes](#api-rest-api-3-issuesecurityschemes-get) resource to get all issue security scheme IDs.")
  public Long getIssueSecurityScheme() {
    return issueSecurityScheme;
  }

  public void setIssueSecurityScheme(Long issueSecurityScheme) {
    this.issueSecurityScheme = issueSecurityScheme;
  }

  public UpdateProjectDetails key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Project keys must be unique and start with an uppercase letter followed by one or more uppercase alphanumeric characters. The maximum length is 10 characters.
   * @return key
  **/
  @Schema(description = "Project keys must be unique and start with an uppercase letter followed by one or more uppercase alphanumeric characters. The maximum length is 10 characters.")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public UpdateProjectDetails lead(String lead) {
    this.lead = lead;
    return this;
  }

   /**
   * This parameter is deprecated because of privacy changes. Use &#x60;leadAccountId&#x60; instead. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. The user name of the project lead. Cannot be provided with &#x60;leadAccountId&#x60;.
   * @return lead
  **/
  @Schema(description = "This parameter is deprecated because of privacy changes. Use `leadAccountId` instead. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. The user name of the project lead. Cannot be provided with `leadAccountId`.")
  public String getLead() {
    return lead;
  }

  public void setLead(String lead) {
    this.lead = lead;
  }

  public UpdateProjectDetails leadAccountId(String leadAccountId) {
    this.leadAccountId = leadAccountId;
    return this;
  }

   /**
   * The account ID of the project lead. Cannot be provided with &#x60;lead&#x60;.
   * @return leadAccountId
  **/
  @Schema(description = "The account ID of the project lead. Cannot be provided with `lead`.")
  public String getLeadAccountId() {
    return leadAccountId;
  }

  public void setLeadAccountId(String leadAccountId) {
    this.leadAccountId = leadAccountId;
  }

  public UpdateProjectDetails name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the project.
   * @return name
  **/
  @Schema(description = "The name of the project.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UpdateProjectDetails notificationScheme(Long notificationScheme) {
    this.notificationScheme = notificationScheme;
    return this;
  }

   /**
   * The ID of the notification scheme for the project. Use the [Get notification schemes](#api-rest-api-3-notificationscheme-get) resource to get a list of notification scheme IDs.
   * @return notificationScheme
  **/
  @Schema(description = "The ID of the notification scheme for the project. Use the [Get notification schemes](#api-rest-api-3-notificationscheme-get) resource to get a list of notification scheme IDs.")
  public Long getNotificationScheme() {
    return notificationScheme;
  }

  public void setNotificationScheme(Long notificationScheme) {
    this.notificationScheme = notificationScheme;
  }

  public UpdateProjectDetails permissionScheme(Long permissionScheme) {
    this.permissionScheme = permissionScheme;
    return this;
  }

   /**
   * The ID of the permission scheme for the project. Use the [Get all permission schemes](#api-rest-api-3-permissionscheme-get) resource to see a list of all permission scheme IDs.
   * @return permissionScheme
  **/
  @Schema(description = "The ID of the permission scheme for the project. Use the [Get all permission schemes](#api-rest-api-3-permissionscheme-get) resource to see a list of all permission scheme IDs.")
  public Long getPermissionScheme() {
    return permissionScheme;
  }

  public void setPermissionScheme(Long permissionScheme) {
    this.permissionScheme = permissionScheme;
  }

  public UpdateProjectDetails url(String url) {
    this.url = url;
    return this;
  }

   /**
   * A link to information about this project, such as project documentation
   * @return url
  **/
  @Schema(description = "A link to information about this project, such as project documentation")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateProjectDetails updateProjectDetails = (UpdateProjectDetails) o;
    return Objects.equals(this.assigneeType, updateProjectDetails.assigneeType) &&
        Objects.equals(this.avatarId, updateProjectDetails.avatarId) &&
        Objects.equals(this.categoryId, updateProjectDetails.categoryId) &&
        Objects.equals(this.description, updateProjectDetails.description) &&
        Objects.equals(this.issueSecurityScheme, updateProjectDetails.issueSecurityScheme) &&
        Objects.equals(this.key, updateProjectDetails.key) &&
        Objects.equals(this.lead, updateProjectDetails.lead) &&
        Objects.equals(this.leadAccountId, updateProjectDetails.leadAccountId) &&
        Objects.equals(this.name, updateProjectDetails.name) &&
        Objects.equals(this.notificationScheme, updateProjectDetails.notificationScheme) &&
        Objects.equals(this.permissionScheme, updateProjectDetails.permissionScheme) &&
        Objects.equals(this.url, updateProjectDetails.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assigneeType, avatarId, categoryId, description, issueSecurityScheme, key, lead, leadAccountId, name, notificationScheme, permissionScheme, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateProjectDetails {\n");
    
    sb.append("    assigneeType: ").append(toIndentedString(assigneeType)).append("\n");
    sb.append("    avatarId: ").append(toIndentedString(avatarId)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    issueSecurityScheme: ").append(toIndentedString(issueSecurityScheme)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    lead: ").append(toIndentedString(lead)).append("\n");
    sb.append("    leadAccountId: ").append(toIndentedString(leadAccountId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    notificationScheme: ").append(toIndentedString(notificationScheme)).append("\n");
    sb.append("    permissionScheme: ").append(toIndentedString(permissionScheme)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
