package com.j4loxa.j4edu.designpatterns.behavioral.command;

import java.util.Objects;

public class TurnOff implements Command {
    private Bulb bulb;

    public TurnOff(Bulb bulb) {
        if(Objects.nonNull(bulb)) {
            this.bulb = bulb;
        } else {
            throw new IllegalArgumentException("Bulb cannot be null");
        }

    }

    @Override
    public void execute() {
        bulb.turnoOff();
    }

    @Override
    public void undo() {
        bulb.turnOn();
    }

    @Override
    public void redo() {
        execute();
    }
}
