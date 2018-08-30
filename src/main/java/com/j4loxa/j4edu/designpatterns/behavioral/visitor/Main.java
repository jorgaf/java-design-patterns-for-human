package com.j4loxa.j4edu.designpatterns.behavioral.visitor;

public class Main {
    public static void main(String[] args) {
        var monkey = new Monkey();
        var lion = new Lion();
        var dolphin = new Dolphin();

        var speak = new Speak();

        monkey.accept(speak);
        lion.accept(speak);
        dolphin.accept(speak);

        var jump = new Jump();
        monkey.accept(jump);
        lion.accept(jump);
        dolphin.accept(jump);
    }
}
