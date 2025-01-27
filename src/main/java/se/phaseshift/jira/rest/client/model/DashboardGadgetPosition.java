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
 * Details of a gadget position.
 */
@Schema(description = "Details of a gadget position.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class DashboardGadgetPosition {
  @SerializedName("The column position of the gadget.")
  private Integer theColumnPositionOfTheGadget_ = null;

  @SerializedName("The row position of the gadget.")
  private Integer theRowPositionOfTheGadget_ = null;

  public DashboardGadgetPosition theColumnPositionOfTheGadget_(Integer theColumnPositionOfTheGadget_) {
    this.theColumnPositionOfTheGadget_ = theColumnPositionOfTheGadget_;
    return this;
  }

   /**
   * Get theColumnPositionOfTheGadget_
   * @return theColumnPositionOfTheGadget_
  **/
  @Schema(required = true, description = "")
  public Integer getTheColumnPositionOfTheGadget_() {
    return theColumnPositionOfTheGadget_;
  }

  public void setTheColumnPositionOfTheGadget_(Integer theColumnPositionOfTheGadget_) {
    this.theColumnPositionOfTheGadget_ = theColumnPositionOfTheGadget_;
  }

  public DashboardGadgetPosition theRowPositionOfTheGadget_(Integer theRowPositionOfTheGadget_) {
    this.theRowPositionOfTheGadget_ = theRowPositionOfTheGadget_;
    return this;
  }

   /**
   * Get theRowPositionOfTheGadget_
   * @return theRowPositionOfTheGadget_
  **/
  @Schema(required = true, description = "")
  public Integer getTheRowPositionOfTheGadget_() {
    return theRowPositionOfTheGadget_;
  }

  public void setTheRowPositionOfTheGadget_(Integer theRowPositionOfTheGadget_) {
    this.theRowPositionOfTheGadget_ = theRowPositionOfTheGadget_;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashboardGadgetPosition dashboardGadgetPosition = (DashboardGadgetPosition) o;
    return Objects.equals(this.theColumnPositionOfTheGadget_, dashboardGadgetPosition.theColumnPositionOfTheGadget_) &&
        Objects.equals(this.theRowPositionOfTheGadget_, dashboardGadgetPosition.theRowPositionOfTheGadget_);
  }

  @Override
  public int hashCode() {
    return Objects.hash(theColumnPositionOfTheGadget_, theRowPositionOfTheGadget_);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardGadgetPosition {\n");
    
    sb.append("    theColumnPositionOfTheGadget_: ").append(toIndentedString(theColumnPositionOfTheGadget_)).append("\n");
    sb.append("    theRowPositionOfTheGadget_: ").append(toIndentedString(theRowPositionOfTheGadget_)).append("\n");
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
