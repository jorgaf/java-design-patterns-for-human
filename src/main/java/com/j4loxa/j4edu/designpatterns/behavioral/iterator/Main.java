package com.j4loxa.j4edu.designpatterns.behavioral.iterator;

public class Main {
    public static void main(String[] args) {
        var songCollection = new SongCollection();

        var song1 = new Song("A");
        songCollection.add(song1);

        var song2 = new Song("B");
        songCollection.add(song2);

        var song3 = new Song("C");
        songCollection.add(song3);

        for(var x : songCollection) {
            System.out.println(x.getName());
        }

        System.out.printf("Actual: %s\n", songCollection.current());
        songCollection.next();
        System.out.printf("Actual: %s\n", songCollection.current());
        songCollection.next();
        System.out.printf("Actual: %s\n", songCollection.current());
        songCollection.previous();
        System.out.printf("Actual: %s\n", songCollection.current());
    }
}
