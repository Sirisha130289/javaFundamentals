package be.intecbrussel.TestAudioPlayer;

public class AudioPlayer implements MediaPlayer {

    private MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        mediaAdapter = new MediaAdapter(audioType);
        mediaAdapter.play(audioType, fileName);
    }
}
