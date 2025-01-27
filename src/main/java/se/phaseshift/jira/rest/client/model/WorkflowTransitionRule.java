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
 * A workflow transition rule.
 */
@Schema(description = "A workflow transition rule.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class WorkflowTransitionRule {
  @SerializedName("configuration")
  private Object _configuration = null;

  @SerializedName("type")
  private String type = null;

  public WorkflowTransitionRule _configuration(Object _configuration) {
    this._configuration = _configuration;
    return this;
  }

   /**
   * EXPERIMENTAL. The configuration of the transition rule.
   * @return _configuration
  **/
  @Schema(description = "EXPERIMENTAL. The configuration of the transition rule.")
  public Object getConfiguration() {
    return _configuration;
  }

  public void setConfiguration(Object _configuration) {
    this._configuration = _configuration;
  }

  public WorkflowTransitionRule type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the transition rule.
   * @return type
  **/
  @Schema(required = true, description = "The type of the transition rule.")
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
    WorkflowTransitionRule workflowTransitionRule = (WorkflowTransitionRule) o;
    return Objects.equals(this._configuration, workflowTransitionRule._configuration) &&
        Objects.equals(this.type, workflowTransitionRule.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_configuration, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowTransitionRule {\n");
    
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
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
