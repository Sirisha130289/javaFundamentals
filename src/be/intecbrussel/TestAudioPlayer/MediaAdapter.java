package be.intecbrussel.TestAudioPlayer;

public class MediaAdapter implements MediaPlayer {

    private AdvancedMediaPlayer advancedMediaPlayer;
    private String vlcPlayer;
    private String mp4Player;

    MediaAdapter(String audioType) {
        this.vlcPlayer = audioType;
        this.mp4Player = audioType;
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equals(vlcPlayer)) {
            System.out.println(vlcPlayer);
        } else if (audioType.equals(mp4Player)) {
            System.out.println(mp4Player);
        }

    }
}
