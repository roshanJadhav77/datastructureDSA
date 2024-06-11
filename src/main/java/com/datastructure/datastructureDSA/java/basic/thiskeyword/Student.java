package com.datastructure.datastructureDSA.java.basic.thiskeyword;

public class Student {
    String name;
    int rollno;

    Student(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }
     void display(){
         System.out.println("student details: "+name+" "+rollno);
     }

    public static void main(String[] args) {
        Student student = new Student("Roshan",77);
        student.display();
    }
}
