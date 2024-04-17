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
import org.threeten.bp.OffsetDateTime;
/**
 * The response for status request for a running/completed export task.
 */
@Schema(description = "The response for status request for a running/completed export task.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class ExportArchivedIssuesTaskProgressResponse {
  @SerializedName("fileUrl")
  private String fileUrl = null;

  @SerializedName("payload")
  private String payload = null;

  @SerializedName("progress")
  private Long progress = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("submittedTime")
  private OffsetDateTime submittedTime = null;

  @SerializedName("taskId")
  private String taskId = null;

  public ExportArchivedIssuesTaskProgressResponse fileUrl(String fileUrl) {
    this.fileUrl = fileUrl;
    return this;
  }

   /**
   * Get fileUrl
   * @return fileUrl
  **/
  @Schema(description = "")
  public String getFileUrl() {
    return fileUrl;
  }

  public void setFileUrl(String fileUrl) {
    this.fileUrl = fileUrl;
  }

  public ExportArchivedIssuesTaskProgressResponse payload(String payload) {
    this.payload = payload;
    return this;
  }

   /**
   * Get payload
   * @return payload
  **/
  @Schema(description = "")
  public String getPayload() {
    return payload;
  }

  public void setPayload(String payload) {
    this.payload = payload;
  }

  public ExportArchivedIssuesTaskProgressResponse progress(Long progress) {
    this.progress = progress;
    return this;
  }

   /**
   * Get progress
   * @return progress
  **/
  @Schema(description = "")
  public Long getProgress() {
    return progress;
  }

  public void setProgress(Long progress) {
    this.progress = progress;
  }

  public ExportArchivedIssuesTaskProgressResponse status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ExportArchivedIssuesTaskProgressResponse submittedTime(OffsetDateTime submittedTime) {
    this.submittedTime = submittedTime;
    return this;
  }

   /**
   * Get submittedTime
   * @return submittedTime
  **/
  @Schema(description = "")
  public OffsetDateTime getSubmittedTime() {
    return submittedTime;
  }

  public void setSubmittedTime(OffsetDateTime submittedTime) {
    this.submittedTime = submittedTime;
  }

  public ExportArchivedIssuesTaskProgressResponse taskId(String taskId) {
    this.taskId = taskId;
    return this;
  }

   /**
   * Get taskId
   * @return taskId
  **/
  @Schema(description = "")
  public String getTaskId() {
    return taskId;
  }

  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExportArchivedIssuesTaskProgressResponse exportArchivedIssuesTaskProgressResponse = (ExportArchivedIssuesTaskProgressResponse) o;
    return Objects.equals(this.fileUrl, exportArchivedIssuesTaskProgressResponse.fileUrl) &&
        Objects.equals(this.payload, exportArchivedIssuesTaskProgressResponse.payload) &&
        Objects.equals(this.progress, exportArchivedIssuesTaskProgressResponse.progress) &&
        Objects.equals(this.status, exportArchivedIssuesTaskProgressResponse.status) &&
        Objects.equals(this.submittedTime, exportArchivedIssuesTaskProgressResponse.submittedTime) &&
        Objects.equals(this.taskId, exportArchivedIssuesTaskProgressResponse.taskId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileUrl, payload, progress, status, submittedTime, taskId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportArchivedIssuesTaskProgressResponse {\n");
    
    sb.append("    fileUrl: ").append(toIndentedString(fileUrl)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    submittedTime: ").append(toIndentedString(submittedTime)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
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
