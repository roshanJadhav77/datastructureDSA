package com.datastructure.datastructureDSA.java.record;

public class MainClass {

    public static void main(String[] args) {
        Person person = new Person("Roshan", 28,"jdhav","Suvarna","Married");

        System.out.println(person.name());
        System.out.println(person.age());
        System.out.println("Wife Name: "+person.wifeName());
    }
}
