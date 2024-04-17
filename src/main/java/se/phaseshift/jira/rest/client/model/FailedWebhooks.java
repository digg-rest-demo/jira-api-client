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
import se.phaseshift.jira.rest.client.model.FailedWebhook;
/**
 * A page of failed webhooks.
 */
@Schema(description = "A page of failed webhooks.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class FailedWebhooks {
  @SerializedName("maxResults")
  private Integer maxResults = null;

  @SerializedName("next")
  private String next = null;

  @SerializedName("values")
  private List<FailedWebhook> values = new ArrayList<FailedWebhook>();

  public FailedWebhooks maxResults(Integer maxResults) {
    this.maxResults = maxResults;
    return this;
  }

   /**
   * The maximum number of items on the page. If the list of values is shorter than this number, then there are no more pages.
   * @return maxResults
  **/
  @Schema(required = true, description = "The maximum number of items on the page. If the list of values is shorter than this number, then there are no more pages.")
  public Integer getMaxResults() {
    return maxResults;
  }

  public void setMaxResults(Integer maxResults) {
    this.maxResults = maxResults;
  }

  public FailedWebhooks next(String next) {
    this.next = next;
    return this;
  }

   /**
   * The URL to the next page of results. Present only if the request returned at least one result.The next page may be empty at the time of receiving the response, but new failed webhooks may appear in time. You can save the URL to the next page and query for new results periodically (for example, every hour).
   * @return next
  **/
  @Schema(description = "The URL to the next page of results. Present only if the request returned at least one result.The next page may be empty at the time of receiving the response, but new failed webhooks may appear in time. You can save the URL to the next page and query for new results periodically (for example, every hour).")
  public String getNext() {
    return next;
  }

  public void setNext(String next) {
    this.next = next;
  }

  public FailedWebhooks values(List<FailedWebhook> values) {
    this.values = values;
    return this;
  }

  public FailedWebhooks addValuesItem(FailedWebhook valuesItem) {
    this.values.add(valuesItem);
    return this;
  }

   /**
   * The list of webhooks.
   * @return values
  **/
  @Schema(required = true, description = "The list of webhooks.")
  public List<FailedWebhook> getValues() {
    return values;
  }

  public void setValues(List<FailedWebhook> values) {
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
    FailedWebhooks failedWebhooks = (FailedWebhooks) o;
    return Objects.equals(this.maxResults, failedWebhooks.maxResults) &&
        Objects.equals(this.next, failedWebhooks.next) &&
        Objects.equals(this.values, failedWebhooks.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxResults, next, values);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FailedWebhooks {\n");
    
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
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
