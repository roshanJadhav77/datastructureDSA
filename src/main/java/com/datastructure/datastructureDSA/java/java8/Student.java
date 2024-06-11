package com.datastructure.datastructureDSA.java.java8;

import lombok.Data;

@Data
public class Student {
    int id;
    int salary;

    public Student(int id, int salary) {
        this.id = id;
        this.salary = salary;
    }
}
