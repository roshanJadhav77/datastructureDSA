package com.datastructure.datastructureDSA.java.interview.coforge;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Demo {
    //1st swiss

    public static void main(String[] args) {
        String input = "swiss";
        Optional<Map.Entry<Character, Long>> nonRepeatingChar = findNonRepeatingChar(input);
        System.out.println("Non Repeating character: "+nonRepeatingChar);

    }

    public static Optional<Map.Entry<Character, Long>> findNonRepeatingChar(String input){

        LinkedHashMap<Character, Long> countChar = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        ch -> ch,
                        LinkedHashMap::new,
                        Collectors.counting()
                ));

        Optional<Map.Entry<Character, Long>> first = countChar.entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .findFirst();

        return first;


    }


}
