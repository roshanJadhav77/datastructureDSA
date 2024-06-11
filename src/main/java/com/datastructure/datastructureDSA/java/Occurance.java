package com.datastructure.datastructureDSA.java;

import java.util.LinkedHashMap;
import java.util.Map;

public class Occurance {
    public static void main(String[] args) {

        String str = "RACECARS";
        char[] ch = str.toCharArray();

        LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<>();

        for(char c : ch){
            if(lhm.containsKey(c)){
                lhm.put(c, lhm.get(c)+1);
            } else{
                lhm.put(c, 1);
            }
        }

        for(Map.Entry<Character, Integer> e : lhm.entrySet()){
            if(e.getValue() == 1)
            System.out.println(e.getKey()+" : " +e.getValue());
        }
    }
}
