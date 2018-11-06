package us.rlit.linked.lists.challenge;

import java.util.ArrayList;

public class Album {
    private String artist;
    private String title;
    private ArrayList<Song> songs;


    public Album(String title, String artist) {
        songs = new ArrayList<>();
        this.title = title;
        this.artist = artist;
    }

    public Album addSong(Song song) {
        if(hasSong(song)) {
            System.out.println("Song already exists in this album.");
        } else {
            songs.add(song);
        }
        return this;
    }

    public boolean hasSong(Song song) {
        if(songs.indexOf(song) > 0) {
            return true;
        }
        return false;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Album{" +
                "artist='" + artist + '\'' +
                ", title='" + title + '\'' +
                ", songs=" + songs +
                '}';
    }
}
