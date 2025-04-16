package Session25.bt4;

public class AudioPlayer implements MediaPlayer {

    private AdvancedMediaPlayer advancedMediaPlayer = new AdvancedMediaPlayer();

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer.playMp4(fileName);
        } else {
            System.out.println("Định dạng không được hỗ trợ: " + audioType);
        }
    }
}
