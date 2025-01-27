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
 * An icon. If no icon is defined:   *  for a status icon, no status icon displays in Jira.  *  for the remote object icon, the default link icon displays in Jira.
 */
@Schema(description = "An icon. If no icon is defined:   *  for a status icon, no status icon displays in Jira.  *  for the remote object icon, the default link icon displays in Jira.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class Icon extends HashMap<String, Object> {
  @SerializedName("link")
  private String link = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("url16x16")
  private String url16x16 = null;

  public Icon link(String link) {
    this.link = link;
    return this;
  }

   /**
   * The URL of the tooltip, used only for a status icon. If not set, the status icon in Jira is not clickable.
   * @return link
  **/
  @Schema(description = "The URL of the tooltip, used only for a status icon. If not set, the status icon in Jira is not clickable.")
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public Icon title(String title) {
    this.title = title;
    return this;
  }

   /**
   * The title of the icon. This is used as follows:   *  For a status icon it is used as a tooltip on the icon. If not set, the status icon doesn&#x27;t display a tooltip in Jira.  *  For the remote object icon it is used in conjunction with the application name to display a tooltip for the link&#x27;s icon. The tooltip takes the format \&quot;\\[application name\\] icon title\&quot;. Blank itemsare excluded from the tooltip title. If both items are blank, the icon tooltop displays as \&quot;Web Link\&quot;.
   * @return title
  **/
  @Schema(description = "The title of the icon. This is used as follows:   *  For a status icon it is used as a tooltip on the icon. If not set, the status icon doesn't display a tooltip in Jira.  *  For the remote object icon it is used in conjunction with the application name to display a tooltip for the link's icon. The tooltip takes the format \"\\[application name\\] icon title\". Blank itemsare excluded from the tooltip title. If both items are blank, the icon tooltop displays as \"Web Link\".")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Icon url16x16(String url16x16) {
    this.url16x16 = url16x16;
    return this;
  }

   /**
   * The URL of an icon that displays at 16x16 pixel in Jira.
   * @return url16x16
  **/
  @Schema(description = "The URL of an icon that displays at 16x16 pixel in Jira.")
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
    Icon icon = (Icon) o;
    return Objects.equals(this.link, icon.link) &&
        Objects.equals(this.title, icon.title) &&
        Objects.equals(this.url16x16, icon.url16x16) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, title, url16x16, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Icon {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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
