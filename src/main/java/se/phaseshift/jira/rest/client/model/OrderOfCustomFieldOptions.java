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
import java.util.ArrayList;
import java.util.List;
/**
 * An ordered list of custom field option IDs and information on where to move them.
 */
@Schema(description = "An ordered list of custom field option IDs and information on where to move them.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class OrderOfCustomFieldOptions {
  @SerializedName("after")
  private String after = null;

  @SerializedName("customFieldOptionIds")
  private List<String> customFieldOptionIds = new ArrayList<String>();

  /**
   * The position the custom field options should be moved to. Required if &#x60;after&#x60; isn&#x27;t provided.
   */
  @JsonAdapter(PositionEnum.Adapter.class)
  public enum PositionEnum {
    @SerializedName("First")
    FIRST("First"),
    @SerializedName("Last")
    LAST("Last");

    private String value;

    PositionEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static PositionEnum fromValue(String input) {
      for (PositionEnum b : PositionEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<PositionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PositionEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public PositionEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return PositionEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("position")
  private PositionEnum position = null;

  public OrderOfCustomFieldOptions after(String after) {
    this.after = after;
    return this;
  }

   /**
   * The ID of the custom field option or cascading option to place the moved options after. Required if &#x60;position&#x60; isn&#x27;t provided.
   * @return after
  **/
  @Schema(description = "The ID of the custom field option or cascading option to place the moved options after. Required if `position` isn't provided.")
  public String getAfter() {
    return after;
  }

  public void setAfter(String after) {
    this.after = after;
  }

  public OrderOfCustomFieldOptions customFieldOptionIds(List<String> customFieldOptionIds) {
    this.customFieldOptionIds = customFieldOptionIds;
    return this;
  }

  public OrderOfCustomFieldOptions addCustomFieldOptionIdsItem(String customFieldOptionIdsItem) {
    this.customFieldOptionIds.add(customFieldOptionIdsItem);
    return this;
  }

   /**
   * A list of IDs of custom field options to move. The order of the custom field option IDs in the list is the order they are given after the move. The list must contain custom field options or cascading options, but not both.
   * @return customFieldOptionIds
  **/
  @Schema(required = true, description = "A list of IDs of custom field options to move. The order of the custom field option IDs in the list is the order they are given after the move. The list must contain custom field options or cascading options, but not both.")
  public List<String> getCustomFieldOptionIds() {
    return customFieldOptionIds;
  }

  public void setCustomFieldOptionIds(List<String> customFieldOptionIds) {
    this.customFieldOptionIds = customFieldOptionIds;
  }

  public OrderOfCustomFieldOptions position(PositionEnum position) {
    this.position = position;
    return this;
  }

   /**
   * The position the custom field options should be moved to. Required if &#x60;after&#x60; isn&#x27;t provided.
   * @return position
  **/
  @Schema(description = "The position the custom field options should be moved to. Required if `after` isn't provided.")
  public PositionEnum getPosition() {
    return position;
  }

  public void setPosition(PositionEnum position) {
    this.position = position;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderOfCustomFieldOptions orderOfCustomFieldOptions = (OrderOfCustomFieldOptions) o;
    return Objects.equals(this.after, orderOfCustomFieldOptions.after) &&
        Objects.equals(this.customFieldOptionIds, orderOfCustomFieldOptions.customFieldOptionIds) &&
        Objects.equals(this.position, orderOfCustomFieldOptions.position);
  }

  @Override
  public int hashCode() {
    return Objects.hash(after, customFieldOptionIds, position);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderOfCustomFieldOptions {\n");
    
    sb.append("    after: ").append(toIndentedString(after)).append("\n");
    sb.append("    customFieldOptionIds: ").append(toIndentedString(customFieldOptionIds)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
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
