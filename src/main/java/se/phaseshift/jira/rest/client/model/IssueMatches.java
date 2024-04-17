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
import se.phaseshift.jira.rest.client.model.IssueMatchesForJQL;
/**
 * A list of matched issues or errors for each JQL query, in the order the JQL queries were passed.
 */
@Schema(description = "A list of matched issues or errors for each JQL query, in the order the JQL queries were passed.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class IssueMatches {
  @SerializedName("matches")
  private List<IssueMatchesForJQL> matches = new ArrayList<IssueMatchesForJQL>();

  public IssueMatches matches(List<IssueMatchesForJQL> matches) {
    this.matches = matches;
    return this;
  }

  public IssueMatches addMatchesItem(IssueMatchesForJQL matchesItem) {
    this.matches.add(matchesItem);
    return this;
  }

   /**
   * Get matches
   * @return matches
  **/
  @Schema(required = true, description = "")
  public List<IssueMatchesForJQL> getMatches() {
    return matches;
  }

  public void setMatches(List<IssueMatchesForJQL> matches) {
    this.matches = matches;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueMatches issueMatches = (IssueMatches) o;
    return Objects.equals(this.matches, issueMatches.matches);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matches);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueMatches {\n");
    
    sb.append("    matches: ").append(toIndentedString(matches)).append("\n");
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