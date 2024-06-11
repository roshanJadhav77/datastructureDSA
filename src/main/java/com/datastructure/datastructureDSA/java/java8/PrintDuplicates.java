package com.datastructure.datastructureDSA.java.java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicates {
    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 2, 6, 7, 5, 8);

        Set<Integer> hash = new HashSet<>();

        integers.stream()
                .filter(n -> !hash.add(n))
                .forEach(System.out::println);
    }
}
