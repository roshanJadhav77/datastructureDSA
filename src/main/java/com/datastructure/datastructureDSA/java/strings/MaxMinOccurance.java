package com.datastructure.datastructureDSA.java.strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class MaxMinOccurance {
    public static void main(String[] args) {
        String str = "greener";
       maxMinOccurance(str);

    }

    public static void maxMinOccurance(String str){

        char[] chars = str.toCharArray();
        Map<Character, Integer> map = new LinkedHashMap();

        for(Character c : chars) {
            map.put(c, map.containsKey(c) ? map.get(c)+1 : 1);
        }

        System.out.println(map);
        //find max frequency
        int max_count = '0';
        int min_count = '0';
        char max_occurance = '0';
        char min_occurance = '0';
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(max_count> entry.getValue()){
                max_count = entry.getValue();
                max_occurance = entry.getKey();
            } else{
                min_count = entry.getValue();
                min_occurance = entry.getKey();
            }
        }

        System.out.println("Max character occurred: "+max_occurance);
        System.out.println("Min character occurred: "+min_occurance);

    }



}
