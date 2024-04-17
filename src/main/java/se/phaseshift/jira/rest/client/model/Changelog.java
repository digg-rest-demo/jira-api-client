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
import org.threeten.bp.OffsetDateTime;
import se.phaseshift.jira.rest.client.model.ChangeDetails;
/**
 * A log of changes made to issue fields. Changelogs related to workflow associations are currently being deprecated.
 */
@Schema(description = "A log of changes made to issue fields. Changelogs related to workflow associations are currently being deprecated.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class Changelog {
  @SerializedName("author")
  private AllOfChangelogAuthor author = null;

  @SerializedName("created")
  private OffsetDateTime created = null;

  @SerializedName("historyMetadata")
  private AllOfChangelogHistoryMetadata historyMetadata = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("items")
  private List<ChangeDetails> items = null;

   /**
   * The user who made the change.
   * @return author
  **/
  @Schema(description = "The user who made the change.")
  public AllOfChangelogAuthor getAuthor() {
    return author;
  }

   /**
   * The date on which the change took place.
   * @return created
  **/
  @Schema(description = "The date on which the change took place.")
  public OffsetDateTime getCreated() {
    return created;
  }

   /**
   * The history metadata associated with the changed.
   * @return historyMetadata
  **/
  @Schema(description = "The history metadata associated with the changed.")
  public AllOfChangelogHistoryMetadata getHistoryMetadata() {
    return historyMetadata;
  }

   /**
   * The ID of the changelog.
   * @return id
  **/
  @Schema(description = "The ID of the changelog.")
  public String getId() {
    return id;
  }

   /**
   * The list of items changed.
   * @return items
  **/
  @Schema(description = "The list of items changed.")
  public List<ChangeDetails> getItems() {
    return items;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Changelog changelog = (Changelog) o;
    return Objects.equals(this.author, changelog.author) &&
        Objects.equals(this.created, changelog.created) &&
        Objects.equals(this.historyMetadata, changelog.historyMetadata) &&
        Objects.equals(this.id, changelog.id) &&
        Objects.equals(this.items, changelog.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(author, created, historyMetadata, id, items);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Changelog {\n");
    
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    historyMetadata: ").append(toIndentedString(historyMetadata)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
