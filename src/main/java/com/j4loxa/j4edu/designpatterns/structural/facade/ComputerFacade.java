package com.j4loxa.j4edu.designpatterns.structural.facade;

import java.util.Objects;

public class ComputerFacade {
    private Computer computer;

    public ComputerFacade(Computer computer) {
        if(Objects.nonNull(computer)) {
            this.computer = computer;
        } else {
            throw new NullPointerException("Computer cannot be null");
        }
    }

    public void turnOn() {
        computer.getElectricShock();
        computer.makeSound();
        computer.showLoadingScreen();
        computer.bam();
    }

    public void turnOff() {
        computer.closeEverything();
        computer.pullCurrent();
        computer.sooth();
    }
}
