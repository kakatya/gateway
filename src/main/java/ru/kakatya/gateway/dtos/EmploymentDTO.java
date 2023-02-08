package ru.kakatya.gateway.dtos;

import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmploymentDTO implements Serializable {
    private EmploymentStatus employmentStatus;
    private String employerINN;
    private BigDecimal salary;
    private EmploymentPosition position;
    private int workExperienceTotal;
    private int workExperienceCurrent;

    @Override
    public String toString() {
        return
                "employmentStatus=" + employmentStatus + "\n" +
                        "employerINN=" + employerINN + "\n" +
                        "salary=" + salary + "\n" +
                        "position=" + position + "\n" +
                        "workExperienceTotal=" + workExperienceTotal + "\n" +
                        "workExperienceCurrent=" + workExperienceCurrent + "\n";
    }
}
