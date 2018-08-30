package com.j4loxa.j4edu.designpatterns.creational.abstractfactory;

public class IronDoorFactory implements DoorFactory {
    public Door makeDoor() {
        return new IronDoor();
    }

    public DoorFittingExpert makeFittingExpert() {
        return new Welder();
    }
}
