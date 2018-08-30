package com.j4loxa.j4edu.designpatterns.structural.adapter;

public class Main {
    public static void main(String[] args) {
        var wildDog = new WildDog();
        var wildDogAdapter = new WildDogAdapter(wildDog);
        var hunter = new Hunter();
        hunter.hunt(wildDogAdapter);
    }

}
