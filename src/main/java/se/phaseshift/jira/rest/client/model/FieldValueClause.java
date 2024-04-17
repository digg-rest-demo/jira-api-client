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
import se.phaseshift.jira.rest.client.model.JqlQueryClauseOperand;
import se.phaseshift.jira.rest.client.model.JqlQueryField;
/**
 * A clause that asserts the current value of a field. For example, &#x60;summary ~ test&#x60;.
 */
@Schema(description = "A clause that asserts the current value of a field. For example, `summary ~ test`.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class FieldValueClause implements JqlQueryClause {
  @SerializedName("field")
  private JqlQueryField field = null;

  @SerializedName("operand")
  private JqlQueryClauseOperand operand = null;

  /**
   * The operator between the field and operand.
   */
  @JsonAdapter(OperatorEnum.Adapter.class)
  public enum OperatorEnum {
    @SerializedName("=")
    EQUAL("="),
    @SerializedName("!=")
    NOT_EQUAL("!="),
    @SerializedName(">")
    GREATER_THAN(">"),
    @SerializedName("<")
    LESS_THAN("<"),
    @SerializedName(">=")
    GREATER_THAN_OR_EQUAL_TO(">="),
    @SerializedName("<=")
    LESS_THAN_OR_EQUAL_TO("<="),
    @SerializedName("in")
    IN("in"),
    @SerializedName("not in")
    NOT_IN("not in"),
    @SerializedName("~")
    TILDE("~"),
    @SerializedName("~=")
    _U("~="),
    @SerializedName("is")
    IS("is"),
    @SerializedName("is not")
    IS_NOT("is not");

    private String value;

    OperatorEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static OperatorEnum fromValue(String input) {
      for (OperatorEnum b : OperatorEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<OperatorEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OperatorEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public OperatorEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return OperatorEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("operator")
  private OperatorEnum operator = null;

  public FieldValueClause field(JqlQueryField field) {
    this.field = field;
    return this;
  }

   /**
   * Get field
   * @return field
  **/
  @Schema(required = true, description = "")
  public JqlQueryField getField() {
    return field;
  }

  public void setField(JqlQueryField field) {
    this.field = field;
  }

  public FieldValueClause operand(JqlQueryClauseOperand operand) {
    this.operand = operand;
    return this;
  }

   /**
   * Get operand
   * @return operand
  **/
  @Schema(required = true, description = "")
  public JqlQueryClauseOperand getOperand() {
    return operand;
  }

  public void setOperand(JqlQueryClauseOperand operand) {
    this.operand = operand;
  }

  public FieldValueClause operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }

   /**
   * The operator between the field and operand.
   * @return operator
  **/
  @Schema(required = true, description = "The operator between the field and operand.")
  public OperatorEnum getOperator() {
    return operator;
  }

  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldValueClause fieldValueClause = (FieldValueClause) o;
    return Objects.equals(this.field, fieldValueClause.field) &&
        Objects.equals(this.operand, fieldValueClause.operand) &&
        Objects.equals(this.operator, fieldValueClause.operator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, operand, operator);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldValueClause {\n");
    
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    operand: ").append(toIndentedString(operand)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
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
