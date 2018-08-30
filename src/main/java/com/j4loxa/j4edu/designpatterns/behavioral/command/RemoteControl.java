package com.j4loxa.j4edu.designpatterns.behavioral.command;

public class RemoteControl {
    public void submit(Command command) {
        command.execute();
    }
}
