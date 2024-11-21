package com.datastructure.datastructureDSA.realTimeExample.desingPattern.observer;

public class SMSNotification implements PaymentObserver{
    @Override
    public void update(String status) {
        System.out.println("SMS sent for payment status: " + status);
    }
}
