package be.intecbrussel.interfaces.demo;

public class Studio {
    public static void main(String[] args) {
        DVDPlayer dvdPlayer = new DVDPlayer();
        CDPlayer cdPlayer = new CDPlayer();
        TapePlayer tapePlayer = new TapePlayer();

        Player player = new DVDPlayer();

        DVDPlayer anotherdvdPlayer = (DVDPlayer) player; // cast and can be converted into dvd player.
    }

}
