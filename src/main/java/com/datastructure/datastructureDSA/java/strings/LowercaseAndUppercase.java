package com.datastructure.datastructureDSA.java.strings;

public class LowercaseAndUppercase {
    public static void main(String[] args) {
        String str = "MY name IS roshan AND i AM from GULBARGA";
        String[] s = str.split(" ");
        int len = s.length;

        for (int i = 0; i < len; i++){
            if(i%2 == 0){
                System.out.print(s[i].toLowerCase());
            }else{
                System.out.print(s[i].toUpperCase());
            }
        }
    }
}
