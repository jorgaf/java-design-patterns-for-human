package com.j4loxa.j4edu.designpatterns.behavioral.observer;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class JobBlog {
    private JobPost newest;
    private PropertyChangeSupport support;

    public JobBlog() {
        support = new PropertyChangeSupport(this);
    }

    public void suscribe(PropertyChangeListener pcl) {
        support.addPropertyChangeListener(pcl);
    }

    public void unsuscribre(PropertyChangeListener pcl) {
        support.removePropertyChangeListener(pcl);
    }

    public JobPost getTitle() {
        return newest;
    }

    public void addJobPost(JobPost jobPost) {
        support.firePropertyChange("newest", this.newest, jobPost);
        this.newest = jobPost;
    }
}
