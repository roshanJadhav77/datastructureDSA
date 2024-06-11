package com.datastructure.datastructureDSA.java;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

public class Arrangement {
    public static void main(String[] args) {
        String str = "Hello world";
        char[] chars = str.toCharArray();

        LinkedHashMap<Character,Integer> lhm = new LinkedHashMap<Character, Integer>();

        for(char c : chars){
            if(lhm.containsKey(c)){
                lhm.put(c,lhm.get(c) + 1);
            } else{
                lhm.put(c,1);
            }
        }

        for(Map.Entry<Character, Integer> entry : lhm.entrySet()){

            System.out.println(entry);
        }


    }
}
