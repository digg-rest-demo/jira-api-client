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
 * A screen.
 */
@Schema(description = "A screen.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class Screen {
  @SerializedName("description")
  private String description = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("scope")
  private AllOfScreenScope scope = null;

   /**
   * The description of the screen.
   * @return description
  **/
  @Schema(description = "The description of the screen.")
  public String getDescription() {
    return description;
  }

   /**
   * The ID of the screen.
   * @return id
  **/
  @Schema(description = "The ID of the screen.")
  public Long getId() {
    return id;
  }

   /**
   * The name of the screen.
   * @return name
  **/
  @Schema(description = "The name of the screen.")
  public String getName() {
    return name;
  }

  public Screen scope(AllOfScreenScope scope) {
    this.scope = scope;
    return this;
  }

   /**
   * The scope of the screen.
   * @return scope
  **/
  @Schema(description = "The scope of the screen.")
  public AllOfScreenScope getScope() {
    return scope;
  }

  public void setScope(AllOfScreenScope scope) {
    this.scope = scope;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Screen screen = (Screen) o;
    return Objects.equals(this.description, screen.description) &&
        Objects.equals(this.id, screen.id) &&
        Objects.equals(this.name, screen.name) &&
        Objects.equals(this.scope, screen.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, name, scope);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Screen {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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
