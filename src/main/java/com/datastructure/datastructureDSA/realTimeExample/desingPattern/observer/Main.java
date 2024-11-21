package com.datastructure.datastructureDSA.realTimeExample.desingPattern.observer;

public class Main {
    public static void main(String[] args) {
        PaymentNotifier paymentNotifier = new PaymentNotifier();
        paymentNotifier.addObsever(new EmailNotification());
        paymentNotifier.addObsever(new SMSNotification());
        paymentNotifier.notifyObserver("Success");
    }
}
