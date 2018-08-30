package com.j4loxa.j4edu.designpatterns.creational.factorymethod;

public class Main {
    public static void main(String[] args) {
        var dManager = new DevelopmentManager();
        dManager.takeInterview();

        var mManager = new MarketingManager();
        mManager.takeInterview();
    }
}
