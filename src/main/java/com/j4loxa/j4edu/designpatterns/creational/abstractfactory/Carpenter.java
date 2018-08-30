package com.j4loxa.j4edu.designpatterns.creational.abstractfactory;

public class Carpenter implements DoorFittingExpert {
        public void getDescription() {
            System.out.println("I can only fit wooden doors");
        }
}
