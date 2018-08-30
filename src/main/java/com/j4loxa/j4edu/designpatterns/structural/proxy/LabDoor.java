package com.j4loxa.j4edu.designpatterns.structural.proxy;

public class LabDoor implements Door {
    @Override
    public void open() {
        System.out.println("Opening lab door");
    }

    @Override
    public void close() {
        System.out.println("Closing lab door");

    }
}
