package com.datastructure.datastructureDSA.interviewCoding;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

// "technical tech round roshan" using
public class SynichronCode {

    public static void main(String[] args) {
        String str = "technical tech round roshan";
        Character character = str.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .get();

        System.out.println(character);


    }

}
