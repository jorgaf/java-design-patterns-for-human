package com.j4loxa.j4edu.designpatterns.structural.adapter;

public class AfricanLion implements Lion {
    @Override
    public void roar() {
        System.out.println("African lion roaring");
    }
}
