package com.datastructure.datastructureDSA.interviewToday;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicate {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 5, 1, 6);

         Set<Integer> collect = numbers.stream().collect(Collectors.toSet());

         //or

         numbers.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);


        // System.out.println(collect);
    }
}
