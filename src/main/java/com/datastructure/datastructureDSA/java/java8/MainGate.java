package com.datastructure.datastructureDSA.java.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainGate {

    public static void main(String[] args) {

        List<Employee> empList = new ArrayList<Employee>();
        empList.add(new Employee(101,"Roshan",101,"active",35000));
        empList.add(new Employee(201,"Ramya",401,"active",25000));
        empList.add(new Employee(301,"Nisha",201,"active",25000));
        empList.add(new Employee(401,"Aruna",401,"active",25000));
        empList.add(new Employee(501,"Rohit",101,"active",35000));
        empList.add(new Employee(101,"Harish",101,"active",25000));


        // program to display salary greater then 350000
       /* List<Employee> collect = empList
                .stream()
                .filter(emp -> emp.getSalary() >= 35000)
                .collect(Collectors.toList());*/
       // collect.forEach(emp -> System.out.println(emp));

       // empList.forEach(emp -> System.out.println(emp));


        // program to print employee details working in each dept
       /* Map<Integer, List<Employee>> emplCount = empList.stream()
                         .collect(Collectors.groupingBy(
                                 Employee::getDeptId, Collectors.toList()));
        emplCount.entrySet().forEach(entry ->
                System.out.println(entry.getKey() + "---" + entry.getValue()));
    }*/

        // program to sort thr employee list based on salary
       /* Stream<Employee> sortedList = empList.stream().sorted(Comparator.comparing(Employee::getSalary));
        sortedList.forEach(System.out::println);*/

        //or
        Stream<Employee> sorted = empList.stream().sorted((o1, o2) -> (int) (o1.getSalary() - o2.getSalary()));
        sorted.forEach(System.out::println);


}}
