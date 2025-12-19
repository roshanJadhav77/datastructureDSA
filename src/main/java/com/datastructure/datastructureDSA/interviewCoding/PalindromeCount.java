package com.datastructure.datastructureDSA.interviewCoding;


// Question: Palindrom count

import java.util.Arrays;

//“Madam is walking on the Street”
public class PalindromeCount {

    public static void main(String[] args) {

        String sentence1= "Madam is walking on the Street";
        String sentence2= "Madam is in room number 121";

        System.out.println(countOfPalindrome("sentence 1: "+sentence1));
        System.out.println(countOfPalindrome("sentence 2: "+sentence2));

    }

    private static int countOfPalindrome(String sentence){
        return (int)Arrays
                .stream(sentence.split("\\s+"))
                .map(word -> word.replaceAll("[^a-zA-Z0-9]","").toLowerCase())
                .filter(word -> word.length() > 1)
                .filter(word -> new StringBuilder(word).reverse().toString().equals(word))
                .count();
    }

}
