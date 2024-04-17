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

public class CreateProjectDetails {
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

  @SerializedName("fieldConfigurationScheme")
  private Long fieldConfigurationScheme = null;

  @SerializedName("issueSecurityScheme")
  private Long issueSecurityScheme = null;

  @SerializedName("issueTypeScheme")
  private Long issueTypeScheme = null;

  @SerializedName("issueTypeScreenScheme")
  private Long issueTypeScreenScheme = null;

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

  /**
   * A predefined configuration for a project. The type of the &#x60;projectTemplateKey&#x60; must match with the type of the &#x60;projectTypeKey&#x60;.
   */
  @JsonAdapter(ProjectTemplateKeyEnum.Adapter.class)
  public enum ProjectTemplateKeyEnum {
    @SerializedName("com.pyxis.greenhopper.jira:gh-simplified-agility-kanban")
    PYXIS_GREENHOPPER_JIRA_GH_SIMPLIFIED_AGILITY_KANBAN("com.pyxis.greenhopper.jira:gh-simplified-agility-kanban"),
    @SerializedName("com.pyxis.greenhopper.jira:gh-simplified-agility-scrum")
    PYXIS_GREENHOPPER_JIRA_GH_SIMPLIFIED_AGILITY_SCRUM("com.pyxis.greenhopper.jira:gh-simplified-agility-scrum"),
    @SerializedName("com.pyxis.greenhopper.jira:gh-simplified-basic")
    PYXIS_GREENHOPPER_JIRA_GH_SIMPLIFIED_BASIC("com.pyxis.greenhopper.jira:gh-simplified-basic"),
    @SerializedName("com.pyxis.greenhopper.jira:gh-simplified-kanban-classic")
    PYXIS_GREENHOPPER_JIRA_GH_SIMPLIFIED_KANBAN_CLASSIC("com.pyxis.greenhopper.jira:gh-simplified-kanban-classic"),
    @SerializedName("com.pyxis.greenhopper.jira:gh-simplified-scrum-classic")
    PYXIS_GREENHOPPER_JIRA_GH_SIMPLIFIED_SCRUM_CLASSIC("com.pyxis.greenhopper.jira:gh-simplified-scrum-classic"),
    @SerializedName("com.pyxis.greenhopper.jira:gh-cross-team-template")
    PYXIS_GREENHOPPER_JIRA_GH_CROSS_TEAM_TEMPLATE("com.pyxis.greenhopper.jira:gh-cross-team-template"),
    @SerializedName("com.pyxis.greenhopper.jira:gh-cross-team-planning-template")
    PYXIS_GREENHOPPER_JIRA_GH_CROSS_TEAM_PLANNING_TEMPLATE("com.pyxis.greenhopper.jira:gh-cross-team-planning-template"),
    @SerializedName("com.atlassian.servicedesk:simplified-it-service-management")
    ATLASSIAN_SERVICEDESK_SIMPLIFIED_IT_SERVICE_MANAGEMENT("com.atlassian.servicedesk:simplified-it-service-management"),
    @SerializedName("com.atlassian.servicedesk:simplified-general-service-desk")
    ATLASSIAN_SERVICEDESK_SIMPLIFIED_GENERAL_SERVICE_DESK("com.atlassian.servicedesk:simplified-general-service-desk"),
    @SerializedName("com.atlassian.servicedesk:simplified-general-service-desk-it")
    ATLASSIAN_SERVICEDESK_SIMPLIFIED_GENERAL_SERVICE_DESK_IT("com.atlassian.servicedesk:simplified-general-service-desk-it"),
    @SerializedName("com.atlassian.servicedesk:simplified-general-service-desk-business")
    ATLASSIAN_SERVICEDESK_SIMPLIFIED_GENERAL_SERVICE_DESK_BUSINESS("com.atlassian.servicedesk:simplified-general-service-desk-business"),
    @SerializedName("com.atlassian.servicedesk:simplified-internal-service-desk")
    ATLASSIAN_SERVICEDESK_SIMPLIFIED_INTERNAL_SERVICE_DESK("com.atlassian.servicedesk:simplified-internal-service-desk"),
    @SerializedName("com.atlassian.servicedesk:simplified-external-service-desk")
    ATLASSIAN_SERVICEDESK_SIMPLIFIED_EXTERNAL_SERVICE_DESK("com.atlassian.servicedesk:simplified-external-service-desk"),
    @SerializedName("com.atlassian.servicedesk:simplified-hr-service-desk")
    ATLASSIAN_SERVICEDESK_SIMPLIFIED_HR_SERVICE_DESK("com.atlassian.servicedesk:simplified-hr-service-desk"),
    @SerializedName("com.atlassian.servicedesk:simplified-facilities-service-desk")
    ATLASSIAN_SERVICEDESK_SIMPLIFIED_FACILITIES_SERVICE_DESK("com.atlassian.servicedesk:simplified-facilities-service-desk"),
    @SerializedName("com.atlassian.servicedesk:simplified-legal-service-desk")
    ATLASSIAN_SERVICEDESK_SIMPLIFIED_LEGAL_SERVICE_DESK("com.atlassian.servicedesk:simplified-legal-service-desk"),
    @SerializedName("com.atlassian.servicedesk:simplified-marketing-service-desk")
    ATLASSIAN_SERVICEDESK_SIMPLIFIED_MARKETING_SERVICE_DESK("com.atlassian.servicedesk:simplified-marketing-service-desk"),
    @SerializedName("com.atlassian.servicedesk:simplified-finance-service-desk")
    ATLASSIAN_SERVICEDESK_SIMPLIFIED_FINANCE_SERVICE_DESK("com.atlassian.servicedesk:simplified-finance-service-desk"),
    @SerializedName("com.atlassian.servicedesk:simplified-analytics-service-desk")
    ATLASSIAN_SERVICEDESK_SIMPLIFIED_ANALYTICS_SERVICE_DESK("com.atlassian.servicedesk:simplified-analytics-service-desk"),
    @SerializedName("com.atlassian.servicedesk:simplified-design-service-desk")
    ATLASSIAN_SERVICEDESK_SIMPLIFIED_DESIGN_SERVICE_DESK("com.atlassian.servicedesk:simplified-design-service-desk"),
    @SerializedName("com.atlassian.servicedesk:simplified-sales-service-desk")
    ATLASSIAN_SERVICEDESK_SIMPLIFIED_SALES_SERVICE_DESK("com.atlassian.servicedesk:simplified-sales-service-desk"),
    @SerializedName("com.atlassian.servicedesk:simplified-halp-service-desk")
    ATLASSIAN_SERVICEDESK_SIMPLIFIED_HALP_SERVICE_DESK("com.atlassian.servicedesk:simplified-halp-service-desk"),
    @SerializedName("com.atlassian.servicedesk:simplified-blank-project-it")
    ATLASSIAN_SERVICEDESK_SIMPLIFIED_BLANK_PROJECT_IT("com.atlassian.servicedesk:simplified-blank-project-it"),
    @SerializedName("com.atlassian.servicedesk:simplified-blank-project-business")
    ATLASSIAN_SERVICEDESK_SIMPLIFIED_BLANK_PROJECT_BUSINESS("com.atlassian.servicedesk:simplified-blank-project-business"),
    @SerializedName("com.atlassian.servicedesk:next-gen-it-service-desk")
    ATLASSIAN_SERVICEDESK_NEXT_GEN_IT_SERVICE_DESK("com.atlassian.servicedesk:next-gen-it-service-desk"),
    @SerializedName("com.atlassian.servicedesk:next-gen-hr-service-desk")
    ATLASSIAN_SERVICEDESK_NEXT_GEN_HR_SERVICE_DESK("com.atlassian.servicedesk:next-gen-hr-service-desk"),
    @SerializedName("com.atlassian.servicedesk:next-gen-legal-service-desk")
    ATLASSIAN_SERVICEDESK_NEXT_GEN_LEGAL_SERVICE_DESK("com.atlassian.servicedesk:next-gen-legal-service-desk"),
    @SerializedName("com.atlassian.servicedesk:next-gen-marketing-service-desk")
    ATLASSIAN_SERVICEDESK_NEXT_GEN_MARKETING_SERVICE_DESK("com.atlassian.servicedesk:next-gen-marketing-service-desk"),
    @SerializedName("com.atlassian.servicedesk:next-gen-facilities-service-desk")
    ATLASSIAN_SERVICEDESK_NEXT_GEN_FACILITIES_SERVICE_DESK("com.atlassian.servicedesk:next-gen-facilities-service-desk"),
    @SerializedName("com.atlassian.servicedesk:next-gen-general-service-desk")
    ATLASSIAN_SERVICEDESK_NEXT_GEN_GENERAL_SERVICE_DESK("com.atlassian.servicedesk:next-gen-general-service-desk"),
    @SerializedName("com.atlassian.servicedesk:next-gen-general-it-service-desk")
    ATLASSIAN_SERVICEDESK_NEXT_GEN_GENERAL_IT_SERVICE_DESK("com.atlassian.servicedesk:next-gen-general-it-service-desk"),
    @SerializedName("com.atlassian.servicedesk:next-gen-general-business-service-desk")
    ATLASSIAN_SERVICEDESK_NEXT_GEN_GENERAL_BUSINESS_SERVICE_DESK("com.atlassian.servicedesk:next-gen-general-business-service-desk"),
    @SerializedName("com.atlassian.servicedesk:next-gen-analytics-service-desk")
    ATLASSIAN_SERVICEDESK_NEXT_GEN_ANALYTICS_SERVICE_DESK("com.atlassian.servicedesk:next-gen-analytics-service-desk"),
    @SerializedName("com.atlassian.servicedesk:next-gen-finance-service-desk")
    ATLASSIAN_SERVICEDESK_NEXT_GEN_FINANCE_SERVICE_DESK("com.atlassian.servicedesk:next-gen-finance-service-desk"),
    @SerializedName("com.atlassian.servicedesk:next-gen-design-service-desk")
    ATLASSIAN_SERVICEDESK_NEXT_GEN_DESIGN_SERVICE_DESK("com.atlassian.servicedesk:next-gen-design-service-desk"),
    @SerializedName("com.atlassian.servicedesk:next-gen-sales-service-desk")
    ATLASSIAN_SERVICEDESK_NEXT_GEN_SALES_SERVICE_DESK("com.atlassian.servicedesk:next-gen-sales-service-desk"),
    @SerializedName("com.atlassian.jira-core-project-templates:jira-core-simplified-content-management")
    ATLASSIAN_JIRA_CORE_PROJECT_TEMPLATES_JIRA_CORE_SIMPLIFIED_CONTENT_MANAGEMENT("com.atlassian.jira-core-project-templates:jira-core-simplified-content-management"),
    @SerializedName("com.atlassian.jira-core-project-templates:jira-core-simplified-document-approval")
    ATLASSIAN_JIRA_CORE_PROJECT_TEMPLATES_JIRA_CORE_SIMPLIFIED_DOCUMENT_APPROVAL("com.atlassian.jira-core-project-templates:jira-core-simplified-document-approval"),
    @SerializedName("com.atlassian.jira-core-project-templates:jira-core-simplified-lead-tracking")
    ATLASSIAN_JIRA_CORE_PROJECT_TEMPLATES_JIRA_CORE_SIMPLIFIED_LEAD_TRACKING("com.atlassian.jira-core-project-templates:jira-core-simplified-lead-tracking"),
    @SerializedName("com.atlassian.jira-core-project-templates:jira-core-simplified-process-control")
    ATLASSIAN_JIRA_CORE_PROJECT_TEMPLATES_JIRA_CORE_SIMPLIFIED_PROCESS_CONTROL("com.atlassian.jira-core-project-templates:jira-core-simplified-process-control"),
    @SerializedName("com.atlassian.jira-core-project-templates:jira-core-simplified-procurement")
    ATLASSIAN_JIRA_CORE_PROJECT_TEMPLATES_JIRA_CORE_SIMPLIFIED_PROCUREMENT("com.atlassian.jira-core-project-templates:jira-core-simplified-procurement"),
    @SerializedName("com.atlassian.jira-core-project-templates:jira-core-simplified-project-management")
    ATLASSIAN_JIRA_CORE_PROJECT_TEMPLATES_JIRA_CORE_SIMPLIFIED_PROJECT_MANAGEMENT("com.atlassian.jira-core-project-templates:jira-core-simplified-project-management"),
    @SerializedName("com.atlassian.jira-core-project-templates:jira-core-simplified-recruitment")
    ATLASSIAN_JIRA_CORE_PROJECT_TEMPLATES_JIRA_CORE_SIMPLIFIED_RECRUITMENT("com.atlassian.jira-core-project-templates:jira-core-simplified-recruitment"),
    @SerializedName("com.atlassian.jira-core-project-templates:jira-core-simplified-task-")
    ATLASSIAN_JIRA_CORE_PROJECT_TEMPLATES_JIRA_CORE_SIMPLIFIED_TASK_("com.atlassian.jira-core-project-templates:jira-core-simplified-task-");

