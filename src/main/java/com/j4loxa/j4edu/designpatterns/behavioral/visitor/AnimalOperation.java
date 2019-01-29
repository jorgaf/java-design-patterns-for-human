package com.j4loxa.j4edu.designpatterns.behavioral.visitor;


public interface AnimalOperation {
    void visitMonkey(Monkey monkey);
    void visitLion(Lion lion);
    void visitDolphin(Dolphin dolphin);
}
