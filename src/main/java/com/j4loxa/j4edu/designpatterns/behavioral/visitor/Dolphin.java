package com.j4loxa.j4edu.designpatterns.behavioral.visitor;

public class Dolphin implements Animal {
    public void speak() {
        System.out.println("Tuut tittu tuutt!");
    }

    @Override
    public void accept(AnimalOperation operation) {
        operation.visitDolphin(this);
    }
}
