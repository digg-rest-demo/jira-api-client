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
 * A JSON object with custom content.
 */
@Schema(description = "A JSON object with custom content.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class JsonContextVariable implements OneOfCustomContextVariable {
  @SerializedName("type")
  private String type = null;

  @SerializedName("value")
  private Object value = null;

  public JsonContextVariable type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of custom context variable.
   * @return type
  **/
  @Schema(required = true, description = "Type of custom context variable.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public JsonContextVariable value(Object value) {
    this.value = value;
    return this;
  }

   /**
   * A JSON object containing custom content.
   * @return value
  **/
  @Schema(description = "A JSON object containing custom content.")
  public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonContextVariable jsonContextVariable = (JsonContextVariable) o;
    return Objects.equals(this.type, jsonContextVariable.type) &&
        Objects.equals(this.value, jsonContextVariable.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonContextVariable {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
