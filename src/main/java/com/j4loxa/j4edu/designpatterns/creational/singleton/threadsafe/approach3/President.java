package com.j4loxa.j4edu.designpatterns.creational.singleton.threadsafe.approach3;

public class President {
    private static final President INSTANCE = new President();

    private President() {}

    public static President getInstance() {
        return INSTANCE;
    }
}
