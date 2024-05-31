package fr.fipcnam;

import fr.fipcnam.components.SimpleWindow;
import fr.fipcnam.components.WindowComponent;
import fr.fipcnam.decorators.DarkThemeDecorator;
import fr.fipcnam.decorators.FontDecorator;

import javax.swing.*;
import java.awt.*;

public class Main {

    private static DarkThemeDecorator darkThemeDecorator;
    private static FontDecorator fontDecorator;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SimpleWindow window = new SimpleWindow();
            window.render();

            JToggleButton darkThemeButton = new JToggleButton("Thème Sombre");
            JToggleButton fontButton = new JToggleButton("Changer la Police");

            darkThemeButton.addActionListener(_ -> {
                if (darkThemeButton.isSelected()) {
                    darkThemeDecorator = new DarkThemeDecorator(window);
                    darkThemeDecorator.render();
                } else {
                    if (darkThemeDecorator != null) {
                        darkThemeDecorator.reset();
                        darkThemeDecorator = null;
                    }
                }
            });

            fontButton.addActionListener(_ -> {
                if (fontButton.isSelected()) {
                    fontDecorator = new FontDecorator(window);
                    fontDecorator.render();
                } else {
                    if (fontDecorator != null) {
                        fontDecorator.reset();
                        fontDecorator = null;
                    }
                }
            });

            JPanel panel = new JPanel();
            panel.add(darkThemeButton);
            panel.add(fontButton);
            window.add(panel, BorderLayout.SOUTH);
        });
    }
}
