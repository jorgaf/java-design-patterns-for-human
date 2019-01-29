package com.j4loxa.j4edu.designpatterns.behavioral.iterator;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SongCollection implements Iterable<Song> {
    private final List<Song> songList = new ArrayList<>();
    private int currentSongPos = 0;

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

    public Song next() {
        var nextPos = currentSongPos + 1;
        currentSongPos = isValid(nextPos) ? currentSongPos + 1 : 0;
        return current();
    }

    public Song previous() {
        var previousPos = currentSongPos - 1;
        currentSongPos = isValid(previousPos) ? currentSongPos - 1 : songList.size() - 1;
        return current();
    }

    public Song current() {
        return songList.get(currentSongPos);
    }

    private boolean isValid(int position) {
        return position >= 0 && position < songList.size();
    }
}
