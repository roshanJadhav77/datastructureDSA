package com.datastructure.datastructureDSA.realTimeExample.desingPattern.strategyPattern;

public class MembershipDiscount implements DiscountStrategy{

    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.15; // 15% discount
    }
}
