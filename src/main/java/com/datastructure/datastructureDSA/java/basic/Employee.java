package com.datastructure.datastructureDSA.java.basic;

import lombok.Data;

@Data
public class Employee implements Comparable<Employee>{

    private String name;
    private String phone;
    private int empId;

    @Override
    public int compareTo(Employee o) {
        return this.empId - o.empId;
    }

    public Employee(String name, String phone, int empId) {
        this.name = name;
        this.phone = phone;
        this.empId = empId;
    }
}
