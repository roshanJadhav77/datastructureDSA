package com.datastructure.datastructureDSA.interviewToday;

import java.util.Arrays;
import java.util.List;

public class EvenNumver {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);

        list.stream()
                .filter(num -> num % 2 == 0)
                .forEach(System.out::print);
    } // even : 2 4 6 8 0 //odd : 1 3 5 7 9
}
