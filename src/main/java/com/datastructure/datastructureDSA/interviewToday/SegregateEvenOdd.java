package com.datastructure.datastructureDSA.interviewToday;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SegregateEvenOdd {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Map<Boolean, List<Integer>> collect =
                list.
                        stream()
                        .collect(Collectors.partitioningBy(num -> num % 2 == 0));

        System.out.println(collect);

        List<Integer> even = collect.get(true);
        List<Integer> odd = collect.get(false);

        System.out.println(collect.get(true));
        System.out.println(collect.get(false));
    }
}
