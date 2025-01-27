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
 * An icon.
 */
@Schema(description = "An icon.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class IconBean {
  @SerializedName("link")
  private String link = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("url16x16")
  private String url16x16 = null;

  public IconBean link(String link) {
    this.link = link;
    return this;
  }

   /**
   * The URL of the tooltip, used only for a status icon.
   * @return link
  **/
  @Schema(description = "The URL of the tooltip, used only for a status icon.")
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public IconBean title(String title) {
    this.title = title;
    return this;
  }

   /**
   * The title of the icon, for use as a tooltip on the icon.
   * @return title
  **/
  @Schema(description = "The title of the icon, for use as a tooltip on the icon.")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public IconBean url16x16(String url16x16) {
    this.url16x16 = url16x16;
    return this;
  }

   /**
   * The URL of a 16x16 pixel icon.
   * @return url16x16
  **/
  @Schema(description = "The URL of a 16x16 pixel icon.")
  public String getUrl16x16() {
    return url16x16;
  }

  public void setUrl16x16(String url16x16) {
    this.url16x16 = url16x16;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IconBean iconBean = (IconBean) o;
    return Objects.equals(this.link, iconBean.link) &&
        Objects.equals(this.title, iconBean.title) &&
        Objects.equals(this.url16x16, iconBean.url16x16);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, title, url16x16);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IconBean {\n");
    
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    url16x16: ").append(toIndentedString(url16x16)).append("\n");
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
