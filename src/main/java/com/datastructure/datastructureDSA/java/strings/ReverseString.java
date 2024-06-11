package com.datastructure.datastructureDSA.java.strings;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Roshan";
        System.out.println(getReverse(str));
    }

    //Using build in funtion
    static StringBuilder getReverse(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder str2 = stringBuilder.append(str);
        str2 = str2.reverse();
        return str2;
    }

}
