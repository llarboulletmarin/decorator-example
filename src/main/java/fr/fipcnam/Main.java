package fr.fipcnam;

import fr.fipcnam.components.SimpleWindow;
import fr.fipcnam.ui.DarkThemeButton;
import fr.fipcnam.ui.FontButton;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SimpleWindow window = new SimpleWindow();
            window.render();

            DarkThemeButton darkThemeButton = new DarkThemeButton(window);
            FontButton fontButton = new FontButton(window);

            JPanel panel = new JPanel();
            panel.add(darkThemeButton);
            panel.add(fontButton);
            window.add(panel, BorderLayout.SOUTH);
        });
    }
}