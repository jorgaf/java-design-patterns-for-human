package com.j4loxa.j4edu.designpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Cafeteria {
    private Map<Integer, Coffee> orders = new HashMap<>();
    private CoffeeMaker coffeeMaker;

    public Cafeteria(CoffeeMaker coffeeMaker) {
        if(Objects.nonNull(coffeeMaker)) {
            this.coffeeMaker = coffeeMaker;
        } else {
            throw new NullPointerException("Coffee maker cannot be null");
        }
    }

    public void takeOrder(String preference, int table) {
        orders.put(table, coffeeMaker.make(preference));
    }

    public void serve() {
        for(var table : orders.keySet()) {
            System.out.printf("Serving Coffee to table # %d\n", table);
        }
    }
}
