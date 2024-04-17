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
import se.phaseshift.jira.rest.client.model.JQLQueryWithUnknownUsers;
/**
 * The converted JQL queries.
 */
@Schema(description = "The converted JQL queries.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class ConvertedJQLQueries {
  @SerializedName("queriesWithUnknownUsers")
  private List<JQLQueryWithUnknownUsers> queriesWithUnknownUsers = null;

  @SerializedName("queryStrings")
  private List<String> queryStrings = null;

  public ConvertedJQLQueries queriesWithUnknownUsers(List<JQLQueryWithUnknownUsers> queriesWithUnknownUsers) {
    this.queriesWithUnknownUsers = queriesWithUnknownUsers;
    return this;
  }

  public ConvertedJQLQueries addQueriesWithUnknownUsersItem(JQLQueryWithUnknownUsers queriesWithUnknownUsersItem) {
    if (this.queriesWithUnknownUsers == null) {
      this.queriesWithUnknownUsers = new ArrayList<JQLQueryWithUnknownUsers>();
    }
    this.queriesWithUnknownUsers.add(queriesWithUnknownUsersItem);
    return this;
  }

   /**
   * List of queries containing user information that could not be mapped to an existing user
   * @return queriesWithUnknownUsers
  **/
  @Schema(description = "List of queries containing user information that could not be mapped to an existing user")
  public List<JQLQueryWithUnknownUsers> getQueriesWithUnknownUsers() {
    return queriesWithUnknownUsers;
  }

  public void setQueriesWithUnknownUsers(List<JQLQueryWithUnknownUsers> queriesWithUnknownUsers) {
    this.queriesWithUnknownUsers = queriesWithUnknownUsers;
  }

  public ConvertedJQLQueries queryStrings(List<String> queryStrings) {
    this.queryStrings = queryStrings;
    return this;
  }

  public ConvertedJQLQueries addQueryStringsItem(String queryStringsItem) {
    if (this.queryStrings == null) {
      this.queryStrings = new ArrayList<String>();
    }
    this.queryStrings.add(queryStringsItem);
    return this;
  }

   /**
   * The list of converted query strings with account IDs in place of user identifiers.
   * @return queryStrings
  **/
  @Schema(description = "The list of converted query strings with account IDs in place of user identifiers.")
  public List<String> getQueryStrings() {
    return queryStrings;
  }

  public void setQueryStrings(List<String> queryStrings) {
    this.queryStrings = queryStrings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConvertedJQLQueries convertedJQLQueries = (ConvertedJQLQueries) o;
    return Objects.equals(this.queriesWithUnknownUsers, convertedJQLQueries.queriesWithUnknownUsers) &&
        Objects.equals(this.queryStrings, convertedJQLQueries.queryStrings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queriesWithUnknownUsers, queryStrings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConvertedJQLQueries {\n");
    
    sb.append("    queriesWithUnknownUsers: ").append(toIndentedString(queriesWithUnknownUsers)).append("\n");
    sb.append("    queryStrings: ").append(toIndentedString(queryStrings)).append("\n");
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
