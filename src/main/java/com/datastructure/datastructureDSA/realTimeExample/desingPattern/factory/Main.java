package com.datastructure.datastructureDSA.realTimeExample.desingPattern.factory;

public class Main {
    public static void main(String[] args) {
        PaymentMethod method = PaymentMethodFactory.getPaymentMethod("CREDIT_CARD");
        PaymentMethod method1 = PaymentMethodFactory.getPaymentMethod("UPI");
        method1.pay(110.0);
        method.pay(150.0);
    }
}
