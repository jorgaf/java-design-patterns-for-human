package com.j4loxa.j4edu.designpatterns.behavioral.observer;


import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class JobSeeker  implements PropertyChangeListener {
    private String name;

    public JobSeeker(String name) {
        this.name = name;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        var newJobPost = (JobPost) evt.getNewValue();
        System.out.printf("Hi %s! New job posted: %s\n",
                name,
                newJobPost.getTitle());

    }
}
