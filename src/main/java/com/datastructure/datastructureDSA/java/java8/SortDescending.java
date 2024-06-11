package com.datastructure.datastructureDSA.java.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortDescending {
    public static void main(String[] args) {

        ArrayList<Student> empList = new ArrayList<Student>();

        empList.add(new Student(1,5000));
        empList.add(new Student(2,6000));
        empList.add(new Student(3,7000));
        empList.add(new Student(4,8000));
        empList.add(new Student(5,9000));

        List<Student> collect = empList.stream()
                .sorted((o1, o2) -> (int) (o2.getSalary() - o1.getSalary()))
                .limit(3) //it will give top 3 salary
                .collect(Collectors.toList());
        System.out.println(collect);

    }
}
