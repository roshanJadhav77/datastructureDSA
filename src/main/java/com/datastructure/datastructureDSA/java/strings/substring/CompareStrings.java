package com.datastructure.datastructureDSA.java.strings.substring;

public class CompareStrings {
    public static void main(String[] args) {

        String s1 = "Roshan";
        String s2 = "Roshan";
        String s3 = new String("Roshan");
        String s4 = "jadhav";

        System.out.println(s1.equals(s2));//true

        System.out.println(s1.equals(s3));//true

        System.out.println(s1.equals(s4));//false
    }
}
