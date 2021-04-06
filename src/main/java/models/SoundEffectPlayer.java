package models;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class SoundEffectPlayer {
    Clip clip;
    public void setFile(String name) {
        File file = new File(name);
        try {
            AudioInputStream sound = AudioSystem.getAudioInputStream(file);
            clip = AudioSystem.getClip();
            clip.open(sound);
        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }
    }
    public void play() {
        clip.setFramePosition(0);
        clip.start();
    }
}
