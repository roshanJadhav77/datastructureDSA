package com.datastructure.datastructureDSA.interviewToday;


// input = 31, 45, 67,85,104,115
//Output = 85,115,45

import java.util.Arrays;
import java.util.List;

public class DividedBy5 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(31, 45, 67, 85, 104, 115);

        list.stream()
                .filter(e -> e % 5 == 0)
                .forEach(System.out::println);
    }
}
