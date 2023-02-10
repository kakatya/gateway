package ru.kakatya.gateway.dtos;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * LoanOfferDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-10T14:45:24.698772300+04:00[Europe/Saratov]")
public class LoanOfferDTO   {
  @JsonProperty("applicationId")
  private Long applicationId;

  @JsonProperty("requestedAmount")
  private BigDecimal requestedAmount;

  @JsonProperty("totalAmount")
  private BigDecimal totalAmount;

  @JsonProperty("term")
  private Integer term;

  @JsonProperty("monthlyPayment")
  private BigDecimal monthlyPayment;

  @JsonProperty("rate")
  private BigDecimal rate;

  @JsonProperty("isInsuranceEnabled")
  private Boolean isInsuranceEnabled;

  @JsonProperty("isSalaryClient")
  private Boolean isSalaryClient;

  public LoanOfferDTO applicationId(Long applicationId) {
    this.applicationId = applicationId;
    return this;
  }

  /**
   * Get applicationId
   * @return applicationId
  */
  @ApiModelProperty(example = "115", required = true, value = "")
  @NotNull


  public Long getApplicationId() {
    return applicationId;
  }

  public void setApplicationId(Long applicationId) {
    this.applicationId = applicationId;
  }

  public LoanOfferDTO requestAmount(BigDecimal requestAmount) {
    this.requestedAmount = requestAmount;
    return this;
  }

  /**
   * Get requestedAmount
   * @return requestedAmount
  */
  @ApiModelProperty(example = "120000", required = true, value = "")
  @NotNull

  @Valid

  public BigDecimal getRequestedAmount() {
    return requestedAmount;
  }

  public void setRequestedAmount(BigDecimal requestedAmount) {
    this.requestedAmount = requestedAmount;
  }

  public LoanOfferDTO totalAmount(BigDecimal totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

  /**
   * Get totalAmount
   * @return totalAmount
  */
  @ApiModelProperty(example = "150000", required = true, value = "")
  @NotNull

  @Valid

  public BigDecimal getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(BigDecimal totalAmount) {
    this.totalAmount = totalAmount;
  }

  public LoanOfferDTO term(Integer term) {
    this.term = term;
    return this;
  }

  /**
   * Get term
   * @return term
  */
  @ApiModelProperty(example = "24", required = true, value = "")
  @NotNull


  public Integer getTerm() {
    return term;
  }

  public void setTerm(Integer term) {
    this.term = term;
  }

  public LoanOfferDTO monthlyPayment(BigDecimal monthlyPayment) {
    this.monthlyPayment = monthlyPayment;
    return this;
  }

  /**
   * Get monthlyPayment
   * @return monthlyPayment
  */
  @ApiModelProperty(example = "10000", required = true, value = "")
  @NotNull

  @Valid

  public BigDecimal getMonthlyPayment() {
    return monthlyPayment;
  }

  public void setMonthlyPayment(BigDecimal monthlyPayment) {
    this.monthlyPayment = monthlyPayment;
  }

  public LoanOfferDTO rate(BigDecimal rate) {
    this.rate = rate;
    return this;
  }

  /**
   * Get rate
   * @return rate
  */
  @ApiModelProperty(example = "14", required = true, value = "")
  @NotNull

  @Valid

  public BigDecimal getRate() {
    return rate;
  }

  public void setRate(BigDecimal rate) {
    this.rate = rate;
  }

  public LoanOfferDTO isInsuranceEnabled(Boolean isInsuranceEnabled) {
    this.isInsuranceEnabled = isInsuranceEnabled;
    return this;
  }

  /**
   * Get isInsuranceEnabled
   * @return isInsuranceEnabled
  */
  @ApiModelProperty(example = "true", required = true, value = "")
  @NotNull


  public Boolean getIsInsuranceEnabled() {
    return isInsuranceEnabled;
  }

  public void setIsInsuranceEnabled(Boolean isInsuranceEnabled) {
    this.isInsuranceEnabled = isInsuranceEnabled;
  }

  public LoanOfferDTO isSalaryClient(Boolean isSalaryClient) {
    this.isSalaryClient = isSalaryClient;
    return this;
  }

  /**
   * Get isSalaryClient
   * @return isSalaryClient
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Boolean getIsSalaryClient() {
    return isSalaryClient;
  }

  public void setIsSalaryClient(Boolean isSalaryClient) {
    this.isSalaryClient = isSalaryClient;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoanOfferDTO loanOfferDTO = (LoanOfferDTO) o;
    return Objects.equals(this.applicationId, loanOfferDTO.applicationId) &&
        Objects.equals(this.requestedAmount, loanOfferDTO.requestedAmount) &&
        Objects.equals(this.totalAmount, loanOfferDTO.totalAmount) &&
        Objects.equals(this.term, loanOfferDTO.term) &&
        Objects.equals(this.monthlyPayment, loanOfferDTO.monthlyPayment) &&
        Objects.equals(this.rate, loanOfferDTO.rate) &&
        Objects.equals(this.isInsuranceEnabled, loanOfferDTO.isInsuranceEnabled) &&
        Objects.equals(this.isSalaryClient, loanOfferDTO.isSalaryClient);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationId, requestedAmount, totalAmount, term, monthlyPayment, rate, isInsuranceEnabled, isSalaryClient);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoanOfferDTO {\n");
    
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    requestedAmount: ").append(toIndentedString(requestedAmount)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    term: ").append(toIndentedString(term)).append("\n");
    sb.append("    monthlyPayment: ").append(toIndentedString(monthlyPayment)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    isInsuranceEnabled: ").append(toIndentedString(isInsuranceEnabled)).append("\n");
    sb.append("    isSalaryClient: ").append(toIndentedString(isSalaryClient)).append("\n");
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

