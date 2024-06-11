package com.datastructure.datastructureDSA.java.interview.coforge;

public class Program3 {
    static void staticMethod()
    {
        System.out.println("Static Method");
    }
}

class B{
    public static void main(String[] args)
    {
        Program3 a = null;
        a.staticMethod();
    }
}
