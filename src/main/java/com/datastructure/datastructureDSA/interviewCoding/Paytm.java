package com.datastructure.datastructureDSA.interviewCoding;

import java.util.*;

public class Paytm {

   // Input: strs = ["eat","tea","tan","ate","nat","bat"]
   //  Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

    public static void main(String[] args) {

        String[] input = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> result = groupAnagram(input);
        System.out.println(result);

    }

    public static List<List<String>> groupAnagram(String[] strs) {
        Map<String, List<String>> anagramMap = new HashMap<>();
        for(String str : strs){
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            //add in map
            String s = new String(charArray);
            anagramMap.computeIfAbsent(s, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(anagramMap.values());

    }



}
