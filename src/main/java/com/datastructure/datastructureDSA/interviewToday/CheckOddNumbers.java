package com.datastructure.datastructureDSA.interviewToday;

import java.util.Arrays;
import java.util.List;

public class CheckOddNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 5, 7);

        list.stream()
                .filter(num -> num % 2 != 0)
                .forEach(System.out::println);
    }
}
