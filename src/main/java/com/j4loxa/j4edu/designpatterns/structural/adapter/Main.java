package com.j4loxa.j4edu.designpatterns.structural.adapter;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        var wildDog = new WildDog();
        var lions = List.of(new AfricanLion(), new AsianLion(), new WildDogAdapter(wildDog));
        var hunter = new Hunter();

        for(Lion l : lions) {
            hunter.hunt(l);
        }
    }
}