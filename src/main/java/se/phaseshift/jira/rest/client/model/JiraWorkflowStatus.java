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
import se.phaseshift.jira.rest.client.model.ProjectIssueTypes;
import se.phaseshift.jira.rest.client.model.WorkflowScope;
/**
 * Details of a status.
 */
@Schema(description = "Details of a status.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class JiraWorkflowStatus {
  @SerializedName("description")
  private String description = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("scope")
  private WorkflowScope scope = null;

  /**
   * The category of the status.
   */
  @JsonAdapter(StatusCategoryEnum.Adapter.class)
  public enum StatusCategoryEnum {
    @SerializedName("TODO")
    TODO("TODO"),
    @SerializedName("IN_PROGRESS")
    IN_PROGRESS("IN_PROGRESS"),
    @SerializedName("DONE")
    DONE("DONE");

    private String value;

    StatusCategoryEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static StatusCategoryEnum fromValue(String input) {
      for (StatusCategoryEnum b : StatusCategoryEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<StatusCategoryEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusCategoryEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public StatusCategoryEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return StatusCategoryEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("statusCategory")
  private StatusCategoryEnum statusCategory = null;

  @SerializedName("statusReference")
  private String statusReference = null;

  @SerializedName("usages")
  private List<ProjectIssueTypes> usages = null;

  public JiraWorkflowStatus description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the status.
   * @return description
  **/
  @Schema(description = "The description of the status.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public JiraWorkflowStatus id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the status.
   * @return id
  **/
  @Schema(description = "The ID of the status.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public JiraWorkflowStatus name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the status.
   * @return name
  **/
  @Schema(description = "The name of the status.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public JiraWorkflowStatus scope(WorkflowScope scope) {
    this.scope = scope;
    return this;
  }

   /**
   * Get scope
   * @return scope
  **/
  @Schema(description = "")
  public WorkflowScope getScope() {
    return scope;
  }

  public void setScope(WorkflowScope scope) {
    this.scope = scope;
  }

  public JiraWorkflowStatus statusCategory(StatusCategoryEnum statusCategory) {
    this.statusCategory = statusCategory;
    return this;
  }

   /**
   * The category of the status.
   * @return statusCategory
  **/
  @Schema(description = "The category of the status.")
  public StatusCategoryEnum getStatusCategory() {
    return statusCategory;
  }

  public void setStatusCategory(StatusCategoryEnum statusCategory) {
    this.statusCategory = statusCategory;
  }

  public JiraWorkflowStatus statusReference(String statusReference) {
    this.statusReference = statusReference;
    return this;
  }

   /**
   * The reference of the status.
   * @return statusReference
  **/
  @Schema(description = "The reference of the status.")
  public String getStatusReference() {
    return statusReference;
  }

  public void setStatusReference(String statusReference) {
    this.statusReference = statusReference;
  }

  public JiraWorkflowStatus usages(List<ProjectIssueTypes> usages) {
    this.usages = usages;
    return this;
  }

  public JiraWorkflowStatus addUsagesItem(ProjectIssueTypes usagesItem) {
    if (this.usages == null) {
      this.usages = new ArrayList<ProjectIssueTypes>();
    }
    this.usages.add(usagesItem);
    return this;
  }

   /**
   * The &#x60;statuses.usages&#x60; expand is an optional parameter that can be used when reading and updating statuses in Jira. It provides additional information about the projects and issue types associated with the requested statuses.
   * @return usages
  **/
  @Schema(description = "The `statuses.usages` expand is an optional parameter that can be used when reading and updating statuses in Jira. It provides additional information about the projects and issue types associated with the requested statuses.")
  public List<ProjectIssueTypes> getUsages() {
    return usages;
  }

  public void setUsages(List<ProjectIssueTypes> usages) {
    this.usages = usages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JiraWorkflowStatus jiraWorkflowStatus = (JiraWorkflowStatus) o;
    return Objects.equals(this.description, jiraWorkflowStatus.description) &&
        Objects.equals(this.id, jiraWorkflowStatus.id) &&
        Objects.equals(this.name, jiraWorkflowStatus.name) &&
        Objects.equals(this.scope, jiraWorkflowStatus.scope) &&
        Objects.equals(this.statusCategory, jiraWorkflowStatus.statusCategory) &&
        Objects.equals(this.statusReference, jiraWorkflowStatus.statusReference) &&
        Objects.equals(this.usages, jiraWorkflowStatus.usages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, name, scope, statusCategory, statusReference, usages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JiraWorkflowStatus {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    statusCategory: ").append(toIndentedString(statusCategory)).append("\n");
    sb.append("    statusReference: ").append(toIndentedString(statusReference)).append("\n");
    sb.append("    usages: ").append(toIndentedString(usages)).append("\n");
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
