package com.j4loxa.j4edu.designpatterns.behavioral.visitor;

public class Monkey implements Animal {

    public void shout() {
        System.out.println("Oooh o aa aa!");
    }
    @Override
    public void accept(AnimalOperation operation) {
        operation.visitMonkey(this);
    }
}
