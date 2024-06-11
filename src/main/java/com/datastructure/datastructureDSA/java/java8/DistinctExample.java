package com.datastructure.datastructureDSA.java.java8;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class DistinctExample {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 5, 6);

        System.out.println("Distinct elements are : ");
        list.stream().distinct().forEach(System.out::println);

    }
}
