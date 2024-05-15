package org.example.homework10.task1;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private String title;
    private SongList songList;

    public SongList getSongList() {
        return songList;
    }

    public String getTitle() {
        return title;
    }

    public Album(String title) {
        this.title = title;
        songList = new SongList();
    }

    class SongList {
        private List<Song> songs;

        SongList() {
            songs = new ArrayList<>();
        }

        boolean addSong(Song songToAdd) {
            if (songs.contains(songToAdd)) {
                return false;
            }
            return songs.add(songToAdd);
        }

        Song findSongByTitle(String title) {
            for (Song song : songs) {
                if (song.getTitle().equals(title)) {
                    return song;
                }
            }
            return null;
        }

        Song findSongByTrackNumber(int trackNumber) {
            if (trackNumber > songs.size()) {
                return null;
            }
            return songs.get(trackNumber - 1);
        }
    }
}