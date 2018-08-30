package com.j4loxa.j4edu.designpatterns.structural.proxy;

public class Main {
    public static void main(String[] args) {
        var door = new SecuredDoor(new LabDoor());
        door.open("invalid");

        door.open("$ecr@t");
        door.close();
    }
}
