package com.datastructure.datastructureDSA.java.strings.substring;

import java.util.HashSet;

public class SubstringCombinations {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(getSubString(str));

    }

    static HashSet<Object> getSubString(String str){

        HashSet<Object> subString = new HashSet<>();

        for(int i = 0; i < str.length(); i++){
            subString.add(String.valueOf(str.charAt(i)));

            for(int j= i+1; j < str.length(); j++){
                subString.add(str.substring(i,j+1));
            }
            if(i != str.length() -1){
                subString.add(""+str.charAt(i) + str.charAt(i+1));
            }
        }

        return subString;
    }
}
