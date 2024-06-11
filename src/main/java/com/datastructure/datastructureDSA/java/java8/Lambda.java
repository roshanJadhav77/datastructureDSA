package com.datastructure.datastructureDSA.java.java8;

public class Lambda {
    public static void main(String[] args) {

        Lambda example = new Lambda();

        MathOperation addition = (int a, int b) -> a+b;
        MathOperation subtraction = (a, b) -> a-b;
        MathOperation multiplication = (a, b) ->  {return a*b;};
        MathOperation division = (a, b) -> a/b ;

        System.out.println("10 + 5 = "+example.operation(10, 5, addition));
        System.out.println("10 - 5 = "+example.operation(10, 5, subtraction));
        System.out.println("10 * 5 = "+example.operation(10, 5, multiplication));
        System.out.println("10 / 5 = "+example.operation(10, 5, division));


        GreetingService greetingserv1 = message -> System.out.println("First Name = "+message);
        GreetingService greetingserv2 = message -> System.out.println("Last Name = "+message);

        greetingserv1.sayMessage("Roshan");
        greetingserv2.sayMessage("Jadhav");


    }

    interface MathOperation {
        int operation(int a, int b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    //overloading Interface operation ()
    private int operation(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a, b);
    }

}
