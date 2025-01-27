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
 * Configuration of the announcement banner.
 */
@Schema(description = "Configuration of the announcement banner.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class AnnouncementBannerConfigurationUpdate {
  @SerializedName("isDismissible")
  private Boolean isDismissible = null;

  @SerializedName("isEnabled")
  private Boolean isEnabled = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("visibility")
  private String visibility = null;

  public AnnouncementBannerConfigurationUpdate isDismissible(Boolean isDismissible) {
    this.isDismissible = isDismissible;
    return this;
  }

   /**
   * Flag indicating if the announcement banner can be dismissed by the user.
   * @return isDismissible
  **/
  @Schema(description = "Flag indicating if the announcement banner can be dismissed by the user.")
  public Boolean isIsDismissible() {
    return isDismissible;
  }

  public void setIsDismissible(Boolean isDismissible) {
    this.isDismissible = isDismissible;
  }

  public AnnouncementBannerConfigurationUpdate isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

   /**
   * Flag indicating if the announcement banner is enabled or not.
   * @return isEnabled
  **/
  @Schema(description = "Flag indicating if the announcement banner is enabled or not.")
  public Boolean isIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }

  public AnnouncementBannerConfigurationUpdate message(String message) {
    this.message = message;
    return this;
  }

   /**
   * The text on the announcement banner.
   * @return message
  **/
  @Schema(description = "The text on the announcement banner.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public AnnouncementBannerConfigurationUpdate visibility(String visibility) {
    this.visibility = visibility;
    return this;
  }

   /**
   * Visibility of the announcement banner. Can be public or private.
   * @return visibility
  **/
  @Schema(description = "Visibility of the announcement banner. Can be public or private.")
  public String getVisibility() {
    return visibility;
  }

  public void setVisibility(String visibility) {
    this.visibility = visibility;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnnouncementBannerConfigurationUpdate announcementBannerConfigurationUpdate = (AnnouncementBannerConfigurationUpdate) o;
    return Objects.equals(this.isDismissible, announcementBannerConfigurationUpdate.isDismissible) &&
        Objects.equals(this.isEnabled, announcementBannerConfigurationUpdate.isEnabled) &&
        Objects.equals(this.message, announcementBannerConfigurationUpdate.message) &&
        Objects.equals(this.visibility, announcementBannerConfigurationUpdate.visibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isDismissible, isEnabled, message, visibility);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnnouncementBannerConfigurationUpdate {\n");
    
    sb.append("    isDismissible: ").append(toIndentedString(isDismissible)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
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
