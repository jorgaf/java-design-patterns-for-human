package com.j4loxa.j4edu.designpatterns.structural.decorator;

import java.util.Objects;

public class VanillaCoffee implements Coffee {
    private Coffee coffee;

    public VanillaCoffee(Coffee coffee) {
        if(Objects.nonNull(coffee))
            this.coffee = coffee;
        else
            throw new NullPointerException("Coffee should not be null");
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 1;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", vanilla";
    }
}
