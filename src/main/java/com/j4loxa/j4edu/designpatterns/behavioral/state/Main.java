package com.j4loxa.j4edu.designpatterns.behavioral.state;

public class Main {
    public static void main(String[] args) {
        var editor = new TextEditor();

        editor.type("First line");

        editor.setState(new UpperCase());

        editor.type("Second line");
        editor.type("Third line");

        editor.setState(new LowerCase());

        editor.type("Fourth line");
        editor.type("Fifth line");
    }
}
