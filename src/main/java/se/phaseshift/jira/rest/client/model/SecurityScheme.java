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
import se.phaseshift.jira.rest.client.model.SecurityLevel;
/**
 * Details about a security scheme.
 */
@Schema(description = "Details about a security scheme.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class SecurityScheme {
  @SerializedName("defaultSecurityLevelId")
  private Long defaultSecurityLevelId = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("levels")
  private List<SecurityLevel> levels = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("self")
  private String self = null;

   /**
   * The ID of the default security level.
   * @return defaultSecurityLevelId
  **/
  @Schema(description = "The ID of the default security level.")
  public Long getDefaultSecurityLevelId() {
    return defaultSecurityLevelId;
  }

   /**
   * The description of the issue security scheme.
   * @return description
  **/
  @Schema(description = "The description of the issue security scheme.")
  public String getDescription() {
    return description;
  }

   /**
   * The ID of the issue security scheme.
   * @return id
  **/
  @Schema(description = "The ID of the issue security scheme.")
  public Long getId() {
    return id;
  }

  public SecurityScheme levels(List<SecurityLevel> levels) {
    this.levels = levels;
    return this;
  }

  public SecurityScheme addLevelsItem(SecurityLevel levelsItem) {
    if (this.levels == null) {
      this.levels = new ArrayList<SecurityLevel>();
    }
    this.levels.add(levelsItem);
    return this;
  }

   /**
   * Get levels
   * @return levels
  **/
  @Schema(description = "")
  public List<SecurityLevel> getLevels() {
    return levels;
  }

  public void setLevels(List<SecurityLevel> levels) {
    this.levels = levels;
  }

   /**
   * The name of the issue security scheme.
   * @return name
  **/
  @Schema(description = "The name of the issue security scheme.")
  public String getName() {
    return name;
  }

   /**
   * The URL of the issue security scheme.
   * @return self
  **/
  @Schema(description = "The URL of the issue security scheme.")
  public String getSelf() {
    return self;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityScheme securityScheme = (SecurityScheme) o;
    return Objects.equals(this.defaultSecurityLevelId, securityScheme.defaultSecurityLevelId) &&
        Objects.equals(this.description, securityScheme.description) &&
        Objects.equals(this.id, securityScheme.id) &&
        Objects.equals(this.levels, securityScheme.levels) &&
        Objects.equals(this.name, securityScheme.name) &&
        Objects.equals(this.self, securityScheme.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultSecurityLevelId, description, id, levels, name, self);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityScheme {\n");
    
    sb.append("    defaultSecurityLevelId: ").append(toIndentedString(defaultSecurityLevelId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    levels: ").append(toIndentedString(levels)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
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