package com.j4loxa.j4edu.designpatterns.behavioral.mediator;

public class User {
    private String name;
    private ChatRoomMediator chatRoom;

    public User(String name, ChatRoomMediator chatRoom) {
        this.name = name;
        this.chatRoom = chatRoom;
    }

    public String getName() {
        return name;
    }

    public void send(String message) {
        chatRoom.showMessage(this, message);
    }
}
