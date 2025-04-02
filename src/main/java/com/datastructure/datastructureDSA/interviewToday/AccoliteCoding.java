package com.datastructure.datastructureDSA.interviewToday;
//// String s = "aabbyybbbbcoyc";
//// Output ->{a=2, b=2, c=1, y=1, o=1}
//  least number of repeating  --. contains -> if(map){c}

import java.util.HashMap;
import java.util.stream.IntStream;

public class AccoliteCoding {
    public static void main(String[] args) {
        String s = "aabbyybbbbcoyc";
        findLeastNumberOfOccurence(s);
    }

    private static void findLeastNumberOfOccurence(String input) {

        HashMap<Character, Integer> hashMap = new HashMap<>();
        int count = 1;
        int n = input.length();

        for(int i = 1; i < n; i++){
            if(input.charAt(i) == input.charAt(i - 1)){
                count++;
            } else{
                char ch = input.charAt(i - 1);
                hashMap.put(ch, Math.min(hashMap.getOrDefault(ch, Integer.MAX_VALUE), count));
                count = 1;
            }
        }

        char lastChar = input.charAt(n - 1);
        hashMap.put(lastChar, Math.min(hashMap.getOrDefault(lastChar, Integer.MAX_VALUE),count));
        hashMap.forEach((key, value) -> System.out.println(key+":"+value));


    }
}
