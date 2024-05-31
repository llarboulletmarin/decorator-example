package fr.fipcnam.ui;

import fr.fipcnam.components.SimpleWindow;
import fr.fipcnam.decorators.FontDecorator;

import javax.swing.*;

/**
 * Bouton permettant de basculer le changement de police pour une fenêtre.
 */
public class FontButton extends JToggleButton {

    private static final String FONT_BUTTON_TEXT = "Changer la Police";
    private static FontDecorator fontDecorator;

    /**
     * Constructeur du bouton de changement de police.
     * @param window La fenêtre à laquelle appliquer le changement de police.
     */
    public FontButton(SimpleWindow window) {
        super(FONT_BUTTON_TEXT);

        this.addActionListener(_ -> {
            if (this.isSelected()) {
                fontDecorator = new FontDecorator(window);
                fontDecorator.render();
            } else {
                if (fontDecorator != null) {
                    fontDecorator.reset();
                    fontDecorator = null;
                }
            }
        });
    }
}
