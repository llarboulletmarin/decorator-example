package fr.fipcnam.components;

import javax.swing.*;
import java.awt.*;

public class SimpleWindow extends JFrame implements WindowComponent {

    private final JLabel label;

    public SimpleWindow() {
        setTitle("decorator-example");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        label = new JLabel("Fenêtre Simple", SwingConstants.CENTER);
        add(label, BorderLayout.CENTER);
    }

    public void render() {
        setVisible(true);
    }

    public JLabel getLabel() {
        return label;
    }

}