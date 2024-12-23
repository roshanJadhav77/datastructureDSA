package com.datastructure.datastructureDSA.interviewToday;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindCommanElement {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(4, 5, 6, 7, 8);

        list1.stream()
                .filter(list2::contains)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    } // output 4 5
}
