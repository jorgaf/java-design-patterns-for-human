package com.j4loxa.j4edu.designpatterns.creational.singleton;

public class Main {
    public static void main(String[] args) {
        var presidentA = President.getInstance();
        var presidentB = President.getInstance();

        System.out.println(presidentA.equals(presidentB));
    }
}
