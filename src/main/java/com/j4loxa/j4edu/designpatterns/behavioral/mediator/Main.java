package com.j4loxa.j4edu.designpatterns.behavioral.mediator;

public class Main {
    public static void main(String[] args) {
        var mediator = new ChatRoom();
        var daniel = new User("Daniel", mediator);
        var jane = new User("Janneth", mediator);

        daniel.send("I love you");
        jane.send("Me too");
    }
}
