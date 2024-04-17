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
import se.phaseshift.jira.rest.client.model.FilterSubscription;
import se.phaseshift.jira.rest.client.model.SharePermission;
/**
 * Details of a filter.
 */
@Schema(description = "Details of a filter.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class FilterDetails {
  @SerializedName("approximateLastUsed")
  private OffsetDateTime approximateLastUsed = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("editPermissions")
  private List<SharePermission> editPermissions = null;

  @SerializedName("expand")
  private String expand = null;

  @SerializedName("favourite")
  private Boolean favourite = null;

  @SerializedName("favouritedCount")
  private Long favouritedCount = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("jql")
  private String jql = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("owner")
  private AllOfFilterDetailsOwner owner = null;

  @SerializedName("searchUrl")
  private String searchUrl = null;

  @SerializedName("self")
  private String self = null;

  @SerializedName("sharePermissions")
  private List<SharePermission> sharePermissions = null;

  @SerializedName("subscriptions")
  private List<FilterSubscription> subscriptions = null;

  @SerializedName("viewUrl")
  private String viewUrl = null;

   /**
   * \\[Experimental\\] Approximate last used time. Returns the date and time when the filter was last used. Returns &#x60;null&#x60; if the filter hasn&#x27;t been used after tracking was enabled. For performance reasons, timestamps aren&#x27;t updated in real time and therefore may not be exactly accurate.
   * @return approximateLastUsed
  **/
  @Schema(description = "\\[Experimental\\] Approximate last used time. Returns the date and time when the filter was last used. Returns `null` if the filter hasn't been used after tracking was enabled. For performance reasons, timestamps aren't updated in real time and therefore may not be exactly accurate.")
  public OffsetDateTime getApproximateLastUsed() {
    return approximateLastUsed;
  }

  public FilterDetails description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the filter.
   * @return description
  **/
  @Schema(description = "The description of the filter.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public FilterDetails editPermissions(List<SharePermission> editPermissions) {
    this.editPermissions = editPermissions;
    return this;
  }

  public FilterDetails addEditPermissionsItem(SharePermission editPermissionsItem) {
    if (this.editPermissions == null) {
      this.editPermissions = new ArrayList<SharePermission>();
    }
    this.editPermissions.add(editPermissionsItem);
    return this;
  }

   /**
   * The groups and projects that can edit the filter. This can be specified when updating a filter, but not when creating a filter.
   * @return editPermissions
  **/
  @Schema(description = "The groups and projects that can edit the filter. This can be specified when updating a filter, but not when creating a filter.")
  public List<SharePermission> getEditPermissions() {
    return editPermissions;
  }

  public void setEditPermissions(List<SharePermission> editPermissions) {
    this.editPermissions = editPermissions;
  }

   /**
   * Expand options that include additional filter details in the response.
   * @return expand
  **/
  @Schema(description = "Expand options that include additional filter details in the response.")
  public String getExpand() {
    return expand;
  }

   /**
   * Whether the filter is selected as a favorite by any users, not including the filter owner.
   * @return favourite
  **/
  @Schema(description = "Whether the filter is selected as a favorite by any users, not including the filter owner.")
  public Boolean isFavourite() {
    return favourite;
  }

   /**
   * The count of how many users have selected this filter as a favorite, including the filter owner.
   * @return favouritedCount
  **/
  @Schema(description = "The count of how many users have selected this filter as a favorite, including the filter owner.")
  public Long getFavouritedCount() {
    return favouritedCount;
  }

   /**
   * The unique identifier for the filter.
   * @return id
  **/
  @Schema(description = "The unique identifier for the filter.")
  public String getId() {
    return id;
  }

   /**
   * The JQL query for the filter. For example, *project &#x3D; SSP AND issuetype &#x3D; Bug*.
   * @return jql
  **/
  @Schema(description = "The JQL query for the filter. For example, *project = SSP AND issuetype = Bug*.")
  public String getJql() {
    return jql;
  }

  public FilterDetails name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the filter.
   * @return name
  **/
  @Schema(required = true, description = "The name of the filter.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

   /**
   * The user who owns the filter. Defaults to the creator of the filter, however, Jira administrators can change the owner of a shared filter in the admin settings.
   * @return owner
  **/
  @Schema(description = "The user who owns the filter. Defaults to the creator of the filter, however, Jira administrators can change the owner of a shared filter in the admin settings.")
  public AllOfFilterDetailsOwner getOwner() {
    return owner;
  }

   /**
   * A URL to view the filter results in Jira, using the [Search for issues using JQL](#api-rest-api-3-filter-search-get) operation with the filter&#x27;s JQL string to return the filter results. For example, *https://your-domain.atlassian.net/rest/api/3/search?jql&#x3D;project+%3D+SSP+AND+issuetype+%3D+Bug*.
   * @return searchUrl
  **/
  @Schema(description = "A URL to view the filter results in Jira, using the [Search for issues using JQL](#api-rest-api-3-filter-search-get) operation with the filter's JQL string to return the filter results. For example, *https://your-domain.atlassian.net/rest/api/3/search?jql=project+%3D+SSP+AND+issuetype+%3D+Bug*.")
  public String getSearchUrl() {
    return searchUrl;
  }

   /**
   * The URL of the filter.
   * @return self
  **/
  @Schema(description = "The URL of the filter.")
  public String getSelf() {
    return self;
  }

  public FilterDetails sharePermissions(List<SharePermission> sharePermissions) {
    this.sharePermissions = sharePermissions;
    return this;
  }

  public FilterDetails addSharePermissionsItem(SharePermission sharePermissionsItem) {
    if (this.sharePermissions == null) {
      this.sharePermissions = new ArrayList<SharePermission>();
    }
    this.sharePermissions.add(sharePermissionsItem);
    return this;
  }

   /**
   * The groups and projects that the filter is shared with. This can be specified when updating a filter, but not when creating a filter.
   * @return sharePermissions
  **/
  @Schema(description = "The groups and projects that the filter is shared with. This can be specified when updating a filter, but not when creating a filter.")
  public List<SharePermission> getSharePermissions() {
    return sharePermissions;
  }

  public void setSharePermissions(List<SharePermission> sharePermissions) {
    this.sharePermissions = sharePermissions;
  }

   /**
   * The users that are subscribed to the filter.
   * @return subscriptions
  **/
  @Schema(description = "The users that are subscribed to the filter.")
  public List<FilterSubscription> getSubscriptions() {
    return subscriptions;
  }

   /**
   * A URL to view the filter results in Jira, using the ID of the filter. For example, *https://your-domain.atlassian.net/issues/?filter&#x3D;10100*.
   * @return viewUrl
  **/
  @Schema(description = "A URL to view the filter results in Jira, using the ID of the filter. For example, *https://your-domain.atlassian.net/issues/?filter=10100*.")
  public String getViewUrl() {
    return viewUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilterDetails filterDetails = (FilterDetails) o;
    return Objects.equals(this.approximateLastUsed, filterDetails.approximateLastUsed) &&
        Objects.equals(this.description, filterDetails.description) &&
        Objects.equals(this.editPermissions, filterDetails.editPermissions) &&
        Objects.equals(this.expand, filterDetails.expand) &&
        Objects.equals(this.favourite, filterDetails.favourite) &&
        Objects.equals(this.favouritedCount, filterDetails.favouritedCount) &&
        Objects.equals(this.id, filterDetails.id) &&
        Objects.equals(this.jql, filterDetails.jql) &&
        Objects.equals(this.name, filterDetails.name) &&
        Objects.equals(this.owner, filterDetails.owner) &&
        Objects.equals(this.searchUrl, filterDetails.searchUrl) &&
        Objects.equals(this.self, filterDetails.self) &&
        Objects.equals(this.sharePermissions, filterDetails.sharePermissions) &&
        Objects.equals(this.subscriptions, filterDetails.subscriptions) &&
        Objects.equals(this.viewUrl, filterDetails.viewUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(approximateLastUsed, description, editPermissions, expand, favourite, favouritedCount, id, jql, name, owner, searchUrl, self, sharePermissions, subscriptions, viewUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilterDetails {\n");
    
    sb.append("    approximateLastUsed: ").append(toIndentedString(approximateLastUsed)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    editPermissions: ").append(toIndentedString(editPermissions)).append("\n");
    sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
    sb.append("    favourite: ").append(toIndentedString(favourite)).append("\n");
    sb.append("    favouritedCount: ").append(toIndentedString(favouritedCount)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    jql: ").append(toIndentedString(jql)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    searchUrl: ").append(toIndentedString(searchUrl)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    sharePermissions: ").append(toIndentedString(sharePermissions)).append("\n");
    sb.append("    subscriptions: ").append(toIndentedString(subscriptions)).append("\n");
    sb.append("    viewUrl: ").append(toIndentedString(viewUrl)).append("\n");
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
