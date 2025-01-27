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
 * Result of your JQL search. Returns a list of issue IDs and a token to fetch the next page if one exists.
 */
@Schema(description = "Result of your JQL search. Returns a list of issue IDs and a token to fetch the next page if one exists.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class IdSearchResults {
  @SerializedName("issueIds")
  private List<Long> issueIds = null;

  @SerializedName("nextPageToken")
  private String nextPageToken = null;

   /**
   * The list of issue IDs found by the search.
   * @return issueIds
  **/
  @Schema(description = "The list of issue IDs found by the search.")
  public List<Long> getIssueIds() {
    return issueIds;
  }

   /**
   * Continuation token to fetch the next page. If this result represents the last or the only page this token will be null.
   * @return nextPageToken
  **/
  @Schema(description = "Continuation token to fetch the next page. If this result represents the last or the only page this token will be null.")
  public String getNextPageToken() {
    return nextPageToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdSearchResults idSearchResults = (IdSearchResults) o;
    return Objects.equals(this.issueIds, idSearchResults.issueIds) &&
        Objects.equals(this.nextPageToken, idSearchResults.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issueIds, nextPageToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdSearchResults {\n");
    
    sb.append("    issueIds: ").append(toIndentedString(issueIds)).append("\n");
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
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
