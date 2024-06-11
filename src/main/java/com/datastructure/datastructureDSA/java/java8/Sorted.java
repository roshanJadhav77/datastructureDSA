package com.datastructure.datastructureDSA.java.java8;

import java.util.*;
import java.util.stream.Collectors;

public class Sorted {

    public static void main(String[] args) {



        String p= "1010";

        HashSet<String> aList = new HashSet();
        aList.add(p);

        System.out.println(aList);

        List<Integer> numnbers = List.of(23, 3, 15, 11, 5, 1, 0);

        List<String> stringList = List.of("ROSHAN");

        // approach 1
        // numnbers.stream().sorted().forEach(System.out::println);

        // approach 2
        List<Integer> collect = numnbers.stream().sorted().collect(Collectors.toList());
        collect.forEach(System.out::println);

        // Reverse string
        String collect1 = stringList.stream().map(word -> new StringBuilder(word).reverse())
                .collect((Collectors.joining(" ")));
        System.out.println("reverse = "+collect1);

        //min numners
        Integer integer = numnbers.stream().min((x, y) -> x.compareTo(y)).get();
        System.out.println("Min = " + integer);

        //man number
        Integer integer1 = numnbers.stream().max((x, y) -> x.compareTo(y)).get();
        System.out.println("Max = " + integer1);

    }

}
