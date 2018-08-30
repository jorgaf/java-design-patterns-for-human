package com.j4loxa.j4edu.designpatterns.creational.factorymethod;

public abstract class HiringManager {
    //Factory method
    public abstract Interviewer makeInterviewer();

    public void takeInterview() {
        Interviewer interviewer = this.makeInterviewer();
        interviewer.askQuestions();
    }
}
