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
 * CustomFieldDefinitionJsonBean
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class CustomFieldDefinitionJsonBean {
  @SerializedName("description")
  private String description = null;

  @SerializedName("name")
  private String name = null;

  /**
   * The searcher defines the way the field is searched in Jira. For example, *com.atlassian.jira.plugin.system.customfieldtypes:grouppickersearcher*.   The search UI (basic search and JQL search) will display different operations and values for the field, based on the field searcher. You must specify a searcher that is valid for the field type, as listed below (abbreviated values shown):   *  &#x60;cascadingselect&#x60;: &#x60;cascadingselectsearcher&#x60;  *  &#x60;datepicker&#x60;: &#x60;daterange&#x60;  *  &#x60;datetime&#x60;: &#x60;datetimerange&#x60;  *  &#x60;float&#x60;: &#x60;exactnumber&#x60; or &#x60;numberrange&#x60;  *  &#x60;grouppicker&#x60;: &#x60;grouppickersearcher&#x60;  *  &#x60;importid&#x60;: &#x60;exactnumber&#x60; or &#x60;numberrange&#x60;  *  &#x60;labels&#x60;: &#x60;labelsearcher&#x60;  *  &#x60;multicheckboxes&#x60;: &#x60;multiselectsearcher&#x60;  *  &#x60;multigrouppicker&#x60;: &#x60;multiselectsearcher&#x60;  *  &#x60;multiselect&#x60;: &#x60;multiselectsearcher&#x60;  *  &#x60;multiuserpicker&#x60;: &#x60;userpickergroupsearcher&#x60;  *  &#x60;multiversion&#x60;: &#x60;versionsearcher&#x60;  *  &#x60;project&#x60;: &#x60;projectsearcher&#x60;  *  &#x60;radiobuttons&#x60;: &#x60;multiselectsearcher&#x60;  *  &#x60;readonlyfield&#x60;: &#x60;textsearcher&#x60;  *  &#x60;select&#x60;: &#x60;multiselectsearcher&#x60;  *  &#x60;textarea&#x60;: &#x60;textsearcher&#x60;  *  &#x60;textfield&#x60;: &#x60;textsearcher&#x60;  *  &#x60;url&#x60;: &#x60;exacttextsearcher&#x60;  *  &#x60;userpicker&#x60;: &#x60;userpickergroupsearcher&#x60;  *  &#x60;version&#x60;: &#x60;versionsearcher&#x60;  If no searcher is provided, the field isn&#x27;t searchable. However, [Forge custom fields](https://developer.atlassian.com/platform/forge/manifest-reference/modules/#jira-custom-field-type--beta-) have a searcher set automatically, so are always searchable.
   */
  @JsonAdapter(SearcherKeyEnum.Adapter.class)
  public enum SearcherKeyEnum {
    @SerializedName("com.atlassian.jira.plugin.system.customfieldtypes:cascadingselectsearcher")
    CASCADINGSELECTSEARCHER("com.atlassian.jira.plugin.system.customfieldtypes:cascadingselectsearcher"),
    @SerializedName("com.atlassian.jira.plugin.system.customfieldtypes:daterange")
    DATERANGE("com.atlassian.jira.plugin.system.customfieldtypes:daterange"),
    @SerializedName("com.atlassian.jira.plugin.system.customfieldtypes:datetimerange")
    DATETIMERANGE("com.atlassian.jira.plugin.system.customfieldtypes:datetimerange"),
    @SerializedName("com.atlassian.jira.plugin.system.customfieldtypes:exactnumber")
    EXACTNUMBER("com.atlassian.jira.plugin.system.customfieldtypes:exactnumber"),
    @SerializedName("com.atlassian.jira.plugin.system.customfieldtypes:exacttextsearcher")
    EXACTTEXTSEARCHER("com.atlassian.jira.plugin.system.customfieldtypes:exacttextsearcher"),
    @SerializedName("com.atlassian.jira.plugin.system.customfieldtypes:grouppickersearcher")
    GROUPPICKERSEARCHER("com.atlassian.jira.plugin.system.customfieldtypes:grouppickersearcher"),
    @SerializedName("com.atlassian.jira.plugin.system.customfieldtypes:labelsearcher")
    LABELSEARCHER("com.atlassian.jira.plugin.system.customfieldtypes:labelsearcher"),
    @SerializedName("com.atlassian.jira.plugin.system.customfieldtypes:multiselectsearcher")
    MULTISELECTSEARCHER("com.atlassian.jira.plugin.system.customfieldtypes:multiselectsearcher"),
    @SerializedName("com.atlassian.jira.plugin.system.customfieldtypes:numberrange")
    NUMBERRANGE("com.atlassian.jira.plugin.system.customfieldtypes:numberrange"),
    @SerializedName("com.atlassian.jira.plugin.system.customfieldtypes:projectsearcher")
    PROJECTSEARCHER("com.atlassian.jira.plugin.system.customfieldtypes:projectsearcher"),
    @SerializedName("com.atlassian.jira.plugin.system.customfieldtypes:textsearcher")
    TEXTSEARCHER("com.atlassian.jira.plugin.system.customfieldtypes:textsearcher"),
    @SerializedName("com.atlassian.jira.plugin.system.customfieldtypes:userpickergroupsearcher")
    USERPICKERGROUPSEARCHER("com.atlassian.jira.plugin.system.customfieldtypes:userpickergroupsearcher"),
    @SerializedName("com.atlassian.jira.plugin.system.customfieldtypes:versionsearcher")
    VERSIONSEARCHER("com.atlassian.jira.plugin.system.customfieldtypes:versionsearcher");

    private String value;

    SearcherKeyEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static SearcherKeyEnum fromValue(String input) {
      for (SearcherKeyEnum b : SearcherKeyEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<SearcherKeyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SearcherKeyEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public SearcherKeyEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return SearcherKeyEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("searcherKey")
  private SearcherKeyEnum searcherKey = null;

  @SerializedName("type")
  private String type = null;

  public CustomFieldDefinitionJsonBean description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the custom field, which is displayed in Jira.
   * @return description
  **/
  @Schema(description = "The description of the custom field, which is displayed in Jira.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CustomFieldDefinitionJsonBean name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the custom field, which is displayed in Jira. This is not the unique identifier.
   * @return name
  **/
  @Schema(required = true, description = "The name of the custom field, which is displayed in Jira. This is not the unique identifier.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CustomFieldDefinitionJsonBean searcherKey(SearcherKeyEnum searcherKey) {
    this.searcherKey = searcherKey;
    return this;
  }

   /**
   * The searcher defines the way the field is searched in Jira. For example, *com.atlassian.jira.plugin.system.customfieldtypes:grouppickersearcher*.   The search UI (basic search and JQL search) will display different operations and values for the field, based on the field searcher. You must specify a searcher that is valid for the field type, as listed below (abbreviated values shown):   *  &#x60;cascadingselect&#x60;: &#x60;cascadingselectsearcher&#x60;  *  &#x60;datepicker&#x60;: &#x60;daterange&#x60;  *  &#x60;datetime&#x60;: &#x60;datetimerange&#x60;  *  &#x60;float&#x60;: &#x60;exactnumber&#x60; or &#x60;numberrange&#x60;  *  &#x60;grouppicker&#x60;: &#x60;grouppickersearcher&#x60;  *  &#x60;importid&#x60;: &#x60;exactnumber&#x60; or &#x60;numberrange&#x60;  *  &#x60;labels&#x60;: &#x60;labelsearcher&#x60;  *  &#x60;multicheckboxes&#x60;: &#x60;multiselectsearcher&#x60;  *  &#x60;multigrouppicker&#x60;: &#x60;multiselectsearcher&#x60;  *  &#x60;multiselect&#x60;: &#x60;multiselectsearcher&#x60;  *  &#x60;multiuserpicker&#x60;: &#x60;userpickergroupsearcher&#x60;  *  &#x60;multiversion&#x60;: &#x60;versionsearcher&#x60;  *  &#x60;project&#x60;: &#x60;projectsearcher&#x60;  *  &#x60;radiobuttons&#x60;: &#x60;multiselectsearcher&#x60;  *  &#x60;readonlyfield&#x60;: &#x60;textsearcher&#x60;  *  &#x60;select&#x60;: &#x60;multiselectsearcher&#x60;  *  &#x60;textarea&#x60;: &#x60;textsearcher&#x60;  *  &#x60;textfield&#x60;: &#x60;textsearcher&#x60;  *  &#x60;url&#x60;: &#x60;exacttextsearcher&#x60;  *  &#x60;userpicker&#x60;: &#x60;userpickergroupsearcher&#x60;  *  &#x60;version&#x60;: &#x60;versionsearcher&#x60;  If no searcher is provided, the field isn&#x27;t searchable. However, [Forge custom fields](https://developer.atlassian.com/platform/forge/manifest-reference/modules/#jira-custom-field-type--beta-) have a searcher set automatically, so are always searchable.
   * @return searcherKey
  **/
  @Schema(description = "The searcher defines the way the field is searched in Jira. For example, *com.atlassian.jira.plugin.system.customfieldtypes:grouppickersearcher*.   The search UI (basic search and JQL search) will display different operations and values for the field, based on the field searcher. You must specify a searcher that is valid for the field type, as listed below (abbreviated values shown):   *  `cascadingselect`: `cascadingselectsearcher`  *  `datepicker`: `daterange`  *  `datetime`: `datetimerange`  *  `float`: `exactnumber` or `numberrange`  *  `grouppicker`: `grouppickersearcher`  *  `importid`: `exactnumber` or `numberrange`  *  `labels`: `labelsearcher`  *  `multicheckboxes`: `multiselectsearcher`  *  `multigrouppicker`: `multiselectsearcher`  *  `multiselect`: `multiselectsearcher`  *  `multiuserpicker`: `userpickergroupsearcher`  *  `multiversion`: `versionsearcher`  *  `project`: `projectsearcher`  *  `radiobuttons`: `multiselectsearcher`  *  `readonlyfield`: `textsearcher`  *  `select`: `multiselectsearcher`  *  `textarea`: `textsearcher`  *  `textfield`: `textsearcher`  *  `url`: `exacttextsearcher`  *  `userpicker`: `userpickergroupsearcher`  *  `version`: `versionsearcher`  If no searcher is provided, the field isn't searchable. However, [Forge custom fields](https://developer.atlassian.com/platform/forge/manifest-reference/modules/#jira-custom-field-type--beta-) have a searcher set automatically, so are always searchable.")
  public SearcherKeyEnum getSearcherKey() {
    return searcherKey;
  }

  public void setSearcherKey(SearcherKeyEnum searcherKey) {
    this.searcherKey = searcherKey;
  }

  public CustomFieldDefinitionJsonBean type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the custom field. These built-in custom field types are available:   *  &#x60;cascadingselect&#x60;: Enables values to be selected from two levels of select lists (value: &#x60;com.atlassian.jira.plugin.system.customfieldtypes:cascadingselect&#x60;)  *  &#x60;datepicker&#x60;: Stores a date using a picker control (value: &#x60;com.atlassian.jira.plugin.system.customfieldtypes:datepicker&#x60;)  *  &#x60;datetime&#x60;: Stores a date with a time component (value: &#x60;com.atlassian.jira.plugin.system.customfieldtypes:datetime&#x60;)  *  &#x60;float&#x60;: Stores and validates a numeric (floating point) input (value: &#x60;com.atlassian.jira.plugin.system.customfieldtypes:float&#x60;)  *  &#x60;grouppicker&#x60;: Stores a user group using a picker control (value: &#x60;com.atlassian.jira.plugin.system.customfieldtypes:grouppicker&#x60;)  *  &#x60;importid&#x60;: A read-only field that stores the ID the issue had in the system it was imported from (value: &#x60;com.atlassian.jira.plugin.system.customfieldtypes:importid&#x60;)  *  &#x60;labels&#x60;: Stores labels (value: &#x60;com.atlassian.jira.plugin.system.customfieldtypes:labels&#x60;)  *  &#x60;multicheckboxes&#x60;: Stores multiple values using checkboxes (value: &#x60;&#x60;)  *  &#x60;multigrouppicker&#x60;: Stores multiple user groups using a picker control (value: &#x60;&#x60;)  *  &#x60;multiselect&#x60;: Stores multiple values using a select list (value: &#x60;com.atlassian.jira.plugin.system.customfieldtypes:multicheckboxes&#x60;)  *  &#x60;multiuserpicker&#x60;: Stores multiple users using a picker control (value: &#x60;com.atlassian.jira.plugin.system.customfieldtypes:multigrouppicker&#x60;)  *  &#x60;multiversion&#x60;: Stores multiple versions from the versions available in a project using a picker control (value: &#x60;com.atlassian.jira.plugin.system.customfieldtypes:multiversion&#x60;)  *  &#x60;project&#x60;: Stores a project from a list of projects that the user is permitted to view (value: &#x60;com.atlassian.jira.plugin.system.customfieldtypes:project&#x60;)  *  &#x60;radiobuttons&#x60;: Stores a value using radio buttons (value: &#x60;com.atlassian.jira.plugin.system.customfieldtypes:radiobuttons&#x60;)  *  &#x60;readonlyfield&#x60;: Stores a read-only text value, which can only be populated via the API (value: &#x60;com.atlassian.jira.plugin.system.customfieldtypes:readonlyfield&#x60;)  *  &#x60;select&#x60;: Stores a value from a configurable list of options (value: &#x60;com.atlassian.jira.plugin.system.customfieldtypes:select&#x60;)  *  &#x60;textarea&#x60;: Stores a long text string using a multiline text area (value: &#x60;com.atlassian.jira.plugin.system.customfieldtypes:textarea&#x60;)  *  &#x60;textfield&#x60;: Stores a text string using a single-line text box (value: &#x60;com.atlassian.jira.plugin.system.customfieldtypes:textfield&#x60;)  *  &#x60;url&#x60;: Stores a URL (value: &#x60;com.atlassian.jira.plugin.system.customfieldtypes:url&#x60;)  *  &#x60;userpicker&#x60;: Stores a user using a picker control (value: &#x60;com.atlassian.jira.plugin.system.customfieldtypes:userpicker&#x60;)  *  &#x60;version&#x60;: Stores a version using a picker control (value: &#x60;com.atlassian.jira.plugin.system.customfieldtypes:version&#x60;)  To create a field based on a [Forge custom field type](https://developer.atlassian.com/platform/forge/manifest-reference/modules/#jira-custom-field-type--beta-), use the ID of the Forge custom field type as the value. For example, &#x60;ari:cloud:ecosystem::extension/e62f20a2-4b61-4dbe-bfb9-9a88b5e3ac84/548c5df1-24aa-4f7c-bbbb-3038d947cb05/static/my-cf-type-key&#x60;.
   * @return type
  **/
  @Schema(required = true, description = "The type of the custom field. These built-in custom field types are available:   *  `cascadingselect`: Enables values to be selected from two levels of select lists (value: `com.atlassian.jira.plugin.system.customfieldtypes:cascadingselect`)  *  `datepicker`: Stores a date using a picker control (value: `com.atlassian.jira.plugin.system.customfieldtypes:datepicker`)  *  `datetime`: Stores a date with a time component (value: `com.atlassian.jira.plugin.system.customfieldtypes:datetime`)  *  `float`: Stores and validates a numeric (floating point) input (value: `com.atlassian.jira.plugin.system.customfieldtypes:float`)  *  `grouppicker`: Stores a user group using a picker control (value: `com.atlassian.jira.plugin.system.customfieldtypes:grouppicker`)  *  `importid`: A read-only field that stores the ID the issue had in the system it was imported from (value: `com.atlassian.jira.plugin.system.customfieldtypes:importid`)  *  `labels`: Stores labels (value: `com.atlassian.jira.plugin.system.customfieldtypes:labels`)  *  `multicheckboxes`: Stores multiple values using checkboxes (value: ``)  *  `multigrouppicker`: Stores multiple user groups using a picker control (value: ``)  *  `multiselect`: Stores multiple values using a select list (value: `com.atlassian.jira.plugin.system.customfieldtypes:multicheckboxes`)  *  `multiuserpicker`: Stores multiple users using a picker control (value: `com.atlassian.jira.plugin.system.customfieldtypes:multigrouppicker`)  *  `multiversion`: Stores multiple versions from the versions available in a project using a picker control (value: `com.atlassian.jira.plugin.system.customfieldtypes:multiversion`)  *  `project`: Stores a project from a list of projects that the user is permitted to view (value: `com.atlassian.jira.plugin.system.customfieldtypes:project`)  *  `radiobuttons`: Stores a value using radio buttons (value: `com.atlassian.jira.plugin.system.customfieldtypes:radiobuttons`)  *  `readonlyfield`: Stores a read-only text value, which can only be populated via the API (value: `com.atlassian.jira.plugin.system.customfieldtypes:readonlyfield`)  *  `select`: Stores a value from a configurable list of options (value: `com.atlassian.jira.plugin.system.customfieldtypes:select`)  *  `textarea`: Stores a long text string using a multiline text area (value: `com.atlassian.jira.plugin.system.customfieldtypes:textarea`)  *  `textfield`: Stores a text string using a single-line text box (value: `com.atlassian.jira.plugin.system.customfieldtypes:textfield`)  *  `url`: Stores a URL (value: `com.atlassian.jira.plugin.system.customfieldtypes:url`)  *  `userpicker`: Stores a user using a picker control (value: `com.atlassian.jira.plugin.system.customfieldtypes:userpicker`)  *  `version`: Stores a version using a picker control (value: `com.atlassian.jira.plugin.system.customfieldtypes:version`)  To create a field based on a [Forge custom field type](https://developer.atlassian.com/platform/forge/manifest-reference/modules/#jira-custom-field-type--beta-), use the ID of the Forge custom field type as the value. For example, `ari:cloud:ecosystem::extension/e62f20a2-4b61-4dbe-bfb9-9a88b5e3ac84/548c5df1-24aa-4f7c-bbbb-3038d947cb05/static/my-cf-type-key`.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFieldDefinitionJsonBean customFieldDefinitionJsonBean = (CustomFieldDefinitionJsonBean) o;
    return Objects.equals(this.description, customFieldDefinitionJsonBean.description) &&
        Objects.equals(this.name, customFieldDefinitionJsonBean.name) &&
        Objects.equals(this.searcherKey, customFieldDefinitionJsonBean.searcherKey) &&
        Objects.equals(this.type, customFieldDefinitionJsonBean.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name, searcherKey, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldDefinitionJsonBean {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    searcherKey: ").append(toIndentedString(searcherKey)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
