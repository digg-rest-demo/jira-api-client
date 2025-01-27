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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import se.phaseshift.jira.rest.client.model.NotificationSchemeNotificationDetails;
/**
 * Details of a notification scheme event.
 */
@Schema(description = "Details of a notification scheme event.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class NotificationSchemeEventDetails extends HashMap<String, Object> {
  @SerializedName("event")
  private AllOfNotificationSchemeEventDetailsEvent event = null;

  @SerializedName("notifications")
  private List<NotificationSchemeNotificationDetails> notifications = new ArrayList<NotificationSchemeNotificationDetails>();

  public NotificationSchemeEventDetails event(AllOfNotificationSchemeEventDetailsEvent event) {
    this.event = event;
    return this;
  }

   /**
   * The ID of the event.
   * @return event
  **/
  @Schema(required = true, description = "The ID of the event.")
  public AllOfNotificationSchemeEventDetailsEvent getEvent() {
    return event;
  }

  public void setEvent(AllOfNotificationSchemeEventDetailsEvent event) {
    this.event = event;
  }

  public NotificationSchemeEventDetails notifications(List<NotificationSchemeNotificationDetails> notifications) {
    this.notifications = notifications;
    return this;
  }

  public NotificationSchemeEventDetails addNotificationsItem(NotificationSchemeNotificationDetails notificationsItem) {
    this.notifications.add(notificationsItem);
    return this;
  }

   /**
   * The list of notifications mapped to a specified event.
   * @return notifications
  **/
  @Schema(required = true, description = "The list of notifications mapped to a specified event.")
  public List<NotificationSchemeNotificationDetails> getNotifications() {
    return notifications;
  }

  public void setNotifications(List<NotificationSchemeNotificationDetails> notifications) {
    this.notifications = notifications;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationSchemeEventDetails notificationSchemeEventDetails = (NotificationSchemeEventDetails) o;
    return Objects.equals(this.event, notificationSchemeEventDetails.event) &&
        Objects.equals(this.notifications, notificationSchemeEventDetails.notifications) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(event, notifications, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationSchemeEventDetails {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
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
