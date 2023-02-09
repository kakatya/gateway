package ru.kakatya.gateway.dtos;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;

import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * EmploymentDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-09T14:10:33.221503700+04:00[GMT+04:00]")
public class EmploymentDTO {

  /**
   * Gets or Sets employmentStatus
   */
  public enum EmploymentStatus {
    UNEMPLOYED("UNEMPLOYED"),
    
    SELF_EMPLOYED("SELF_EMPLOYED"),
    
    EMPLOYED("EMPLOYED"),
    
    BUSINESS_OWNER("BUSINESS_OWNER");

    private String value;

    EmploymentStatus(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static EmploymentStatus fromValue(String value) {
      for (EmploymentStatus b : EmploymentStatus.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("employmentStatus")
  private EmploymentStatus employmentStatus;

  @JsonProperty("employerINN")
  private String employerINN;

  @JsonProperty("salary")
  private BigDecimal salary;

  /**
   * Gets or Sets position
   */
  public enum EmploymentPosition {
    WORKER("WORKER"),
    
    MID_MANAGER("MID_MANAGER"),
    
    TOP_MANAGER("TOP_MANAGER"),
    
    OWNER("OWNER");

    private String value;

    EmploymentPosition(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static EmploymentPosition fromValue(String value) {
      for (EmploymentPosition b : EmploymentPosition.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("position")
  private EmploymentPosition position;

  @JsonProperty("workExperienceTotal")
  private Integer workExperienceTotal;

  @JsonProperty("workExperienceCurrent")
  private Integer workExperienceCurrent;

  public EmploymentDTO employmentStatus(EmploymentStatus employmentStatus) {
    this.employmentStatus = employmentStatus;
    return this;
  }

  /**
   * Get employmentStatus
   * @return employmentStatus
  */
  @NotNull 
  @Schema(name = "employmentStatus", example = "EMPLOYED", requiredMode = Schema.RequiredMode.REQUIRED)
  public EmploymentDTO.EmploymentStatus getEmploymentStatus() {
    return employmentStatus;
  }

  public void setEmploymentStatus(EmploymentStatus employmentStatus) {
    this.employmentStatus = employmentStatus;
  }

  public EmploymentDTO employerINN(String employerINN) {
    this.employerINN = employerINN;
    return this;
  }

  /**
   * Get employerINN
   * @return employerINN
  */
  @NotNull 
  @Schema(name = "employerINN", example = "12569845645", requiredMode = Schema.RequiredMode.REQUIRED)
  public String getEmployerINN() {
    return employerINN;
  }

  public void setEmployerINN(String employerINN) {
    this.employerINN = employerINN;
  }

  public EmploymentDTO salary(BigDecimal salary) {
    this.salary = salary;
    return this;
  }

  /**
   * Get salary
   * @return salary
  */
  @NotNull @Valid 
  @Schema(name = "salary", example = "80000", requiredMode = Schema.RequiredMode.REQUIRED)
  public BigDecimal getSalary() {
    return salary;
  }

  public void setSalary(BigDecimal salary) {
    this.salary = salary;
  }

  public EmploymentDTO position(EmploymentPosition position) {
    this.position = position;
    return this;
  }

  /**
   * Get position
   * @return position
  */
  @NotNull 
  @Schema(name = "position", example = "WORKER", requiredMode = Schema.RequiredMode.REQUIRED)
  public EmploymentDTO.EmploymentPosition getPosition() {
    return position;
  }

  public void setPosition(EmploymentPosition position) {
    this.position = position;
  }

  public EmploymentDTO workExperienceTotal(Integer workExperienceTotal) {
    this.workExperienceTotal = workExperienceTotal;
    return this;
  }

  /**
   * Get workExperienceTotal
   * @return workExperienceTotal
  */
  @NotNull 
  @Schema(name = "workExperienceTotal", example = "12", requiredMode = Schema.RequiredMode.REQUIRED)
  public Integer getWorkExperienceTotal() {
    return workExperienceTotal;
  }

  public void setWorkExperienceTotal(Integer workExperienceTotal) {
    this.workExperienceTotal = workExperienceTotal;
  }

  public EmploymentDTO workExperienceCurrent(Integer workExperienceCurrent) {
    this.workExperienceCurrent = workExperienceCurrent;
    return this;
  }

  /**
   * Get workExperienceCurrent
   * @return workExperienceCurrent
  */
  @NotNull 
  @Schema(name = "workExperienceCurrent", example = "12", requiredMode = Schema.RequiredMode.REQUIRED)
  public Integer getWorkExperienceCurrent() {
    return workExperienceCurrent;
  }

  public void setWorkExperienceCurrent(Integer workExperienceCurrent) {
    this.workExperienceCurrent = workExperienceCurrent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmploymentDTO employmentDTO = (EmploymentDTO) o;
    return Objects.equals(this.employmentStatus, employmentDTO.employmentStatus) &&
        Objects.equals(this.employerINN, employmentDTO.employerINN) &&
        Objects.equals(this.salary, employmentDTO.salary) &&
        Objects.equals(this.position, employmentDTO.position) &&
        Objects.equals(this.workExperienceTotal, employmentDTO.workExperienceTotal) &&
        Objects.equals(this.workExperienceCurrent, employmentDTO.workExperienceCurrent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employmentStatus, employerINN, salary, position, workExperienceTotal, workExperienceCurrent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmploymentDTO {\n");
    sb.append("    employmentStatus: ").append(toIndentedString(employmentStatus)).append("\n");
    sb.append("    employerINN: ").append(toIndentedString(employerINN)).append("\n");
    sb.append("    salary: ").append(toIndentedString(salary)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    workExperienceTotal: ").append(toIndentedString(workExperienceTotal)).append("\n");
    sb.append("    workExperienceCurrent: ").append(toIndentedString(workExperienceCurrent)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

