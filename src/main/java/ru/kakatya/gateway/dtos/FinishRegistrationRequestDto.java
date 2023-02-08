package ru.kakatya.gateway.dtos;

import lombok.Data;
import java.io.Serializable;
import java.time.LocalDate;

@Data
public class FinishRegistrationRequestDto implements Serializable {
    private Gender gender;
    private MaritalStatus maritalStatus;
    private Integer dependentAmount;
    private LocalDate passportIssueDate;
    private String passportIssueBranch;
    private EmploymentDTO employment;
    private String account;
}
