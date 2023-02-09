package ru.kakatya.gateway.dtos;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * FinishRegistrationRequestDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-09T14:10:33.221503700+04:00[GMT+04:00]")
public class FinishRegistrationRequestDto {

  /**
   * Gets or Sets gender
   */
  public enum Gender {
    MALE("MALE"),
    
    FEMALE("FEMALE"),
    
    NON_BINARY("NON_BINARY");

    private String value;

    Gender(String value) {
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
    public static Gender fromValue(String value) {
      for (Gender b : Gender.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("gender")
  private Gender gender;

  /**
   * Gets or Sets maritalStatus
   */
  public enum MaritalStatus {
    MARRIED("MARRIED"),
    
    DIVORCED("DIVORCED"),
    
    SINGLE("SINGLE"),
    
    WIDOW_WIDOWER("WIDOW_WIDOWER");

    private String value;

    MaritalStatus(String value) {
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
    public static MaritalStatus fromValue(String value) {
      for (MaritalStatus b : MaritalStatus.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("maritalStatus")
  private MaritalStatus maritalStatus;

  @JsonProperty("dependentAmount")
  private Integer dependentAmount;

  @JsonProperty("passportIssueDate")
  private String passportIssueDate;

  @JsonProperty("passportIssueBranch")
  private String passportIssueBranch;

  @JsonProperty("employment")
  private EmploymentDTO employment;

  @JsonProperty("account")
  private Integer account;

  public FinishRegistrationRequestDto gender(Gender gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Get gender
   * @return gender
  */
  @NotNull 
  @Schema(name = "gender", requiredMode = Schema.RequiredMode.REQUIRED)
  public FinishRegistrationRequestDto.Gender getGender() {
    return gender;
  }

  public void setGender(Gender gender) {
    this.gender = gender;
  }

  public FinishRegistrationRequestDto maritalStatus(MaritalStatus maritalStatus) {
    this.maritalStatus = maritalStatus;
    return this;
  }

  /**
   * Get maritalStatus
   * @return maritalStatus
  */
  @NotNull 
  @Schema(name = "maritalStatus", requiredMode = Schema.RequiredMode.REQUIRED)
  public FinishRegistrationRequestDto.MaritalStatus getMaritalStatus() {
    return maritalStatus;
  }

  public void setMaritalStatus(MaritalStatus maritalStatus) {
    this.maritalStatus = maritalStatus;
  }

  public FinishRegistrationRequestDto dependentAmount(Integer dependentAmount) {
    this.dependentAmount = dependentAmount;
    return this;
  }

  /**
   * Get dependentAmount
   * @return dependentAmount
  */
  @NotNull 
  @Schema(name = "dependentAmount", example = "15489", requiredMode = Schema.RequiredMode.REQUIRED)
  public Integer getDependentAmount() {
    return dependentAmount;
  }

  public void setDependentAmount(Integer dependentAmount) {
    this.dependentAmount = dependentAmount;
  }

  public FinishRegistrationRequestDto passportIssueDate(String passportIssueDate) {
    this.passportIssueDate = passportIssueDate;
    return this;
  }

  /**
   * Get passportIssueDate
   * @return passportIssueDate
  */
  @NotNull 
  @Schema(name = "passportIssueDate", example = "2015-10-09", requiredMode = Schema.RequiredMode.REQUIRED)
  public String getPassportIssueDate() {
    return passportIssueDate;
  }

  public void setPassportIssueDate(String passportIssueDate) {
    this.passportIssueDate = passportIssueDate;
  }

  public FinishRegistrationRequestDto passportIssueBranch(String passportIssueBranch) {
    this.passportIssueBranch = passportIssueBranch;
    return this;
  }

  /**
   * Get passportIssueBranch
   * @return passportIssueBranch
  */
  @NotNull 
  @Schema(name = "passportIssueBranch", example = "GU MVD PO SARATOVSKOY OBLASTI", requiredMode = Schema.RequiredMode.REQUIRED)
  public String getPassportIssueBranch() {
    return passportIssueBranch;
  }

  public void setPassportIssueBranch(String passportIssueBranch) {
    this.passportIssueBranch = passportIssueBranch;
  }

  public FinishRegistrationRequestDto employment(EmploymentDTO employment) {
    this.employment = employment;
    return this;
  }

  /**
   * Get employment
   * @return employment
  */
  @NotNull @Valid 
  @Schema(name = "employment", requiredMode = Schema.RequiredMode.REQUIRED)
  public EmploymentDTO getEmployment() {
    return employment;
  }

  public void setEmployment(EmploymentDTO employment) {
    this.employment = employment;
  }

  public FinishRegistrationRequestDto account(Integer account) {
    this.account = account;
    return this;
  }

  /**
   * Get account
   * @return account
  */
  @NotNull 
  @Schema(name = "account", example = "154799", requiredMode = Schema.RequiredMode.REQUIRED)
  public Integer getAccount() {
    return account;
  }

  public void setAccount(Integer account) {
    this.account = account;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FinishRegistrationRequestDto finishRegistrationRequestDto = (FinishRegistrationRequestDto) o;
    return Objects.equals(this.gender, finishRegistrationRequestDto.gender) &&
        Objects.equals(this.maritalStatus, finishRegistrationRequestDto.maritalStatus) &&
        Objects.equals(this.dependentAmount, finishRegistrationRequestDto.dependentAmount) &&
        Objects.equals(this.passportIssueDate, finishRegistrationRequestDto.passportIssueDate) &&
        Objects.equals(this.passportIssueBranch, finishRegistrationRequestDto.passportIssueBranch) &&
        Objects.equals(this.employment, finishRegistrationRequestDto.employment) &&
        Objects.equals(this.account, finishRegistrationRequestDto.account);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gender, maritalStatus, dependentAmount, passportIssueDate, passportIssueBranch, employment, account);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinishRegistrationRequestDto {\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    maritalStatus: ").append(toIndentedString(maritalStatus)).append("\n");
    sb.append("    dependentAmount: ").append(toIndentedString(dependentAmount)).append("\n");
    sb.append("    passportIssueDate: ").append(toIndentedString(passportIssueDate)).append("\n");
    sb.append("    passportIssueBranch: ").append(toIndentedString(passportIssueBranch)).append("\n");
    sb.append("    employment: ").append(toIndentedString(employment)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
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

