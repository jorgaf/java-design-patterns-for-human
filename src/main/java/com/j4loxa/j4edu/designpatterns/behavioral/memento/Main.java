package com.j4loxa.j4edu.designpatterns.behavioral.memento;

public class Main {
    public static void main(String[] args) {
        var editor = new Editor();

        editor.type("This is the first sentence.");
        editor.type("This is second.");

        editor.save();

        editor.type("This is third.");

        System.out.println(editor.getContent());

        editor.restore();

        System.out.println(editor.getContent());
    }
}
