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
/**
 * The details of a workflow transition.
 */
@Schema(description = "The details of a workflow transition.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class CreateWorkflowTransitionDetails {
  @SerializedName("description")
  private String description = null;

  @SerializedName("from")
  private List<String> from = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("properties")
  private Map<String, String> properties = null;

  @SerializedName("rules")
  private AllOfCreateWorkflowTransitionDetailsRules rules = null;

  @SerializedName("screen")
  private AllOfCreateWorkflowTransitionDetailsScreen screen = null;

  @SerializedName("to")
  private String to = null;

  /**
   * The type of the transition.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    @SerializedName("global")
    GLOBAL("global"),
    @SerializedName("initial")
    INITIAL("initial"),
    @SerializedName("directed")
    DIRECTED("directed");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TypeEnum fromValue(String input) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return TypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("type")
  private TypeEnum type = null;

  public CreateWorkflowTransitionDetails description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the transition. The maximum length is 1000 characters.
   * @return description
  **/
  @Schema(description = "The description of the transition. The maximum length is 1000 characters.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CreateWorkflowTransitionDetails from(List<String> from) {
    this.from = from;
    return this;
  }

  public CreateWorkflowTransitionDetails addFromItem(String fromItem) {
    if (this.from == null) {
      this.from = new ArrayList<String>();
    }
    this.from.add(fromItem);
    return this;
  }

   /**
   * The statuses the transition can start from.
   * @return from
  **/
  @Schema(description = "The statuses the transition can start from.")
  public List<String> getFrom() {
    return from;
  }

  public void setFrom(List<String> from) {
    this.from = from;
  }

  public CreateWorkflowTransitionDetails name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the transition. The maximum length is 60 characters.
   * @return name
  **/
  @Schema(required = true, description = "The name of the transition. The maximum length is 60 characters.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateWorkflowTransitionDetails properties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  public CreateWorkflowTransitionDetails putPropertiesItem(String key, String propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<String, String>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * The properties of the transition.
   * @return properties
  **/
  @Schema(description = "The properties of the transition.")
  public Map<String, String> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, String> properties) {
    this.properties = properties;
  }

  public CreateWorkflowTransitionDetails rules(AllOfCreateWorkflowTransitionDetailsRules rules) {
    this.rules = rules;
    return this;
  }

   /**
   * The rules of the transition.
   * @return rules
  **/
  @Schema(description = "The rules of the transition.")
  public AllOfCreateWorkflowTransitionDetailsRules getRules() {
    return rules;
  }

  public void setRules(AllOfCreateWorkflowTransitionDetailsRules rules) {
    this.rules = rules;
  }

  public CreateWorkflowTransitionDetails screen(AllOfCreateWorkflowTransitionDetailsScreen screen) {
    this.screen = screen;
    return this;
  }

   /**
   * The screen of the transition.
   * @return screen
  **/
  @Schema(description = "The screen of the transition.")
  public AllOfCreateWorkflowTransitionDetailsScreen getScreen() {
    return screen;
  }

  public void setScreen(AllOfCreateWorkflowTransitionDetailsScreen screen) {
    this.screen = screen;
  }

  public CreateWorkflowTransitionDetails to(String to) {
    this.to = to;
    return this;
  }

   /**
   * The status the transition goes to.
   * @return to
  **/
  @Schema(required = true, description = "The status the transition goes to.")
  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public CreateWorkflowTransitionDetails type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the transition.
   * @return type
  **/
  @Schema(required = true, description = "The type of the transition.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
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
    CreateWorkflowTransitionDetails createWorkflowTransitionDetails = (CreateWorkflowTransitionDetails) o;
    return Objects.equals(this.description, createWorkflowTransitionDetails.description) &&
        Objects.equals(this.from, createWorkflowTransitionDetails.from) &&
        Objects.equals(this.name, createWorkflowTransitionDetails.name) &&
        Objects.equals(this.properties, createWorkflowTransitionDetails.properties) &&
        Objects.equals(this.rules, createWorkflowTransitionDetails.rules) &&
        Objects.equals(this.screen, createWorkflowTransitionDetails.screen) &&
        Objects.equals(this.to, createWorkflowTransitionDetails.to) &&
        Objects.equals(this.type, createWorkflowTransitionDetails.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, from, name, properties, rules, screen, to, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateWorkflowTransitionDetails {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    screen: ").append(toIndentedString(screen)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
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
