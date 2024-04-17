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
 * Properties that identify a published workflow.
 */
@Schema(description = "Properties that identify a published workflow.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class PublishedWorkflowId {
  @SerializedName("entityId")
  private String entityId = null;

  @SerializedName("name")
  private String name = null;

  public PublishedWorkflowId entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

   /**
   * The entity ID of the workflow.
   * @return entityId
  **/
  @Schema(description = "The entity ID of the workflow.")
  public String getEntityId() {
    return entityId;
  }

  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }

  public PublishedWorkflowId name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the workflow.
   * @return name
  **/
  @Schema(required = true, description = "The name of the workflow.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublishedWorkflowId publishedWorkflowId = (PublishedWorkflowId) o;
    return Objects.equals(this.entityId, publishedWorkflowId.entityId) &&
        Objects.equals(this.name, publishedWorkflowId.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityId, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublishedWorkflowId {\n");
    
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
