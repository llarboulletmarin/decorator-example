package fr.fipcnam.ui;

import fr.fipcnam.components.SimpleWindow;
import fr.fipcnam.decorators.DarkThemeDecorator;

import javax.swing.*;

/**
 * Bouton permettant de basculer le thème sombre pour une fenêtre.
 */
public class DarkThemeButton extends JToggleButton {

    private static final String DARK_THEME_BUTTON_TEXT = "Thème Sombre";
    private static DarkThemeDecorator darkThemeDecorator;

    /**
     * Constructeur du bouton de thème sombre.
     * @param window La fenêtre à laquelle appliquer le thème sombre.
     */
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