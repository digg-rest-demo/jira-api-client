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
import org.threeten.bp.OffsetDateTime;
/**
 * Additional details about a project.
 */
@Schema(description = "Additional details about a project.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class ProjectInsight {
  @SerializedName("lastIssueUpdateTime")
  private OffsetDateTime lastIssueUpdateTime = null;

  @SerializedName("totalIssueCount")
  private Long totalIssueCount = null;

   /**
   * The last issue update time.
   * @return lastIssueUpdateTime
  **/
  @Schema(description = "The last issue update time.")
  public OffsetDateTime getLastIssueUpdateTime() {
    return lastIssueUpdateTime;
  }

   /**
   * Total issue count.
   * @return totalIssueCount
  **/
  @Schema(description = "Total issue count.")
  public Long getTotalIssueCount() {
    return totalIssueCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectInsight projectInsight = (ProjectInsight) o;
    return Objects.equals(this.lastIssueUpdateTime, projectInsight.lastIssueUpdateTime) &&
        Objects.equals(this.totalIssueCount, projectInsight.totalIssueCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastIssueUpdateTime, totalIssueCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectInsight {\n");
    
    sb.append("    lastIssueUpdateTime: ").append(toIndentedString(lastIssueUpdateTime)).append("\n");
    sb.append("    totalIssueCount: ").append(toIndentedString(totalIssueCount)).append("\n");
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