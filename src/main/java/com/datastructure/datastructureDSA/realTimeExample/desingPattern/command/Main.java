package com.datastructure.datastructureDSA.realTimeExample.desingPattern.command;

public class Main {
    public static void main(String[] args) {

        PaymentService paymentService = new PaymentService();
        RetryPaymentCommand retryPayment = new RetryPaymentCommand(paymentService, "ORD001", 350.0);

        PaymentInvoker invoker = new PaymentInvoker();
        invoker.setCommand(retryPayment);
        invoker.executeCommand();

    }
}
