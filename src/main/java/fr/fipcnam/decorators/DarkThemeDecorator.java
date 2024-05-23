package fr.fipcnam.decorators;

import fr.fipcnam.components.SimpleWindow;
import fr.fipcnam.components.WindowComponent;

import java.awt.*;

public class DarkThemeDecorator extends WindowDecorator {

    public DarkThemeDecorator(WindowComponent decoratedWindow) {
        super(decoratedWindow);
        applyTheme();
    }

    private void applyTheme() {
        ((SimpleWindow) decoratedWindow).getContentPane().setBackground(Color.BLACK);
        ((SimpleWindow) decoratedWindow).getLabel().setForeground(Color.WHITE);
        ((SimpleWindow) decoratedWindow).getLabel().setText(((SimpleWindow) decoratedWindow).getLabel().getText() + " (Thème Sombre) ");
    }

}
