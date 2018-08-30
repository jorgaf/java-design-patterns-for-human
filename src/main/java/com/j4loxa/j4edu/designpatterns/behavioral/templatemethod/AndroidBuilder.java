package com.j4loxa.j4edu.designpatterns.behavioral.templatemethod;

public class AndroidBuilder extends Builder {
    @Override
    public void test() {
        System.out.println("Running android tests");
    }

    @Override
    protected void lint() {
        System.out.println("Linting the android code");
    }

    @Override
    protected void assemble() {
        System.out.println("Assembling the android build");

    }

    @Override
    public void deploy() {
        System.out.println("Deploying android build to server");
    }
}
