package com.datastructure.datastructureDSA.java.strings;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class RemoveDuplicateCharacter {
    public static void main(String[] args) {
        String str = "Roshan Jadhav"; //output : roshan jdv
        char[] chars = str.toLowerCase().toCharArray();
        LinkedHashMap<Character, Integer> hm = new LinkedHashMap<>();

        for(char c : chars) {
            hm.put(c, hm.containsKey(c) ? hm.get(c) : 1);
        }

        System.out.println(hm);

        for(Character entry : hm.keySet()){
            System.out.print(entry);
        }
    }
}
