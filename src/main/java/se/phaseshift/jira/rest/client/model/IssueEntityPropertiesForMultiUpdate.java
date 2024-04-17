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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import se.phaseshift.jira.rest.client.model.JsonNode;
/**
 * An issue ID with entity property values. See [Entity properties](https://developer.atlassian.com/cloud/jira/platform/jira-entity-properties/) for more information.
 */
@Schema(description = "An issue ID with entity property values. See [Entity properties](https://developer.atlassian.com/cloud/jira/platform/jira-entity-properties/) for more information.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class IssueEntityPropertiesForMultiUpdate {
  @SerializedName("issueID")
  private Long issueID = null;

  @SerializedName("properties")
  private Map<String, JsonNode> properties = null;

  public IssueEntityPropertiesForMultiUpdate issueID(Long issueID) {
    this.issueID = issueID;
    return this;
  }

   /**
   * The ID of the issue.
   * @return issueID
  **/
  @Schema(description = "The ID of the issue.")
  public Long getIssueID() {
    return issueID;
  }

  public void setIssueID(Long issueID) {
    this.issueID = issueID;
  }

  public IssueEntityPropertiesForMultiUpdate properties(Map<String, JsonNode> properties) {
    this.properties = properties;
    return this;
  }

  public IssueEntityPropertiesForMultiUpdate putPropertiesItem(String key, JsonNode propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<String, JsonNode>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * Entity properties to set on the issue. The maximum length of an issue property value is 32768 characters.
   * @return properties
  **/
  @Schema(description = "Entity properties to set on the issue. The maximum length of an issue property value is 32768 characters.")
  public Map<String, JsonNode> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, JsonNode> properties) {
    this.properties = properties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueEntityPropertiesForMultiUpdate issueEntityPropertiesForMultiUpdate = (IssueEntityPropertiesForMultiUpdate) o;
    return Objects.equals(this.issueID, issueEntityPropertiesForMultiUpdate.issueID) &&
        Objects.equals(this.properties, issueEntityPropertiesForMultiUpdate.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issueID, properties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueEntityPropertiesForMultiUpdate {\n");
    
    sb.append("    issueID: ").append(toIndentedString(issueID)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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