package com.datastructure.datastructureDSA.java.basic;

import java.util.ArrayList;
import java.util.Collections;

public class MainClient {
    public static void main(String[] args) {

        ArrayList<Employee> emps = new ArrayList<>();
        emps.add(new Employee("roshan", "98776552", 202));
        emps.add(new Employee("Rohit", "987546552", 101));
        emps.add(new Employee("Harish", "5345554", 404));
        emps.add(new Employee("Aruna", "84847333", 303));
        emps.add(new Employee("Ramya", "799869864", 505));

        // comparing by Id
        System.out.println(emps);
       // Collections.sort(emps);
        // System.out.println(emps);

        // Comparing by name
        ArrayList<Employee> emps2 = new ArrayList<Employee>(emps);
        Collections.sort(emps2, new NameComparator());
        System.out.println(emps2);

    }
}
