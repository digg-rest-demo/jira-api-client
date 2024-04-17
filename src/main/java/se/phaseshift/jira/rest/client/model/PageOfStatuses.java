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
import se.phaseshift.jira.rest.client.model.JiraStatus;
/**
 * PageOfStatuses
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class PageOfStatuses {
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
  private List<JiraStatus> values = null;

  public PageOfStatuses isLast(Boolean isLast) {
    this.isLast = isLast;
    return this;
  }

   /**
   * Whether this is the last page.
   * @return isLast
  **/
  @Schema(description = "Whether this is the last page.")
  public Boolean isIsLast() {
    return isLast;
  }

  public void setIsLast(Boolean isLast) {
    this.isLast = isLast;
  }

  public PageOfStatuses maxResults(Integer maxResults) {
    this.maxResults = maxResults;
    return this;
  }

   /**
   * The maximum number of items that could be returned.
   * @return maxResults
  **/
  @Schema(description = "The maximum number of items that could be returned.")
  public Integer getMaxResults() {
    return maxResults;
  }

  public void setMaxResults(Integer maxResults) {
    this.maxResults = maxResults;
  }

  public PageOfStatuses nextPage(String nextPage) {
    this.nextPage = nextPage;
    return this;
  }

   /**
   * The URL of the next page of results, if any.
   * @return nextPage
  **/
  @Schema(description = "The URL of the next page of results, if any.")
  public String getNextPage() {
    return nextPage;
  }

  public void setNextPage(String nextPage) {
    this.nextPage = nextPage;
  }

  public PageOfStatuses self(String self) {
    this.self = self;
    return this;
  }

   /**
   * The URL of this page.
   * @return self
  **/
  @Schema(description = "The URL of this page.")
  public String getSelf() {
    return self;
  }

  public void setSelf(String self) {
    this.self = self;
  }

  public PageOfStatuses startAt(Long startAt) {
    this.startAt = startAt;
    return this;
  }

   /**
   * The index of the first item returned on the page.
   * @return startAt
  **/
  @Schema(description = "The index of the first item returned on the page.")
  public Long getStartAt() {
    return startAt;
  }

  public void setStartAt(Long startAt) {
    this.startAt = startAt;
  }

  public PageOfStatuses total(Long total) {
    this.total = total;
    return this;
  }

   /**
   * Number of items that satisfy the search.
   * @return total
  **/
  @Schema(description = "Number of items that satisfy the search.")
  public Long getTotal() {
    return total;
  }

  public void setTotal(Long total) {
    this.total = total;
  }

  public PageOfStatuses values(List<JiraStatus> values) {
    this.values = values;
    return this;
  }

  public PageOfStatuses addValuesItem(JiraStatus valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<JiraStatus>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * The list of items.
   * @return values
  **/
  @Schema(description = "The list of items.")
  public List<JiraStatus> getValues() {
    return values;
  }

  public void setValues(List<JiraStatus> values) {
    this.values = values;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageOfStatuses pageOfStatuses = (PageOfStatuses) o;
    return Objects.equals(this.isLast, pageOfStatuses.isLast) &&
        Objects.equals(this.maxResults, pageOfStatuses.maxResults) &&
        Objects.equals(this.nextPage, pageOfStatuses.nextPage) &&
        Objects.equals(this.self, pageOfStatuses.self) &&
        Objects.equals(this.startAt, pageOfStatuses.startAt) &&
        Objects.equals(this.total, pageOfStatuses.total) &&
        Objects.equals(this.values, pageOfStatuses.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isLast, maxResults, nextPage, self, startAt, total, values);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageOfStatuses {\n");
    
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
