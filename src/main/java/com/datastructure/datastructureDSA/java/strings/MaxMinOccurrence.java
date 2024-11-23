package com.datastructure.datastructureDSA.java.strings;

import java.util.*;

public class MaxMinOccurrence {
    public static void main(String[] args) {
        String str = "greener";
        maxMinOccurrence(str);
    }

    public static void maxMinOccurrence(String str) {
        // Convert the string to a character array
        char[] chars = str.toCharArray();
        Map<Character, Integer> map = new LinkedHashMap<>();

        // Count occurrences of each character
        for (Character c : chars) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        System.out.println("Character frequencies: " + map);

        // Variables to store max and min occurrences
        int max_count = Integer.MIN_VALUE;
        int min_count = Integer.MAX_VALUE;
        char max_occurrence = ' ';
        char min_occurrence = ' ';

        // Iterate through the map to find max and min occurrences
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            int value = entry.getValue();

            // Update max occurrence
            if (value > max_count) {
                max_count = value;
                max_occurrence = entry.getKey();
            }

            // Update min occurrence
            if (value < min_count) {
                min_count = value;
                min_occurrence = entry.getKey();
            }
        }

        System.out.println("Max character occurred: " + max_occurrence + " with count " + max_count);
        System.out.println("Min character occurred: " + min_occurrence + " with count " + min_count);
    }
}
