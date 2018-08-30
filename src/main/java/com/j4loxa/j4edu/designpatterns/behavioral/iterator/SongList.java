package com.j4loxa.j4edu.designpatterns.behavioral.iterator;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SongList implements Iterable<Song> {
    private final List<Song> songList = new ArrayList<>();
    @Override
    public Iterator<Song> iterator() {
        return songList.iterator();
    }

    public void add(Song song) {
        songList.add(song);
    }

    public void remove(Song song) {
        songList.remove(song);
    }


}
