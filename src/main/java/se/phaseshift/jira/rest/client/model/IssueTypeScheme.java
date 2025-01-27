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
 * Details of an issue type scheme.
 */
@Schema(description = "Details of an issue type scheme.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class IssueTypeScheme {
  @SerializedName("defaultIssueTypeId")
  private String defaultIssueTypeId = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("isDefault")
  private Boolean isDefault = null;

  @SerializedName("name")
  private String name = null;

  public IssueTypeScheme defaultIssueTypeId(String defaultIssueTypeId) {
    this.defaultIssueTypeId = defaultIssueTypeId;
    return this;
  }

   /**
   * The ID of the default issue type of the issue type scheme.
   * @return defaultIssueTypeId
  **/
  @Schema(description = "The ID of the default issue type of the issue type scheme.")
  public String getDefaultIssueTypeId() {
    return defaultIssueTypeId;
  }

  public void setDefaultIssueTypeId(String defaultIssueTypeId) {
    this.defaultIssueTypeId = defaultIssueTypeId;
  }

  public IssueTypeScheme description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the issue type scheme.
   * @return description
  **/
  @Schema(description = "The description of the issue type scheme.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public IssueTypeScheme id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the issue type scheme.
   * @return id
  **/
  @Schema(required = true, description = "The ID of the issue type scheme.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public IssueTypeScheme isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

   /**
   * Whether the issue type scheme is the default.
   * @return isDefault
  **/
  @Schema(description = "Whether the issue type scheme is the default.")
  public Boolean isIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  public IssueTypeScheme name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the issue type scheme.
   * @return name
  **/
  @Schema(required = true, description = "The name of the issue type scheme.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueTypeScheme issueTypeScheme = (IssueTypeScheme) o;
    return Objects.equals(this.defaultIssueTypeId, issueTypeScheme.defaultIssueTypeId) &&
        Objects.equals(this.description, issueTypeScheme.description) &&
        Objects.equals(this.id, issueTypeScheme.id) &&
        Objects.equals(this.isDefault, issueTypeScheme.isDefault) &&
        Objects.equals(this.name, issueTypeScheme.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultIssueTypeId, description, id, isDefault, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueTypeScheme {\n");
    
    sb.append("    defaultIssueTypeId: ").append(toIndentedString(defaultIssueTypeId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
