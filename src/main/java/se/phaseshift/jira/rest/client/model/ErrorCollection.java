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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Error messages from an operation.
 */
@Schema(description = "Error messages from an operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class ErrorCollection {
  @SerializedName("errorMessages")
  private List<String> errorMessages = null;

  @SerializedName("errors")
  private Map<String, String> errors = null;

  @SerializedName("status")
  private Integer status = null;

  public ErrorCollection errorMessages(List<String> errorMessages) {
    this.errorMessages = errorMessages;
    return this;
  }

  public ErrorCollection addErrorMessagesItem(String errorMessagesItem) {
    if (this.errorMessages == null) {
      this.errorMessages = new ArrayList<String>();
    }
    this.errorMessages.add(errorMessagesItem);
    return this;
  }

   /**
   * The list of error messages produced by this operation. For example, \&quot;input parameter &#x27;key&#x27; must be provided\&quot;
   * @return errorMessages
  **/
  @Schema(description = "The list of error messages produced by this operation. For example, \"input parameter 'key' must be provided\"")
  public List<String> getErrorMessages() {
    return errorMessages;
  }

  public void setErrorMessages(List<String> errorMessages) {
    this.errorMessages = errorMessages;
  }

  public ErrorCollection errors(Map<String, String> errors) {
    this.errors = errors;
    return this;
  }

  public ErrorCollection putErrorsItem(String key, String errorsItem) {
    if (this.errors == null) {
      this.errors = new HashMap<String, String>();
    }
    this.errors.put(key, errorsItem);
    return this;
  }

   /**
   * The list of errors by parameter returned by the operation. For example,\&quot;projectKey\&quot;: \&quot;Project keys must start with an uppercase letter, followed by one or more uppercase alphanumeric characters.\&quot;
   * @return errors
  **/
  @Schema(description = "The list of errors by parameter returned by the operation. For example,\"projectKey\": \"Project keys must start with an uppercase letter, followed by one or more uppercase alphanumeric characters.\"")
  public Map<String, String> getErrors() {
    return errors;
  }

  public void setErrors(Map<String, String> errors) {
    this.errors = errors;
  }

  public ErrorCollection status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorCollection errorCollection = (ErrorCollection) o;
    return Objects.equals(this.errorMessages, errorCollection.errorMessages) &&
        Objects.equals(this.errors, errorCollection.errors) &&
        Objects.equals(this.status, errorCollection.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorMessages, errors, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorCollection {\n");
    
    sb.append("    errorMessages: ").append(toIndentedString(errorMessages)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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