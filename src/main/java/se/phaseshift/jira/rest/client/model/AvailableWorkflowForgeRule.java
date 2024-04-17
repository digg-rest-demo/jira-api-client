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
 * The Forge provided ecosystem rules available.
 */
@Schema(description = "The Forge provided ecosystem rules available.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class AvailableWorkflowForgeRule {
  @SerializedName("description")
  private String description = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("ruleKey")
  private String ruleKey = null;

  /**
   * The rule type.
   */
  @JsonAdapter(RuleTypeEnum.Adapter.class)
  public enum RuleTypeEnum {
    @SerializedName("Condition")
    CONDITION("Condition"),
    @SerializedName("Validator")
    VALIDATOR("Validator"),
    @SerializedName("Function")
    FUNCTION("Function"),
    @SerializedName("Screen")
    SCREEN("Screen");

    private String value;

    RuleTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static RuleTypeEnum fromValue(String input) {
      for (RuleTypeEnum b : RuleTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<RuleTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RuleTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public RuleTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return RuleTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("ruleType")
  private RuleTypeEnum ruleType = null;

  public AvailableWorkflowForgeRule description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The rule description.
   * @return description
  **/
  @Schema(description = "The rule description.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AvailableWorkflowForgeRule id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique ARI of the forge rule type.
   * @return id
  **/
  @Schema(description = "The unique ARI of the forge rule type.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AvailableWorkflowForgeRule name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The rule name.
   * @return name
  **/
  @Schema(description = "The rule name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AvailableWorkflowForgeRule ruleKey(String ruleKey) {
    this.ruleKey = ruleKey;
    return this;
  }

   /**
   * The rule key.
   * @return ruleKey
  **/
  @Schema(description = "The rule key.")
  public String getRuleKey() {
    return ruleKey;
  }

  public void setRuleKey(String ruleKey) {
    this.ruleKey = ruleKey;
  }

  public AvailableWorkflowForgeRule ruleType(RuleTypeEnum ruleType) {
    this.ruleType = ruleType;
    return this;
  }

   /**
   * The rule type.
   * @return ruleType
  **/
  @Schema(description = "The rule type.")
  public RuleTypeEnum getRuleType() {
    return ruleType;
  }

  public void setRuleType(RuleTypeEnum ruleType) {
    this.ruleType = ruleType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailableWorkflowForgeRule availableWorkflowForgeRule = (AvailableWorkflowForgeRule) o;
    return Objects.equals(this.description, availableWorkflowForgeRule.description) &&
        Objects.equals(this.id, availableWorkflowForgeRule.id) &&
        Objects.equals(this.name, availableWorkflowForgeRule.name) &&
        Objects.equals(this.ruleKey, availableWorkflowForgeRule.ruleKey) &&
        Objects.equals(this.ruleType, availableWorkflowForgeRule.ruleType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, name, ruleKey, ruleType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailableWorkflowForgeRule {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ruleKey: ").append(toIndentedString(ruleKey)).append("\n");
    sb.append("    ruleType: ").append(toIndentedString(ruleType)).append("\n");
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
