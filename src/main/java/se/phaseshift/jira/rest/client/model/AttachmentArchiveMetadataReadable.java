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
import se.phaseshift.jira.rest.client.model.AttachmentArchiveItemReadable;
/**
 * Metadata for an archive (for example a zip) and its contents.
 */
@Schema(description = "Metadata for an archive (for example a zip) and its contents.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class AttachmentArchiveMetadataReadable {
  @SerializedName("entries")
  private List<AttachmentArchiveItemReadable> entries = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("mediaType")
  private String mediaType = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("totalEntryCount")
  private Long totalEntryCount = null;

   /**
   * The list of the items included in the archive.
   * @return entries
  **/
  @Schema(description = "The list of the items included in the archive.")
  public List<AttachmentArchiveItemReadable> getEntries() {
    return entries;
  }

   /**
   * The ID of the attachment.
   * @return id
  **/
  @Schema(description = "The ID of the attachment.")
  public Long getId() {
    return id;
  }

   /**
   * The MIME type of the attachment.
   * @return mediaType
  **/
  @Schema(description = "The MIME type of the attachment.")
  public String getMediaType() {
    return mediaType;
  }

   /**
   * The name of the archive file.
   * @return name
  **/
  @Schema(description = "The name of the archive file.")
  public String getName() {
    return name;
  }

   /**
   * The number of items included in the archive.
   * @return totalEntryCount
  **/
  @Schema(description = "The number of items included in the archive.")
  public Long getTotalEntryCount() {
    return totalEntryCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachmentArchiveMetadataReadable attachmentArchiveMetadataReadable = (AttachmentArchiveMetadataReadable) o;
    return Objects.equals(this.entries, attachmentArchiveMetadataReadable.entries) &&
        Objects.equals(this.id, attachmentArchiveMetadataReadable.id) &&
        Objects.equals(this.mediaType, attachmentArchiveMetadataReadable.mediaType) &&
        Objects.equals(this.name, attachmentArchiveMetadataReadable.name) &&
        Objects.equals(this.totalEntryCount, attachmentArchiveMetadataReadable.totalEntryCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entries, id, mediaType, name, totalEntryCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachmentArchiveMetadataReadable {\n");
    
    sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
