package com.datastructure.datastructureDSA.java.interview.coforge;

import java.util.Scanner;

public class MainPerson {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ShavilPerson obj = new ShavilPerson();
        System.out.println("Enter Name");
        String name = sc.next();

       // obj.setName("Shavil");
        System.out.println("Enter Eyes");
        int eyes = sc.nextInt();

       // obj.setEyes(2);

        System.out.println("Enter Finger");
        int finger = sc.nextInt();

       // obj.setFingers(20);
        obj.setHands(2);
        obj.setLegs(2);

        System.out.println(" Shavil has " +name+" eyes");
        System.out.println(" Shavil has " +eyes+" eyes");
        System.out.println(" Shavil has " +finger+" eyes");


    }
}
