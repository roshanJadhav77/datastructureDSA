package com.datastructure.datastructureDSA.java.basic.superkeyword;

public class Dog extends Animal {

    String name = "Dog name is Tommy";

    @Override
    void display(){
        System.out.println("I am Dog");
    }

    void print(){
        // this calls overrided class
        display();

        //this calls parent method
        super.display();

        System.out.println("this type is "+name);
        System.out.println("this type is "+super.name);

    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.print();

    }

}
