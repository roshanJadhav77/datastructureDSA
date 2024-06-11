package com.datastructure.datastructureDSA.java.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountElements {
    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(2, 12, 32, 4, 3, 31, 43, 13, 16);

        long count = integers.stream().count();

        System.out.println(count);

    }
}
