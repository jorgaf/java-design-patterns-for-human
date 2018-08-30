package com.j4loxa.j4edu.designpatterns.behavioral.observer;

public class Main {
    public static void main(String[] args) {
        var danielDoe = new JobSeeker("Daniel Doe");
        var janeDoe = new JobSeeker("Jane Doe");

        var jobPostings = new JobBlog();
        jobPostings.suscribe(danielDoe);
        jobPostings.suscribe(janeDoe);

        jobPostings.addJobPost(new JobPost("Software engineer"));

        jobPostings.unsuscribre(janeDoe);

        jobPostings.addJobPost(new JobPost("Java developer"));
    }
}
