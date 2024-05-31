package fr.fipcnam.decorators;

import fr.fipcnam.components.SimpleWindow;
import fr.fipcnam.components.WindowComponent;

import java.awt.*;

public class FontDecorator extends WindowDecorator {

    public FontDecorator(WindowComponent decoratedWindow) {
        super(decoratedWindow);
    }

    public void render() {
        super.render();
        ((SimpleWindow) decoratedWindow).getLabel().setFont(new Font("Serif", Font.BOLD, 25));
        ((SimpleWindow) decoratedWindow).getLabel().setText(((SimpleWindow) decoratedWindow).getLabel().getText() + " (Changement de Police) ");
    }

    public void reset() {
        super.reset();
        ((SimpleWindow) decoratedWindow).getLabel().setFont(new Font("Serif", Font.PLAIN, 15));
        ((SimpleWindow) decoratedWindow).getLabel().setText(((SimpleWindow) decoratedWindow).getLabel().getText().replace(" (Changement de Police) ", ""));
    }

}