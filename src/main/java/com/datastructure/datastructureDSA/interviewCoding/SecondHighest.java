package com.datastructure.datastructureDSA.interviewCoding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Integer number = list
                .stream()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .skip(1)
                .findFirst()
                .get();
        System.out.println(number);
    }
}
