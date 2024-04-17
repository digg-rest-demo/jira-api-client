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
import se.phaseshift.jira.rest.client.model.AttachmentArchiveEntry;
/**
 * AttachmentArchiveImpl
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class AttachmentArchiveImpl {
  @SerializedName("entries")
  private List<AttachmentArchiveEntry> entries = null;

  @SerializedName("totalEntryCount")
  private Integer totalEntryCount = null;

  public AttachmentArchiveImpl entries(List<AttachmentArchiveEntry> entries) {
    this.entries = entries;
    return this;
  }

  public AttachmentArchiveImpl addEntriesItem(AttachmentArchiveEntry entriesItem) {
    if (this.entries == null) {
      this.entries = new ArrayList<AttachmentArchiveEntry>();
    }
    this.entries.add(entriesItem);
    return this;
  }

   /**
   * The list of the items included in the archive.
   * @return entries
  **/
  @Schema(description = "The list of the items included in the archive.")
  public List<AttachmentArchiveEntry> getEntries() {
    return entries;
  }

  public void setEntries(List<AttachmentArchiveEntry> entries) {
    this.entries = entries;
  }

  public AttachmentArchiveImpl totalEntryCount(Integer totalEntryCount) {
    this.totalEntryCount = totalEntryCount;
    return this;
  }

   /**
   * The number of items in the archive.
   * @return totalEntryCount
  **/
  @Schema(description = "The number of items in the archive.")
  public Integer getTotalEntryCount() {
    return totalEntryCount;
  }

  public void setTotalEntryCount(Integer totalEntryCount) {
    this.totalEntryCount = totalEntryCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachmentArchiveImpl attachmentArchiveImpl = (AttachmentArchiveImpl) o;
    return Objects.equals(this.entries, attachmentArchiveImpl.entries) &&
        Objects.equals(this.totalEntryCount, attachmentArchiveImpl.totalEntryCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entries, totalEntryCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachmentArchiveImpl {\n");
    
    sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
    sb.append("    totalEntryCount: ").append(toIndentedString(totalEntryCount)).append("\n");
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