package com.datastructure.datastructureDSA.java.strings;

public class Palidrome {
    public static void main(String[] args) {

        String str = "Mom";
       System.out.println(str + " Polindrame is "+isPalidrome(str.toLowerCase()));
       // System.out.println(isPalidromeCase(str.toLowerCase()));

    }

    private static boolean isPalidrome(String str) {
        if (str == null)
            return false;
            StringBuilder stringBuilder = new StringBuilder(str);
        StringBuilder reverse = stringBuilder.reverse();
        return reverse.toString().equals(str);
    }

    // without built in function
    private static boolean isPalidromeCase(String str) {
        if(str == null)
            return false;
        int length = str.length();
      //  System.out.println(length / 2);
        for(int i=0; i< length / 2; i++){
            if(str.charAt(i) != str.charAt(length - i - 1))
                return false;
        }
        return true;
    }
}
