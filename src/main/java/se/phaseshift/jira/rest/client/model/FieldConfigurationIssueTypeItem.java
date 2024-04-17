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
 * The field configuration for an issue type.
 */
@Schema(description = "The field configuration for an issue type.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class FieldConfigurationIssueTypeItem {
  @SerializedName("fieldConfigurationId")
  private String fieldConfigurationId = null;

  @SerializedName("fieldConfigurationSchemeId")
  private String fieldConfigurationSchemeId = null;

  @SerializedName("issueTypeId")
  private String issueTypeId = null;

  public FieldConfigurationIssueTypeItem fieldConfigurationId(String fieldConfigurationId) {
    this.fieldConfigurationId = fieldConfigurationId;
    return this;
  }

   /**
   * The ID of the field configuration.
   * @return fieldConfigurationId
  **/
  @Schema(required = true, description = "The ID of the field configuration.")
  public String getFieldConfigurationId() {
    return fieldConfigurationId;
  }

  public void setFieldConfigurationId(String fieldConfigurationId) {
    this.fieldConfigurationId = fieldConfigurationId;
  }

  public FieldConfigurationIssueTypeItem fieldConfigurationSchemeId(String fieldConfigurationSchemeId) {
    this.fieldConfigurationSchemeId = fieldConfigurationSchemeId;
    return this;
  }

   /**
   * The ID of the field configuration scheme.
   * @return fieldConfigurationSchemeId
  **/
  @Schema(required = true, description = "The ID of the field configuration scheme.")
  public String getFieldConfigurationSchemeId() {
    return fieldConfigurationSchemeId;
  }

  public void setFieldConfigurationSchemeId(String fieldConfigurationSchemeId) {
    this.fieldConfigurationSchemeId = fieldConfigurationSchemeId;
  }

  public FieldConfigurationIssueTypeItem issueTypeId(String issueTypeId) {
    this.issueTypeId = issueTypeId;
    return this;
  }

   /**
   * The ID of the issue type or *default*. When set to *default* this field configuration issue type item applies to all issue types without a field configuration.
   * @return issueTypeId
  **/
  @Schema(required = true, description = "The ID of the issue type or *default*. When set to *default* this field configuration issue type item applies to all issue types without a field configuration.")
  public String getIssueTypeId() {
    return issueTypeId;
  }

  public void setIssueTypeId(String issueTypeId) {
    this.issueTypeId = issueTypeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldConfigurationIssueTypeItem fieldConfigurationIssueTypeItem = (FieldConfigurationIssueTypeItem) o;
    return Objects.equals(this.fieldConfigurationId, fieldConfigurationIssueTypeItem.fieldConfigurationId) &&
        Objects.equals(this.fieldConfigurationSchemeId, fieldConfigurationIssueTypeItem.fieldConfigurationSchemeId) &&
        Objects.equals(this.issueTypeId, fieldConfigurationIssueTypeItem.issueTypeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldConfigurationId, fieldConfigurationSchemeId, issueTypeId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldConfigurationIssueTypeItem {\n");
    
    sb.append("    fieldConfigurationId: ").append(toIndentedString(fieldConfigurationId)).append("\n");
    sb.append("    fieldConfigurationSchemeId: ").append(toIndentedString(fieldConfigurationSchemeId)).append("\n");
    sb.append("    issueTypeId: ").append(toIndentedString(issueTypeId)).append("\n");
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
