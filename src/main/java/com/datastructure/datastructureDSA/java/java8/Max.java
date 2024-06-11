package com.datastructure.datastructureDSA.java.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Max {
    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(2, 12, 32, 4, 3, 31, 43, 13, 16);

        Integer integersff = integers.stream()
                .max(Integer::compareTo).get();
        System.out.println("The max integer: "+ integersff);

       // Stream.of(1,2,3,4,5,6,7,8,9).limit(1).forEach(System.out::println);

       //integers.stream().limit(6).forEach(System.out::println);

    }
}
