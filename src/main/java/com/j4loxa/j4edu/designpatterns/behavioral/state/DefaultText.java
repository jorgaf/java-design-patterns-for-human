package com.j4loxa.j4edu.designpatterns.behavioral.state;

public class DefaultText implements WritingState {
    @Override
    public void write(String words) {
        System.out.println(words);
    }
}
