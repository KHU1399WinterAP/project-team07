package errors;

import models.SoundEffectPlayer;

import javax.swing.*;

public class Errors {
    public static void emptyFields() {
        SoundEffectPlayer soundEffectPlayer = new SoundEffectPlayer();
        soundEffectPlayer.setFile(".\\src\\main\\resources\\Sound Effects\\menu\\Error.wav");
        soundEffectPlayer.play();
        JOptionPane.showMessageDialog(null, "Please complete all fields!", "WARNING", JOptionPane.WARNING_MESSAGE);
    }

    public static void incorrectInfo() {
        SoundEffectPlayer soundEffectPlayer = new SoundEffectPlayer();
        soundEffectPlayer.setFile(".\\src\\main\\resources\\Sound Effects\\menu\\Error.wav");
        soundEffectPlayer.play();
        JOptionPane.showMessageDialog(null, "Incorrect username or password!", "WARNING", JOptionPane.WARNING_MESSAGE);
    }

    public static void invalidInfo() {
        SoundEffectPlayer soundEffectPlayer = new SoundEffectPlayer();
        soundEffectPlayer.setFile(".\\src\\main\\resources\\Sound Effects\\menu\\Error.wav");
        soundEffectPlayer.play();
        JOptionPane.showMessageDialog(null, "Please try another username!", "WARNING", JOptionPane.WARNING_MESSAGE);
    }

    public static void nullTheme() {
        SoundEffectPlayer soundEffectPlayer = new SoundEffectPlayer();
        soundEffectPlayer.setFile(".\\src\\main\\resources\\Sound Effects\\menu\\Error.wav");
        soundEffectPlayer.play();
        JOptionPane.showMessageDialog(null, "Please choose a theme from settings !", "WARNING", JOptionPane.WARNING_MESSAGE);
    }
}
