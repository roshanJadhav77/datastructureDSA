package com.datastructure.datastructureDSA.interviewToday;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FindDuplicates {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9,9,3);

        list.stream()
                .filter(num -> Collections.frequency(list, num) > 1)
                .collect(Collectors.toSet())
                .forEach(System.out::print);
    }
}
