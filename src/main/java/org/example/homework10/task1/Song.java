package org.example.homework10.task1;

public class Song {
    private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public Song(String title, int minutes, int seconds) {
        this(title, minutes + seconds / 60.0d);
    }

    public String getTitle() {
        return title;
    }

    public double getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Song {" +
                "title = '" + title + '\'' +
                ", duration = " + duration +
                '}';
    }
}
