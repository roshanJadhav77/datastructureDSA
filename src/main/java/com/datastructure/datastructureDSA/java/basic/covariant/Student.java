package com.datastructure.datastructureDSA.java.basic.covariant;

public class Student extends College {

    @Override
    Student getstudent() {
        return this;
    }

    public static void main(String[] args) {

    }
}
