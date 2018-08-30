package com.j4loxa.j4edu.designpatterns.structural.flyweight;

public class Main {
    public static void main(String[] args) {
        var coffeeMaker = new CoffeeMaker();
        var cafeteria = new Cafeteria(coffeeMaker);

        cafeteria.takeOrder("less sugar", 1);
        cafeteria.takeOrder("more milk", 2);
        cafeteria.takeOrder("without sugar", 5);

        cafeteria.serve();
    }
}
