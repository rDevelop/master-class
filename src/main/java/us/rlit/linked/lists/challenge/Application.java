package us.rlit.linked.lists.challenge;

import java.util.ArrayList;

// Create a program that implements a playlist for songs
// Create a Song class having Title and Duration for a song.
// The program will have an Album class containing a list of songs.
// The albums will be stored in an ArrayList
// Songs from different albums can be added to the playlist and will appear in the list in the order
// they are added.
// Once the songs have been added to the playlist, create a menu of options to:-
// Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
// List the songs in the playlist
// A song must exist in an album before it can be added to the playlist (so you can only play songs that
// you own).
// Hint:  To replay a song, consider what happened when we went back and forth from a city before we
// started tracking the direction we were going.
// As an optional extra, provide an option to remove the current song from the playlist
// (hint: listiterator.remove()
public class Application {

    public static void main(String[] args) {
        ArrayList<Album> albums = new ArrayList<>();
        PlayList playList = new PlayList("Rob's PlayList");
        initializePlayList(albums, playList);
        playList.play();
    }

    public static void initializePlayList(ArrayList<Album> albums, PlayList playList) {
        Album a1 = new Album("This Feeling", "The Chainsmokers");
        albums.add(a1);
        Album a2 = new Album("The Carter V", "Lil Wayne");
        albums.add(a2);
        Album a3 = new Album("Recovery", "Eminem");
        albums.add(a3);
        Album a4 = new Album("Mixes", "Dj Robeecool");
        albums.add(a4);
        Song thisFeeling = new Song("This Feeling", 200);
        a1.addSong(thisFeeling);
        Song uproar = new Song("Uproar", 210);
        Song hittas = new Song("Hittas", 230);
        a2.addSong(uproar).addSong(hittas);
        Song soBad = new Song("So Bad", 290);
        Song seduction = new Song("Seduction", 280);
        a3.addSong(soBad).addSong(seduction);
        Song mix1 = new Song("Dreams", 400);
        Song mix2 = new Song("Over You", 502);
        Song mix3 = new Song("Deep Bass", 600);
        Song mix4 = new Song("Living the Dream", 450);
        a4.addSong(mix1).addSong(mix2).addSong(mix3).addSong(mix4);
        playList.addAlbums(albums);
    }
}
