package com.datastructure.datastructureDSA.interviewCoding;

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
