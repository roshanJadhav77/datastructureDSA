package com.datastructure.datastructureDSA.java.strings;

public class RemoveWhiteSpace {
    public static void main(String[] args) {

        System.out.println(removeWhiteSpaceMethod("Hello Roshan Jadhav"));
    }

    private static String removeWhiteSpaceMethod(String input) {
        StringBuilder output = new StringBuilder();
        char[] chars = input.toCharArray();

        for (char c : chars) {
            if(!Character.isWhitespace(c))
                output.append(c);
        }
        return output.toString();
    }
}
