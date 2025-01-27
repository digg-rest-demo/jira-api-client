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
 * The current version details of this workflow scheme.
 */
@Schema(description = "The current version details of this workflow scheme.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class DocumentVersion {
  @SerializedName("id")
  private String id = null;

  @SerializedName("versionNumber")
  private Long versionNumber = null;

  public DocumentVersion id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The version UUID.
   * @return id
  **/
  @Schema(required = true, description = "The version UUID.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DocumentVersion versionNumber(Long versionNumber) {
    this.versionNumber = versionNumber;
    return this;
  }

   /**
   * The version number.
   * @return versionNumber
  **/
  @Schema(required = true, description = "The version number.")
  public Long getVersionNumber() {
    return versionNumber;
  }

  public void setVersionNumber(Long versionNumber) {
    this.versionNumber = versionNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentVersion documentVersion = (DocumentVersion) o;
    return Objects.equals(this.id, documentVersion.id) &&
        Objects.equals(this.versionNumber, documentVersion.versionNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, versionNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentVersion {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    versionNumber: ").append(toIndentedString(versionNumber)).append("\n");
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
