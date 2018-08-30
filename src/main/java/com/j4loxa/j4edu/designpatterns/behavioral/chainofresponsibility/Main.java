package com.j4loxa.j4edu.designpatterns.behavioral.chainofresponsibility;

import com.j4loxa.j4edu.designpatterns.behavioral.chainofresponsibility.paymentmethods.Bank;
import com.j4loxa.j4edu.designpatterns.behavioral.chainofresponsibility.paymentmethods.Bitcoin;
import com.j4loxa.j4edu.designpatterns.behavioral.chainofresponsibility.paymentmethods.Paypal;

public class Main {
    public static void main(String[] args) {
        var bank = new Bank(100);
        var paypal = new Paypal(200);
        var bitcoin = new Bitcoin(300);

        bank.setSuccessor(paypal);
        paypal.setSuccessor(bitcoin);

        bank.pay(259);



    }
}
