package com.datastructure.datastructureDSA.interviewCoding;

public class PublicisSapient_StringCompressor {

    public static void main(String[] args) {

        //input : aaaabbbcc
        //output : a4b3c2

        String input = "aaaabbbcc";
        char CurrentChar = input.charAt(0);
        int count = 1;

        StringBuilder output = new StringBuilder();

        for(int i = 1; i < input.length(); i++){
            char ch = input.charAt(i);
            if(ch == CurrentChar){
                count ++;
            } else{
                output.append(CurrentChar).append(count);
                CurrentChar = ch;
            }
        }
    }

}
