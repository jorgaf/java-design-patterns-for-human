package com.j4loxa.j4edu.designpatterns.behavioral.templatemethod;

public abstract class Builder {
    public void build() {
        test();
        lint();
        assemble();
        deploy();
    }

    public abstract void test();
    protected abstract void lint();
    protected abstract void assemble();
    public abstract void deploy();
}
