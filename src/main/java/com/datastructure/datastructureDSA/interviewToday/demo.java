package com.datastructure.datastructureDSA.interviewToday;


import java.util.LinkedHashMap;


//Strelite prv limited
// String str = "stress";   //Input

// java 21
// ms kofka
// aws
// oracle
// iot
// fallback - ms

 //Output: t
 //
 //Find the first non-repeated character by using java 8
public class demo {
     public static void main(String[] args) {

         String str = "stress";
         System.out.println("First Non Repeatative : "+getNonRepeatativeChar(str));

     }

     static Character getNonRepeatativeChar(String str){

         LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

         for(Character ch : str.toCharArray()){
             map.put(ch,map.containsKey(ch) ? map.get(ch) + 1 : 1);
         }

         System.out.println(map);

         return  map.entrySet().stream()
                 .filter(e ->e.getValue() == 1)
                 .findFirst()
                 .get().getKey();
     }
}
