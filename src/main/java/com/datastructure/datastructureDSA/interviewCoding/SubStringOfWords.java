package com.datastructure.datastructureDSA.interviewCoding;

import java.util.ArrayList;
import java.util.List;

public class SubStringOfWords {
    public static void main(String[] args) {
        String[] words = {"mass","as","hero","superhero"};
        List<String> subStrings = new ArrayList<>();

        for(int i=0; i < words.length; i++){
            for(int j=0; j < words.length; j++){
                if(!words[j].equalsIgnoreCase(words[i])
                        && words[j].contains(words[i])){
                        subStrings.add(words[i]);
                }
            }
        }
        System.out.println(subStrings);

    }
}
