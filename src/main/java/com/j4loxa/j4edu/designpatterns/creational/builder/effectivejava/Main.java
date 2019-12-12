package com.j4loxa.j4edu.designpatterns.creational.builder.effectivejava;

public class Main {
    NutritionFacts cocaCola = new NutritionFacts.Builder(240, 8)
            .calories(100)
            .sodium(35)
            .carbohydrate(27)
            .build();
}
