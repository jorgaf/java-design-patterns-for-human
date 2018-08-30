package com.j4loxa.j4edu.designpatterns.creational.builder;

public class Main {
    public static void main(String[] args) {
        Burger burger = new BurgerBuilder(4).addCheese()
                .addPepperoni()
                .addLettuce()
                .addTomato()
                .build();

        System.out.printf("%s\n", burger.getDescription());
    }
}
