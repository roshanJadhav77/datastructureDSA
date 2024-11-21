package com.datastructure.datastructureDSA.realTimeExample.desingPattern.command;

// Receiver Class
public class PaymentService {

    public void processPayment(String orderid, double amount){
        System.out.println("Processing payment of " + amount + " for order " + orderid);
    }

}
