package com.datastructure.datastructureDSA.java.interview.coforge;

public class Program1 {

    public static void main(String[] args)
    {
        System.out.println(methodOne(11));
    }

    static int methodOne(int i)
    {
        return methodTwo(i *= 11);
    }

    static int methodTwo(int i)
    {
        return methodThree(i /= 11);
    }

    static int methodThree(int i)
    {
        return methodFour(i -= 11);
    }

    static int methodFour(int i)
    {
        return i += 11;
    }

}
