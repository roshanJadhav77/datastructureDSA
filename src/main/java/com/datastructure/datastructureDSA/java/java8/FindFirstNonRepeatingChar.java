package com.datastructure.datastructureDSA.java.java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeatingChar {
    public static void main(String[] args) {
        String str = "dsdffforfoesef";
        //System.out.println("First non repeating character from string is: "+findFirstNonRepeatingChar(str));

        System.out.println("First non repeating character from string is: "+findFirstNonRepeatingCharacter(str));
    }

    private static Character findFirstNonRepeatingChar(String str) {

        Map<Character, Integer> map = new LinkedHashMap<>();

        for(Character ch : str.toCharArray()) {
            map.put(ch, map.containsKey(ch) ? map.get(ch)+1 : 1);
        }

        return map.entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .findFirst()
                .get().
                getKey();
    }


    private static Character findFirstNonRepeatingCharacter(String str){
        return str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("No such Non - repeating character found"))
                .getKey();
    }
}
