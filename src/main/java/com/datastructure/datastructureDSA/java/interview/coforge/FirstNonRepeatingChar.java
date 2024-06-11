package com.datastructure.datastructureDSA.java.interview.coforge;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {

        String str = "india";
        System.out.println("First Non Repeating character is: "+getFirstNonRepeatingChar(str));

    }

    static Character getFirstNonRepeatingChar(String str){
        Map<Character, Integer> map = new LinkedHashMap<>();

        for(Character ch : str.toCharArray()){
            map.put(ch, map.containsKey(ch) ? map.get(ch)+1 : 1);
        }


        return map.entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .findFirst()
                .get()
                .getKey();
    }
}
