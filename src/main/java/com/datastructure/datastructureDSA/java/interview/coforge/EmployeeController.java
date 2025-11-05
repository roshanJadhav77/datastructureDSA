package com.datastructure.datastructureDSA.java.interview.coforge;

//Employee

import com.datastructure.datastructureDSA.java.java8.Employee;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/employee")
public class EmployeeController {

    private List<Employee> empList = new ArrayList<>();

    @PostMapping("/add")
    public List<Employee> addEmployee(@RequestBody Employee employee){

        Employee realData = new Employee(123, "Roshan", 111, "Active", 0000);

        empList.add(realData);

        return empList;
    }

}
