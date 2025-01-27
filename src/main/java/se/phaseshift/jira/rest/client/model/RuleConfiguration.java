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
 * A rule configuration.
 */
@Schema(description = "A rule configuration.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class RuleConfiguration {
  @SerializedName("disabled")
  private Boolean disabled = false;

  @SerializedName("tag")
  private String tag = null;

  @SerializedName("value")
  private String value = null;

  public RuleConfiguration disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

   /**
   * Whether the rule is disabled.
   * @return disabled
  **/
  @Schema(description = "Whether the rule is disabled.")
  public Boolean isDisabled() {
    return disabled;
  }

  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }

  public RuleConfiguration tag(String tag) {
    this.tag = tag;
    return this;
  }

   /**
   * A tag used to filter rules in [Get workflow transition rule configurations](https://developer.atlassian.com/cloud/jira/platform/rest/v3/api-group-workflow-transition-rules/#api-rest-api-3-workflow-rule-config-get).
   * @return tag
  **/
  @Schema(description = "A tag used to filter rules in [Get workflow transition rule configurations](https://developer.atlassian.com/cloud/jira/platform/rest/v3/api-group-workflow-transition-rules/#api-rest-api-3-workflow-rule-config-get).")
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public RuleConfiguration value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Configuration of the rule, as it is stored by the Connect or the Forge app on the rule configuration page.
   * @return value
  **/
  @Schema(required = true, description = "Configuration of the rule, as it is stored by the Connect or the Forge app on the rule configuration page.")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
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
    RuleConfiguration ruleConfiguration = (RuleConfiguration) o;
    return Objects.equals(this.disabled, ruleConfiguration.disabled) &&
        Objects.equals(this.tag, ruleConfiguration.tag) &&
        Objects.equals(this.value, ruleConfiguration.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disabled, tag, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleConfiguration {\n");
    
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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
