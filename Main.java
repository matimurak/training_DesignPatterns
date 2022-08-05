public class Main {
    public static void main(String[] args) {

        creationPatterns();

    }

    private static void creationPatterns() {
    /*Song piosenka1 = new SongBuilder().createSong()
            .setArtist("Blur")
            .setTitle("Song2")
            .setLength(182);
*/
        Song piosenka1 = new Song.SongBuilder()
                .setArtist("Blur")
                .setTitle("Song2")
                .setLength(182)
                .build();

        System.out.println("Piosenka " + piosenka1.getTitle()
                + " by " + piosenka1.getArtist()
                + " of length " + piosenka1.getLength()
                + ". \n");

        Hitsong hicior = Hitsong.from(piosenka1);

        System.out.println("Hicior " + hicior.getTitle()
                + " by " + hicior.getArtist()
                + ". \n");

        Logger.getInstance().logToConsole();
        Logger.getInstance().logToConsole();
        Logger.getInstance().logToConsole();
    }
}