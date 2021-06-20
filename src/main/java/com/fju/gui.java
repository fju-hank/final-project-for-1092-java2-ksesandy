package com.fju;
import javax.swing.*;
import java.awt.*;

public class gui {

    private JPanel panel1;
    private JButton button2;
    private JButton button3;
    private JButton colaButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame("haha");
        frame.getContentPane().add(new gui().panel1);
        frame.setSize(400, 800);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);



    }
}
