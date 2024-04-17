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
 * Issue security level member.
 */
@Schema(description = "Issue security level member.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class SecurityLevelMember extends HashMap<String, Object> {
  @SerializedName("holder")
  private AllOfSecurityLevelMemberHolder holder = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("issueSecurityLevelId")
  private String issueSecurityLevelId = null;

  @SerializedName("issueSecuritySchemeId")
  private String issueSecuritySchemeId = null;

  @SerializedName("managed")
  private Boolean managed = null;

   /**
   * The user or group being granted the permission. It consists of a &#x60;type&#x60; and a type-dependent &#x60;parameter&#x60;. See [Holder object](../api-group-permission-schemes/#holder-object) in *Get all permission schemes* for more information.
   * @return holder
  **/
  @Schema(required = true, description = "The user or group being granted the permission. It consists of a `type` and a type-dependent `parameter`. See [Holder object](../api-group-permission-schemes/#holder-object) in *Get all permission schemes* for more information.")
  public AllOfSecurityLevelMemberHolder getHolder() {
    return holder;
  }

   /**
   * The ID of the issue security level member.
   * @return id
  **/
  @Schema(required = true, description = "The ID of the issue security level member.")
  public String getId() {
    return id;
  }

   /**
   * The ID of the issue security level.
   * @return issueSecurityLevelId
  **/
  @Schema(required = true, description = "The ID of the issue security level.")
  public String getIssueSecurityLevelId() {
    return issueSecurityLevelId;
  }

   /**
   * The ID of the issue security scheme.
   * @return issueSecuritySchemeId
  **/
  @Schema(required = true, description = "The ID of the issue security scheme.")
  public String getIssueSecuritySchemeId() {
    return issueSecuritySchemeId;
  }

  public SecurityLevelMember managed(Boolean managed) {
    this.managed = managed;
    return this;
  }

   /**
   * Get managed
   * @return managed
  **/
  @Schema(description = "")
  public Boolean isManaged() {
    return managed;
  }

  public void setManaged(Boolean managed) {
    this.managed = managed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityLevelMember securityLevelMember = (SecurityLevelMember) o;
    return Objects.equals(this.holder, securityLevelMember.holder) &&
        Objects.equals(this.id, securityLevelMember.id) &&
        Objects.equals(this.issueSecurityLevelId, securityLevelMember.issueSecurityLevelId) &&
        Objects.equals(this.issueSecuritySchemeId, securityLevelMember.issueSecuritySchemeId) &&
        Objects.equals(this.managed, securityLevelMember.managed) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(holder, id, issueSecurityLevelId, issueSecuritySchemeId, managed, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityLevelMember {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    holder: ").append(toIndentedString(holder)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    issueSecurityLevelId: ").append(toIndentedString(issueSecurityLevelId)).append("\n");
    sb.append("    issueSecuritySchemeId: ").append(toIndentedString(issueSecuritySchemeId)).append("\n");
    sb.append("    managed: ").append(toIndentedString(managed)).append("\n");
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