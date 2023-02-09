package ru.kakatya.gateway.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Setter;

import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * LoanOfferDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-09T14:10:33.221503700+04:00[GMT+04:00]")
@Setter
public class LoanOfferDTO implements Serializable {

    @JsonProperty("applicationId")
    private Long applicationId;

    @JsonProperty(value = "requestedAmount")
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



    /**
     * Get applicationId
     *
     * @return applicationId
     */
    @NotNull
    @Schema(name = "applicationId", example = "115", requiredMode = Schema.RequiredMode.REQUIRED)
    public Long getApplicationId() {
        return applicationId;
    }




    /**
     * Get requestAmount
     *
     * @return requestAmount
     */
    @NotNull
    @Valid
    @Schema(name = "requestAmount", example = "120000", requiredMode = Schema.RequiredMode.REQUIRED)
    public BigDecimal getRequestAmount() {
        return requestedAmount;
    }




    /**
     * Get totalAmount
     *
     * @return totalAmount
     */
    @NotNull
    @Valid
    @Schema(name = "totalAmount", example = "150000", requiredMode = Schema.RequiredMode.REQUIRED)
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }




    /**
     * Get term
     *
     * @return term
     */
    @NotNull
    @Schema(name = "term", example = "24", requiredMode = Schema.RequiredMode.REQUIRED)
    public Integer getTerm() {
        return term;
    }



    /**
     * Get monthlyPayment
     *
     * @return monthlyPayment
     */
    @NotNull
    @Valid
    @Schema(name = "monthlyPayment", example = "10000", requiredMode = Schema.RequiredMode.REQUIRED)
    public BigDecimal getMonthlyPayment() {
        return monthlyPayment;
    }



    /**
     * Get rate
     *
     * @return rate
     */
    @NotNull
    @Valid
    @Schema(name = "rate", example = "14", requiredMode = Schema.RequiredMode.REQUIRED)
    public BigDecimal getRate() {
        return rate;
    }




    /**
     * Get isInsuranceEnabled
     *
     * @return isInsuranceEnabled
     */
    @NotNull
    @Schema(name = "isInsuranceEnabled", example = "true", requiredMode = Schema.RequiredMode.REQUIRED)
    public Boolean getIsInsuranceEnabled() {
        return isInsuranceEnabled;
    }




    /**
     * Get isSalaryClient
     *
     * @return isSalaryClient
     */
    @NotNull
    @Schema(name = "isSalaryClient", requiredMode = Schema.RequiredMode.REQUIRED)
    public Boolean getIsSalaryClient() {
        return isSalaryClient;
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
        sb.append("    requestAmount: ").append(toIndentedString(requestedAmount)).append("\n");
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

