package com.datastructure.datastructureDSA.java.strings;

public class CountWords {
    public static void main(String[] args) {
        String str = "My name is roshan 5 5";
        char[] chars = str.toCharArray();
        int len = chars.length;
        int count = 1;

        for(int i=0; i<len; i++) {
            if(chars[i] == ' ' && chars[i+1] != ' '){
                count++;
            }
        }

        System.out.println("Number of words in given string is: "+count);
    }
}
