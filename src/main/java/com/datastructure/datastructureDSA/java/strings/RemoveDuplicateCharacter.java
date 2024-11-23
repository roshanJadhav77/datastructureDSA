package com.datastructure.datastructureDSA.java.strings;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class RemoveDuplicateCharacter {
    public static void main(String[] args) {
        String str = "Roshan Jadhav"; //output : roshan jdv
        char[] chars = str.toLowerCase().toCharArray();
        LinkedHashMap<Character, Integer> hm = new LinkedHashMap<>();

        for(char c : chars) {
            if(hm.containsKey(c)){
                hm.put(c, hm.get(c));
            } else
                hm.put(c, 1);
        }

        for(Character entry : hm.keySet()){
            System.out.print(entry);
        }
    }
}
