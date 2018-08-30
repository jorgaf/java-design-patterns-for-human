package com.j4loxa.j4edu.designpatterns.creational.builder;

public class Burger {
    private int size;
    private boolean cheese;
    private boolean pepperoni;
    private boolean lettuce;
    private boolean tomato;

    public Burger(BurgerBuilder builder) {
        this.size = builder.size;
        this.cheese = builder.cheese;
        this.pepperoni = builder.pepperoni;
        this.lettuce = builder.lettuce;
        this.tomato = builder.tomato;
    }

    public String getDescription() {
        return String.format("This is %d inch Burger.\n", this.size);
    }
}
