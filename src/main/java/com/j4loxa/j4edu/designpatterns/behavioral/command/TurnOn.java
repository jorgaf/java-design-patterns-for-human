package com.j4loxa.j4edu.designpatterns.behavioral.command;

import java.util.Objects;

public class TurnOn implements Command {
    private Bulb bulb;

    public TurnOn(Bulb bulb) {
        if(Objects.nonNull(bulb)) {
            this.bulb = bulb;
        } else {
            throw new IllegalArgumentException("Bulb cannot be null");
        }
    }

    @Override
    public void execute() {
        bulb.turnOn();

    }

    @Override
    public void undo() {
        bulb.turnoOff();

    }

    @Override
    public void redo() {
        execute();

    }
}
