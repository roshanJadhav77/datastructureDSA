package com.datastructure.datastructureDSA.interviewToday;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveNullAndEmpty {
    public static void main(String[] args) {
        List<String> string = Arrays.asList("apple", "", null, "banana", " ", "cherry");
                        string.stream()
                                .filter(str -> str != null && !str.trim().isEmpty())
                                .toList()
                                .forEach(System.out::println);
    }
}
