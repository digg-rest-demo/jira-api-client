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
 * Details of the time tracking configuration.
 */
@Schema(description = "Details of the time tracking configuration.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-17T13:21:14.321931+02:00[Europe/Stockholm]")

public class TimeTrackingConfiguration {
  /**
   * The default unit of time applied to logged time.
   */
  @JsonAdapter(DefaultUnitEnum.Adapter.class)
  public enum DefaultUnitEnum {
    @SerializedName("minute")
    MINUTE("minute"),
    @SerializedName("hour")
    HOUR("hour"),
    @SerializedName("day")
    DAY("day"),
    @SerializedName("week")
    WEEK("week");

    private String value;

    DefaultUnitEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static DefaultUnitEnum fromValue(String input) {
      for (DefaultUnitEnum b : DefaultUnitEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<DefaultUnitEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DefaultUnitEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public DefaultUnitEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return DefaultUnitEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("defaultUnit")
  private DefaultUnitEnum defaultUnit = null;

  /**
   * The format that will appear on an issue&#x27;s *Time Spent* field.
   */
  @JsonAdapter(TimeFormatEnum.Adapter.class)
  public enum TimeFormatEnum {
    @SerializedName("pretty")
    PRETTY("pretty"),
    @SerializedName("days")
    DAYS("days"),
    @SerializedName("hours")
    HOURS("hours");

    private String value;

    TimeFormatEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TimeFormatEnum fromValue(String input) {
      for (TimeFormatEnum b : TimeFormatEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TimeFormatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TimeFormatEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public TimeFormatEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return TimeFormatEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("timeFormat")
  private TimeFormatEnum timeFormat = null;

  @SerializedName("workingDaysPerWeek")
  private Double workingDaysPerWeek = null;

  @SerializedName("workingHoursPerDay")
  private Double workingHoursPerDay = null;

  public TimeTrackingConfiguration defaultUnit(DefaultUnitEnum defaultUnit) {
    this.defaultUnit = defaultUnit;
    return this;
  }

   /**
   * The default unit of time applied to logged time.
   * @return defaultUnit
  **/
  @Schema(required = true, description = "The default unit of time applied to logged time.")
  public DefaultUnitEnum getDefaultUnit() {
    return defaultUnit;
  }

  public void setDefaultUnit(DefaultUnitEnum defaultUnit) {
    this.defaultUnit = defaultUnit;
  }

  public TimeTrackingConfiguration timeFormat(TimeFormatEnum timeFormat) {
    this.timeFormat = timeFormat;
    return this;
  }

   /**
   * The format that will appear on an issue&#x27;s *Time Spent* field.
   * @return timeFormat
  **/
  @Schema(required = true, description = "The format that will appear on an issue's *Time Spent* field.")
  public TimeFormatEnum getTimeFormat() {
    return timeFormat;
  }

  public void setTimeFormat(TimeFormatEnum timeFormat) {
    this.timeFormat = timeFormat;
  }

  public TimeTrackingConfiguration workingDaysPerWeek(Double workingDaysPerWeek) {
    this.workingDaysPerWeek = workingDaysPerWeek;
    return this;
  }

   /**
   * The number of days in a working week.
   * @return workingDaysPerWeek
  **/
  @Schema(required = true, description = "The number of days in a working week.")
  public Double getWorkingDaysPerWeek() {
    return workingDaysPerWeek;
  }

  public void setWorkingDaysPerWeek(Double workingDaysPerWeek) {
    this.workingDaysPerWeek = workingDaysPerWeek;
  }

  public TimeTrackingConfiguration workingHoursPerDay(Double workingHoursPerDay) {
    this.workingHoursPerDay = workingHoursPerDay;
    return this;
  }

   /**
   * The number of hours in a working day.
   * @return workingHoursPerDay
  **/
  @Schema(required = true, description = "The number of hours in a working day.")
  public Double getWorkingHoursPerDay() {
    return workingHoursPerDay;
  }

  public void setWorkingHoursPerDay(Double workingHoursPerDay) {
    this.workingHoursPerDay = workingHoursPerDay;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeTrackingConfiguration timeTrackingConfiguration = (TimeTrackingConfiguration) o;
    return Objects.equals(this.defaultUnit, timeTrackingConfiguration.defaultUnit) &&
        Objects.equals(this.timeFormat, timeTrackingConfiguration.timeFormat) &&
        Objects.equals(this.workingDaysPerWeek, timeTrackingConfiguration.workingDaysPerWeek) &&
        Objects.equals(this.workingHoursPerDay, timeTrackingConfiguration.workingHoursPerDay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultUnit, timeFormat, workingDaysPerWeek, workingHoursPerDay);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeTrackingConfiguration {\n");
    
    sb.append("    defaultUnit: ").append(toIndentedString(defaultUnit)).append("\n");
    sb.append("    timeFormat: ").append(toIndentedString(timeFormat)).append("\n");
    sb.append("    workingDaysPerWeek: ").append(toIndentedString(workingDaysPerWeek)).append("\n");
    sb.append("    workingHoursPerDay: ").append(toIndentedString(workingHoursPerDay)).append("\n");
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
