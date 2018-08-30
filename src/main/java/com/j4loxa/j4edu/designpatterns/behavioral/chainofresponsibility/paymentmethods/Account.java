package com.j4loxa.j4edu.designpatterns.behavioral.chainofresponsibility.paymentmethods;

import java.util.Objects;

public class Account {
    private Account successor;
    protected double balance;

    public void setSuccessor(Account successor) {
        this.successor = successor;
    }

    public void pay(double amountToPay) {
        if(canPay(amountToPay)) {
            System.out.printf("Paid %f using %s\n",
                    amountToPay,
                    this.getClass().getSimpleName());
        } else if(Objects.nonNull(successor)) {
            System.out.printf("Cannot pay using %s. Proceeding..\n",
                    this.getClass().getSimpleName());
            successor.pay(amountToPay);
        } else {
            throw new NullPointerException("None of the accounts have enough balance");
        }

    }

    private boolean canPay(double amount) {
        return balance >= amount;
    }
}
