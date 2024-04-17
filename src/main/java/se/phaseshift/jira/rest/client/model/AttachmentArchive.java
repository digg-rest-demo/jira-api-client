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
 * AttachmentArchive
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class AttachmentArchive {
  @SerializedName("entries")
  private List<AttachmentArchiveEntry> entries = null;

  @SerializedName("moreAvailable")
  private Boolean moreAvailable = null;

  @SerializedName("totalEntryCount")
  private Integer totalEntryCount = null;

  @SerializedName("totalNumberOfEntriesAvailable")
  private Integer totalNumberOfEntriesAvailable = null;

  public AttachmentArchive entries(List<AttachmentArchiveEntry> entries) {
    this.entries = entries;
    return this;
  }

  public AttachmentArchive addEntriesItem(AttachmentArchiveEntry entriesItem) {
    if (this.entries == null) {
      this.entries = new ArrayList<AttachmentArchiveEntry>();
    }
    this.entries.add(entriesItem);
    return this;
  }

   /**
   * Get entries
   * @return entries
  **/
  @Schema(description = "")
  public List<AttachmentArchiveEntry> getEntries() {
    return entries;
  }

  public void setEntries(List<AttachmentArchiveEntry> entries) {
    this.entries = entries;
  }

  public AttachmentArchive moreAvailable(Boolean moreAvailable) {
    this.moreAvailable = moreAvailable;
    return this;
  }

   /**
   * Get moreAvailable
   * @return moreAvailable
  **/
  @Schema(description = "")
  public Boolean isMoreAvailable() {
    return moreAvailable;
  }

  public void setMoreAvailable(Boolean moreAvailable) {
    this.moreAvailable = moreAvailable;
  }

  public AttachmentArchive totalEntryCount(Integer totalEntryCount) {
    this.totalEntryCount = totalEntryCount;
    return this;
  }

   /**
   * Get totalEntryCount
   * @return totalEntryCount
  **/
  @Schema(description = "")
  public Integer getTotalEntryCount() {
    return totalEntryCount;
  }

  public void setTotalEntryCount(Integer totalEntryCount) {
    this.totalEntryCount = totalEntryCount;
  }

  public AttachmentArchive totalNumberOfEntriesAvailable(Integer totalNumberOfEntriesAvailable) {
    this.totalNumberOfEntriesAvailable = totalNumberOfEntriesAvailable;
    return this;
  }

   /**
   * Get totalNumberOfEntriesAvailable
   * @return totalNumberOfEntriesAvailable
  **/
  @Schema(description = "")
  public Integer getTotalNumberOfEntriesAvailable() {
    return totalNumberOfEntriesAvailable;
  }

  public void setTotalNumberOfEntriesAvailable(Integer totalNumberOfEntriesAvailable) {
    this.totalNumberOfEntriesAvailable = totalNumberOfEntriesAvailable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachmentArchive attachmentArchive = (AttachmentArchive) o;
    return Objects.equals(this.entries, attachmentArchive.entries) &&
        Objects.equals(this.moreAvailable, attachmentArchive.moreAvailable) &&
        Objects.equals(this.totalEntryCount, attachmentArchive.totalEntryCount) &&
        Objects.equals(this.totalNumberOfEntriesAvailable, attachmentArchive.totalNumberOfEntriesAvailable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entries, moreAvailable, totalEntryCount, totalNumberOfEntriesAvailable);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachmentArchive {\n");
    
    sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
    sb.append("    moreAvailable: ").append(toIndentedString(moreAvailable)).append("\n");
    sb.append("    totalEntryCount: ").append(toIndentedString(totalEntryCount)).append("\n");
    sb.append("    totalNumberOfEntriesAvailable: ").append(toIndentedString(totalNumberOfEntriesAvailable)).append("\n");
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
