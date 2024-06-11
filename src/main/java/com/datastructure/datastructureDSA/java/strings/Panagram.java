package com.datastructure.datastructureDSA.java.strings;
//write java program to check given string is panagram or not??

public class Panagram {
    public static void main(String[] args) {
        String str = "A quick brown fox jumps over the lazy dog";
        System.out.println(isPanagram(str.toLowerCase()));
    }

    private static boolean isPanagram(String str) {

        if(str.length() < 26){
            return false;
        } else {
            for(char ch = 'a'; ch <= 'z'; ch++) {
                if(str.indexOf(ch) < 0){
                    return false;
                }
            }
        }
        return true;
    }


}




