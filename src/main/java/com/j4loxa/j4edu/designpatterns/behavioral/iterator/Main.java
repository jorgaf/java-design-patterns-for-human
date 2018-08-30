package com.j4loxa.j4edu.designpatterns.behavioral.iterator;

public class Main {
    public static void main(String[] args) {
        var songList = new SongList();

        var song1 = new Song("A");
        songList.add(song1);

        var song2 = new Song("B");
        songList.add(song2);

        var song3 = new Song("C");
        songList.add(song3);

        for(var x : songList) {
            System.out.println(x.getName());
        }


    }
}
