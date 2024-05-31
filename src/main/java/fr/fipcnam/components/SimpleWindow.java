package fr.fipcnam.components;

import javax.swing.*;
import java.awt.*;

public class SimpleWindow extends JFrame implements WindowComponent {

    private final JLabel label;

    public SimpleWindow() {
        label = new JLabel("Fenêtre Simple", SwingConstants.CENTER);
    }

    @Override
    public void render() {
        setTitle("decorator-example");
        setSize(1000, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(label, BorderLayout.CENTER);
        label.setFont(new Font("Serif", Font.PLAIN, 15));
        setVisible(true);
    }

    @Override
    public void reset() {
    }

    public JLabel getLabel() {
        return label;
    }
}
