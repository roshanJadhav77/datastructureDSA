package com.datastructure.datastructureDSA.realTimeExample.desingPattern.observer;

public class EmailNotification implements PaymentObserver{

    @Override
    public void update(String status) {
        System.out.println("Email sent for payment status: " + status);
    }
}
