package com.datastructure.datastructureDSA.interviewCoding;

import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Occurance {
    public static void main(String[] args) {
        // String input = "Roshan Jadhav"
        //J-1
        //R-1
        //o-1
        //s-1,
        //h-2,

        String input = "Roshan Jadhav";

        input.toLowerCase().replaceAll(" ", "")
                .chars()
                .mapToObj( c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                ))
                .forEach((ch , count) -> System.out.println("Charactor :"+ch +" count :"+count));
    }
}
