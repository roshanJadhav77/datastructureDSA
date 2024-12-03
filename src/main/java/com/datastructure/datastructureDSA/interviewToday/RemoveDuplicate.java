package com.datastructure.datastructureDSA.interviewToday;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicate {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 5, 1, 6);

         Set<Integer> collect = numbers.stream().collect(Collectors.toSet());
        System.out.println("collection "+collect);

        //or

        Set<Integer> hashMap = new HashSet<>(numbers);
        System.out.println("hashMap "+hashMap);

         //or

         numbers.stream().distinct().toList().forEach(System.out::print);


        // System.out.println(collect);
    }
}
