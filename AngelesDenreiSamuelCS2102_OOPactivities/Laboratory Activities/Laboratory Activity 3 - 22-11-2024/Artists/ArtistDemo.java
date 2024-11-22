package Artists;

public class ArtistDemo {
    public static void main(String[] args) {
        Artist artist = new Artist("Lee Hyein", "Korean", 16, "Music");
        artist.displayInfo();

        System.out.println();

        Artist singer = new Singer("Hanni Pham", "Vietnamese-Australian", 20, "Music", Genre.POP);
        singer.displayInfo();

        System.out.println();

        Artist painter = new Painter("Danielle Marsh", "Korean-Australian", 19, "Music", Medium.OIL);
        painter.displayInfo();

        System.out.println();

        Artist dancer = new Dancer("Kang Haerin", "Korean", 18, "Music", DanceStyle.HIPHOP);
        dancer.displayInfo();

        System.out.println();

        Artist writer = new Writer("Kim Minji", "Korean", 20, "Music", WritingStyle.DRAMA);
        writer.displayInfo();
    }
}
