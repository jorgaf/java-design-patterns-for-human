package com.j4loxa.j4edu.designpatterns.behavioral.templatemethod;

public class IosBuilder extends Builder {
    @Override
    public void test() {
        System.out.println("Running ios tests");
    }

    @Override
    protected void lint() {
        System.out.println("Linting the ios code");
    }

    @Override
    protected void assemble() {
        System.out.println("Assembling the ios build");
    }

    @Override
    public void deploy() {
        System.out.println("Deploying ios build to server");
    }
}
