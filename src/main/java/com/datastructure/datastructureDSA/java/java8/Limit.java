package com.datastructure.datastructureDSA.java.java8;

import java.util.stream.Stream;

public class Limit {

    public static void main(String[] args) {

        Stream.of(1,2,3,4,5,6,7,8,9)
                .limit(6)
                .forEach(System.out::println);
    }
}
