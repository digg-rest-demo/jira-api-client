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
 * Count of a version&#x27;s unresolved issues.
 */
@Schema(description = "Count of a version's unresolved issues.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class VersionUnresolvedIssuesCount {
  @SerializedName("issuesCount")
  private Long issuesCount = null;

  @SerializedName("issuesUnresolvedCount")
  private Long issuesUnresolvedCount = null;

  @SerializedName("self")
  private String self = null;

   /**
   * Count of issues.
   * @return issuesCount
  **/
  @Schema(description = "Count of issues.")
  public Long getIssuesCount() {
    return issuesCount;
  }

   /**
   * Count of unresolved issues.
   * @return issuesUnresolvedCount
  **/
  @Schema(description = "Count of unresolved issues.")
  public Long getIssuesUnresolvedCount() {
    return issuesUnresolvedCount;
  }

   /**
   * The URL of these count details.
   * @return self
  **/
  @Schema(description = "The URL of these count details.")
  public String getSelf() {
    return self;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionUnresolvedIssuesCount versionUnresolvedIssuesCount = (VersionUnresolvedIssuesCount) o;
    return Objects.equals(this.issuesCount, versionUnresolvedIssuesCount.issuesCount) &&
        Objects.equals(this.issuesUnresolvedCount, versionUnresolvedIssuesCount.issuesUnresolvedCount) &&
        Objects.equals(this.self, versionUnresolvedIssuesCount.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issuesCount, issuesUnresolvedCount, self);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionUnresolvedIssuesCount {\n");
    
    sb.append("    issuesCount: ").append(toIndentedString(issuesCount)).append("\n");
    sb.append("    issuesUnresolvedCount: ").append(toIndentedString(issuesUnresolvedCount)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
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
