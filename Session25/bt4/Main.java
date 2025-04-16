package Session25.bt4;

public class Main {
    public static void main(String[] args) {
        MediaPlayer player = new AudioPlayer();

        player.play("mp3", "Tháp_drill_tự_do.mp3");
        player.play("mp3", "Hẹn_Em_Dưới_Ánh_Trắng.mp3");
        player.play("mp4", "video_clipXXXX.mp4");
        player.play("vlc", "video.vlc");
        player.play("avi", "unknown.avi");
    }
}
