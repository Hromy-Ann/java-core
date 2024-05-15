package org.example.homework10.task1;

public class Task1 {
    public static void main(String[] args) {
        Album shakira = new Album("She Wolf");
        Album.SongList songsInAlbum = shakira.getSongList();
        songsInAlbum.addSong(new Song("Loba", 3, 9));
        songsInAlbum.addSong(new Song("Lo Hecho Está Hecho", 3, 13));
        songsInAlbum.addSong(new Song("Años Luz", 3, 44));
        songsInAlbum.addSong(new Song("Long Time", 2, 56));
        songsInAlbum.addSong(new Song("Good Stuff", 3, 18));
        songsInAlbum.addSong(new Song("Men in This Town", 3, 36));
        songsInAlbum.addSong(new Song("Gypsy", 3, 18));
        songsInAlbum.addSong(new Song("Spy (featuring Wyclef Jean)", 3, 27));
        songsInAlbum.addSong(new Song("Mon Amour", 4, 6));
        songsInAlbum.addSong(new Song("Did It Again", 3, 13));
        songsInAlbum.addSong(new Song("Why Wait", 3, 43));
        songsInAlbum.addSong(new Song("She Wolf", 3, 10));

        System.out.println(songsInAlbum.findSongByTitle("Mon Amour"));
        System.out.println(songsInAlbum.findSongByTitle("Non-existing song title"));
        System.out.println(songsInAlbum.findSongByTrackNumber(12));
        System.out.println(songsInAlbum.findSongByTrackNumber(18));
    }
}
