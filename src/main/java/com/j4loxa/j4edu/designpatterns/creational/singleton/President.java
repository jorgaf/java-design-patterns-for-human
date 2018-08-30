package com.j4loxa.j4edu.designpatterns.creational.singleton;

public class President {
    private static President instance;

    private President() {

    }

    public static President getInstance() {
        if (instance == null) {
            instance = new President();
        }

        return instance;
    }
}
