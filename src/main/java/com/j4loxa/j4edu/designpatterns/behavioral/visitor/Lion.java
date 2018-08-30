package com.j4loxa.j4edu.designpatterns.behavioral.visitor;

public class Lion implements Animal {
    public void roar() {
        System.out.println("Roar!");
    }

    @Override
    public void accept(AnimalOperation operation) {
        operation.visitLion(this);
    }
}
