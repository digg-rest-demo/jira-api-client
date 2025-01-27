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
import org.threeten.bp.OffsetDateTime;
import se.phaseshift.jira.rest.client.model.ProjectDetails;
import se.phaseshift.jira.rest.client.model.PublishedWorkflowId;
import se.phaseshift.jira.rest.client.model.Transition;
import se.phaseshift.jira.rest.client.model.WorkflowOperations;
import se.phaseshift.jira.rest.client.model.WorkflowSchemeIdName;
import se.phaseshift.jira.rest.client.model.WorkflowStatus;
/**
 * Details about a workflow.
 */
@Schema(description = "Details about a workflow.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class Workflow {
  @SerializedName("created")
  private OffsetDateTime created = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("hasDraftWorkflow")
  private Boolean hasDraftWorkflow = null;

  @SerializedName("id")
  private PublishedWorkflowId id = null;

  @SerializedName("isDefault")
  private Boolean isDefault = null;

  @SerializedName("operations")
  private WorkflowOperations operations = null;

  @SerializedName("projects")
  private List<ProjectDetails> projects = null;

  @SerializedName("schemes")
  private List<WorkflowSchemeIdName> schemes = null;

  @SerializedName("statuses")
  private List<WorkflowStatus> statuses = null;

  @SerializedName("transitions")
  private List<Transition> transitions = null;

  @SerializedName("updated")
  private OffsetDateTime updated = null;

  public Workflow created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

   /**
   * The creation date of the workflow.
   * @return created
  **/
  @Schema(description = "The creation date of the workflow.")
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public Workflow description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the workflow.
   * @return description
  **/
  @Schema(required = true, description = "The description of the workflow.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Workflow hasDraftWorkflow(Boolean hasDraftWorkflow) {
    this.hasDraftWorkflow = hasDraftWorkflow;
    return this;
  }

   /**
   * Whether the workflow has a draft version.
   * @return hasDraftWorkflow
  **/
  @Schema(description = "Whether the workflow has a draft version.")
  public Boolean isHasDraftWorkflow() {
    return hasDraftWorkflow;
  }

  public void setHasDraftWorkflow(Boolean hasDraftWorkflow) {
    this.hasDraftWorkflow = hasDraftWorkflow;
  }

  public Workflow id(PublishedWorkflowId id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(required = true, description = "")
  public PublishedWorkflowId getId() {
    return id;
  }

  public void setId(PublishedWorkflowId id) {
    this.id = id;
  }

  public Workflow isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

   /**
   * Whether this is the default workflow.
   * @return isDefault
  **/
  @Schema(description = "Whether this is the default workflow.")
  public Boolean isIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  public Workflow operations(WorkflowOperations operations) {
    this.operations = operations;
    return this;
  }

   /**
   * Get operations
   * @return operations
  **/
  @Schema(description = "")
  public WorkflowOperations getOperations() {
    return operations;
  }

  public void setOperations(WorkflowOperations operations) {
    this.operations = operations;
  }

  public Workflow projects(List<ProjectDetails> projects) {
    this.projects = projects;
    return this;
  }

  public Workflow addProjectsItem(ProjectDetails projectsItem) {
    if (this.projects == null) {
      this.projects = new ArrayList<ProjectDetails>();
    }
    this.projects.add(projectsItem);
    return this;
  }

   /**
   * The projects the workflow is assigned to, through workflow schemes.
   * @return projects
  **/
  @Schema(description = "The projects the workflow is assigned to, through workflow schemes.")
  public List<ProjectDetails> getProjects() {
    return projects;
  }

  public void setProjects(List<ProjectDetails> projects) {
    this.projects = projects;
  }

  public Workflow schemes(List<WorkflowSchemeIdName> schemes) {
    this.schemes = schemes;
    return this;
  }

  public Workflow addSchemesItem(WorkflowSchemeIdName schemesItem) {
    if (this.schemes == null) {
      this.schemes = new ArrayList<WorkflowSchemeIdName>();
    }
    this.schemes.add(schemesItem);
    return this;
  }

   /**
   * The workflow schemes the workflow is assigned to.
   * @return schemes
  **/
  @Schema(description = "The workflow schemes the workflow is assigned to.")
  public List<WorkflowSchemeIdName> getSchemes() {
    return schemes;
  }

  public void setSchemes(List<WorkflowSchemeIdName> schemes) {
    this.schemes = schemes;
  }

  public Workflow statuses(List<WorkflowStatus> statuses) {
    this.statuses = statuses;
    return this;
  }

  public Workflow addStatusesItem(WorkflowStatus statusesItem) {
    if (this.statuses == null) {
      this.statuses = new ArrayList<WorkflowStatus>();
    }
    this.statuses.add(statusesItem);
    return this;
  }

   /**
   * The statuses of the workflow.
   * @return statuses
  **/
  @Schema(description = "The statuses of the workflow.")
  public List<WorkflowStatus> getStatuses() {
    return statuses;
  }

  public void setStatuses(List<WorkflowStatus> statuses) {
    this.statuses = statuses;
  }

  public Workflow transitions(List<Transition> transitions) {
    this.transitions = transitions;
    return this;
  }

  public Workflow addTransitionsItem(Transition transitionsItem) {
    if (this.transitions == null) {
      this.transitions = new ArrayList<Transition>();
    }
    this.transitions.add(transitionsItem);
    return this;
  }

   /**
   * The transitions of the workflow.
   * @return transitions
  **/
  @Schema(description = "The transitions of the workflow.")
  public List<Transition> getTransitions() {
    return transitions;
  }

  public void setTransitions(List<Transition> transitions) {
    this.transitions = transitions;
  }

  public Workflow updated(OffsetDateTime updated) {
    this.updated = updated;
    return this;
  }

   /**
   * The last edited date of the workflow.
   * @return updated
  **/
  @Schema(description = "The last edited date of the workflow.")
  public OffsetDateTime getUpdated() {
    return updated;
  }

  public void setUpdated(OffsetDateTime updated) {
    this.updated = updated;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Workflow workflow = (Workflow) o;
    return Objects.equals(this.created, workflow.created) &&
        Objects.equals(this.description, workflow.description) &&
        Objects.equals(this.hasDraftWorkflow, workflow.hasDraftWorkflow) &&
        Objects.equals(this.id, workflow.id) &&
        Objects.equals(this.isDefault, workflow.isDefault) &&
        Objects.equals(this.operations, workflow.operations) &&
        Objects.equals(this.projects, workflow.projects) &&
        Objects.equals(this.schemes, workflow.schemes) &&
        Objects.equals(this.statuses, workflow.statuses) &&
        Objects.equals(this.transitions, workflow.transitions) &&
        Objects.equals(this.updated, workflow.updated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, description, hasDraftWorkflow, id, isDefault, operations, projects, schemes, statuses, transitions, updated);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Workflow {\n");
    
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    hasDraftWorkflow: ").append(toIndentedString(hasDraftWorkflow)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
    sb.append("    projects: ").append(toIndentedString(projects)).append("\n");
    sb.append("    schemes: ").append(toIndentedString(schemes)).append("\n");
    sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
    sb.append("    transitions: ").append(toIndentedString(transitions)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
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
