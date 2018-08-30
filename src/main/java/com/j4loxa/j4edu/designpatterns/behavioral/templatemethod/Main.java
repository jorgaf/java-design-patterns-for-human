package com.j4loxa.j4edu.designpatterns.behavioral.templatemethod;

public class Main {
    public static void main(String[] args) {
        var androidBuilder = new AndroidBuilder();
        androidBuilder.build();

        var iosBuilder = new IosBuilder();
        iosBuilder.build();
    }
}
