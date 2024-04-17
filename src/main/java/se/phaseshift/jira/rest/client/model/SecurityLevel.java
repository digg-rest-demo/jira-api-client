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
 * Details of an issue level security item.
 */
@Schema(description = "Details of an issue level security item.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class SecurityLevel {
  @SerializedName("description")
  private String description = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("isDefault")
  private Boolean isDefault = null;

  @SerializedName("issueSecuritySchemeId")
  private String issueSecuritySchemeId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("self")
  private String self = null;

   /**
   * The description of the issue level security item.
   * @return description
  **/
  @Schema(description = "The description of the issue level security item.")
  public String getDescription() {
    return description;
  }

   /**
   * The ID of the issue level security item.
   * @return id
  **/
  @Schema(description = "The ID of the issue level security item.")
  public String getId() {
    return id;
  }

   /**
   * Whether the issue level security item is the default.
   * @return isDefault
  **/
  @Schema(description = "Whether the issue level security item is the default.")
  public Boolean isIsDefault() {
    return isDefault;
  }

   /**
   * The ID of the issue level security scheme.
   * @return issueSecuritySchemeId
  **/
  @Schema(description = "The ID of the issue level security scheme.")
  public String getIssueSecuritySchemeId() {
    return issueSecuritySchemeId;
  }

   /**
   * The name of the issue level security item.
   * @return name
  **/
  @Schema(description = "The name of the issue level security item.")
  public String getName() {
    return name;
  }

   /**
   * The URL of the issue level security item.
   * @return self
  **/
  @Schema(description = "The URL of the issue level security item.")
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
    SecurityLevel securityLevel = (SecurityLevel) o;
    return Objects.equals(this.description, securityLevel.description) &&
        Objects.equals(this.id, securityLevel.id) &&
        Objects.equals(this.isDefault, securityLevel.isDefault) &&
        Objects.equals(this.issueSecuritySchemeId, securityLevel.issueSecuritySchemeId) &&
        Objects.equals(this.name, securityLevel.name) &&
        Objects.equals(this.self, securityLevel.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, isDefault, issueSecuritySchemeId, name, self);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityLevel {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    issueSecuritySchemeId: ").append(toIndentedString(issueSecuritySchemeId)).append("\n");
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
