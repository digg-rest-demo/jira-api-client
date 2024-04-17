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
/**
 * Change the order of issue priorities.
 */
@Schema(description = "Change the order of issue priorities.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class ReorderIssuePriorities {
  @SerializedName("after")
  private String after = null;

  @SerializedName("ids")
  private List<String> ids = new ArrayList<String>();

  @SerializedName("position")
  private String position = null;

  public ReorderIssuePriorities after(String after) {
    this.after = after;
    return this;
  }

   /**
   * The ID of the priority. Required if &#x60;position&#x60; isn&#x27;t provided.
   * @return after
  **/
  @Schema(description = "The ID of the priority. Required if `position` isn't provided.")
  public String getAfter() {
    return after;
  }

  public void setAfter(String after) {
    this.after = after;
  }

  public ReorderIssuePriorities ids(List<String> ids) {
    this.ids = ids;
    return this;
  }

  public ReorderIssuePriorities addIdsItem(String idsItem) {
    this.ids.add(idsItem);
    return this;
  }

   /**
   * The list of issue IDs to be reordered. Cannot contain duplicates nor after ID.
   * @return ids
  **/
  @Schema(required = true, description = "The list of issue IDs to be reordered. Cannot contain duplicates nor after ID.")
  public List<String> getIds() {
    return ids;
  }

  public void setIds(List<String> ids) {
    this.ids = ids;
  }

  public ReorderIssuePriorities position(String position) {
    this.position = position;
    return this;
  }

   /**
   * The position for issue priorities to be moved to. Required if &#x60;after&#x60; isn&#x27;t provided.
   * @return position
  **/
  @Schema(description = "The position for issue priorities to be moved to. Required if `after` isn't provided.")
  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReorderIssuePriorities reorderIssuePriorities = (ReorderIssuePriorities) o;
    return Objects.equals(this.after, reorderIssuePriorities.after) &&
        Objects.equals(this.ids, reorderIssuePriorities.ids) &&
        Objects.equals(this.position, reorderIssuePriorities.position);
  }

  @Override
  public int hashCode() {
    return Objects.hash(after, ids, position);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReorderIssuePriorities {\n");
    
    sb.append("    after: ").append(toIndentedString(after)).append("\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
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