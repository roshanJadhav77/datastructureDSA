package com.datastructure.datastructureDSA.realTimeExample.desingPattern.observer;

import java.util.ArrayList;
import java.util.List;

public class PaymentNotifier {

    private List<PaymentObserver> observers = new ArrayList<>();

    public void addObsever(PaymentObserver observer){
        observers.add(observer);
    }

    public void notifyObserver(String status){
        for ( PaymentObserver observer : observers){
            observer.update(status);
        }
    }
}
