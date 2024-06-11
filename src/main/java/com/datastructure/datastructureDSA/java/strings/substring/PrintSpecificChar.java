package com.datastructure.datastructureDSA.java.strings.substring;

public class PrintSpecificChar {
    public static void main(String[] args) {
        String str = "Sachin Tendulkar";

        //prints original string
        System.out.println("original string: "+str);

        // Print Last name
        System.out.println("Print last name: "+str.substring(7));

        //Print 1st name
        System.out.println("Print first name: "+str.substring(0,6));

        // print only chi
        System.out.println("print only chi: "+str.substring(2,5));

    }
}
