package com.datastructure.datastructureDSA.interviewToday;

import lombok.Data;

@Data
public class StudentAge {
    public StudentAge(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String name;
    int age;
}
