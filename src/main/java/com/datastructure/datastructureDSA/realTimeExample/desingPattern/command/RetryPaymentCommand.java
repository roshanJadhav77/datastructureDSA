package com.datastructure.datastructureDSA.realTimeExample.desingPattern.command;

public class RetryPaymentCommand implements PaymentCommand{
    private PaymentService paymentService;
    private String orderId;
    private double amount;

    public RetryPaymentCommand(PaymentService paymentService, String orderId, double amount) {
        this.paymentService = paymentService;
        this.orderId = orderId;
        this.amount = amount;
    }

    @Override
    public void execute() {
        paymentService.processPayment(orderId,amount);
    }
}
