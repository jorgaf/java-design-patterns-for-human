package com.j4loxa.j4edu.designpatterns.behavioral.mediator;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ChatRoom implements ChatRoomMediator {

    @Override
    public void showMessage(User user, String message) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.printf("%s [%s]: %s\n",
                dateTime.format(DateTimeFormatter.ofPattern("MMMM dd, H:mm")),
                user.getName(),
                message);
    }
}
