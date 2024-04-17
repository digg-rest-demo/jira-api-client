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
 * Details of a screen scheme.
 */
@Schema(description = "Details of a screen scheme.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class ScreenSchemeDetails {
  @SerializedName("description")
  private String description = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("screens")
  private AllOfScreenSchemeDetailsScreens screens = null;

  public ScreenSchemeDetails description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the screen scheme. The maximum length is 255 characters.
   * @return description
  **/
  @Schema(description = "The description of the screen scheme. The maximum length is 255 characters.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ScreenSchemeDetails name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the screen scheme. The name must be unique. The maximum length is 255 characters.
   * @return name
  **/
  @Schema(required = true, description = "The name of the screen scheme. The name must be unique. The maximum length is 255 characters.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ScreenSchemeDetails screens(AllOfScreenSchemeDetailsScreens screens) {
    this.screens = screens;
    return this;
  }

   /**
   * The IDs of the screens for the screen types of the screen scheme. Only screens used in classic projects are accepted.
   * @return screens
  **/
  @Schema(required = true, description = "The IDs of the screens for the screen types of the screen scheme. Only screens used in classic projects are accepted.")
  public AllOfScreenSchemeDetailsScreens getScreens() {
    return screens;
  }

  public void setScreens(AllOfScreenSchemeDetailsScreens screens) {
    this.screens = screens;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScreenSchemeDetails screenSchemeDetails = (ScreenSchemeDetails) o;
    return Objects.equals(this.description, screenSchemeDetails.description) &&
        Objects.equals(this.name, screenSchemeDetails.name) &&
        Objects.equals(this.screens, screenSchemeDetails.screens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name, screens);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScreenSchemeDetails {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    screens: ").append(toIndentedString(screens)).append("\n");
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
