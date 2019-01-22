package com.j4loxa.j4edu.designpatterns.creational.singleton.threadsafe.approach2;

public class President {
    private static volatile President instance;

    private President() {
    }

    public static President getInstance() {
        if(instance == null) {
            synchronized (President.class) {
                if(instance == null) {
                    instance = new President();
                }
            }
        }
        return instance;
    }
}
