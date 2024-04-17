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
import java.util.Map;
/**
 * Details of an issue priority.
 */
@Schema(description = "Details of an issue priority.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class CreatePriorityDetails extends HashMap<String, Object> {
  @SerializedName("description")
  private String description = null;

  /**
   * The URL of an icon for the priority. Accepted protocols are HTTP and HTTPS. Built in icons can also be used.
   */
  @JsonAdapter(IconUrlEnum.Adapter.class)
  public enum IconUrlEnum {
    @SerializedName("/images/icons/priorities/blocker.png")
    BLOCKER_PNG("/images/icons/priorities/blocker.png"),
    @SerializedName("/images/icons/priorities/critical.png")
    CRITICAL_PNG("/images/icons/priorities/critical.png"),
    @SerializedName("/images/icons/priorities/high.png")
    HIGH_PNG("/images/icons/priorities/high.png"),
    @SerializedName("/images/icons/priorities/highest.png")
    HIGHEST_PNG("/images/icons/priorities/highest.png"),
    @SerializedName("/images/icons/priorities/low.png")
    LOW_PNG("/images/icons/priorities/low.png"),
    @SerializedName("/images/icons/priorities/lowest.png")
    LOWEST_PNG("/images/icons/priorities/lowest.png"),
    @SerializedName("/images/icons/priorities/major.png")
    MAJOR_PNG("/images/icons/priorities/major.png"),
    @SerializedName("/images/icons/priorities/medium.png")
    MEDIUM_PNG("/images/icons/priorities/medium.png"),
    @SerializedName("/images/icons/priorities/minor.png")
    MINOR_PNG("/images/icons/priorities/minor.png"),
    @SerializedName("/images/icons/priorities/trivial.png")
    TRIVIAL_PNG("/images/icons/priorities/trivial.png");

    private String value;

    IconUrlEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static IconUrlEnum fromValue(String input) {
      for (IconUrlEnum b : IconUrlEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<IconUrlEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IconUrlEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public IconUrlEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return IconUrlEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("iconUrl")
  private IconUrlEnum iconUrl = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("statusColor")
  private String statusColor = null;

  public CreatePriorityDetails description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the priority.
   * @return description
  **/
  @Schema(description = "The description of the priority.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CreatePriorityDetails iconUrl(IconUrlEnum iconUrl) {
    this.iconUrl = iconUrl;
    return this;
  }

   /**
   * The URL of an icon for the priority. Accepted protocols are HTTP and HTTPS. Built in icons can also be used.
   * @return iconUrl
  **/
  @Schema(description = "The URL of an icon for the priority. Accepted protocols are HTTP and HTTPS. Built in icons can also be used.")
  public IconUrlEnum getIconUrl() {
    return iconUrl;
  }

  public void setIconUrl(IconUrlEnum iconUrl) {
    this.iconUrl = iconUrl;
  }

  public CreatePriorityDetails name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the priority. Must be unique.
   * @return name
  **/
  @Schema(required = true, description = "The name of the priority. Must be unique.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreatePriorityDetails statusColor(String statusColor) {
    this.statusColor = statusColor;
    return this;
  }

   /**
   * The status color of the priority in 3-digit or 6-digit hexadecimal format.
   * @return statusColor
  **/
  @Schema(required = true, description = "The status color of the priority in 3-digit or 6-digit hexadecimal format.")
  public String getStatusColor() {
    return statusColor;
  }

  public void setStatusColor(String statusColor) {
    this.statusColor = statusColor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePriorityDetails createPriorityDetails = (CreatePriorityDetails) o;
    return Objects.equals(this.description, createPriorityDetails.description) &&
        Objects.equals(this.iconUrl, createPriorityDetails.iconUrl) &&
        Objects.equals(this.name, createPriorityDetails.name) &&
        Objects.equals(this.statusColor, createPriorityDetails.statusColor) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, iconUrl, name, statusColor, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePriorityDetails {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    statusColor: ").append(toIndentedString(statusColor)).append("\n");
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
