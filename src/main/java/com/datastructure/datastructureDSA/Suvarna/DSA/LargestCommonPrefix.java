package com.datastructure.datastructureDSA.Suvarna.DSA;
// Write a function to find the longest common prefix string amongst an array of strings.

public class LargestCommonPrefix {
    static String commonPrifix(String[] str){
        String prefix = str[0];

        if(str == null || str.length == 0){
            return "";
        }

        for(int i =0; i<str.length ; i++){
            while(str[i].indexOf(prefix) !=0){
                prefix = prefix.substring(0, prefix.length()-1);
                if(prefix.isEmpty()){
                    return "";
                }

            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] str = {"flower", "florn", "floan"};
        String result = commonPrifix(str);
        if (result == null) {
            System.out.println("no string is matching " + result);
        } else {
            System.out.println("Largest common prefeix is " + result);
        }
    }

}
