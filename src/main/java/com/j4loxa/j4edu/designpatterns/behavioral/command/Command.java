package com.j4loxa.j4edu.designpatterns.behavioral.command;

public interface Command {
    void execute();
    void undo();
    void redo();
}
