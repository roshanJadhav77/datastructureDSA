package com.datastructure.datastructureDSA.interviewCoding;

import java.util.ArrayList;
import java.util.List;

public class PermuteCombination {
    public static void main(String[] args) {
        String str = "XYZ";
        String prefix = "";
        ArrayList<Object> result = new ArrayList<>();
        permutationCombination(prefix,str,result);
        result.forEach(System.out::println);


    }
    private static void permutationCombination(String prefix,String input, List<Object> result){

        if(input.isEmpty()){
            result.add(prefix);
            return;
        }
        for(int i= 0; i < input.length(); i++){
            char ch = input.charAt(i);

            String newPrefix = prefix + ch;
            String newRemaining =  input.substring(0,i) +
                    input.substring(i + 1);

            permutationCombination(newPrefix, newRemaining,result);
        }
    }
}
