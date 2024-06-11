package com.datastructure.datastructureDSA.java.garbage;


public class GarbageCollection {
    public static void main(String[] args) {

        Student student1 = new Student("Rosh");
        Student student2 = new Student("jadhav");

       // student1 = student2 ;

        Runtime rc = Runtime.getRuntime();
        System.out.println("Full Memory "+rc.totalMemory());
        System.out.println("Free Memory "+rc.freeMemory());
        System.out.println("Student1 "+student1.name);
        System.out.println("Student2 "+student2.name);
        System.out.println("aftet gc");
        System.gc();
        System.out.println("Free Memory "+rc.freeMemory());
        System.out.println("Student1 "+student1.name);
        System.out.println("Student2 "+student2.name);
    }

}
