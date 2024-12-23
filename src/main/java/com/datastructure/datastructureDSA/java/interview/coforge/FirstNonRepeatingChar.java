package com.datastructure.datastructureDSA.java.interview.coforge;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * This class finds the first non-repeating character in a string.
 */
public class FirstNonRepeatingChar {
    public static void main(String[] args) {

        String str = "india";
        System.out.println("First Non Repeating character is: "+getFirstNonRepeatingChar(str));

    }

    /**
     * This method takes a string as input and returns the first non-repeating
     * character.
     *
     * @param str The string to be searched.
     * @return The first non-repeating character in the string, or null if there
     *         is none.
     */
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
