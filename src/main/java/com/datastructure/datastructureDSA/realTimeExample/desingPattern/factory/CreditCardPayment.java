package com.datastructure.datastructureDSA.realTimeExample.desingPattern.factory;

public class CreditCardPayment implements PaymentMethod{

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}
