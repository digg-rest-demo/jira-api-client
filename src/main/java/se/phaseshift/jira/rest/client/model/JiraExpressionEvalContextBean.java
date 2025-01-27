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
import se.phaseshift.jira.rest.client.model.CustomContextVariable;
/**
 * JiraExpressionEvalContextBean
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class JiraExpressionEvalContextBean {
  @SerializedName("board")
  private Long board = null;

  @SerializedName("custom")
  private List<CustomContextVariable> custom = null;

  @SerializedName("customerRequest")
  private Long customerRequest = null;

  @SerializedName("issue")
  private AllOfJiraExpressionEvalContextBeanIssue issue = null;

  @SerializedName("issues")
  private AllOfJiraExpressionEvalContextBeanIssues issues = null;

  @SerializedName("project")
  private AllOfJiraExpressionEvalContextBeanProject project = null;

  @SerializedName("serviceDesk")
  private Long serviceDesk = null;

  @SerializedName("sprint")
  private Long sprint = null;

  public JiraExpressionEvalContextBean board(Long board) {
    this.board = board;
    return this;
  }

   /**
   * The ID of the board that is available under the &#x60;board&#x60; variable when evaluating the expression.
   * @return board
  **/
  @Schema(description = "The ID of the board that is available under the `board` variable when evaluating the expression.")
  public Long getBoard() {
    return board;
  }

  public void setBoard(Long board) {
    this.board = board;
  }

  public JiraExpressionEvalContextBean custom(List<CustomContextVariable> custom) {
    this.custom = custom;
    return this;
  }

  public JiraExpressionEvalContextBean addCustomItem(CustomContextVariable customItem) {
    if (this.custom == null) {
      this.custom = new ArrayList<CustomContextVariable>();
    }
    this.custom.add(customItem);
    return this;
  }

   /**
   * Custom context variables and their types. These variable types are available for use in a custom context:   *  &#x60;user&#x60;: A [user](https://developer.atlassian.com/cloud/jira/platform/jira-expressions-type-reference#user) specified as an Atlassian account ID.  *  &#x60;issue&#x60;: An [issue](https://developer.atlassian.com/cloud/jira/platform/jira-expressions-type-reference#issue) specified by ID or key. All the fields of the issue object are available in the Jira expression.  *  &#x60;json&#x60;: A JSON object containing custom content.  *  &#x60;list&#x60;: A JSON list of &#x60;user&#x60;, &#x60;issue&#x60;, or &#x60;json&#x60; variable types.
   * @return custom
  **/
  @Schema(description = "Custom context variables and their types. These variable types are available for use in a custom context:   *  `user`: A [user](https://developer.atlassian.com/cloud/jira/platform/jira-expressions-type-reference#user) specified as an Atlassian account ID.  *  `issue`: An [issue](https://developer.atlassian.com/cloud/jira/platform/jira-expressions-type-reference#issue) specified by ID or key. All the fields of the issue object are available in the Jira expression.  *  `json`: A JSON object containing custom content.  *  `list`: A JSON list of `user`, `issue`, or `json` variable types.")
  public List<CustomContextVariable> getCustom() {
    return custom;
  }

  public void setCustom(List<CustomContextVariable> custom) {
    this.custom = custom;
  }

  public JiraExpressionEvalContextBean customerRequest(Long customerRequest) {
    this.customerRequest = customerRequest;
    return this;
  }

   /**
   * The ID of the customer request that is available under the &#x60;customerRequest&#x60; variable when evaluating the expression. This is the same as the ID of the underlying Jira issue, but the customer request context variable will have a different type.
   * @return customerRequest
  **/
  @Schema(description = "The ID of the customer request that is available under the `customerRequest` variable when evaluating the expression. This is the same as the ID of the underlying Jira issue, but the customer request context variable will have a different type.")
  public Long getCustomerRequest() {
    return customerRequest;
  }

  public void setCustomerRequest(Long customerRequest) {
    this.customerRequest = customerRequest;
  }

  public JiraExpressionEvalContextBean issue(AllOfJiraExpressionEvalContextBeanIssue issue) {
    this.issue = issue;
    return this;
  }

   /**
   * The issue that is available under the &#x60;issue&#x60; variable when evaluating the expression.
   * @return issue
  **/
  @Schema(description = "The issue that is available under the `issue` variable when evaluating the expression.")
  public AllOfJiraExpressionEvalContextBeanIssue getIssue() {
    return issue;
  }

  public void setIssue(AllOfJiraExpressionEvalContextBeanIssue issue) {
    this.issue = issue;
  }

  public JiraExpressionEvalContextBean issues(AllOfJiraExpressionEvalContextBeanIssues issues) {
    this.issues = issues;
    return this;
  }

   /**
   * The collection of issues that is available under the &#x60;issues&#x60; variable when evaluating the expression.
   * @return issues
  **/
  @Schema(description = "The collection of issues that is available under the `issues` variable when evaluating the expression.")
  public AllOfJiraExpressionEvalContextBeanIssues getIssues() {
    return issues;
  }

  public void setIssues(AllOfJiraExpressionEvalContextBeanIssues issues) {
    this.issues = issues;
  }

  public JiraExpressionEvalContextBean project(AllOfJiraExpressionEvalContextBeanProject project) {
    this.project = project;
    return this;
  }

   /**
   * The project that is available under the &#x60;project&#x60; variable when evaluating the expression.
   * @return project
  **/
  @Schema(description = "The project that is available under the `project` variable when evaluating the expression.")
  public AllOfJiraExpressionEvalContextBeanProject getProject() {
    return project;
  }

  public void setProject(AllOfJiraExpressionEvalContextBeanProject project) {
    this.project = project;
  }

  public JiraExpressionEvalContextBean serviceDesk(Long serviceDesk) {
    this.serviceDesk = serviceDesk;
    return this;
  }

   /**
   * The ID of the service desk that is available under the &#x60;serviceDesk&#x60; variable when evaluating the expression.
   * @return serviceDesk
  **/
  @Schema(description = "The ID of the service desk that is available under the `serviceDesk` variable when evaluating the expression.")
  public Long getServiceDesk() {
    return serviceDesk;
  }

  public void setServiceDesk(Long serviceDesk) {
    this.serviceDesk = serviceDesk;
  }

  public JiraExpressionEvalContextBean sprint(Long sprint) {
    this.sprint = sprint;
    return this;
  }

   /**
   * The ID of the sprint that is available under the &#x60;sprint&#x60; variable when evaluating the expression.
   * @return sprint
  **/
  @Schema(description = "The ID of the sprint that is available under the `sprint` variable when evaluating the expression.")
  public Long getSprint() {
    return sprint;
  }

  public void setSprint(Long sprint) {
    this.sprint = sprint;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JiraExpressionEvalContextBean jiraExpressionEvalContextBean = (JiraExpressionEvalContextBean) o;
    return Objects.equals(this.board, jiraExpressionEvalContextBean.board) &&
        Objects.equals(this.custom, jiraExpressionEvalContextBean.custom) &&
        Objects.equals(this.customerRequest, jiraExpressionEvalContextBean.customerRequest) &&
        Objects.equals(this.issue, jiraExpressionEvalContextBean.issue) &&
        Objects.equals(this.issues, jiraExpressionEvalContextBean.issues) &&
        Objects.equals(this.project, jiraExpressionEvalContextBean.project) &&
        Objects.equals(this.serviceDesk, jiraExpressionEvalContextBean.serviceDesk) &&
        Objects.equals(this.sprint, jiraExpressionEvalContextBean.sprint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(board, custom, customerRequest, issue, issues, project, serviceDesk, sprint);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JiraExpressionEvalContextBean {\n");
    
    sb.append("    board: ").append(toIndentedString(board)).append("\n");
    sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
    sb.append("    customerRequest: ").append(toIndentedString(customerRequest)).append("\n");
    sb.append("    issue: ").append(toIndentedString(issue)).append("\n");
    sb.append("    issues: ").append(toIndentedString(issues)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    serviceDesk: ").append(toIndentedString(serviceDesk)).append("\n");
    sb.append("    sprint: ").append(toIndentedString(sprint)).append("\n");
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
