package com.datastructure.datastructureDSA.interviewToday;

import java.util.Arrays;
import java.util.List;

public class CountStrings {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "apricot", "cherry", "avocado");
        List<String> list1 = Arrays.asList("avocado");

        long count = list.stream()
                .filter(word -> word.startsWith("a"))
                .count();
        System.out.println(count);
    }
}
