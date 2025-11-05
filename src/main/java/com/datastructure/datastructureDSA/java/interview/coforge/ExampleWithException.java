package com.datastructure.datastructureDSA.java.interview.coforge;

public class ExampleWithException {
    public static void main(String[] args) {
        String input = "1234a";
        try {
            int result = Integer.parseInt(input);
            System.out.println("Parsed  number "+result);
        } catch (NumberFormatException e){
            System.out.println("Invalid input "+e);
        }

    }
}
