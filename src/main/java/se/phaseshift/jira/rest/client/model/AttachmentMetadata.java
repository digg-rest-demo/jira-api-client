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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.OffsetDateTime;
/**
 * Metadata for an issue attachment.
 */
@Schema(description = "Metadata for an issue attachment.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class AttachmentMetadata {
  @SerializedName("author")
  private AllOfAttachmentMetadataAuthor author = null;

  @SerializedName("content")
  private String content = null;

  @SerializedName("created")
  private OffsetDateTime created = null;

  @SerializedName("filename")
  private String filename = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("mimeType")
  private String mimeType = null;

  @SerializedName("properties")
  private Map<String, Object> properties = null;

  @SerializedName("self")
  private String self = null;

  @SerializedName("size")
  private Long size = null;

  @SerializedName("thumbnail")
  private String thumbnail = null;

   /**
   * Details of the user who attached the file.
   * @return author
  **/
  @Schema(description = "Details of the user who attached the file.")
  public AllOfAttachmentMetadataAuthor getAuthor() {
    return author;
  }

   /**
   * The URL of the attachment.
   * @return content
  **/
  @Schema(description = "The URL of the attachment.")
  public String getContent() {
    return content;
  }

   /**
   * The datetime the attachment was created.
   * @return created
  **/
  @Schema(description = "The datetime the attachment was created.")
  public OffsetDateTime getCreated() {
    return created;
  }

   /**
   * The name of the attachment file.
   * @return filename
  **/
  @Schema(description = "The name of the attachment file.")
  public String getFilename() {
    return filename;
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
   * @return mimeType
  **/
  @Schema(description = "The MIME type of the attachment.")
  public String getMimeType() {
    return mimeType;
  }

   /**
   * Additional properties of the attachment.
   * @return properties
  **/
  @Schema(description = "Additional properties of the attachment.")
  public Map<String, Object> getProperties() {
    return properties;
  }

   /**
   * The URL of the attachment metadata details.
   * @return self
  **/
  @Schema(description = "The URL of the attachment metadata details.")
  public String getSelf() {
    return self;
  }

   /**
   * The size of the attachment.
   * @return size
  **/
  @Schema(description = "The size of the attachment.")
  public Long getSize() {
    return size;
  }

   /**
   * The URL of a thumbnail representing the attachment.
   * @return thumbnail
  **/
  @Schema(description = "The URL of a thumbnail representing the attachment.")
  public String getThumbnail() {
    return thumbnail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachmentMetadata attachmentMetadata = (AttachmentMetadata) o;
    return Objects.equals(this.author, attachmentMetadata.author) &&
        Objects.equals(this.content, attachmentMetadata.content) &&
        Objects.equals(this.created, attachmentMetadata.created) &&
        Objects.equals(this.filename, attachmentMetadata.filename) &&
        Objects.equals(this.id, attachmentMetadata.id) &&
        Objects.equals(this.mimeType, attachmentMetadata.mimeType) &&
        Objects.equals(this.properties, attachmentMetadata.properties) &&
        Objects.equals(this.self, attachmentMetadata.self) &&
        Objects.equals(this.size, attachmentMetadata.size) &&
        Objects.equals(this.thumbnail, attachmentMetadata.thumbnail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(author, content, created, filename, id, mimeType, properties, self, size, thumbnail);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachmentMetadata {\n");
    
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
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
