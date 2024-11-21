package com.datastructure.datastructureDSA.realTimeExample.desingPattern.strategyPattern;

import org.springframework.beans.factory.annotation.Autowired;

public class PaymentProcessor {

    private DiscountStrategy discountStrategy;

    public PaymentProcessor(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double processPayment(double amount){
        double discount = discountStrategy.calculateDiscount(amount);
        return amount - discount;
    }


}
