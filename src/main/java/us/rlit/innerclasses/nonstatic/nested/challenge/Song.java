package us.rlit.innerclasses.nonstatic.nested.challenge;

public class Song {
    private String title;
    private long duration;
    public Song(String title, long duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String  toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }
}
