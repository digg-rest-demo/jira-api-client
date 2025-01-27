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
 * The IDs of the screens for the screen types of the screen scheme.
 */
@Schema(description = "The IDs of the screens for the screen types of the screen scheme.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class UpdateScreenTypes {
  @SerializedName("create")
  private String create = null;

  @SerializedName("default")
  private String _default = null;

  @SerializedName("edit")
  private String edit = null;

  @SerializedName("view")
  private String view = null;

  public UpdateScreenTypes create(String create) {
    this.create = create;
    return this;
  }

   /**
   * The ID of the create screen. To remove the screen association, pass a null.
   * @return create
  **/
  @Schema(description = "The ID of the create screen. To remove the screen association, pass a null.")
  public String getCreate() {
    return create;
  }

  public void setCreate(String create) {
    this.create = create;
  }

  public UpdateScreenTypes _default(String _default) {
    this._default = _default;
    return this;
  }

   /**
   * The ID of the default screen. When specified, must include a screen ID as a default screen is required.
   * @return _default
  **/
  @Schema(description = "The ID of the default screen. When specified, must include a screen ID as a default screen is required.")
  public String getDefault() {
    return _default;
  }

  public void setDefault(String _default) {
    this._default = _default;
  }

  public UpdateScreenTypes edit(String edit) {
    this.edit = edit;
    return this;
  }

   /**
   * The ID of the edit screen. To remove the screen association, pass a null.
   * @return edit
  **/
  @Schema(description = "The ID of the edit screen. To remove the screen association, pass a null.")
  public String getEdit() {
    return edit;
  }

  public void setEdit(String edit) {
    this.edit = edit;
  }

  public UpdateScreenTypes view(String view) {
    this.view = view;
    return this;
  }

   /**
   * The ID of the view screen. To remove the screen association, pass a null.
   * @return view
  **/
  @Schema(description = "The ID of the view screen. To remove the screen association, pass a null.")
  public String getView() {
    return view;
  }

  public void setView(String view) {
    this.view = view;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateScreenTypes updateScreenTypes = (UpdateScreenTypes) o;
    return Objects.equals(this.create, updateScreenTypes.create) &&
        Objects.equals(this._default, updateScreenTypes._default) &&
        Objects.equals(this.edit, updateScreenTypes.edit) &&
        Objects.equals(this.view, updateScreenTypes.view);
  }

  @Override
  public int hashCode() {
    return Objects.hash(create, _default, edit, view);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateScreenTypes {\n");
    
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    edit: ").append(toIndentedString(edit)).append("\n");
    sb.append("    view: ").append(toIndentedString(view)).append("\n");
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
