package com.datastructure.datastructureDSA.java.java8;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StartWith {
    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(2, 12, 32, 4, 3, 31, 43, 13, 16);

        integers.stream()
                .map(s -> s + "")
                .filter(s -> s.startsWith("3"))
                .forEach(System.out::println);

        // We can use Stream.of() to store element in stream

        Stream.of(2, 12, 32, 4, 3, 31, 43, 13, 16)
                .map(s -> s + "")
                .filter(s -> s.startsWith("3"))
                .forEach(System.out::println);
    }
}
