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
 * The details of the statuses in the associated workflows.
 */
@Schema(description = "The details of the statuses in the associated workflows.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class StatusMetadata {
  /**
   * The category of the status.
   */
  @JsonAdapter(CategoryEnum.Adapter.class)
  public enum CategoryEnum {
    @SerializedName("TODO")
    TODO("TODO"),
    @SerializedName("IN_PROGRESS")
    IN_PROGRESS("IN_PROGRESS"),
    @SerializedName("DONE")
    DONE("DONE");

    private String value;

    CategoryEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static CategoryEnum fromValue(String input) {
      for (CategoryEnum b : CategoryEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<CategoryEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CategoryEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public CategoryEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return CategoryEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("category")
  private CategoryEnum category = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  public StatusMetadata category(CategoryEnum category) {
    this.category = category;
    return this;
  }

   /**
   * The category of the status.
   * @return category
  **/
  @Schema(description = "The category of the status.")
  public CategoryEnum getCategory() {
    return category;
  }

  public void setCategory(CategoryEnum category) {
    this.category = category;
  }

  public StatusMetadata id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the status.
   * @return id
  **/
  @Schema(description = "The ID of the status.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public StatusMetadata name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the status.
   * @return name
  **/
  @Schema(description = "The name of the status.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusMetadata statusMetadata = (StatusMetadata) o;
    return Objects.equals(this.category, statusMetadata.category) &&
        Objects.equals(this.id, statusMetadata.id) &&
        Objects.equals(this.name, statusMetadata.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, id, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusMetadata {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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