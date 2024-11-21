package com.datastructure.datastructureDSA.realTimeExample.desingPattern.singleTon;

public class MainPayment {
    public static void main(String[] args) {
        PaymentGateway gateway = PaymentGateway.getInstance();
        gateway.processPayment("ORD001",100.0);
    }
}
