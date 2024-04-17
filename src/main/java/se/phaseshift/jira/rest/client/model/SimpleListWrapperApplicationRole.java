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
import se.phaseshift.jira.rest.client.model.ApplicationRole;
import se.phaseshift.jira.rest.client.model.ListWrapperCallbackApplicationRole;
/**
 * SimpleListWrapperApplicationRole
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class SimpleListWrapperApplicationRole {
  @SerializedName("callback")
  private ListWrapperCallbackApplicationRole callback = null;

  @SerializedName("items")
  private List<ApplicationRole> items = null;

  @SerializedName("max-results")
  private Integer maxResults = null;

  @SerializedName("pagingCallback")
  private ListWrapperCallbackApplicationRole pagingCallback = null;

  @SerializedName("size")
  private Integer size = null;

  public SimpleListWrapperApplicationRole callback(ListWrapperCallbackApplicationRole callback) {
    this.callback = callback;
    return this;
  }

   /**
   * Get callback
   * @return callback
  **/
  @Schema(description = "")
  public ListWrapperCallbackApplicationRole getCallback() {
    return callback;
  }

  public void setCallback(ListWrapperCallbackApplicationRole callback) {
    this.callback = callback;
  }

  public SimpleListWrapperApplicationRole items(List<ApplicationRole> items) {
    this.items = items;
    return this;
  }

  public SimpleListWrapperApplicationRole addItemsItem(ApplicationRole itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<ApplicationRole>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @Schema(description = "")
  public List<ApplicationRole> getItems() {
    return items;
  }

  public void setItems(List<ApplicationRole> items) {
    this.items = items;
  }

  public SimpleListWrapperApplicationRole maxResults(Integer maxResults) {
    this.maxResults = maxResults;
    return this;
  }

   /**
   * Get maxResults
   * @return maxResults
  **/
  @Schema(description = "")
  public Integer getMaxResults() {
    return maxResults;
  }

  public void setMaxResults(Integer maxResults) {
    this.maxResults = maxResults;
  }

  public SimpleListWrapperApplicationRole pagingCallback(ListWrapperCallbackApplicationRole pagingCallback) {
    this.pagingCallback = pagingCallback;
    return this;
  }

   /**
   * Get pagingCallback
   * @return pagingCallback
  **/
  @Schema(description = "")
  public ListWrapperCallbackApplicationRole getPagingCallback() {
    return pagingCallback;
  }

  public void setPagingCallback(ListWrapperCallbackApplicationRole pagingCallback) {
    this.pagingCallback = pagingCallback;
  }

  public SimpleListWrapperApplicationRole size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @Schema(description = "")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimpleListWrapperApplicationRole simpleListWrapperApplicationRole = (SimpleListWrapperApplicationRole) o;
    return Objects.equals(this.callback, simpleListWrapperApplicationRole.callback) &&
        Objects.equals(this.items, simpleListWrapperApplicationRole.items) &&
        Objects.equals(this.maxResults, simpleListWrapperApplicationRole.maxResults) &&
        Objects.equals(this.pagingCallback, simpleListWrapperApplicationRole.pagingCallback) &&
        Objects.equals(this.size, simpleListWrapperApplicationRole.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callback, items, maxResults, pagingCallback, size);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimpleListWrapperApplicationRole {\n");
    
    sb.append("    callback: ").append(toIndentedString(callback)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
    sb.append("    pagingCallback: ").append(toIndentedString(pagingCallback)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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