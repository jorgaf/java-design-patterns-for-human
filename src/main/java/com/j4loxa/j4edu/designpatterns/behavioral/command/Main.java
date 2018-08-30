package com.j4loxa.j4edu.designpatterns.behavioral.command;

public class Main {
    public static void main(String[] args) {
        var bulb = new Bulb();

        var turnOn = new TurnOn(bulb);
        var turnOff = new TurnOff(bulb);

        var remote = new RemoteControl();
        remote.submit(turnOn);
        remote.submit(turnOff);
    }
}