    private String value;

    ProjectTemplateKeyEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ProjectTemplateKeyEnum fromValue(String input) {
      for (ProjectTemplateKeyEnum b : ProjectTemplateKeyEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ProjectTemplateKeyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ProjectTemplateKeyEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ProjectTemplateKeyEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ProjectTemplateKeyEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("projectTemplateKey")
  private ProjectTemplateKeyEnum projectTemplateKey = null;

  /**
   * The [project type](https://confluence.atlassian.com/x/GwiiLQ#Jiraapplicationsoverview-Productfeaturesandprojecttypes), which defines the application-specific feature set. If you don&#x27;t specify the project template you have to specify the project type.
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

  @SerializedName("url")
  private String url = null;

  @SerializedName("workflowScheme")
  private Long workflowScheme = null;

  public CreateProjectDetails assigneeType(AssigneeTypeEnum assigneeType) {
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

  public CreateProjectDetails avatarId(Long avatarId) {
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

  public CreateProjectDetails categoryId(Long categoryId) {
    this.categoryId = categoryId;
    return this;
  }

   /**
   * The ID of the project&#x27;s category. A complete list of category IDs is found using the [Get all project categories](#api-rest-api-3-projectCategory-get) operation.
   * @return categoryId
  **/
  @Schema(description = "The ID of the project's category. A complete list of category IDs is found using the [Get all project categories](#api-rest-api-3-projectCategory-get) operation.")
  public Long getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
  }

  public CreateProjectDetails description(String description) {
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

  public CreateProjectDetails fieldConfigurationScheme(Long fieldConfigurationScheme) {
    this.fieldConfigurationScheme = fieldConfigurationScheme;
    return this;
  }

   /**
   * The ID of the field configuration scheme for the project. Use the [Get all field configuration schemes](#api-rest-api-3-fieldconfigurationscheme-get) operation to get a list of field configuration scheme IDs. If you specify the field configuration scheme you cannot specify the project template key.
   * @return fieldConfigurationScheme
  **/
  @Schema(description = "The ID of the field configuration scheme for the project. Use the [Get all field configuration schemes](#api-rest-api-3-fieldconfigurationscheme-get) operation to get a list of field configuration scheme IDs. If you specify the field configuration scheme you cannot specify the project template key.")
  public Long getFieldConfigurationScheme() {
    return fieldConfigurationScheme;
  }

  public void setFieldConfigurationScheme(Long fieldConfigurationScheme) {
    this.fieldConfigurationScheme = fieldConfigurationScheme;
  }

  public CreateProjectDetails issueSecurityScheme(Long issueSecurityScheme) {
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

  public CreateProjectDetails issueTypeScheme(Long issueTypeScheme) {
    this.issueTypeScheme = issueTypeScheme;
    return this;
  }

   /**
   * The ID of the issue type scheme for the project. Use the [Get all issue type schemes](#api-rest-api-3-issuetypescheme-get) operation to get a list of issue type scheme IDs. If you specify the issue type scheme you cannot specify the project template key.
   * @return issueTypeScheme
  **/
  @Schema(description = "The ID of the issue type scheme for the project. Use the [Get all issue type schemes](#api-rest-api-3-issuetypescheme-get) operation to get a list of issue type scheme IDs. If you specify the issue type scheme you cannot specify the project template key.")
  public Long getIssueTypeScheme() {
    return issueTypeScheme;
  }

  public void setIssueTypeScheme(Long issueTypeScheme) {
    this.issueTypeScheme = issueTypeScheme;
  }

  public CreateProjectDetails issueTypeScreenScheme(Long issueTypeScreenScheme) {
    this.issueTypeScreenScheme = issueTypeScreenScheme;
    return this;
  }

   /**
   * The ID of the issue type screen scheme for the project. Use the [Get all issue type screen schemes](#api-rest-api-3-issuetypescreenscheme-get) operation to get a list of issue type screen scheme IDs. If you specify the issue type screen scheme you cannot specify the project template key.
   * @return issueTypeScreenScheme
  **/
  @Schema(description = "The ID of the issue type screen scheme for the project. Use the [Get all issue type screen schemes](#api-rest-api-3-issuetypescreenscheme-get) operation to get a list of issue type screen scheme IDs. If you specify the issue type screen scheme you cannot specify the project template key.")
  public Long getIssueTypeScreenScheme() {
    return issueTypeScreenScheme;
  }

  public void setIssueTypeScreenScheme(Long issueTypeScreenScheme) {
    this.issueTypeScreenScheme = issueTypeScreenScheme;
  }

  public CreateProjectDetails key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Project keys must be unique and start with an uppercase letter followed by one or more uppercase alphanumeric characters. The maximum length is 10 characters.
   * @return key
  **/
  @Schema(required = true, description = "Project keys must be unique and start with an uppercase letter followed by one or more uppercase alphanumeric characters. The maximum length is 10 characters.")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public CreateProjectDetails lead(String lead) {
    this.lead = lead;
    return this;
  }

   /**
   * This parameter is deprecated because of privacy changes. Use &#x60;leadAccountId&#x60; instead. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. The user name of the project lead. Either &#x60;lead&#x60; or &#x60;leadAccountId&#x60; must be set when creating a project. Cannot be provided with &#x60;leadAccountId&#x60;.
   * @return lead
  **/
  @Schema(description = "This parameter is deprecated because of privacy changes. Use `leadAccountId` instead. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. The user name of the project lead. Either `lead` or `leadAccountId` must be set when creating a project. Cannot be provided with `leadAccountId`.")
  public String getLead() {
    return lead;
  }

  public void setLead(String lead) {
    this.lead = lead;
  }

  public CreateProjectDetails leadAccountId(String leadAccountId) {
    this.leadAccountId = leadAccountId;
    return this;
  }

   /**
   * The account ID of the project lead. Either &#x60;lead&#x60; or &#x60;leadAccountId&#x60; must be set when creating a project. Cannot be provided with &#x60;lead&#x60;.
   * @return leadAccountId
  **/
  @Schema(description = "The account ID of the project lead. Either `lead` or `leadAccountId` must be set when creating a project. Cannot be provided with `lead`.")
  public String getLeadAccountId() {
    return leadAccountId;
  }

  public void setLeadAccountId(String leadAccountId) {
    this.leadAccountId = leadAccountId;
  }

  public CreateProjectDetails name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the project.
   * @return name
  **/
  @Schema(required = true, description = "The name of the project.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateProjectDetails notificationScheme(Long notificationScheme) {
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

  public CreateProjectDetails permissionScheme(Long permissionScheme) {
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

  public CreateProjectDetails projectTemplateKey(ProjectTemplateKeyEnum projectTemplateKey) {
    this.projectTemplateKey = projectTemplateKey;
    return this;
  }

   /**
   * A predefined configuration for a project. The type of the &#x60;projectTemplateKey&#x60; must match with the type of the &#x60;projectTypeKey&#x60;.
   * @return projectTemplateKey
  **/
  @Schema(description = "A predefined configuration for a project. The type of the `projectTemplateKey` must match with the type of the `projectTypeKey`.")
  public ProjectTemplateKeyEnum getProjectTemplateKey() {
    return projectTemplateKey;
  }

  public void setProjectTemplateKey(ProjectTemplateKeyEnum projectTemplateKey) {
    this.projectTemplateKey = projectTemplateKey;
  }

  public CreateProjectDetails projectTypeKey(ProjectTypeKeyEnum projectTypeKey) {
    this.projectTypeKey = projectTypeKey;
    return this;
  }

   /**
   * The [project type](https://confluence.atlassian.com/x/GwiiLQ#Jiraapplicationsoverview-Productfeaturesandprojecttypes), which defines the application-specific feature set. If you don&#x27;t specify the project template you have to specify the project type.
   * @return projectTypeKey
  **/
  @Schema(description = "The [project type](https://confluence.atlassian.com/x/GwiiLQ#Jiraapplicationsoverview-Productfeaturesandprojecttypes), which defines the application-specific feature set. If you don't specify the project template you have to specify the project type.")
  public ProjectTypeKeyEnum getProjectTypeKey() {
    return projectTypeKey;
  }

  public void setProjectTypeKey(ProjectTypeKeyEnum projectTypeKey) {
    this.projectTypeKey = projectTypeKey;
  }

  public CreateProjectDetails url(String url) {
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

  public CreateProjectDetails workflowScheme(Long workflowScheme) {
    this.workflowScheme = workflowScheme;
    return this;
  }

   /**
   * The ID of the workflow scheme for the project. Use the [Get all workflow schemes](#api-rest-api-3-workflowscheme-get) operation to get a list of workflow scheme IDs. If you specify the workflow scheme you cannot specify the project template key.
   * @return workflowScheme
  **/
  @Schema(description = "The ID of the workflow scheme for the project. Use the [Get all workflow schemes](#api-rest-api-3-workflowscheme-get) operation to get a list of workflow scheme IDs. If you specify the workflow scheme you cannot specify the project template key.")
  public Long getWorkflowScheme() {
    return workflowScheme;
  }

  public void setWorkflowScheme(Long workflowScheme) {
    this.workflowScheme = workflowScheme;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateProjectDetails createProjectDetails = (CreateProjectDetails) o;
    return Objects.equals(this.assigneeType, createProjectDetails.assigneeType) &&
        Objects.equals(this.avatarId, createProjectDetails.avatarId) &&
        Objects.equals(this.categoryId, createProjectDetails.categoryId) &&
        Objects.equals(this.description, createProjectDetails.description) &&
        Objects.equals(this.fieldConfigurationScheme, createProjectDetails.fieldConfigurationScheme) &&
        Objects.equals(this.issueSecurityScheme, createProjectDetails.issueSecurityScheme) &&
        Objects.equals(this.issueTypeScheme, createProjectDetails.issueTypeScheme) &&
        Objects.equals(this.issueTypeScreenScheme, createProjectDetails.issueTypeScreenScheme) &&
        Objects.equals(this.key, createProjectDetails.key) &&
        Objects.equals(this.lead, createProjectDetails.lead) &&
        Objects.equals(this.leadAccountId, createProjectDetails.leadAccountId) &&
        Objects.equals(this.name, createProjectDetails.name) &&
        Objects.equals(this.notificationScheme, createProjectDetails.notificationScheme) &&
        Objects.equals(this.permissionScheme, createProjectDetails.permissionScheme) &&
        Objects.equals(this.projectTemplateKey, createProjectDetails.projectTemplateKey) &&
        Objects.equals(this.projectTypeKey, createProjectDetails.projectTypeKey) &&
        Objects.equals(this.url, createProjectDetails.url) &&
        Objects.equals(this.workflowScheme, createProjectDetails.workflowScheme);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assigneeType, avatarId, categoryId, description, fieldConfigurationScheme, issueSecurityScheme, issueTypeScheme, issueTypeScreenScheme, key, lead, leadAccountId, name, notificationScheme, permissionScheme, projectTemplateKey, projectTypeKey, url, workflowScheme);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateProjectDetails {\n");
    
    sb.append("    assigneeType: ").append(toIndentedString(assigneeType)).append("\n");
    sb.append("    avatarId: ").append(toIndentedString(avatarId)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    fieldConfigurationScheme: ").append(toIndentedString(fieldConfigurationScheme)).append("\n");
    sb.append("    issueSecurityScheme: ").append(toIndentedString(issueSecurityScheme)).append("\n");
    sb.append("    issueTypeScheme: ").append(toIndentedString(issueTypeScheme)).append("\n");
    sb.append("    issueTypeScreenScheme: ").append(toIndentedString(issueTypeScreenScheme)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    lead: ").append(toIndentedString(lead)).append("\n");
    sb.append("    leadAccountId: ").append(toIndentedString(leadAccountId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    notificationScheme: ").append(toIndentedString(notificationScheme)).append("\n");
    sb.append("    permissionScheme: ").append(toIndentedString(permissionScheme)).append("\n");
    sb.append("    projectTemplateKey: ").append(toIndentedString(projectTemplateKey)).append("\n");
    sb.append("    projectTypeKey: ").append(toIndentedString(projectTypeKey)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    workflowScheme: ").append(toIndentedString(workflowScheme)).append("\n");
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
