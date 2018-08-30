package com.j4loxa.j4edu.designpatterns.structural.adapter;

public class WildDogAdapter implements Lion {
    private WildDog wilDog;

    public WildDogAdapter(WildDog wilDog) {
        this.wilDog = wilDog;
    }

    @Override
    public void roar() {
        wilDog.bark();
    }
}
