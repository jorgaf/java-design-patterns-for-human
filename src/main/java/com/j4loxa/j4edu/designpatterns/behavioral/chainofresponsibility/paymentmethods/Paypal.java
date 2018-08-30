package com.j4loxa.j4edu.designpatterns.behavioral.chainofresponsibility.paymentmethods;

public class Paypal extends Account {

    public Paypal(double balance) {
        this.balance = balance;
    }
}
