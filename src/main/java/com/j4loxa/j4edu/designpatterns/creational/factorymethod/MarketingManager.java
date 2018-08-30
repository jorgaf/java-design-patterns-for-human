package com.j4loxa.j4edu.designpatterns.creational.factorymethod;

public class MarketingManager extends HiringManager {
    public Interviewer makeInterviewer() {
        return new CommunityExecutive();
    }
}
