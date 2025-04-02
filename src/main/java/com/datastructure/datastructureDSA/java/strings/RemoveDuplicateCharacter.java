package com.datastructure.datastructureDSA.java.strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

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
            System.out.println(entry);
        }

        for( Map.Entry<Character, Integer> entry :hm.entrySet()){
            System.out.println("key :" + entry.getKey() + " value :" + entry.getValue());

        }
    }
}
