package com.datastructure.datastructureDSA.interviewCoding;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CombNameStartingWithLetter {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Amit", "Cat", "Bobby", "BHuvan", "Devid", "Arun");

        Map<Character, List<String>> collect = list.stream()
                .collect(Collectors.groupingBy(names -> Character.toUpperCase(names.charAt(0))));

        collect.forEach((k,v ) -> System.out.println(k +"-->"+v));

    }
}
