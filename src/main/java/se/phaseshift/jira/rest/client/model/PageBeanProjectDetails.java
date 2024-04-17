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
import se.phaseshift.jira.rest.client.model.ProjectDetails;
/**
 * A page of items.
 */
@Schema(description = "A page of items.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class PageBeanProjectDetails {
  @SerializedName("isLast")
  private Boolean isLast = null;

  @SerializedName("maxResults")
  private Integer maxResults = null;

  @SerializedName("nextPage")
  private String nextPage = null;

  @SerializedName("self")
  private String self = null;

  @SerializedName("startAt")
  private Long startAt = null;

  @SerializedName("total")
  private Long total = null;

  @SerializedName("values")
  private List<ProjectDetails> values = null;

   /**
   * Whether this is the last page.
   * @return isLast
  **/
  @Schema(description = "Whether this is the last page.")
  public Boolean isIsLast() {
    return isLast;
  }

   /**
   * The maximum number of items that could be returned.
   * @return maxResults
  **/
  @Schema(description = "The maximum number of items that could be returned.")
  public Integer getMaxResults() {
    return maxResults;
  }

   /**
   * If there is another page of results, the URL of the next page.
   * @return nextPage
  **/
  @Schema(description = "If there is another page of results, the URL of the next page.")
  public String getNextPage() {
    return nextPage;
  }

   /**
   * The URL of the page.
   * @return self
  **/
  @Schema(description = "The URL of the page.")
  public String getSelf() {
    return self;
  }

   /**
   * The index of the first item returned.
   * @return startAt
  **/
  @Schema(description = "The index of the first item returned.")
  public Long getStartAt() {
    return startAt;
  }

   /**
   * The number of items returned.
   * @return total
  **/
  @Schema(description = "The number of items returned.")
  public Long getTotal() {
    return total;
  }

   /**
   * The list of items.
   * @return values
  **/
  @Schema(description = "The list of items.")
  public List<ProjectDetails> getValues() {
    return values;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageBeanProjectDetails pageBeanProjectDetails = (PageBeanProjectDetails) o;
    return Objects.equals(this.isLast, pageBeanProjectDetails.isLast) &&
        Objects.equals(this.maxResults, pageBeanProjectDetails.maxResults) &&
        Objects.equals(this.nextPage, pageBeanProjectDetails.nextPage) &&
        Objects.equals(this.self, pageBeanProjectDetails.self) &&
        Objects.equals(this.startAt, pageBeanProjectDetails.startAt) &&
        Objects.equals(this.total, pageBeanProjectDetails.total) &&
        Objects.equals(this.values, pageBeanProjectDetails.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isLast, maxResults, nextPage, self, startAt, total, values);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageBeanProjectDetails {\n");
    
    sb.append("    isLast: ").append(toIndentedString(isLast)).append("\n");
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
    sb.append("    nextPage: ").append(toIndentedString(nextPage)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
