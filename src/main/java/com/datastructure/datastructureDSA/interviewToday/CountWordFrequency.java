package com.datastructure.datastructureDSA.interviewToday;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountWordFrequency {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "apple", "cherry", "banana", "banana");
        Map<String, Long> collect = list.stream()
                .collect(Collectors.groupingBy(words -> words, Collectors.counting()));

        System.out.println(collect);


    }
}
