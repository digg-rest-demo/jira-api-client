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
import se.phaseshift.jira.rest.client.model.ConditionGroupUpdate;
import se.phaseshift.jira.rest.client.model.StatusReferenceAndPort;
import se.phaseshift.jira.rest.client.model.WorkflowRuleConfiguration;
import se.phaseshift.jira.rest.client.model.WorkflowTrigger;
/**
 * The transitions of this workflow.
 */
@Schema(description = "The transitions of this workflow.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class TransitionUpdateDTO extends HashMap<String, Object> {
  @SerializedName("actions")
  private List<WorkflowRuleConfiguration> actions = null;

  @SerializedName("conditions")
  private ConditionGroupUpdate conditions = null;

  @SerializedName("customIssueEventId")
  private String customIssueEventId = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("from")
  private List<StatusReferenceAndPort> from = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("properties")
  private Map<String, String> properties = null;

  @SerializedName("to")
  private StatusReferenceAndPort to = null;

  @SerializedName("transitionScreen")
  private WorkflowRuleConfiguration transitionScreen = null;

  @SerializedName("triggers")
  private List<WorkflowTrigger> triggers = null;

  /**
   * The transition type.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    @SerializedName("INITIAL")
    INITIAL("INITIAL"),
    @SerializedName("GLOBAL")
    GLOBAL("GLOBAL"),
    @SerializedName("DIRECTED")
    DIRECTED("DIRECTED");

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

  @SerializedName("validators")
  private List<WorkflowRuleConfiguration> validators = null;

  public TransitionUpdateDTO actions(List<WorkflowRuleConfiguration> actions) {
    this.actions = actions;
    return this;
  }

  public TransitionUpdateDTO addActionsItem(WorkflowRuleConfiguration actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<WorkflowRuleConfiguration>();
    }
    this.actions.add(actionsItem);
    return this;
  }

   /**
   * The post-functions of the transition.
   * @return actions
  **/
  @Schema(description = "The post-functions of the transition.")
  public List<WorkflowRuleConfiguration> getActions() {
    return actions;
  }

  public void setActions(List<WorkflowRuleConfiguration> actions) {
    this.actions = actions;
  }

  public TransitionUpdateDTO conditions(ConditionGroupUpdate conditions) {
    this.conditions = conditions;
    return this;
  }

   /**
   * Get conditions
   * @return conditions
  **/
  @Schema(description = "")
  public ConditionGroupUpdate getConditions() {
    return conditions;
  }

  public void setConditions(ConditionGroupUpdate conditions) {
    this.conditions = conditions;
  }

  public TransitionUpdateDTO customIssueEventId(String customIssueEventId) {
    this.customIssueEventId = customIssueEventId;
    return this;
  }

   /**
   * The custom event ID of the transition.
   * @return customIssueEventId
  **/
  @Schema(description = "The custom event ID of the transition.")
  public String getCustomIssueEventId() {
    return customIssueEventId;
  }

  public void setCustomIssueEventId(String customIssueEventId) {
    this.customIssueEventId = customIssueEventId;
  }

  public TransitionUpdateDTO description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the transition.
   * @return description
  **/
  @Schema(description = "The description of the transition.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public TransitionUpdateDTO from(List<StatusReferenceAndPort> from) {
    this.from = from;
    return this;
  }

  public TransitionUpdateDTO addFromItem(StatusReferenceAndPort fromItem) {
    if (this.from == null) {
      this.from = new ArrayList<StatusReferenceAndPort>();
    }
    this.from.add(fromItem);
    return this;
  }

   /**
   * The statuses the transition can start from.
   * @return from
  **/
  @Schema(description = "The statuses the transition can start from.")
  public List<StatusReferenceAndPort> getFrom() {
    return from;
  }

  public void setFrom(List<StatusReferenceAndPort> from) {
    this.from = from;
  }

  public TransitionUpdateDTO id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the transition.
   * @return id
  **/
  @Schema(required = true, description = "The ID of the transition.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public TransitionUpdateDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the transition.
   * @return name
  **/
  @Schema(required = true, description = "The name of the transition.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TransitionUpdateDTO properties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  public TransitionUpdateDTO putPropertiesItem(String key, String propertiesItem) {
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

  public TransitionUpdateDTO to(StatusReferenceAndPort to) {
    this.to = to;
    return this;
  }

   /**
   * Get to
   * @return to
  **/
  @Schema(description = "")
  public StatusReferenceAndPort getTo() {
    return to;
  }

  public void setTo(StatusReferenceAndPort to) {
    this.to = to;
  }

  public TransitionUpdateDTO transitionScreen(WorkflowRuleConfiguration transitionScreen) {
    this.transitionScreen = transitionScreen;
    return this;
  }

   /**
   * Get transitionScreen
   * @return transitionScreen
  **/
  @Schema(description = "")
  public WorkflowRuleConfiguration getTransitionScreen() {
    return transitionScreen;
  }

  public void setTransitionScreen(WorkflowRuleConfiguration transitionScreen) {
    this.transitionScreen = transitionScreen;
  }

  public TransitionUpdateDTO triggers(List<WorkflowTrigger> triggers) {
    this.triggers = triggers;
    return this;
  }

  public TransitionUpdateDTO addTriggersItem(WorkflowTrigger triggersItem) {
    if (this.triggers == null) {
      this.triggers = new ArrayList<WorkflowTrigger>();
    }
    this.triggers.add(triggersItem);
    return this;
  }

   /**
   * The triggers of the transition.
   * @return triggers
  **/
  @Schema(description = "The triggers of the transition.")
  public List<WorkflowTrigger> getTriggers() {
    return triggers;
  }

  public void setTriggers(List<WorkflowTrigger> triggers) {
    this.triggers = triggers;
  }

  public TransitionUpdateDTO type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The transition type.
   * @return type
  **/
  @Schema(required = true, description = "The transition type.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public TransitionUpdateDTO validators(List<WorkflowRuleConfiguration> validators) {
    this.validators = validators;
    return this;
  }

  public TransitionUpdateDTO addValidatorsItem(WorkflowRuleConfiguration validatorsItem) {
    if (this.validators == null) {
      this.validators = new ArrayList<WorkflowRuleConfiguration>();
    }
    this.validators.add(validatorsItem);
    return this;
  }

   /**
   * The validators of the transition.
   * @return validators
  **/
  @Schema(description = "The validators of the transition.")
  public List<WorkflowRuleConfiguration> getValidators() {
    return validators;
  }

  public void setValidators(List<WorkflowRuleConfiguration> validators) {
    this.validators = validators;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransitionUpdateDTO transitionUpdateDTO = (TransitionUpdateDTO) o;
    return Objects.equals(this.actions, transitionUpdateDTO.actions) &&
        Objects.equals(this.conditions, transitionUpdateDTO.conditions) &&
        Objects.equals(this.customIssueEventId, transitionUpdateDTO.customIssueEventId) &&
        Objects.equals(this.description, transitionUpdateDTO.description) &&
        Objects.equals(this.from, transitionUpdateDTO.from) &&
        Objects.equals(this.id, transitionUpdateDTO.id) &&
        Objects.equals(this.name, transitionUpdateDTO.name) &&
        Objects.equals(this.properties, transitionUpdateDTO.properties) &&
        Objects.equals(this.to, transitionUpdateDTO.to) &&
        Objects.equals(this.transitionScreen, transitionUpdateDTO.transitionScreen) &&
        Objects.equals(this.triggers, transitionUpdateDTO.triggers) &&
        Objects.equals(this.type, transitionUpdateDTO.type) &&
        Objects.equals(this.validators, transitionUpdateDTO.validators) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, conditions, customIssueEventId, description, from, id, name, properties, to, transitionScreen, triggers, type, validators, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransitionUpdateDTO {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    customIssueEventId: ").append(toIndentedString(customIssueEventId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    transitionScreen: ").append(toIndentedString(transitionScreen)).append("\n");
    sb.append("    triggers: ").append(toIndentedString(triggers)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    validators: ").append(toIndentedString(validators)).append("\n");
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
