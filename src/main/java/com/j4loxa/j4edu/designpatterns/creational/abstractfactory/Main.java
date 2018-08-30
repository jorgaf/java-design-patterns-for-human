package com.j4loxa.j4edu.designpatterns.creational.abstractfactory;

public class Main {
    public static void main(String[] args) {
        var wDoorFactory = new WoodenDoorFactory();
        var woodenDoor = wDoorFactory.makeDoor();
        var wDoorFittingExpert = wDoorFactory.makeFittingExpert();

        woodenDoor.getDescription();
        wDoorFittingExpert.getDescription();

        var iDoorFactory = new IronDoorFactory();
        var ironDoor = iDoorFactory.makeDoor();
        var iDoorFittingExpert = iDoorFactory.makeFittingExpert();

        ironDoor.getDescription();
        iDoorFittingExpert.getDescription();
    }
}
