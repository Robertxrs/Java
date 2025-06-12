package functions;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private String music;

    private List<String> playlist;

    public MusicPlayer() {
        this.playlist = new ArrayList<>();
    }

    public MusicPlayer(String music) {
        this.music = music;
    }

    public void addMusic(String music) {
        playlist.add(music);
    }

    public void playMusic(String music) {
        if (playlist.contains(music)) {
            System.out.println("Tocando a musica: " + music);
        } else {
            System.out.println("A musica nao esta na playlist.");
        }
    }

    public void pauseMusic() {
        System.out.println("Musica pausada. ");
    }

    public void stopMusic() {
        System.out.println("Parando a musica. ");
    }

    public void showPlaylist() {
        System.out.println("Playlist:");
        for (String music : playlist) {
            System.out.println("- " + music);
        }
    }

}
