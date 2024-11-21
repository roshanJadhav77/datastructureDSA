package com.datastructure.datastructureDSA.realTimeExample.desingPattern.singleTon;

public class PaymentGateway {
    private static PaymentGateway instance;

    private PaymentGateway(){
        System.out.println("Initializing payment Gateway");
    }

    public static synchronized PaymentGateway getInstance(){
        if(instance == null){
            instance = new PaymentGateway();
        }
        return instance;
    }

    public void processPayment(String orderId, double amount) {
        System.out.println("Processing payment of " + amount + " for order " + orderId);
    }
}
