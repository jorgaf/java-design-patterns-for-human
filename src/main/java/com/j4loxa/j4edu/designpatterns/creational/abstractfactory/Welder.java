package com.j4loxa.j4edu.designpatterns.creational.abstractfactory;

public class Welder implements DoorFittingExpert {
    public void getDescription() {
        System.out.println("I can only fit iron doors");
    }
}
