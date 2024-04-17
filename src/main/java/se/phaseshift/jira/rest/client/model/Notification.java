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
 * Details about a notification.
 */
@Schema(description = "Details about a notification.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class Notification extends HashMap<String, Object> {
  @SerializedName("htmlBody")
  private String htmlBody = null;

  @SerializedName("restrict")
  private AllOfNotificationRestrict restrict = null;

  @SerializedName("subject")
  private String subject = null;

  @SerializedName("textBody")
  private String textBody = null;

  @SerializedName("to")
  private AllOfNotificationTo to = null;

  public Notification htmlBody(String htmlBody) {
    this.htmlBody = htmlBody;
    return this;
  }

   /**
   * The HTML body of the email notification for the issue.
   * @return htmlBody
  **/
  @Schema(description = "The HTML body of the email notification for the issue.")
  public String getHtmlBody() {
    return htmlBody;
  }

  public void setHtmlBody(String htmlBody) {
    this.htmlBody = htmlBody;
  }

  public Notification restrict(AllOfNotificationRestrict restrict) {
    this.restrict = restrict;
    return this;
  }

   /**
   * Restricts the notifications to users with the specified permissions.
   * @return restrict
  **/
  @Schema(description = "Restricts the notifications to users with the specified permissions.")
  public AllOfNotificationRestrict getRestrict() {
    return restrict;
  }

  public void setRestrict(AllOfNotificationRestrict restrict) {
    this.restrict = restrict;
  }

  public Notification subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * The subject of the email notification for the issue. If this is not specified, then the subject is set to the issue key and summary.
   * @return subject
  **/
  @Schema(description = "The subject of the email notification for the issue. If this is not specified, then the subject is set to the issue key and summary.")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public Notification textBody(String textBody) {
    this.textBody = textBody;
    return this;
  }

   /**
   * The plain text body of the email notification for the issue.
   * @return textBody
  **/
  @Schema(description = "The plain text body of the email notification for the issue.")
  public String getTextBody() {
    return textBody;
  }

  public void setTextBody(String textBody) {
    this.textBody = textBody;
  }

  public Notification to(AllOfNotificationTo to) {
    this.to = to;
    return this;
  }

   /**
   * The recipients of the email notification for the issue.
   * @return to
  **/
  @Schema(description = "The recipients of the email notification for the issue.")
  public AllOfNotificationTo getTo() {
    return to;
  }

  public void setTo(AllOfNotificationTo to) {
    this.to = to;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Notification notification = (Notification) o;
    return Objects.equals(this.htmlBody, notification.htmlBody) &&
        Objects.equals(this.restrict, notification.restrict) &&
        Objects.equals(this.subject, notification.subject) &&
        Objects.equals(this.textBody, notification.textBody) &&
        Objects.equals(this.to, notification.to) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(htmlBody, restrict, subject, textBody, to, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Notification {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    htmlBody: ").append(toIndentedString(htmlBody)).append("\n");
    sb.append("    restrict: ").append(toIndentedString(restrict)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    textBody: ").append(toIndentedString(textBody)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
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
