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
/**
 * Error
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class Error {
  @SerializedName("count")
  private Long count = null;

  @SerializedName("issueIdsOrKeys")
  private List<String> issueIdsOrKeys = null;

  @SerializedName("message")
  private String message = null;

  public Error count(Long count) {
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @Schema(description = "")
  public Long getCount() {
    return count;
  }

  public void setCount(Long count) {
    this.count = count;
  }

  public Error issueIdsOrKeys(List<String> issueIdsOrKeys) {
    this.issueIdsOrKeys = issueIdsOrKeys;
    return this;
  }

  public Error addIssueIdsOrKeysItem(String issueIdsOrKeysItem) {
    if (this.issueIdsOrKeys == null) {
      this.issueIdsOrKeys = new ArrayList<String>();
    }
    this.issueIdsOrKeys.add(issueIdsOrKeysItem);
    return this;
  }

   /**
   * Get issueIdsOrKeys
   * @return issueIdsOrKeys
  **/
  @Schema(description = "")
  public List<String> getIssueIdsOrKeys() {
    return issueIdsOrKeys;
  }

  public void setIssueIdsOrKeys(List<String> issueIdsOrKeys) {
    this.issueIdsOrKeys = issueIdsOrKeys;
  }

  public Error message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @Schema(description = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.count, error.count) &&
        Objects.equals(this.issueIdsOrKeys, error.issueIdsOrKeys) &&
        Objects.equals(this.message, error.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, issueIdsOrKeys, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    issueIdsOrKeys: ").append(toIndentedString(issueIdsOrKeys)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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