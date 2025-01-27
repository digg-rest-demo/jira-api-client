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
/**
 * IssueLimitReportRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class IssueLimitReportRequest {
  @SerializedName("issuesApproachingLimitParams")
  private Map<String, Integer> issuesApproachingLimitParams = null;

  public IssueLimitReportRequest issuesApproachingLimitParams(Map<String, Integer> issuesApproachingLimitParams) {
    this.issuesApproachingLimitParams = issuesApproachingLimitParams;
    return this;
  }

  public IssueLimitReportRequest putIssuesApproachingLimitParamsItem(String key, Integer issuesApproachingLimitParamsItem) {
    if (this.issuesApproachingLimitParams == null) {
      this.issuesApproachingLimitParams = new HashMap<String, Integer>();
    }
    this.issuesApproachingLimitParams.put(key, issuesApproachingLimitParamsItem);
    return this;
  }

   /**
   * A list of fields and their respective approaching limit threshold. Required for querying issues approaching limits. Optional for querying issues breaching limits. For example: \&quot;issuesApproachingLimitParams\&quot;: \\{\&quot;comment\&quot;: 4500\\}
   * @return issuesApproachingLimitParams
  **/
  @Schema(description = "A list of fields and their respective approaching limit threshold. Required for querying issues approaching limits. Optional for querying issues breaching limits. For example: \"issuesApproachingLimitParams\": \\{\"comment\": 4500\\}")
  public Map<String, Integer> getIssuesApproachingLimitParams() {
    return issuesApproachingLimitParams;
  }

  public void setIssuesApproachingLimitParams(Map<String, Integer> issuesApproachingLimitParams) {
    this.issuesApproachingLimitParams = issuesApproachingLimitParams;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueLimitReportRequest issueLimitReportRequest = (IssueLimitReportRequest) o;
    return Objects.equals(this.issuesApproachingLimitParams, issueLimitReportRequest.issuesApproachingLimitParams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issuesApproachingLimitParams);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueLimitReportRequest {\n");
    
    sb.append("    issuesApproachingLimitParams: ").append(toIndentedString(issuesApproachingLimitParams)).append("\n");
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
