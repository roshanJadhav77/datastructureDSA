package com.datastructure.datastructureDSA.interviewToday;

import java.util.*;
import java.util.stream.Collectors;

public class CountWordFrequency {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "apple", "cherry", "banana", "banana");
        Map<String, Long> collect = list.stream()
                .collect(Collectors.groupingBy(words -> words, Collectors.counting()));

        System.out.println(collect);


        //Highest repeated
        Map.Entry<String, Long> stringLongEntry = collect.entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .findFirst()
                .get();

        System.out.println(stringLongEntry.getKey());
        System.out.println(stringLongEntry.getValue());

    } // {banana=3, cherry=1, apple=2}
}
