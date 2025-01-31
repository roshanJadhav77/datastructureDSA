package com.datastructure.datastructureDSA.interviewToday;
// * Input: String1 = "hello" String2 = "world"
//* Output: String1 = "world" String2 = "hello"
public class Swap {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        a = a + b;// 50
        b = a - b; //20
        a = a- b; // 30

        //System.out.println("a");

        String str1 = "hello";
        String str2 = "world";

        str1 = str1 + str2; //helloworld
        str2 = str1.substring(0, str1.length() - str2.length());
        str1 = str1.substring(str2.length());

        System.out.print(str1+":"+str2);



    }




}
