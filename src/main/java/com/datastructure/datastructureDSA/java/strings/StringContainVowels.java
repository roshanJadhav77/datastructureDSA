package com.datastructure.datastructureDSA.java.strings;

public class StringContainVowels {
    public static void main(String[] args) {

        String string = "Hi welcome to learning India";
        char[] chars = string.toCharArray();
        for(int i = 0; i < chars.length; i++) {

            if(chars[i] == 'a' || chars[i] == 'e' || chars[i] == 'i' ||
                    chars[i] == 'o' || chars[i] == 'u' || chars[i] == 'I') {

                System.out.println("Given string contains "+chars[i] +" at the index "+i);
            }
        }
    }
}
