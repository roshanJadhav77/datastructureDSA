package com.datastructure.datastructureDSA.java.strings;

import java.util.Arrays;

/**
 * This program checks whether two strings are anagrams of each other.
 */
public class Anagram {
    /**
     * The main method of the program.
     *
     * @param args The command line arguments.
     */
    public static void main(String[] args) {

        String str1 = "Race";
        String str2 = "Care";

        // 1. Convert into lowerCase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        //2. check the lenth equal or not
        if(str1.length() == str2.length()) {

            //2. Convert String into char array
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();

            //3. Sort the char array
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            //4. if sorted char are same then string is anagram
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
