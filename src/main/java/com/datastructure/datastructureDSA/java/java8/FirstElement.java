package com.datastructure.datastructureDSA.java.java8;

import java.util.Arrays;
import java.util.List;

public class FirstElement {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(12, 23, 4, 56, 78, 90);

        integers.stream()
                .findFirst()
                .ifPresent(System.out::println);
    }
}
