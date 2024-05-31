package fr.fipcnam.ui;

import fr.fipcnam.components.SimpleWindow;
import fr.fipcnam.decorators.DarkThemeDecorator;

import javax.swing.*;

public class DarkThemeButton extends JToggleButton {

    private static final String DARK_THEME_BUTTON_TEXT = "Thème Sombre";
    private static DarkThemeDecorator darkThemeDecorator;

    public DarkThemeButton(SimpleWindow window) {
        super(DARK_THEME_BUTTON_TEXT);
        this.addActionListener(_ -> {
            if (this.isSelected()) {
                darkThemeDecorator = new DarkThemeDecorator(window);
                darkThemeDecorator.render();
            } else {
                if (darkThemeDecorator != null) {
                    darkThemeDecorator.reset();
                    darkThemeDecorator = null;
                }
            }
        });
    }
}