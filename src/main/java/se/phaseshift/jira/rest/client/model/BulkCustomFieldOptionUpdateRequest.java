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
import se.phaseshift.jira.rest.client.model.CustomFieldOptionUpdate;
/**
 * Details of the options to update for a custom field.
 */
@Schema(description = "Details of the options to update for a custom field.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class BulkCustomFieldOptionUpdateRequest {
  @SerializedName("options")
  private List<CustomFieldOptionUpdate> options = null;

  public BulkCustomFieldOptionUpdateRequest options(List<CustomFieldOptionUpdate> options) {
    this.options = options;
    return this;
  }

  public BulkCustomFieldOptionUpdateRequest addOptionsItem(CustomFieldOptionUpdate optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<CustomFieldOptionUpdate>();
    }
    this.options.add(optionsItem);
    return this;
  }

   /**
   * Details of the options to update.
   * @return options
  **/
  @Schema(description = "Details of the options to update.")
  public List<CustomFieldOptionUpdate> getOptions() {
    return options;
  }

  public void setOptions(List<CustomFieldOptionUpdate> options) {
    this.options = options;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkCustomFieldOptionUpdateRequest bulkCustomFieldOptionUpdateRequest = (BulkCustomFieldOptionUpdateRequest) o;
    return Objects.equals(this.options, bulkCustomFieldOptionUpdateRequest.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(options);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkCustomFieldOptionUpdateRequest {\n");
    
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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