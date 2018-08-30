package com.j4loxa.j4edu.designpatterns.behavioral.interpreter;

public class Number implements Expression {
    private final int n;

    public Number(int n) {
        this.n = n;
    }

    @Override
    public int interpret() {
        return n;
    }
}
