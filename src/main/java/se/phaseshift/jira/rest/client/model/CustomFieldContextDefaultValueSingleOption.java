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
 * The default value for a single select custom field.
 */
@Schema(description = "The default value for a single select custom field.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class CustomFieldContextDefaultValueSingleOption implements CustomFieldContextDefaultValue {
  @SerializedName("contextId")
  private String contextId = null;

  @SerializedName("optionId")
  private String optionId = null;

  @SerializedName("type")
  private String type = null;

  public CustomFieldContextDefaultValueSingleOption contextId(String contextId) {
    this.contextId = contextId;
    return this;
  }

   /**
   * The ID of the context.
   * @return contextId
  **/
  @Schema(required = true, description = "The ID of the context.")
  public String getContextId() {
    return contextId;
  }

  public void setContextId(String contextId) {
    this.contextId = contextId;
  }

  public CustomFieldContextDefaultValueSingleOption optionId(String optionId) {
    this.optionId = optionId;
    return this;
  }

   /**
   * The ID of the default option.
   * @return optionId
  **/
  @Schema(required = true, description = "The ID of the default option.")
  public String getOptionId() {
    return optionId;
  }

  public void setOptionId(String optionId) {
    this.optionId = optionId;
  }

  public CustomFieldContextDefaultValueSingleOption type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(required = true, description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFieldContextDefaultValueSingleOption customFieldContextDefaultValueSingleOption = (CustomFieldContextDefaultValueSingleOption) o;
    return Objects.equals(this.contextId, customFieldContextDefaultValueSingleOption.contextId) &&
        Objects.equals(this.optionId, customFieldContextDefaultValueSingleOption.optionId) &&
        Objects.equals(this.type, customFieldContextDefaultValueSingleOption.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contextId, optionId, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldContextDefaultValueSingleOption {\n");
    
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    optionId: ").append(toIndentedString(optionId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
