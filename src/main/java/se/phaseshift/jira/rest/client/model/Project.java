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
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;
import se.phaseshift.jira.rest.client.model.IssueTypeDetails;
import se.phaseshift.jira.rest.client.model.ProjectComponent;
import se.phaseshift.jira.rest.client.model.Version;
/**
 * Details about a project.
 */
@Schema(description = "Details about a project.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class Project {
  @SerializedName("archived")
  private Boolean archived = null;

  @SerializedName("archivedBy")
  private AllOfProjectArchivedBy archivedBy = null;

  @SerializedName("archivedDate")
  private OffsetDateTime archivedDate = null;

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

  @SerializedName("avatarUrls")
  private AllOfProjectAvatarUrls avatarUrls = null;

  @SerializedName("components")
  private List<ProjectComponent> components = null;

  @SerializedName("deleted")
  private Boolean deleted = null;

  @SerializedName("deletedBy")
  private AllOfProjectDeletedBy deletedBy = null;

  @SerializedName("deletedDate")
  private OffsetDateTime deletedDate = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("expand")
  private String expand = null;

  @SerializedName("favourite")
  private Boolean favourite = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("insight")
  private AllOfProjectInsight insight = null;

  @SerializedName("isPrivate")
  private Boolean isPrivate = null;

  @SerializedName("issueTypeHierarchy")
  private AllOfProjectIssueTypeHierarchy issueTypeHierarchy = null;

  @SerializedName("issueTypes")
  private List<IssueTypeDetails> issueTypes = null;

  @SerializedName("key")
  private String key = null;

  @SerializedName("landingPageInfo")
  private AllOfProjectLandingPageInfo landingPageInfo = null;

  @SerializedName("lead")
  private AllOfProjectLead lead = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("permissions")
  private AllOfProjectPermissions permissions = null;

  @SerializedName("projectCategory")
  private AllOfProjectProjectCategory projectCategory = null;

  /**
   * The [project type](https://confluence.atlassian.com/x/GwiiLQ#Jiraapplicationsoverview-Productfeaturesandprojecttypes) of the project.
   */
  @JsonAdapter(ProjectTypeKeyEnum.Adapter.class)
  public enum ProjectTypeKeyEnum {
    @SerializedName("software")
    SOFTWARE("software"),
    @SerializedName("service_desk")
    SERVICE_DESK("service_desk"),
    @SerializedName("business")
    BUSINESS("business");

    private String value;

    ProjectTypeKeyEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ProjectTypeKeyEnum fromValue(String input) {
      for (ProjectTypeKeyEnum b : ProjectTypeKeyEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ProjectTypeKeyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ProjectTypeKeyEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ProjectTypeKeyEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ProjectTypeKeyEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("projectTypeKey")
  private ProjectTypeKeyEnum projectTypeKey = null;

  @SerializedName("properties")
  private Map<String, Object> properties = null;

  @SerializedName("retentionTillDate")
  private OffsetDateTime retentionTillDate = null;

  @SerializedName("roles")
  private Map<String, String> roles = null;

  @SerializedName("self")
  private String self = null;

  @SerializedName("simplified")
  private Boolean simplified = null;

  /**
   * The type of the project.
   */
  @JsonAdapter(StyleEnum.Adapter.class)
  public enum StyleEnum {
    @SerializedName("classic")
    CLASSIC("classic"),
    @SerializedName("next-gen")
    NEXT_GEN("next-gen");

    private String value;

    StyleEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static StyleEnum fromValue(String input) {
      for (StyleEnum b : StyleEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<StyleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StyleEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public StyleEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return StyleEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("style")
  private StyleEnum style = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("uuid")
  private UUID uuid = null;

  @SerializedName("versions")
  private List<Version> versions = null;

   /**
   * Whether the project is archived.
   * @return archived
  **/
  @Schema(description = "Whether the project is archived.")
  public Boolean isArchived() {
    return archived;
  }

   /**
   * The user who archived the project.
   * @return archivedBy
  **/
  @Schema(description = "The user who archived the project.")
  public AllOfProjectArchivedBy getArchivedBy() {
    return archivedBy;
  }

   /**
   * The date when the project was archived.
   * @return archivedDate
  **/
  @Schema(description = "The date when the project was archived.")
  public OffsetDateTime getArchivedDate() {
    return archivedDate;
  }

   /**
   * The default assignee when creating issues for this project.
   * @return assigneeType
  **/
  @Schema(description = "The default assignee when creating issues for this project.")
  public AssigneeTypeEnum getAssigneeType() {
    return assigneeType;
  }

   /**
   * The URLs of the project&#x27;s avatars.
   * @return avatarUrls
  **/
  @Schema(description = "The URLs of the project's avatars.")
  public AllOfProjectAvatarUrls getAvatarUrls() {
    return avatarUrls;
  }

   /**
   * List of the components contained in the project.
   * @return components
  **/
  @Schema(description = "List of the components contained in the project.")
  public List<ProjectComponent> getComponents() {
    return components;
  }

   /**
   * Whether the project is marked as deleted.
   * @return deleted
  **/
  @Schema(description = "Whether the project is marked as deleted.")
  public Boolean isDeleted() {
    return deleted;
  }

   /**
   * The user who marked the project as deleted.
   * @return deletedBy
  **/
  @Schema(description = "The user who marked the project as deleted.")
  public AllOfProjectDeletedBy getDeletedBy() {
    return deletedBy;
  }

   /**
   * The date when the project was marked as deleted.
   * @return deletedDate
  **/
  @Schema(description = "The date when the project was marked as deleted.")
  public OffsetDateTime getDeletedDate() {
    return deletedDate;
  }

   /**
   * A brief description of the project.
   * @return description
  **/
  @Schema(description = "A brief description of the project.")
  public String getDescription() {
    return description;
  }

  public Project email(String email) {
    this.email = email;
    return this;
  }

   /**
   * An email address associated with the project.
   * @return email
  **/
  @Schema(description = "An email address associated with the project.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

   /**
   * Expand options that include additional project details in the response.
   * @return expand
  **/
  @Schema(description = "Expand options that include additional project details in the response.")
  public String getExpand() {
    return expand;
  }

  public Project favourite(Boolean favourite) {
    this.favourite = favourite;
    return this;
  }

   /**
   * Whether the project is selected as a favorite.
   * @return favourite
  **/
  @Schema(description = "Whether the project is selected as a favorite.")
  public Boolean isFavourite() {
    return favourite;
  }

  public void setFavourite(Boolean favourite) {
    this.favourite = favourite;
  }

  public Project id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the project.
   * @return id
  **/
  @Schema(description = "The ID of the project.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

   /**
   * Insights about the project.
   * @return insight
  **/
  @Schema(description = "Insights about the project.")
  public AllOfProjectInsight getInsight() {
    return insight;
  }

   /**
   * Whether the project is private from the user&#x27;s perspective. This means the user can&#x27;t see the project or any associated issues.
   * @return isPrivate
  **/
  @Schema(description = "Whether the project is private from the user's perspective. This means the user can't see the project or any associated issues.")
  public Boolean isIsPrivate() {
    return isPrivate;
  }

   /**
   * The issue type hierarchy for the project.
   * @return issueTypeHierarchy
  **/
  @Schema(description = "The issue type hierarchy for the project.")
  public AllOfProjectIssueTypeHierarchy getIssueTypeHierarchy() {
    return issueTypeHierarchy;
  }

   /**
   * List of the issue types available in the project.
   * @return issueTypes
  **/
  @Schema(description = "List of the issue types available in the project.")
  public List<IssueTypeDetails> getIssueTypes() {
    return issueTypes;
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
   * The project landing page info.
   * @return landingPageInfo
  **/
  @Schema(description = "The project landing page info.")
  public AllOfProjectLandingPageInfo getLandingPageInfo() {
    return landingPageInfo;
  }

   /**
   * The username of the project lead.
   * @return lead
  **/
  @Schema(description = "The username of the project lead.")
  public AllOfProjectLead getLead() {
    return lead;
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
   * User permissions on the project
   * @return permissions
  **/
  @Schema(description = "User permissions on the project")
  public AllOfProjectPermissions getPermissions() {
    return permissions;
  }

   /**
   * The category the project belongs to.
   * @return projectCategory
  **/
  @Schema(description = "The category the project belongs to.")
  public AllOfProjectProjectCategory getProjectCategory() {
    return projectCategory;
  }

   /**
   * The [project type](https://confluence.atlassian.com/x/GwiiLQ#Jiraapplicationsoverview-Productfeaturesandprojecttypes) of the project.
   * @return projectTypeKey
  **/
  @Schema(description = "The [project type](https://confluence.atlassian.com/x/GwiiLQ#Jiraapplicationsoverview-Productfeaturesandprojecttypes) of the project.")
  public ProjectTypeKeyEnum getProjectTypeKey() {
    return projectTypeKey;
  }

   /**
   * Map of project properties
   * @return properties
  **/
  @Schema(description = "Map of project properties")
  public Map<String, Object> getProperties() {
    return properties;
  }

   /**
   * The date when the project is deleted permanently.
   * @return retentionTillDate
  **/
  @Schema(description = "The date when the project is deleted permanently.")
  public OffsetDateTime getRetentionTillDate() {
    return retentionTillDate;
  }

   /**
   * The name and self URL for each role defined in the project. For more information, see [Create project role](#api-rest-api-3-role-post).
   * @return roles
  **/
  @Schema(description = "The name and self URL for each role defined in the project. For more information, see [Create project role](#api-rest-api-3-role-post).")
  public Map<String, String> getRoles() {
    return roles;
  }

   /**
   * The URL of the project details.
   * @return self
  **/
  @Schema(description = "The URL of the project details.")
  public String getSelf() {
    return self;
  }

   /**
   * Whether the project is simplified.
   * @return simplified
  **/
  @Schema(description = "Whether the project is simplified.")
  public Boolean isSimplified() {
    return simplified;
  }

   /**
   * The type of the project.
   * @return style
  **/
  @Schema(description = "The type of the project.")
  public StyleEnum getStyle() {
    return style;
  }

   /**
   * A link to information about this project, such as project documentation.
   * @return url
  **/
  @Schema(description = "A link to information about this project, such as project documentation.")
  public String getUrl() {
    return url;
  }

   /**
   * Unique ID for next-gen projects.
   * @return uuid
  **/
  @Schema(description = "Unique ID for next-gen projects.")
  public UUID getUuid() {
    return uuid;
  }

   /**
   * The versions defined in the project. For more information, see [Create version](#api-rest-api-3-version-post).
   * @return versions
  **/
  @Schema(description = "The versions defined in the project. For more information, see [Create version](#api-rest-api-3-version-post).")
  public List<Version> getVersions() {
    return versions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Project project = (Project) o;
    return Objects.equals(this.archived, project.archived) &&
        Objects.equals(this.archivedBy, project.archivedBy) &&
        Objects.equals(this.archivedDate, project.archivedDate) &&
        Objects.equals(this.assigneeType, project.assigneeType) &&
        Objects.equals(this.avatarUrls, project.avatarUrls) &&
        Objects.equals(this.components, project.components) &&
        Objects.equals(this.deleted, project.deleted) &&
        Objects.equals(this.deletedBy, project.deletedBy) &&
        Objects.equals(this.deletedDate, project.deletedDate) &&
        Objects.equals(this.description, project.description) &&
        Objects.equals(this.email, project.email) &&
        Objects.equals(this.expand, project.expand) &&
        Objects.equals(this.favourite, project.favourite) &&
        Objects.equals(this.id, project.id) &&
        Objects.equals(this.insight, project.insight) &&
        Objects.equals(this.isPrivate, project.isPrivate) &&
        Objects.equals(this.issueTypeHierarchy, project.issueTypeHierarchy) &&
        Objects.equals(this.issueTypes, project.issueTypes) &&
        Objects.equals(this.key, project.key) &&
        Objects.equals(this.landingPageInfo, project.landingPageInfo) &&
        Objects.equals(this.lead, project.lead) &&
        Objects.equals(this.name, project.name) &&
        Objects.equals(this.permissions, project.permissions) &&
        Objects.equals(this.projectCategory, project.projectCategory) &&
        Objects.equals(this.projectTypeKey, project.projectTypeKey) &&
        Objects.equals(this.properties, project.properties) &&
        Objects.equals(this.retentionTillDate, project.retentionTillDate) &&
        Objects.equals(this.roles, project.roles) &&
        Objects.equals(this.self, project.self) &&
        Objects.equals(this.simplified, project.simplified) &&
        Objects.equals(this.style, project.style) &&
        Objects.equals(this.url, project.url) &&
        Objects.equals(this.uuid, project.uuid) &&
        Objects.equals(this.versions, project.versions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(archived, archivedBy, archivedDate, assigneeType, avatarUrls, components, deleted, deletedBy, deletedDate, description, email, expand, favourite, id, insight, isPrivate, issueTypeHierarchy, issueTypes, key, landingPageInfo, lead, name, permissions, projectCategory, projectTypeKey, properties, retentionTillDate, roles, self, simplified, style, url, uuid, versions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Project {\n");
    
    sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
    sb.append("    archivedBy: ").append(toIndentedString(archivedBy)).append("\n");
    sb.append("    archivedDate: ").append(toIndentedString(archivedDate)).append("\n");
    sb.append("    assigneeType: ").append(toIndentedString(assigneeType)).append("\n");
    sb.append("    avatarUrls: ").append(toIndentedString(avatarUrls)).append("\n");
    sb.append("    components: ").append(toIndentedString(components)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    deletedBy: ").append(toIndentedString(deletedBy)).append("\n");
    sb.append("    deletedDate: ").append(toIndentedString(deletedDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
    sb.append("    favourite: ").append(toIndentedString(favourite)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    insight: ").append(toIndentedString(insight)).append("\n");
    sb.append("    isPrivate: ").append(toIndentedString(isPrivate)).append("\n");
    sb.append("    issueTypeHierarchy: ").append(toIndentedString(issueTypeHierarchy)).append("\n");
    sb.append("    issueTypes: ").append(toIndentedString(issueTypes)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    landingPageInfo: ").append(toIndentedString(landingPageInfo)).append("\n");
    sb.append("    lead: ").append(toIndentedString(lead)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    projectCategory: ").append(toIndentedString(projectCategory)).append("\n");
    sb.append("    projectTypeKey: ").append(toIndentedString(projectTypeKey)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    retentionTillDate: ").append(toIndentedString(retentionTillDate)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    simplified: ").append(toIndentedString(simplified)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
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
