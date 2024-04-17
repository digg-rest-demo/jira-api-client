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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Details of issue history metadata.
 */
@Schema(description = "Details of issue history metadata.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class HistoryMetadata extends HashMap<String, Object> {
  @SerializedName("activityDescription")
  private String activityDescription = null;

  @SerializedName("activityDescriptionKey")
  private String activityDescriptionKey = null;

  @SerializedName("actor")
  private AllOfHistoryMetadataActor actor = null;

  @SerializedName("cause")
  private AllOfHistoryMetadataCause cause = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("descriptionKey")
  private String descriptionKey = null;

  @SerializedName("emailDescription")
  private String emailDescription = null;

  @SerializedName("emailDescriptionKey")
  private String emailDescriptionKey = null;

  @SerializedName("extraData")
  private Map<String, String> extraData = null;

  @SerializedName("generator")
  private AllOfHistoryMetadataGenerator generator = null;

  @SerializedName("type")
  private String type = null;

  public HistoryMetadata activityDescription(String activityDescription) {
    this.activityDescription = activityDescription;
    return this;
  }

   /**
   * The activity described in the history record.
   * @return activityDescription
  **/
  @Schema(description = "The activity described in the history record.")
  public String getActivityDescription() {
    return activityDescription;
  }

  public void setActivityDescription(String activityDescription) {
    this.activityDescription = activityDescription;
  }

  public HistoryMetadata activityDescriptionKey(String activityDescriptionKey) {
    this.activityDescriptionKey = activityDescriptionKey;
    return this;
  }

   /**
   * The key of the activity described in the history record.
   * @return activityDescriptionKey
  **/
  @Schema(description = "The key of the activity described in the history record.")
  public String getActivityDescriptionKey() {
    return activityDescriptionKey;
  }

  public void setActivityDescriptionKey(String activityDescriptionKey) {
    this.activityDescriptionKey = activityDescriptionKey;
  }

  public HistoryMetadata actor(AllOfHistoryMetadataActor actor) {
    this.actor = actor;
    return this;
  }

   /**
   * Details of the user whose action created the history record.
   * @return actor
  **/
  @Schema(description = "Details of the user whose action created the history record.")
  public AllOfHistoryMetadataActor getActor() {
    return actor;
  }

  public void setActor(AllOfHistoryMetadataActor actor) {
    this.actor = actor;
  }

  public HistoryMetadata cause(AllOfHistoryMetadataCause cause) {
    this.cause = cause;
    return this;
  }

   /**
   * Details of the cause that triggered the creation the history record.
   * @return cause
  **/
  @Schema(description = "Details of the cause that triggered the creation the history record.")
  public AllOfHistoryMetadataCause getCause() {
    return cause;
  }

  public void setCause(AllOfHistoryMetadataCause cause) {
    this.cause = cause;
  }

  public HistoryMetadata description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the history record.
   * @return description
  **/
  @Schema(description = "The description of the history record.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public HistoryMetadata descriptionKey(String descriptionKey) {
    this.descriptionKey = descriptionKey;
    return this;
  }

   /**
   * The description key of the history record.
   * @return descriptionKey
  **/
  @Schema(description = "The description key of the history record.")
  public String getDescriptionKey() {
    return descriptionKey;
  }

  public void setDescriptionKey(String descriptionKey) {
    this.descriptionKey = descriptionKey;
  }

  public HistoryMetadata emailDescription(String emailDescription) {
    this.emailDescription = emailDescription;
    return this;
  }

   /**
   * The description of the email address associated the history record.
   * @return emailDescription
  **/
  @Schema(description = "The description of the email address associated the history record.")
  public String getEmailDescription() {
    return emailDescription;
  }

  public void setEmailDescription(String emailDescription) {
    this.emailDescription = emailDescription;
  }

  public HistoryMetadata emailDescriptionKey(String emailDescriptionKey) {
    this.emailDescriptionKey = emailDescriptionKey;
    return this;
  }

   /**
   * The description key of the email address associated the history record.
   * @return emailDescriptionKey
  **/
  @Schema(description = "The description key of the email address associated the history record.")
  public String getEmailDescriptionKey() {
    return emailDescriptionKey;
  }

  public void setEmailDescriptionKey(String emailDescriptionKey) {
    this.emailDescriptionKey = emailDescriptionKey;
  }

  public HistoryMetadata extraData(Map<String, String> extraData) {
    this.extraData = extraData;
    return this;
  }

  public HistoryMetadata putExtraDataItem(String key, String extraDataItem) {
    if (this.extraData == null) {
      this.extraData = new HashMap<String, String>();
    }
    this.extraData.put(key, extraDataItem);
    return this;
  }

   /**
   * Additional arbitrary information about the history record.
   * @return extraData
  **/
  @Schema(description = "Additional arbitrary information about the history record.")
  public Map<String, String> getExtraData() {
    return extraData;
  }

  public void setExtraData(Map<String, String> extraData) {
    this.extraData = extraData;
  }

  public HistoryMetadata generator(AllOfHistoryMetadataGenerator generator) {
    this.generator = generator;
    return this;
  }

   /**
   * Details of the system that generated the history record.
   * @return generator
  **/
  @Schema(description = "Details of the system that generated the history record.")
  public AllOfHistoryMetadataGenerator getGenerator() {
    return generator;
  }

  public void setGenerator(AllOfHistoryMetadataGenerator generator) {
    this.generator = generator;
  }

  public HistoryMetadata type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the history record.
   * @return type
  **/
  @Schema(description = "The type of the history record.")
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
    HistoryMetadata historyMetadata = (HistoryMetadata) o;
    return Objects.equals(this.activityDescription, historyMetadata.activityDescription) &&
        Objects.equals(this.activityDescriptionKey, historyMetadata.activityDescriptionKey) &&
        Objects.equals(this.actor, historyMetadata.actor) &&
        Objects.equals(this.cause, historyMetadata.cause) &&
        Objects.equals(this.description, historyMetadata.description) &&
        Objects.equals(this.descriptionKey, historyMetadata.descriptionKey) &&
        Objects.equals(this.emailDescription, historyMetadata.emailDescription) &&
        Objects.equals(this.emailDescriptionKey, historyMetadata.emailDescriptionKey) &&
        Objects.equals(this.extraData, historyMetadata.extraData) &&
        Objects.equals(this.generator, historyMetadata.generator) &&
        Objects.equals(this.type, historyMetadata.type) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityDescription, activityDescriptionKey, actor, cause, description, descriptionKey, emailDescription, emailDescriptionKey, extraData, generator, type, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoryMetadata {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    activityDescription: ").append(toIndentedString(activityDescription)).append("\n");
    sb.append("    activityDescriptionKey: ").append(toIndentedString(activityDescriptionKey)).append("\n");
    sb.append("    actor: ").append(toIndentedString(actor)).append("\n");
    sb.append("    cause: ").append(toIndentedString(cause)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    descriptionKey: ").append(toIndentedString(descriptionKey)).append("\n");
    sb.append("    emailDescription: ").append(toIndentedString(emailDescription)).append("\n");
    sb.append("    emailDescriptionKey: ").append(toIndentedString(emailDescriptionKey)).append("\n");
    sb.append("    extraData: ").append(toIndentedString(extraData)).append("\n");
    sb.append("    generator: ").append(toIndentedString(generator)).append("\n");
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