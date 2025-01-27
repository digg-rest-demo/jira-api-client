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
import se.phaseshift.jira.rest.client.model.BulkOperationErrorResult;
import se.phaseshift.jira.rest.client.model.CreatedIssue;
/**
 * Details about the issues created and the errors for requests that failed.
 */
@Schema(description = "Details about the issues created and the errors for requests that failed.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class CreatedIssues {
  @SerializedName("errors")
  private List<BulkOperationErrorResult> errors = null;

  @SerializedName("issues")
  private List<CreatedIssue> issues = null;

   /**
   * Error details for failed issue creation requests.
   * @return errors
  **/
  @Schema(description = "Error details for failed issue creation requests.")
  public List<BulkOperationErrorResult> getErrors() {
    return errors;
  }

   /**
   * Details of the issues created.
   * @return issues
  **/
  @Schema(description = "Details of the issues created.")
  public List<CreatedIssue> getIssues() {
    return issues;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatedIssues createdIssues = (CreatedIssues) o;
    return Objects.equals(this.errors, createdIssues.errors) &&
        Objects.equals(this.issues, createdIssues.issues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, issues);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatedIssues {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    issues: ").append(toIndentedString(issues)).append("\n");
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
