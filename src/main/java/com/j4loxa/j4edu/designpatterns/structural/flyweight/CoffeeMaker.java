package com.j4loxa.j4edu.designpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CoffeeMaker {
    private Map<String, Coffee> availableCoffee = new HashMap<>();

    public Coffee make(String preference) {
        if(!availableCoffee.containsKey(preference)) {
            availableCoffee.put(preference, new Coffee());
        }

        return availableCoffee.get(preference);
    }
}
