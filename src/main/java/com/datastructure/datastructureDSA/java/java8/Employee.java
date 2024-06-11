package com.datastructure.datastructureDSA.java.java8;

import lombok.Data;

@Data
public class Employee {

    private int empId;
    private String empName;
    private int deptId;
    private String status = "status";
    private int salary;

    public Employee(int empId, String empName, int deptId, String status, int salary) {
        this.empId = empId;
        this.empName = empName;
        this.deptId = deptId;
        this.status = status;
        this.salary = salary;
    }
}
