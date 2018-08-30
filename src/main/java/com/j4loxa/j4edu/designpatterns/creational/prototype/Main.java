package com.j4loxa.j4edu.designpatterns.creational.prototype;

public class Main {
    public static void main(String[] args) {
        var original = new Sheep("Jolly");
        System.out.printf("%s - %s\n",
                original.getName(),
                original.getCategory());

        var cloned = (Sheep)original.clone();
        cloned.setName("Dolly");

        System.out.printf("%s - %s\n",
                cloned.getName(),
                cloned.getCategory());
    }
}
