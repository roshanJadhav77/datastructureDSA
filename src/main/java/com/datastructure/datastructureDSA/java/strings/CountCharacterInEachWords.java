package com.datastructure.datastructureDSA.java.strings;

public class CountCharacterInEachWords {
    public static void main(String[] args) {
        String str = "my name is Roshan Jadhav";
        char[] ch = str.toCharArray();
        int len = ch.length;

        for(int i=0; i<len; i++) {
            String s ="";
            while(i< ch.length && ch[i] != ' '){
                s = s+ch[i];
                i++;
            }

            System.out.println(s+" -> "+s.length());
        }
    }
}
