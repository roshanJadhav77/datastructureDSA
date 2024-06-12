package com.datastructure.datastructureDSA.trickyOutput;

public class Program4 {
    public static void main(String[] args) {
        Integer num1 = 100;
        Integer num2 = 100;
        Integer num3 = 500;
        Integer num4 = 500;

        if(num1==num2){
            System.out.println("num1 == num2");
        }
        else{
            System.out.println("num1 != num2");
        }
        if(num3 == num4){
            System.out.println("num3 == num4");
        }
        else{
            System.out.println("num3 != num4");
        }
    }
}

/*
* Answer: b)num1 == num2
            num3 != num4
Reason: We always thought that whenever two object references are compared using “==”,
* it always evaluates to “false”. But here Integer caching changes the results.
* Integer class has a caching range of -128 to 127. Whenever a number is between this range and autoboxing is used,
* it assigns the same reference. That’s why for value 100, both num1 and num2 will have the same reference,
* but for the value 500 (not in the range of -128 to 127), num3 and num4 will have different reference.
*
* */