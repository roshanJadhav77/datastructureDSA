package com.datastructure.datastructureDSA.realTimeExample.desingPattern.strategyPattern;

public class main {
    public static void main(String[] args) {
        MembershipDiscount membershipDiscount = new MembershipDiscount();
        PaymentProcessor paymentProcessor = new PaymentProcessor(membershipDiscount);
        double finalAmount = paymentProcessor.processPayment(200.0);
        System.out.println("final amount after discount: "+finalAmount);
    }
}
