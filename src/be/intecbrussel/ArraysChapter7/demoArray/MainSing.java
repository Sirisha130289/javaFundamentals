package be.intecbrussel.ArraysChapter7.demoArray;

public class MainSing {
    public static void main(String[] args) {
        Sing sing = new Sing();
        sing.setArtist("Thaman");
        sing.setTitle("ALA");

        sing.play();

        Sing sing1 = new Sing();
        sing1.setTitle("Roja");
        sing1.setArtist("Rahman");

        sing1.play();
    }
}
