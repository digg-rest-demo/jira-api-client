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
 * Bulk issue property update request details.
 */
@Schema(description = "Bulk issue property update request details.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class BulkIssuePropertyUpdateRequest {
  @SerializedName("expression")
  private String expression = null;

  @SerializedName("filter")
  private AllOfBulkIssuePropertyUpdateRequestFilter filter = null;

  @SerializedName("value")
  private Object value = null;

  public BulkIssuePropertyUpdateRequest expression(String expression) {
    this.expression = expression;
    return this;
  }

   /**
   * EXPERIMENTAL. The Jira expression to calculate the value of the property. The value of the expression must be an object that can be converted to JSON, such as a number, boolean, string, list, or map. The context variables available to the expression are &#x60;issue&#x60; and &#x60;user&#x60;. Issues for which the expression returns a value whose JSON representation is longer than 32768 characters are ignored.
   * @return expression
  **/
  @Schema(description = "EXPERIMENTAL. The Jira expression to calculate the value of the property. The value of the expression must be an object that can be converted to JSON, such as a number, boolean, string, list, or map. The context variables available to the expression are `issue` and `user`. Issues for which the expression returns a value whose JSON representation is longer than 32768 characters are ignored.")
  public String getExpression() {
    return expression;
  }

  public void setExpression(String expression) {
    this.expression = expression;
  }

  public BulkIssuePropertyUpdateRequest filter(AllOfBulkIssuePropertyUpdateRequestFilter filter) {
    this.filter = filter;
    return this;
  }

   /**
   * The bulk operation filter.
   * @return filter
  **/
  @Schema(description = "The bulk operation filter.")
  public AllOfBulkIssuePropertyUpdateRequestFilter getFilter() {
    return filter;
  }

  public void setFilter(AllOfBulkIssuePropertyUpdateRequestFilter filter) {
    this.filter = filter;
  }

  public BulkIssuePropertyUpdateRequest value(Object value) {
    this.value = value;
    return this;
  }

   /**
   * The value of the property. The value must be a [valid](https://tools.ietf.org/html/rfc4627), non-empty JSON blob. The maximum length is 32768 characters.
   * @return value
  **/
  @Schema(description = "The value of the property. The value must be a [valid](https://tools.ietf.org/html/rfc4627), non-empty JSON blob. The maximum length is 32768 characters.")
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
    BulkIssuePropertyUpdateRequest bulkIssuePropertyUpdateRequest = (BulkIssuePropertyUpdateRequest) o;
    return Objects.equals(this.expression, bulkIssuePropertyUpdateRequest.expression) &&
        Objects.equals(this.filter, bulkIssuePropertyUpdateRequest.filter) &&
        Objects.equals(this.value, bulkIssuePropertyUpdateRequest.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expression, filter, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkIssuePropertyUpdateRequest {\n");
    
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
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
