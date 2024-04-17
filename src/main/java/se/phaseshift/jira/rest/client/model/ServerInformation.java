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
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import se.phaseshift.jira.rest.client.model.HealthCheckResult;
import se.phaseshift.jira.rest.client.model.ServerInformationServerTimeZone;
/**
 * Details about the Jira instance.
 */
@Schema(description = "Details about the Jira instance.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class ServerInformation {
  @SerializedName("baseUrl")
  private String baseUrl = null;

  @SerializedName("buildDate")
  private OffsetDateTime buildDate = null;

  @SerializedName("buildNumber")
  private Integer buildNumber = null;

  @SerializedName("deploymentType")
  private String deploymentType = null;

  @SerializedName("displayUrl")
  private String displayUrl = null;

  @SerializedName("displayUrlServicedeskHelpCenter")
  private String displayUrlServicedeskHelpCenter = null;

  @SerializedName("healthChecks")
  private List<HealthCheckResult> healthChecks = null;

  @SerializedName("scmInfo")
  private String scmInfo = null;

  @SerializedName("serverTime")
  private OffsetDateTime serverTime = null;

  @SerializedName("serverTimeZone")
  private ServerInformationServerTimeZone serverTimeZone = null;

  @SerializedName("serverTitle")
  private String serverTitle = null;

  @SerializedName("version")
  private String version = null;

  @SerializedName("versionNumbers")
  private List<Integer> versionNumbers = null;

  public ServerInformation baseUrl(String baseUrl) {
    this.baseUrl = baseUrl;
    return this;
  }

   /**
   * The base URL of the Jira instance.
   * @return baseUrl
  **/
  @Schema(description = "The base URL of the Jira instance.")
  public String getBaseUrl() {
    return baseUrl;
  }

  public void setBaseUrl(String baseUrl) {
    this.baseUrl = baseUrl;
  }

  public ServerInformation buildDate(OffsetDateTime buildDate) {
    this.buildDate = buildDate;
    return this;
  }

   /**
   * The timestamp when the Jira version was built.
   * @return buildDate
  **/
  @Schema(description = "The timestamp when the Jira version was built.")
  public OffsetDateTime getBuildDate() {
    return buildDate;
  }

  public void setBuildDate(OffsetDateTime buildDate) {
    this.buildDate = buildDate;
  }

  public ServerInformation buildNumber(Integer buildNumber) {
    this.buildNumber = buildNumber;
    return this;
  }

   /**
   * The build number of the Jira version.
   * @return buildNumber
  **/
  @Schema(description = "The build number of the Jira version.")
  public Integer getBuildNumber() {
    return buildNumber;
  }

  public void setBuildNumber(Integer buildNumber) {
    this.buildNumber = buildNumber;
  }

  public ServerInformation deploymentType(String deploymentType) {
    this.deploymentType = deploymentType;
    return this;
  }

   /**
   * The type of server deployment. This is always returned as *Cloud*.
   * @return deploymentType
  **/
  @Schema(description = "The type of server deployment. This is always returned as *Cloud*.")
  public String getDeploymentType() {
    return deploymentType;
  }

  public void setDeploymentType(String deploymentType) {
    this.deploymentType = deploymentType;
  }

  public ServerInformation displayUrl(String displayUrl) {
    this.displayUrl = displayUrl;
    return this;
  }

   /**
   * The display URL of the Jira instance.
   * @return displayUrl
  **/
  @Schema(description = "The display URL of the Jira instance.")
  public String getDisplayUrl() {
    return displayUrl;
  }

  public void setDisplayUrl(String displayUrl) {
    this.displayUrl = displayUrl;
  }

  public ServerInformation displayUrlServicedeskHelpCenter(String displayUrlServicedeskHelpCenter) {
    this.displayUrlServicedeskHelpCenter = displayUrlServicedeskHelpCenter;
    return this;
  }

   /**
   * The display URL of the Servicedesk Help Center.
   * @return displayUrlServicedeskHelpCenter
  **/
  @Schema(description = "The display URL of the Servicedesk Help Center.")
  public String getDisplayUrlServicedeskHelpCenter() {
    return displayUrlServicedeskHelpCenter;
  }

  public void setDisplayUrlServicedeskHelpCenter(String displayUrlServicedeskHelpCenter) {
    this.displayUrlServicedeskHelpCenter = displayUrlServicedeskHelpCenter;
  }

  public ServerInformation healthChecks(List<HealthCheckResult> healthChecks) {
    this.healthChecks = healthChecks;
    return this;
  }

  public ServerInformation addHealthChecksItem(HealthCheckResult healthChecksItem) {
    if (this.healthChecks == null) {
      this.healthChecks = new ArrayList<HealthCheckResult>();
    }
    this.healthChecks.add(healthChecksItem);
    return this;
  }

   /**
   * Jira instance health check results. Deprecated and no longer returned.
   * @return healthChecks
  **/
  @Schema(description = "Jira instance health check results. Deprecated and no longer returned.")
  public List<HealthCheckResult> getHealthChecks() {
    return healthChecks;
  }

  public void setHealthChecks(List<HealthCheckResult> healthChecks) {
    this.healthChecks = healthChecks;
  }

  public ServerInformation scmInfo(String scmInfo) {
    this.scmInfo = scmInfo;
    return this;
  }

   /**
   * The unique identifier of the Jira version.
   * @return scmInfo
  **/
  @Schema(description = "The unique identifier of the Jira version.")
  public String getScmInfo() {
    return scmInfo;
  }

  public void setScmInfo(String scmInfo) {
    this.scmInfo = scmInfo;
  }

  public ServerInformation serverTime(OffsetDateTime serverTime) {
    this.serverTime = serverTime;
    return this;
  }

   /**
   * The time in Jira when this request was responded to.
   * @return serverTime
  **/
  @Schema(description = "The time in Jira when this request was responded to.")
  public OffsetDateTime getServerTime() {
    return serverTime;
  }

  public void setServerTime(OffsetDateTime serverTime) {
    this.serverTime = serverTime;
  }

  public ServerInformation serverTimeZone(ServerInformationServerTimeZone serverTimeZone) {
    this.serverTimeZone = serverTimeZone;
    return this;
  }

   /**
   * Get serverTimeZone
   * @return serverTimeZone
  **/
  @Schema(description = "")
  public ServerInformationServerTimeZone getServerTimeZone() {
    return serverTimeZone;
  }

  public void setServerTimeZone(ServerInformationServerTimeZone serverTimeZone) {
    this.serverTimeZone = serverTimeZone;
  }

  public ServerInformation serverTitle(String serverTitle) {
    this.serverTitle = serverTitle;
    return this;
  }

   /**
   * The name of the Jira instance.
   * @return serverTitle
  **/
  @Schema(description = "The name of the Jira instance.")
  public String getServerTitle() {
    return serverTitle;
  }

  public void setServerTitle(String serverTitle) {
    this.serverTitle = serverTitle;
  }

  public ServerInformation version(String version) {
    this.version = version;
    return this;
  }

   /**
   * The version of Jira.
   * @return version
  **/
  @Schema(description = "The version of Jira.")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public ServerInformation versionNumbers(List<Integer> versionNumbers) {
    this.versionNumbers = versionNumbers;
    return this;
  }

  public ServerInformation addVersionNumbersItem(Integer versionNumbersItem) {
    if (this.versionNumbers == null) {
      this.versionNumbers = new ArrayList<Integer>();
    }
    this.versionNumbers.add(versionNumbersItem);
    return this;
  }

   /**
   * The major, minor, and revision version numbers of the Jira version.
   * @return versionNumbers
  **/
  @Schema(description = "The major, minor, and revision version numbers of the Jira version.")
  public List<Integer> getVersionNumbers() {
    return versionNumbers;
  }

  public void setVersionNumbers(List<Integer> versionNumbers) {
    this.versionNumbers = versionNumbers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServerInformation serverInformation = (ServerInformation) o;
    return Objects.equals(this.baseUrl, serverInformation.baseUrl) &&
        Objects.equals(this.buildDate, serverInformation.buildDate) &&
        Objects.equals(this.buildNumber, serverInformation.buildNumber) &&
        Objects.equals(this.deploymentType, serverInformation.deploymentType) &&
        Objects.equals(this.displayUrl, serverInformation.displayUrl) &&
        Objects.equals(this.displayUrlServicedeskHelpCenter, serverInformation.displayUrlServicedeskHelpCenter) &&
        Objects.equals(this.healthChecks, serverInformation.healthChecks) &&
        Objects.equals(this.scmInfo, serverInformation.scmInfo) &&
        Objects.equals(this.serverTime, serverInformation.serverTime) &&
        Objects.equals(this.serverTimeZone, serverInformation.serverTimeZone) &&
        Objects.equals(this.serverTitle, serverInformation.serverTitle) &&
        Objects.equals(this.version, serverInformation.version) &&
        Objects.equals(this.versionNumbers, serverInformation.versionNumbers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseUrl, buildDate, buildNumber, deploymentType, displayUrl, displayUrlServicedeskHelpCenter, healthChecks, scmInfo, serverTime, serverTimeZone, serverTitle, version, versionNumbers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerInformation {\n");
    
    sb.append("    baseUrl: ").append(toIndentedString(baseUrl)).append("\n");
    sb.append("    buildDate: ").append(toIndentedString(buildDate)).append("\n");
    sb.append("    buildNumber: ").append(toIndentedString(buildNumber)).append("\n");
    sb.append("    deploymentType: ").append(toIndentedString(deploymentType)).append("\n");
    sb.append("    displayUrl: ").append(toIndentedString(displayUrl)).append("\n");
    sb.append("    displayUrlServicedeskHelpCenter: ").append(toIndentedString(displayUrlServicedeskHelpCenter)).append("\n");
    sb.append("    healthChecks: ").append(toIndentedString(healthChecks)).append("\n");
    sb.append("    scmInfo: ").append(toIndentedString(scmInfo)).append("\n");
    sb.append("    serverTime: ").append(toIndentedString(serverTime)).append("\n");
    sb.append("    serverTimeZone: ").append(toIndentedString(serverTimeZone)).append("\n");
    sb.append("    serverTitle: ").append(toIndentedString(serverTitle)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    versionNumbers: ").append(toIndentedString(versionNumbers)).append("\n");
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