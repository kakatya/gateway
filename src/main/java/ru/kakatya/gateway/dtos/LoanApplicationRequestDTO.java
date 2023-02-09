package ru.kakatya.gateway.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * LoanApplicationRequestDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-09T14:10:33.221503700+04:00[GMT+04:00]")
public class LoanApplicationRequestDTO {

    @JsonProperty("amount")
    private BigDecimal amount;

    @JsonProperty("term")
    private Integer term;

    @JsonProperty("firstName")
    private String firstName;

    @JsonProperty("lastName")
    private String lastName;

    @JsonProperty("middleName")
    private String middleName;

    @JsonProperty("email")
    private String email;

    @JsonProperty("birthdate")
    private String birthdate;

    @JsonProperty("passportSeries")
    private String passportSeries;

    @JsonProperty("passportNumber")
    private String passportNumber;

    public LoanApplicationRequestDTO amount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Get amount
     *
     * @return amount
     */
    @NotNull
    @Valid
    @Schema(name = "amount", example = "120000", requiredMode = Schema.RequiredMode.REQUIRED)
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public LoanApplicationRequestDTO term(Integer term) {
        this.term = term;
        return this;
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

    public void setTerm(Integer term) {
        this.term = term;
    }

    public LoanApplicationRequestDTO firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * Get firstName
     *
     * @return firstName
     */
    @NotNull
    @Schema(name = "firstName", example = "Svetlana", requiredMode = Schema.RequiredMode.REQUIRED)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public LoanApplicationRequestDTO lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * Get lastName
     *
     * @return lastName
     */
    @NotNull
    @Schema(name = "lastName", example = "Ivanova", requiredMode = Schema.RequiredMode.REQUIRED)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LoanApplicationRequestDTO middleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    /**
     * Get middleName
     *
     * @return middleName
     */

    @Schema(name = "middleName", example = "Petrovna", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public LoanApplicationRequestDTO email(String email) {
        this.email = email;
        return this;
    }

    /**
     * Get email
     *
     * @return email
     */
    @NotNull
    @Schema(name = "email", example = "svetl@maill.ru", requiredMode = Schema.RequiredMode.REQUIRED)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LoanApplicationRequestDTO birthdate(String birthdate) {
        this.birthdate = birthdate;
        return this;
    }

    /**
     * Get birthdate
     *
     * @return birthdate
     */
    @NotNull
    @Schema(name = "birthdate", example = "1990-12-01", requiredMode = Schema.RequiredMode.REQUIRED)
    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public LoanApplicationRequestDTO passportSeries(String passportSeries) {
        this.passportSeries = passportSeries;
        return this;
    }

    /**
     * Get passportSeries
     *
     * @return passportSeries
     */
    @NotNull
    @Schema(name = "passportSeries", example = "1265", requiredMode = Schema.RequiredMode.REQUIRED)
    public String getPassportSeries() {
        return passportSeries;
    }

    public void setPassportSeries(String passportSeries) {
        this.passportSeries = passportSeries;
    }

    public LoanApplicationRequestDTO passportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
        return this;
    }

    /**
     * Get passportNumber
     *
     * @return passportNumber
     */
    @NotNull
    @Schema(name = "passportNumber", example = "549875", requiredMode = Schema.RequiredMode.REQUIRED)
    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LoanApplicationRequestDTO loanApplicationRequestDTO = (LoanApplicationRequestDTO) o;
        return Objects.equals(this.amount, loanApplicationRequestDTO.amount) &&
                Objects.equals(this.term, loanApplicationRequestDTO.term) &&
                Objects.equals(this.firstName, loanApplicationRequestDTO.firstName) &&
                Objects.equals(this.lastName, loanApplicationRequestDTO.lastName) &&
                Objects.equals(this.middleName, loanApplicationRequestDTO.middleName) &&
                Objects.equals(this.email, loanApplicationRequestDTO.email) &&
                Objects.equals(this.birthdate, loanApplicationRequestDTO.birthdate) &&
                Objects.equals(this.passportSeries, loanApplicationRequestDTO.passportSeries) &&
                Objects.equals(this.passportNumber, loanApplicationRequestDTO.passportNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, term, firstName, lastName, middleName, email, birthdate, passportSeries, passportNumber);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LoanApplicationRequestDTO {\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    term: ").append(toIndentedString(term)).append("\n");
        sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
        sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
        sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    birthdate: ").append(toIndentedString(birthdate)).append("\n");
        sb.append("    passportSeries: ").append(toIndentedString(passportSeries)).append("\n");
        sb.append("    passportNumber: ").append(toIndentedString(passportNumber)).append("\n");
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

