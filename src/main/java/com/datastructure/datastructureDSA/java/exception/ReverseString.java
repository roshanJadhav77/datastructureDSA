package com.datastructure.datastructureDSA.java.exception;

public class ReverseString {
    public static void main(String[] args) {
        String str = "";
        reverseMethod(str);

    }

    public static void reverseMethod(String str){
        if(str == ""){
            throw new IllegalArgumentException("String can not be null");
        }
        char[] chars = str.toCharArray();
        for(int i= chars.length-1; i>0; i--){
            System.out.print(chars[i]);
        }
    }
}
