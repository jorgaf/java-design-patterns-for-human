package com.j4loxa.j4edu.designpatterns.structural.facade;

public class Main {
    public static void main(String[] args) {
        var computer = new ComputerFacade(new Computer());
        computer.turnOn();
        System.out.println();
        computer.turnOff();
    }
}
