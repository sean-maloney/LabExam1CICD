package ie.atu.labexam1cicd;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class employeeService {
    private List<Employee> myList = new ArrayList<>();

    public List<Employee> grabEmployee(Employee employee){
        return myList;
    }
    public List<Employee> addEmployee(Employee employee){
        myList.add(employee);
        return myList;
    }

    public List<Employee> delEmployee(int id, Employee employee){
        for(Employee e:myList){
            if(e.getId()==id){
                myList.remove(e);
            }
        }
        return myList;
    }
    public List <Employee> updateEmployee(int id, Employee employee){
        for(Employee e: myList){
            if(e.getId()==id){
                myList.remove(e);
            }
        }
        myList.add(employee);
        return myList;
    }
}
