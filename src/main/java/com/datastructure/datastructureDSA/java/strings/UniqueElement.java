package com.datastructure.datastructureDSA.java.strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class UniqueElement {
    public static void main(String[] args) {

        String str = "Java is high level langauge";
        char[] chars = str.toLowerCase().toCharArray();
        Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

        for (Character c : chars) {
            map.put(c, map.containsKey(c) ? map.get(c)+1 : 1); //get(c)+1, have a count of repeated character
        }

        map.entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .collect(Collectors.toList())
                .forEach(System.out::println);


       /* for(Map.Entry<Character, Integer> value : map.entrySet()) {
            if (value.getValue() == 1) { // == exist element, > print duplicate element
                //  System.out.print(value.getKey());
                System.out.println(value.getKey() + " : " + value.getValue());
            }
        }*/
    }
}

