package com.datastructure.datastructureDSA.interviewCoding;


import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//    List<Integer> numbers = Arrays.asList(1, 2, 4, 5, 6, 3, 7, 2, 8, 1);
//    int k = 9; // Given constant
//    output
//      4,5
//      3,6
//      2,7
//      1,8

public class PairNumberAsConstance {

    public static void main(String[] args) {
        // Given list of numbers
        List<Integer> numbers = Arrays.asList(1, 2, 4, 5, 6, 3, 7, 2, 8, 1);
        int k = 9; // Given constant

        // Using HashSet to store seen numbers
        Set<Integer> seenNumbers = new HashSet<>();

        //optional
        Set<String> uniquePairs = new HashSet<>();


        //approach1(numbers, k, seenNumbers);
       // approach2(numbers, k, seenNumbers, uniquePairs);
       // approach3(numbers, k, seenNumbers);
        approach4(numbers, k, seenNumbers);

    }

    //best approach using java 7
    private static void approach1(List<Integer> numbers, int k, Set<Integer> seenNumbers) {
        for (int num : numbers){
            int c = k - num;
            if(seenNumbers.contains(c)){
                System.out.println("Pair found : ("+num+ ","+c+")");
            }

            seenNumbers.add(num);
        }
    }

    private static void approach3(List<Integer> numbers, int k, Set<Integer> seenNumbers) {
        numbers.forEach(num -> {
            int complement = k - num;
            if (seenNumbers.contains(complement)) {
                System.out.println("Pair found : (" + num + "," + complement + ")");
            }
            seenNumbers.add(num);
        });
    }

    //Using Streams
    private static void approach4(List<Integer> numbers, int k, Set<Integer> seenNumbers) {
        numbers.stream()
                .forEachOrdered(num -> {
                    int complement = k - num;
                    if (seenNumbers.contains(complement)) {
                        System.out.println("Pair found : (" + num + "," + complement + ")");
                    }
                    seenNumbers.add(num);
                });
    }


    private static void approach2(List<Integer> numbers, int k, Set<Integer> seenNumbers, Set<String> uniquePairs) {
        for (int num : numbers) {
            int complement = k - num; // Find required complement

            if (seenNumbers.contains(complement)) {
                String pair;
                if (num < complement) {
                    pair = num + "," + complement;
                } else {
                    pair = complement + "," + num;
                }
                uniquePairs.add(pair);
            }
            seenNumbers.add(num); // Add current number to set
        }

        // Print pairs
        System.out.println("Pairs that sum to " + k + ":");
        for (String pair : uniquePairs) {
            System.out.println(pair);
            //System.out.println("(" + pair.replace(",", ", ") + ")");*/

        }
    }




}
