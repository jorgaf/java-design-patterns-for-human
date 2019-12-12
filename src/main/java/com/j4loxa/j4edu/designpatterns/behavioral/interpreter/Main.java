package com.j4loxa.j4edu.designpatterns.behavioral.interpreter;

public class Main {
    public static void main(String[] args) {
        var expression = "7 3 + 2 1 * *";

        System.out.println(Interpreter.evaluate(expression));
    }
}
