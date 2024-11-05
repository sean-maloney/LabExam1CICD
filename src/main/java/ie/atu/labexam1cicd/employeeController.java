package ie.atu.labexam1cicd;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/employee")
public class employeeController {
    private employeeService myService;
    public employeeController(employeeService myService){this.myService = myService;}

    private List <Employee> list = new ArrayList<>();

    @GetMapping("/get")
    public List <Employee> getEmployee(@Valid @RequestBody Employee employee){
        list=myService.grabEmployee(employee);
        return list;
    }

    @PostMapping("/add")
    public List <Employee> newEmployee(@Valid @RequestBody Employee employee){
        list=myService.addEmployee(employee);
        return list;
    }

    @PostMapping("/del/{employeeCode}")
    public List <Employee> removeEmployee(@Valid @PathVariable int id, @RequestBody Employee employee){
        list = myService.delEmployee(id, employee);
        return list;
    }
    @PutMapping("/update/{employeeCode}")
    public List <Employee> updateEmployee(@Valid @PathVariable int id, @RequestBody Employee employee){
        list=myService.updateEmployee(id,employee);
        return list;
    }
}
