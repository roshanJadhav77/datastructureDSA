package com.datastructure.datastructureDSA.java.java8;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstNonRepeatingChar {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println("First non repeating character from string is: "+findFirstNonRepeatingChar(str));
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
}
