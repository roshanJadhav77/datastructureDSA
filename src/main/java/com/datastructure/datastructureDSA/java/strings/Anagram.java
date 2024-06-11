package com.datastructure.datastructureDSA.java.strings;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;

public class Anagram {
    public static void main(String[] args) {

        String str1 = "Race";
        String str2 = "Care";

        // 1. Convert into lowerCase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length() == str2.length()) {

            //Convert String into char array
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();

            //Sort the char array
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            //if sorted char are same then string is anagram
            boolean equals = Arrays.equals(charArray1, charArray2);

            if (equals){
                System.out.println(str1+ " and " +str2+ " are anagram");
            } else{
                System.out.println(str1+ " and " +str2+ " are not anagram");
            }
        }
        else{
            System.out.println(str1+ " and " +str2+ " are not anagram");
        }
    }
}
