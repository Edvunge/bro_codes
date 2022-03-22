package aulas;

import javax.swing.*;

public class Aula05GuiIntro {
    public static void main(String[] args) {

        // GUI - graphical user interface
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showInputDialog(null, "Hello "+name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, " you are"+age+" years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showMessageDialog(null, "you are "+height+" cm tall");

    }
}
