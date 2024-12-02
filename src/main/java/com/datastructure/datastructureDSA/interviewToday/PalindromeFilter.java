package com.datastructure.datastructureDSA.interviewToday;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PalindromeFilter {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("level", "apple", "radar", "java", "madam");

        List<String> collect = list.stream()
                .filter(num -> num.equals(new StringBuilder(num).reverse().toString()))
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}
