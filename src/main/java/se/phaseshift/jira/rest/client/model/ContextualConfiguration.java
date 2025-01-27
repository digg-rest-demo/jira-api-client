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
 * Details of the contextual configuration for a custom field.
 */
@Schema(description = "Details of the contextual configuration for a custom field.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class ContextualConfiguration {
  @SerializedName("configuration")
  private Object _configuration = null;

  @SerializedName("fieldContextId")
  private String fieldContextId = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("schema")
  private Object schema = null;

  public ContextualConfiguration _configuration(Object _configuration) {
    this._configuration = _configuration;
    return this;
  }

   /**
   * The field configuration.
   * @return _configuration
  **/
  @Schema(description = "The field configuration.")
  public Object getConfiguration() {
    return _configuration;
  }

  public void setConfiguration(Object _configuration) {
    this._configuration = _configuration;
  }

   /**
   * The ID of the field context the configuration is associated with.
   * @return fieldContextId
  **/
  @Schema(required = true, description = "The ID of the field context the configuration is associated with.")
  public String getFieldContextId() {
    return fieldContextId;
  }

  public ContextualConfiguration id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the configuration.
   * @return id
  **/
  @Schema(required = true, description = "The ID of the configuration.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ContextualConfiguration schema(Object schema) {
    this.schema = schema;
    return this;
  }

   /**
   * The field value schema.
   * @return schema
  **/
  @Schema(description = "The field value schema.")
  public Object getSchema() {
    return schema;
  }

  public void setSchema(Object schema) {
    this.schema = schema;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContextualConfiguration contextualConfiguration = (ContextualConfiguration) o;
    return Objects.equals(this._configuration, contextualConfiguration._configuration) &&
        Objects.equals(this.fieldContextId, contextualConfiguration.fieldContextId) &&
        Objects.equals(this.id, contextualConfiguration.id) &&
        Objects.equals(this.schema, contextualConfiguration.schema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_configuration, fieldContextId, id, schema);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContextualConfiguration {\n");
    
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    fieldContextId: ").append(toIndentedString(fieldContextId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
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
