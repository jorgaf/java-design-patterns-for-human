package com.j4loxa.j4edu.designpatterns.structural.decorator;

public class Main {
    public static void main(String[] args) {
        var myCoffee = new SimpleCoffee();
        System.out.println(myCoffee.getCost());
        System.out.println(myCoffee.getDescription());

        var milkCoffee = new MilkCoffee(myCoffee);
        System.out.println(milkCoffee.getCost());
        System.out.println(milkCoffee.getDescription());

        var whipCoffee = new WhipCoffee(milkCoffee);
        System.out.println(whipCoffee.getCost());
        System.out.println(whipCoffee.getDescription());

        var vanillaCoffee = new VanillaCoffee(whipCoffee);
        System.out.println(vanillaCoffee.getCost());
        System.out.println(vanillaCoffee.getDescription());
    }
}
