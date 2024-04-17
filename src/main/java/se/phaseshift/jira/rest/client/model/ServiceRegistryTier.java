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
import java.util.UUID;
/**
 * ServiceRegistryTier
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class ServiceRegistryTier {
  @SerializedName("description")
  private String description = null;

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("level")
  private Integer level = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("nameKey")
  private String nameKey = null;

  public ServiceRegistryTier description(String description) {
    this.description = description;
    return this;
  }

   /**
   * tier description
   * @return description
  **/
  @Schema(description = "tier description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ServiceRegistryTier id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * tier ID
   * @return id
  **/
  @Schema(description = "tier ID")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public ServiceRegistryTier level(Integer level) {
    this.level = level;
    return this;
  }

   /**
   * tier level
   * @return level
  **/
  @Schema(description = "tier level")
  public Integer getLevel() {
    return level;
  }

  public void setLevel(Integer level) {
    this.level = level;
  }

  public ServiceRegistryTier name(String name) {
    this.name = name;
    return this;
  }

   /**
   * tier name
   * @return name
  **/
  @Schema(description = "tier name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ServiceRegistryTier nameKey(String nameKey) {
    this.nameKey = nameKey;
    return this;
  }

   /**
   * name key of the tier
   * @return nameKey
  **/
  @Schema(example = "service-registry.tier1.name", description = "name key of the tier")
  public String getNameKey() {
    return nameKey;
  }

  public void setNameKey(String nameKey) {
    this.nameKey = nameKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceRegistryTier serviceRegistryTier = (ServiceRegistryTier) o;
    return Objects.equals(this.description, serviceRegistryTier.description) &&
        Objects.equals(this.id, serviceRegistryTier.id) &&
        Objects.equals(this.level, serviceRegistryTier.level) &&
        Objects.equals(this.name, serviceRegistryTier.name) &&
        Objects.equals(this.nameKey, serviceRegistryTier.nameKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, level, name, nameKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceRegistryTier {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nameKey: ").append(toIndentedString(nameKey)).append("\n");
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