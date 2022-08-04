public class Hitsong {

    String artist;
    String title;

    public Hitsong(String artist, String title) {
        this.artist = artist;
        this.title = title;
    }

    public String getArtist() { return artist; }
    public String getTitle() { return title; }

    public static Hitsong from(Song song) {
        return new Hitsong(
                song.getArtist(),
                song.getTitle());
    }
}
