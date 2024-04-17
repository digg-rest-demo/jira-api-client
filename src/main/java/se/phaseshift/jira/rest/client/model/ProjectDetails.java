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
 * Details about a project.
 */
@Schema(description = "Details about a project.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class ProjectDetails {
  @SerializedName("avatarUrls")
  private AllOfProjectDetailsAvatarUrls avatarUrls = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("key")
  private String key = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("projectCategory")
  private AllOfProjectDetailsProjectCategory projectCategory = null;

  /**
   * The [project type](https://confluence.atlassian.com/x/GwiiLQ#Jiraapplicationsoverview-Productfeaturesandprojecttypes) of the project.
   */
  @JsonAdapter(ProjectTypeKeyEnum.Adapter.class)
  public enum ProjectTypeKeyEnum {
    @SerializedName("software")
    SOFTWARE("software"),
    @SerializedName("service_desk")
    SERVICE_DESK("service_desk"),
    @SerializedName("business")
    BUSINESS("business");

    private String value;

    ProjectTypeKeyEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ProjectTypeKeyEnum fromValue(String input) {
      for (ProjectTypeKeyEnum b : ProjectTypeKeyEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ProjectTypeKeyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ProjectTypeKeyEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ProjectTypeKeyEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ProjectTypeKeyEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("projectTypeKey")
  private ProjectTypeKeyEnum projectTypeKey = null;

  @SerializedName("self")
  private String self = null;

  @SerializedName("simplified")
  private Boolean simplified = null;

   /**
   * The URLs of the project&#x27;s avatars.
   * @return avatarUrls
  **/
  @Schema(description = "The URLs of the project's avatars.")
  public AllOfProjectDetailsAvatarUrls getAvatarUrls() {
    return avatarUrls;
  }

  public ProjectDetails id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the project.
   * @return id
  **/
  @Schema(description = "The ID of the project.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

   /**
   * The key of the project.
   * @return key
  **/
  @Schema(description = "The key of the project.")
  public String getKey() {
    return key;
  }

   /**
   * The name of the project.
   * @return name
  **/
  @Schema(description = "The name of the project.")
  public String getName() {
    return name;
  }

   /**
   * The category the project belongs to.
   * @return projectCategory
  **/
  @Schema(description = "The category the project belongs to.")
  public AllOfProjectDetailsProjectCategory getProjectCategory() {
    return projectCategory;
  }

   /**
   * The [project type](https://confluence.atlassian.com/x/GwiiLQ#Jiraapplicationsoverview-Productfeaturesandprojecttypes) of the project.
   * @return projectTypeKey
  **/
  @Schema(description = "The [project type](https://confluence.atlassian.com/x/GwiiLQ#Jiraapplicationsoverview-Productfeaturesandprojecttypes) of the project.")
  public ProjectTypeKeyEnum getProjectTypeKey() {
    return projectTypeKey;
  }

   /**
   * The URL of the project details.
   * @return self
  **/
  @Schema(description = "The URL of the project details.")
  public String getSelf() {
    return self;
  }

   /**
   * Whether or not the project is simplified.
   * @return simplified
  **/
  @Schema(description = "Whether or not the project is simplified.")
  public Boolean isSimplified() {
    return simplified;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectDetails projectDetails = (ProjectDetails) o;
    return Objects.equals(this.avatarUrls, projectDetails.avatarUrls) &&
        Objects.equals(this.id, projectDetails.id) &&
        Objects.equals(this.key, projectDetails.key) &&
        Objects.equals(this.name, projectDetails.name) &&
        Objects.equals(this.projectCategory, projectDetails.projectCategory) &&
        Objects.equals(this.projectTypeKey, projectDetails.projectTypeKey) &&
        Objects.equals(this.self, projectDetails.self) &&
        Objects.equals(this.simplified, projectDetails.simplified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avatarUrls, id, key, name, projectCategory, projectTypeKey, self, simplified);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectDetails {\n");
    
    sb.append("    avatarUrls: ").append(toIndentedString(avatarUrls)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    projectCategory: ").append(toIndentedString(projectCategory)).append("\n");
    sb.append("    projectTypeKey: ").append(toIndentedString(projectTypeKey)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    simplified: ").append(toIndentedString(simplified)).append("\n");
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