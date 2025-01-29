package com.datastructure.datastructureDSA.interviewToday;

public class FindSubStringLengh {
    public static void main(String[] args) {
        // Inputs
        String input1 = "I am now at skidata bng";
        String input2 = "a";

        // Get the length of the substring
        int result = getSubstringLength(input1, input2);

        // Output the result
        System.out.println("Length of the substring: " + result);
    }

    public static int getSubstringLength(String input1, String input2) {
        // Remove input2 and all whitespaces from the string
        String modifiedString = input1.replaceAll("\\s", "");

        // Find the first and last occurrence of 'A' in the original string
        int firstIndex = input1.indexOf(input2);
        int lastIndex = input1.lastIndexOf(input2);

        // If there are less than 2 occurrences of 'A', return 0
        if (firstIndex == -1 || lastIndex == -1 || firstIndex == lastIndex) {
            return 0;
        }

        // Extract the substring between the first and last 'A' in the modified string
        String betweenAs = modifiedString.substring(firstIndex + 1, lastIndex);

        // Return the length of the resulting substring
        return betweenAs.length();
    }
}
