package com.j4loxa.j4edu.designpatterns.creational.singleton.threadsafe.approach1;

public class President {
    private static President instance;

    private President() {}

    public static synchronized President getInstance() {
        instance =  instance == null ? new President() : instance;
        return instance;
    }
}
