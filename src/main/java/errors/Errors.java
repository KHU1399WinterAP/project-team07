package errors;

import javax.swing.*;

public class Errors {
    public static void emptyFields(){
        JOptionPane.showMessageDialog(null, "Please complete all fields!", "WARNING", JOptionPane.WARNING_MESSAGE);
    }
    public static void incorrectInfo(){
        JOptionPane.showMessageDialog(null, "Incorrect username or password!", "WARNING", JOptionPane.WARNING_MESSAGE);
    }
    public static void invalidInfo(){
        JOptionPane.showMessageDialog(null, "Please try another username!", "WARNING", JOptionPane.WARNING_MESSAGE);
    }
    public static void nullTheme(){
        JOptionPane.showMessageDialog(null, "Please choose a theme from settings !", "WARNING", JOptionPane.WARNING_MESSAGE);
    }
}
