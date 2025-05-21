package com.datastructure.datastructureDSA.interviewToday;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EverateAge {

    public static void main(String[] args) {

        List<StudentAge> student = Arrays.asList(
                new StudentAge("Roshan", 10),
                new StudentAge("MSD", 10)
        );


        Double collect = student.stream().collect(Collectors.averagingInt(s -> s.age));

        System.out.println("Everate "+collect);


    }
}
