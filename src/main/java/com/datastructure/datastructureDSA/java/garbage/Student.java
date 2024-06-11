package com.datastructure.datastructureDSA.java.garbage;

public class Student {

    String name = " ";

    public void finalize() {

    }
    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
