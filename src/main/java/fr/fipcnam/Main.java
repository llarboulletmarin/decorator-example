package fr.fipcnam;

import fr.fipcnam.components.SimpleWindow;
import fr.fipcnam.components.WindowComponent;
import fr.fipcnam.decorators.DarkThemeDecorator;
import fr.fipcnam.decorators.FontDecorator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SimpleWindow window = new SimpleWindow();
            window.render();

            JButton darkThemeButton = new JButton("Thème Sombre");
            JButton fontButton = new JButton("Changer la Police");

            darkThemeButton.addActionListener(new ActionListener() {
                boolean isDarkTheme = false;
                WindowComponent decoratedWindow = window;
                @Override
                public void actionPerformed(ActionEvent e) {
                    isDarkTheme = !isDarkTheme;
                    if (isDarkTheme) {
                        decoratedWindow = new DarkThemeDecorator(decoratedWindow);
                    } else {
                        decoratedWindow = window;
                    }
                    decoratedWindow.render();
                }
            });

            fontButton.addActionListener(new ActionListener() {
                boolean isFontChanged = false;
                WindowComponent decoratedWindow = window;
                @Override
                public void actionPerformed(ActionEvent e) {
                    isFontChanged = !isFontChanged;
                    if (isFontChanged) {
                        decoratedWindow = new FontDecorator(decoratedWindow);
                    } else {
                        decoratedWindow = window;
                    }
                    decoratedWindow.render();
                }
            });

            JPanel panel = new JPanel();
            panel.add(darkThemeButton);
            panel.add(fontButton);
            window.add(panel, BorderLayout.SOUTH);
        });
    }
}