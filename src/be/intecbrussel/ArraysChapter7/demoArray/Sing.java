package be.intecbrussel.ArraysChapter7.demoArray;

public class Sing {
    private String title;
    private String artist;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void play(){
        System.out.println(this.title+" is being sung by " + this.artist);
    }
}
