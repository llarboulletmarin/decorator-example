package fr.fipcnam.decorators;

import fr.fipcnam.components.SimpleWindow;
import fr.fipcnam.components.WindowComponent;
import java.awt.*;

public class DarkThemeDecorator extends WindowDecorator {

    public DarkThemeDecorator(WindowComponent decoratedWindow) {
        super(decoratedWindow);
    }

    public void render() {
        super.render();
        ((SimpleWindow) decoratedWindow).getLabel().setForeground(Color.WHITE);
        ((SimpleWindow) decoratedWindow).getLabel().setBackground(Color.BLACK);
        ((SimpleWindow) decoratedWindow).getLabel().setText(((SimpleWindow) decoratedWindow).getLabel().getText() + " (Thème Sombre) ");
        ((SimpleWindow) decoratedWindow).getLabel().setOpaque(true);
    }

    public void reset() {
        super.reset();
        ((SimpleWindow) decoratedWindow).getLabel().setForeground(null);
        ((SimpleWindow) decoratedWindow).getLabel().setBackground(null);
        ((SimpleWindow) decoratedWindow).getLabel().setOpaque(false);
        ((SimpleWindow) decoratedWindow).getLabel().setText(((SimpleWindow) decoratedWindow).getLabel().getText().replace(" (Thème Sombre) ", ""));
    }
}
