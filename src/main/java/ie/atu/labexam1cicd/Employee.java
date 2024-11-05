package ie.atu.labexam1cicd;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.StringJoiner;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @NotBlank(message = "id cannot be blank")
    private int id;

    @Max(value=100, message = "Name cannot be blank")
    private String name;

    @Email(message = "Email cannot be blank")
    private String email;

    @NotBlank(message = "Position cannot be blank")
    private String position;

    @Min(value = 0, message = "Salary Must be greater than 0 unless you are an intern")
    private float salary;

    @NotBlank(message = "Date of joining cannot be blank")
    private String dateOfJoining;
}
