package com.j4loxa.j4edu.designpatterns.structural.adapter;

public class AsiaLion implements Lion {
    @Override
    public void roar() {
        System.out.println("Asian lion roaring");
    }
}
