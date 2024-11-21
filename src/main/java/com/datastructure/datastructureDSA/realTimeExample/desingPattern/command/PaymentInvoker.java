package com.datastructure.datastructureDSA.realTimeExample.desingPattern.command;

public class PaymentInvoker {
    private PaymentCommand command;

    public void setCommand(PaymentCommand command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }

}
