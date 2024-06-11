package com.datastructure.datastructureDSA.java.basic;

public class Bike {
    int speedlimit = 90;
}

class Plender extends Bike{

    int speedlimit = 150;

    public static void main(String[] args) {

        Bike obj = new Plender();

        System.out.println(obj.speedlimit);
    }
}
