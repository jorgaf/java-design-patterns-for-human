package com.j4loxa.j4edu.designpatterns.creational.factorymethod;

public class DevelopmentManager extends HiringManager {
    public Interviewer makeInterviewer() {
        return new Developer();
    }
}
