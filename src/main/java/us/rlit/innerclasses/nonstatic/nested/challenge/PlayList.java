package us.rlit.innerclasses.nonstatic.nested.challenge;


import java.util.*;

public class PlayList {
    private LinkedList<String> playList;
    private ArrayList<Album> albums;
    private Iterator<String> it;

    private String name;

    public PlayList(String name) {
        playList = new LinkedList<>();
        this.name = name;
    }

    private Song getSong(String song) {
        for (Album a : albums) {
            for (Song s : a.getSongs()) {
                if (s.getTitle().equals(song)) {
                    return s;
                }
            }
        }
        return null;
    }


    public void addAlbums(ArrayList<Album> passedAlbums) {
        albums = passedAlbums;
        albums.forEach(
                (a) -> {
                    a.getSongs().forEach((s) ->  playList.add(s.getTitle()));
                }
        );
    }

    public void listSongs() {
        System.out.println("===============================");
        System.out.println(name);
        System.out.println("Number of songs: " + playList.size());
        System.out.println("===============================");
        Iterator<String> it = playList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("===============================");
    }

    private void deleteSong(String song) {
        System.out.println("===============================");
        System.out.println(name);
        System.out.println("Number of songs: " + playList.size());
        System.out.println("===============================");
        Iterator<String> it = playList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("===============================");
    }


    public void play() {
        boolean forward = true;
        System.out.println();
        Scanner s = new Scanner(System.in);
        boolean quit = false;
        ListIterator<String> it = playList.listIterator();
        if( playList.isEmpty()) {
            System.out.println("Play List is empty.");
            return;
        } else {
            showPlaying(it.next());
            showMenu();
        }
        while (!quit) {
            int choice = s.nextInt();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    if(!forward) {
                        if(it.hasNext()) {
                            it.next();
                        }
                        forward = true;
                    }
                    if(it.hasNext()) {
                        showPlaying(it.next());
                    } else {
                        System.out.println("End of playlist.\n");
                    }
                    break;
                case 2:
                    if(forward) {
                        if(it.hasPrevious()) {
                            it.previous();
                        }
                        forward = false;
                    }
                    if(it.hasPrevious()) {
                        showPlaying(it.previous());
                    } else {
                        System.out.println("No previous songs.");
                    }
                    break;
                case 3:
                    if(it.hasPrevious()) {
                        showPlaying(it.previous());
                        it.next();
                    } else {
                        showPlaying(it.next());
                        it.previous();
                    }
                    break;
                case 4:
                    listSongs();
                    break;
                case 5:
                    int previousTrack = it.previousIndex();
                    listSongs();
                    s.nextLine();
                    System.out.println("Which song?");
                    String songToDelete = s.nextLine();
                    Song foundSong = getSong(songToDelete);
                    if(foundSong != null) {
                        it = playList.listIterator();
                        while (it.hasNext()) {
                            if(it.next().equals(songToDelete)) {
                                System.out.println("Removing " + songToDelete);
                                it.previous();
                                it.remove();
                            }
                        }
                        while(it.hasPrevious()) {
                            if(it.previousIndex() == previousTrack) {
                               showPlaying(it.previous());
                               it.next();
                               break;
                            } else {
                                it.previous();
                            }
                        }
                    } else {
                        System.out.println(songToDelete + " is not in the playlist.");
                    }
                    break;
                default:
                    break;
            }

            showMenu();
        }
        System.out.println("Thanks for playing ;)");
    }

    private void showMenu() {
        //Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
        StringBuffer buf = new StringBuffer();
        buf.append("0: Quit\n");
        buf.append("1: Next Song\n");
        buf.append("2: Previous Song\n");
        buf.append("3: Replay Song\n");
        buf.append("4: Show Songs\n");
        buf.append("5: Remove Song from Playlist\n");
        System.out.println(buf);
    }


    private void showPlaying(String display) {
        System.out.println("===============================");
        System.out.println("Playing " + display);
        System.out.println("===============================");
    }

}
