package us.rlit.innerclasses.nonstatic.nested.challenge;

import java.util.ArrayList;

public class Album {
    private String artist;
    private String title;
    //private ArrayList<Song> songs;
    private SongList songs;


    public Album(String title, String artist) {
        songs = new SongList();
        this.title = title;
        this.artist = artist;
    }

//    public Album addSong1(Song song) {
//        if(hasSong(song)) {
//            System.out.println("Song already exists in this album.");
//        } else {
//            songs.add(song);
//        }
//        return this;
//    }

    public Album addSong(Song song) {
        if(this.songs.addSong(song)) {
            return this;
        }
        System.out.println("Song already exists in this album.");
        return null;

    }

//    public boolean hasSong(Song song) {
//        if(songs.contains(song)) {
//            return true;
//        }
//        return false;
//    }

    public ArrayList<Song> getSongs() {
        return songs.getSongs();
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


    private class SongList {
        private ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<>();
        }

        public boolean addSong(Song song) {
            if(hasSong(song)) {
                System.out.println("Song already exists in this album.");
                return false;
            }
            this.songs.add(song);
            return true;
        }

        public boolean hasSong(Song song) {
            if(songs.contains(song)) {
                return true;
            }
            return false;
        }

        public ArrayList<Song> getSongs() {
            return this.songs;
        }

    }
}
