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
 * The status of the item.
 */
@Schema(description = "The status of the item.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class Status extends HashMap<String, Object> {
  @SerializedName("icon")
  private AllOfStatusIcon icon = null;

  @SerializedName("resolved")
  private Boolean resolved = null;

  public Status icon(AllOfStatusIcon icon) {
    this.icon = icon;
    return this;
  }

   /**
   * Details of the icon representing the status. If not provided, no status icon displays in Jira.
   * @return icon
  **/
  @Schema(description = "Details of the icon representing the status. If not provided, no status icon displays in Jira.")
  public AllOfStatusIcon getIcon() {
    return icon;
  }

  public void setIcon(AllOfStatusIcon icon) {
    this.icon = icon;
  }

  public Status resolved(Boolean resolved) {
    this.resolved = resolved;
    return this;
  }

   /**
   * Whether the item is resolved. If set to \&quot;true\&quot;, the link to the issue is displayed in a strikethrough font, otherwise the link displays in normal font.
   * @return resolved
  **/
  @Schema(description = "Whether the item is resolved. If set to \"true\", the link to the issue is displayed in a strikethrough font, otherwise the link displays in normal font.")
  public Boolean isResolved() {
    return resolved;
  }

  public void setResolved(Boolean resolved) {
    this.resolved = resolved;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Status status = (Status) o;
    return Objects.equals(this.icon, status.icon) &&
        Objects.equals(this.resolved, status.resolved) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(icon, resolved, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Status {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    resolved: ").append(toIndentedString(resolved)).append("\n");
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
