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
 * IdSearchRequestBean
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class IdSearchRequestBean {
  @SerializedName("jql")
  private String jql = null;

  @SerializedName("maxResults")
  private Integer maxResults = 1000;

  @SerializedName("nextPageToken")
  private String nextPageToken = null;

  public IdSearchRequestBean jql(String jql) {
    this.jql = jql;
    return this;
  }

   /**
   * A [JQL](https://confluence.atlassian.com/x/egORLQ) expression. Order by clauses are not allowed.
   * @return jql
  **/
  @Schema(description = "A [JQL](https://confluence.atlassian.com/x/egORLQ) expression. Order by clauses are not allowed.")
  public String getJql() {
    return jql;
  }

  public void setJql(String jql) {
    this.jql = jql;
  }

  public IdSearchRequestBean maxResults(Integer maxResults) {
    this.maxResults = maxResults;
    return this;
  }

   /**
   * The maximum number of items to return per page.
   * @return maxResults
  **/
  @Schema(description = "The maximum number of items to return per page.")
  public Integer getMaxResults() {
    return maxResults;
  }

  public void setMaxResults(Integer maxResults) {
    this.maxResults = maxResults;
  }

  public IdSearchRequestBean nextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

   /**
   * The continuation token to fetch the next page. This token is provided by the response of this endpoint.
   * @return nextPageToken
  **/
  @Schema(description = "The continuation token to fetch the next page. This token is provided by the response of this endpoint.")
  public String getNextPageToken() {
    return nextPageToken;
  }

  public void setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdSearchRequestBean idSearchRequestBean = (IdSearchRequestBean) o;
    return Objects.equals(this.jql, idSearchRequestBean.jql) &&
        Objects.equals(this.maxResults, idSearchRequestBean.maxResults) &&
        Objects.equals(this.nextPageToken, idSearchRequestBean.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jql, maxResults, nextPageToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdSearchRequestBean {\n");
    
    sb.append("    jql: ").append(toIndentedString(jql)).append("\n");
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
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
