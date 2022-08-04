public class Song {

    private String Title;
    private String Artist;
    private String Album;
    private Integer Length;

    private Song(String title, String artist, String album, Integer length) {
        Title = title;
        Artist = artist;
        Album = album;
        Length = length;
    }

    public String getTitle() { return Title; }
    public String getArtist() { return Artist; }
    public String getAlbum() { return Album; }
    public Integer getLength() { return Length; }

    public static class SongBuilder {
        private String title;
        private String artist;
        private String album;
        private Integer length;

        public SongBuilder setTitle(String title) {
            this.title = title;
            return this;
        }

        public SongBuilder setArtist(String artist) {
            this.artist = artist;
            return this;
        }

        public SongBuilder setAlbum(String album) {
            this.album = album;
            return this;
        }

        public SongBuilder setLength(Integer length) {
            this.length = length;
            return this;
        }

        public Song build() {
            return new Song(title, artist, album, length);
        }
    }
}