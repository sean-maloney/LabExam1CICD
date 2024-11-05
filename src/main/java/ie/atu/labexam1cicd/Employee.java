package ie.atu.labexam1cicd;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.StringJoiner;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    //@NotBlank(message = "id cannot be blank")
    private int id;

    //@NotBlank(message = "Name cannot be blank")
    private String name;

    //@NotBlank(message = "Email cannot be blank")
    private String email;

    //NotBlank(message = "Position cannot be blank")
    private String position;

    //@NotBlank(message = "Salary cannot be blank")
    private int salary;

    //@NotBlank(message = "Date of joining cannot be blank")
    private String dateOfJoining;
}
