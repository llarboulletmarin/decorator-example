package fr.fipcnam.decorators;

import fr.fipcnam.components.SimpleWindow;
import fr.fipcnam.components.WindowComponent;

import java.awt.*;

public class FontDecorator extends WindowDecorator {

    public FontDecorator(WindowComponent decoratedWindow) {
        super(decoratedWindow);
        applyFont();
    }

    private void applyFont() {
        ((SimpleWindow) decoratedWindow).getLabel().setFont(new Font("Serif", Font.BOLD, 11));
        ((SimpleWindow) decoratedWindow).getLabel().setText(((SimpleWindow) decoratedWindow).getLabel().getText() + " (Changement de Police) ");
    }

}