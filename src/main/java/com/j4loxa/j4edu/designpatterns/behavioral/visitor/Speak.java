package com.j4loxa.j4edu.designpatterns.behavioral.visitor;

public class Speak implements AnimalOperation {
    @Override
    public void visitMonkey(Monkey monkey) {
        monkey.shout();
    }

    @Override
    public void visitLion(Lion lion) {
        lion.roar();
    }

    @Override
    public void visitDolphin(Dolphin dolphin) {
        dolphin.speak();
    }
}
