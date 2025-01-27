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
 * The default timezone of the Jira server. In a format known as Olson Time Zones, IANA Time Zones or TZ Database Time Zones.
 */
@Schema(description = "The default timezone of the Jira server. In a format known as Olson Time Zones, IANA Time Zones or TZ Database Time Zones.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class ServerInformationServerTimeZone {
  @SerializedName("displayName")
  private String displayName = null;

  @SerializedName("dstsavings")
  private Integer dstsavings = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("rawOffset")
  private Integer rawOffset = null;

  public ServerInformationServerTimeZone displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @Schema(description = "")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public ServerInformationServerTimeZone dstsavings(Integer dstsavings) {
    this.dstsavings = dstsavings;
    return this;
  }

   /**
   * Get dstsavings
   * @return dstsavings
  **/
  @Schema(description = "")
  public Integer getDstsavings() {
    return dstsavings;
  }

  public void setDstsavings(Integer dstsavings) {
    this.dstsavings = dstsavings;
  }

  public ServerInformationServerTimeZone id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ServerInformationServerTimeZone rawOffset(Integer rawOffset) {
    this.rawOffset = rawOffset;
    return this;
  }

   /**
   * Get rawOffset
   * @return rawOffset
  **/
  @Schema(description = "")
  public Integer getRawOffset() {
    return rawOffset;
  }

  public void setRawOffset(Integer rawOffset) {
    this.rawOffset = rawOffset;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServerInformationServerTimeZone serverInformationServerTimeZone = (ServerInformationServerTimeZone) o;
    return Objects.equals(this.displayName, serverInformationServerTimeZone.displayName) &&
        Objects.equals(this.dstsavings, serverInformationServerTimeZone.dstsavings) &&
        Objects.equals(this.id, serverInformationServerTimeZone.id) &&
        Objects.equals(this.rawOffset, serverInformationServerTimeZone.rawOffset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, dstsavings, id, rawOffset);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerInformationServerTimeZone {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    dstsavings: ").append(toIndentedString(dstsavings)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    rawOffset: ").append(toIndentedString(rawOffset)).append("\n");
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
