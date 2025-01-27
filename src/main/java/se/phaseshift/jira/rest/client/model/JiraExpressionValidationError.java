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
 * Details about syntax and type errors. The error details apply to the entire expression, unless the object includes:   *  &#x60;line&#x60; and &#x60;column&#x60;  *  &#x60;expression&#x60;
 */
@Schema(description = "Details about syntax and type errors. The error details apply to the entire expression, unless the object includes:   *  `line` and `column`  *  `expression`")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class JiraExpressionValidationError {
  @SerializedName("column")
  private Integer column = null;

  @SerializedName("expression")
  private String expression = null;

  @SerializedName("line")
  private Integer line = null;

  @SerializedName("message")
  private String message = null;

  /**
   * The error type.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    @SerializedName("syntax")
    SYNTAX("syntax"),
    @SerializedName("type")
    TYPE("type"),
    @SerializedName("other")
    OTHER("other");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TypeEnum fromValue(String input) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return TypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("type")
  private TypeEnum type = null;

  public JiraExpressionValidationError column(Integer column) {
    this.column = column;
    return this;
  }

   /**
   * The text column in which the error occurred.
   * @return column
  **/
  @Schema(description = "The text column in which the error occurred.")
  public Integer getColumn() {
    return column;
  }

  public void setColumn(Integer column) {
    this.column = column;
  }

  public JiraExpressionValidationError expression(String expression) {
    this.expression = expression;
    return this;
  }

   /**
   * The part of the expression in which the error occurred.
   * @return expression
  **/
  @Schema(description = "The part of the expression in which the error occurred.")
  public String getExpression() {
    return expression;
  }

  public void setExpression(String expression) {
    this.expression = expression;
  }

  public JiraExpressionValidationError line(Integer line) {
    this.line = line;
    return this;
  }

   /**
   * The text line in which the error occurred.
   * @return line
  **/
  @Schema(description = "The text line in which the error occurred.")
  public Integer getLine() {
    return line;
  }

  public void setLine(Integer line) {
    this.line = line;
  }

  public JiraExpressionValidationError message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Details about the error.
   * @return message
  **/
  @Schema(example = "!, -, typeof, (, IDENTIFIER, null, true, false, NUMBER, STRING, TEMPLATE_LITERAL, new, [ or { expected, > encountered.", required = true, description = "Details about the error.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public JiraExpressionValidationError type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The error type.
   * @return type
  **/
  @Schema(required = true, description = "The error type.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
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
    JiraExpressionValidationError jiraExpressionValidationError = (JiraExpressionValidationError) o;
    return Objects.equals(this.column, jiraExpressionValidationError.column) &&
        Objects.equals(this.expression, jiraExpressionValidationError.expression) &&
        Objects.equals(this.line, jiraExpressionValidationError.line) &&
        Objects.equals(this.message, jiraExpressionValidationError.message) &&
        Objects.equals(this.type, jiraExpressionValidationError.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(column, expression, line, message, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JiraExpressionValidationError {\n");
    
    sb.append("    column: ").append(toIndentedString(column)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    line: ").append(toIndentedString(line)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
