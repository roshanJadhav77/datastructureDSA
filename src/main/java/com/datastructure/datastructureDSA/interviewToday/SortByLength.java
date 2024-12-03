package com.datastructure.datastructureDSA.interviewToday;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortByLength {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "kiwi", "cherry");
        List<String> collect = list.stream().sorted((s1, s2) -> Integer.compare(s1.length(), s2.length()))
                .collect(Collectors.toList());
        System.out.println(collect);

        ///or
        List<String> collect1 = list.stream().sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());

        System.out.println(collect1);
    }
}
