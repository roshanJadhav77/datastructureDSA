package com.datastructure.datastructureDSA.realTimeExample.desingPattern.factory;

public class PaymentMethodFactory {

    public static PaymentMethod getPaymentMethod(String type){
        switch (type.toUpperCase()){
            case "CREDIT_CARD" : return new CreditCardPayment();
            case "UPI": return new UpiPayment();
            default: throw new IllegalArgumentException("Invalid Payment Method");
        }
    }
}
