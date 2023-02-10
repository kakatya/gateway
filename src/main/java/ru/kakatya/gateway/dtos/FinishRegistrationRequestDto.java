package ru.kakatya.gateway.dtos;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FinishRegistrationRequestDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-10T14:45:24.698772300+04:00[Europe/Saratov]")
public class FinishRegistrationRequestDto   {
  /**
   * Gets or Sets gender
   */
  public enum GenderEnum {
    MALE("MALE"),
    
    FEMALE("FEMALE"),
    
    NON_BINARY("NON_BINARY");

    private String value;

    GenderEnum(String value) {
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
    public static GenderEnum fromValue(String value) {
      for (GenderEnum b : GenderEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("gender")
  private GenderEnum gender;

  /**
   * Gets or Sets maritalStatus
   */
  public enum MaritalStatusEnum {
    MARRIED("MARRIED"),
    
    DIVORCED("DIVORCED"),
    
    SINGLE("SINGLE"),
    
    WIDOW_WIDOWER("WIDOW_WIDOWER");

    private String value;

    MaritalStatusEnum(String value) {
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
    public static MaritalStatusEnum fromValue(String value) {
      for (MaritalStatusEnum b : MaritalStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("maritalStatus")
  private MaritalStatusEnum maritalStatus;

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

  public FinishRegistrationRequestDto gender(GenderEnum gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Get gender
   * @return gender
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public GenderEnum getGender() {
    return gender;
  }

  public void setGender(GenderEnum gender) {
    this.gender = gender;
  }

  public FinishRegistrationRequestDto maritalStatus(MaritalStatusEnum maritalStatus) {
    this.maritalStatus = maritalStatus;
    return this;
  }

  /**
   * Get maritalStatus
   * @return maritalStatus
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public MaritalStatusEnum getMaritalStatus() {
    return maritalStatus;
  }

  public void setMaritalStatus(MaritalStatusEnum maritalStatus) {
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
  @ApiModelProperty(example = "15489", required = true, value = "")
  @NotNull


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
  @ApiModelProperty(example = "2015-10-09", required = true, value = "")
  @NotNull


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
  @ApiModelProperty(example = "GU MVD PO SARATOVSKOY OBLASTI", required = true, value = "")
  @NotNull


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
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

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
  @ApiModelProperty(example = "154799", required = true, value = "")
  @NotNull


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

