package com.j4loxa.j4edu.designpatterns.structural.proxy;

import java.util.Objects;

public class SecuredDoor {
    private Door door;

    public SecuredDoor(Door door) {
        if(Objects.nonNull(door)) {
            this.door = door;
        } else {
            throw new NullPointerException("Door can not be null");
        }
    }
    public void open(String password) {
        if(authenticate(password)) {
            door.open();
        } else {
            System.out.println("Access denied");
        }
    }

    private boolean authenticate(String password) {
        return password.equals("$ecr@t");
    }

    public void close() {
        door.close();
    }
}
