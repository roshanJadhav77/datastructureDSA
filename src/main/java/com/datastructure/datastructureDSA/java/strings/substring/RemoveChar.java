package com.datastructure.datastructureDSA.java.strings.substring;

public class RemoveChar {
    public static void main(String[] args) {
        String str = "RoshanJadhav";
        System.out.println(str);
        System.out.println(charRemove(str,6));
    }

    private static String charRemove(String str, int p) {

        return str.substring(0,p) + str.substring(p + 1); //str.substring(p + 1) to print rest of substring
    }
}
