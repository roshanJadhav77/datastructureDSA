package com.datastructure.datastructureDSA.java.java8;

import java.util.Arrays;
import java.util.List;

public class Odd {
    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(1, 2, 3,4 ,5 ,6 ,7, 8, 9);

        myList.stream()
                .filter(n -> n%2 == 0)
                .map(e -> e*e)
                .forEach(System.out::println);
    }
}
