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
/**
 * Bulk operation filter details.
 */
@Schema(description = "Bulk operation filter details.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class IssueFilterForBulkPropertySet {
  @SerializedName("currentValue")
  private Object currentValue = null;

  @SerializedName("entityIds")
  private List<Long> entityIds = null;

  @SerializedName("hasProperty")
  private Boolean hasProperty = null;

  public IssueFilterForBulkPropertySet currentValue(Object currentValue) {
    this.currentValue = currentValue;
    return this;
  }

   /**
   * The value of properties to perform the bulk operation on.
   * @return currentValue
  **/
  @Schema(description = "The value of properties to perform the bulk operation on.")
  public Object getCurrentValue() {
    return currentValue;
  }

  public void setCurrentValue(Object currentValue) {
    this.currentValue = currentValue;
  }

  public IssueFilterForBulkPropertySet entityIds(List<Long> entityIds) {
    this.entityIds = entityIds;
    return this;
  }

  public IssueFilterForBulkPropertySet addEntityIdsItem(Long entityIdsItem) {
    if (this.entityIds == null) {
      this.entityIds = new ArrayList<Long>();
    }
    this.entityIds.add(entityIdsItem);
    return this;
  }

   /**
   * List of issues to perform the bulk operation on.
   * @return entityIds
  **/
  @Schema(description = "List of issues to perform the bulk operation on.")
  public List<Long> getEntityIds() {
    return entityIds;
  }

  public void setEntityIds(List<Long> entityIds) {
    this.entityIds = entityIds;
  }

  public IssueFilterForBulkPropertySet hasProperty(Boolean hasProperty) {
    this.hasProperty = hasProperty;
    return this;
  }

   /**
   * Whether the bulk operation occurs only when the property is present on or absent from an issue.
   * @return hasProperty
  **/
  @Schema(description = "Whether the bulk operation occurs only when the property is present on or absent from an issue.")
  public Boolean isHasProperty() {
    return hasProperty;
  }

  public void setHasProperty(Boolean hasProperty) {
    this.hasProperty = hasProperty;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueFilterForBulkPropertySet issueFilterForBulkPropertySet = (IssueFilterForBulkPropertySet) o;
    return Objects.equals(this.currentValue, issueFilterForBulkPropertySet.currentValue) &&
        Objects.equals(this.entityIds, issueFilterForBulkPropertySet.entityIds) &&
        Objects.equals(this.hasProperty, issueFilterForBulkPropertySet.hasProperty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentValue, entityIds, hasProperty);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueFilterForBulkPropertySet {\n");
    
    sb.append("    currentValue: ").append(toIndentedString(currentValue)).append("\n");
    sb.append("    entityIds: ").append(toIndentedString(entityIds)).append("\n");
    sb.append("    hasProperty: ").append(toIndentedString(hasProperty)).append("\n");
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
