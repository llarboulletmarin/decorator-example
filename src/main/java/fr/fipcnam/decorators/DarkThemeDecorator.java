package fr.fipcnam.decorators;

import fr.fipcnam.components.SimpleWindow;
import fr.fipcnam.components.WindowComponent;
import java.awt.*;


/**
 * Décorateur de fenêtre appliquant un thème sombre.
 */
public class DarkThemeDecorator extends WindowDecorator {

    /**
     * Constructeur prenant le composant de fenêtre à décorer.
     * @param decoratedWindow Le composant de fenêtre à décorer.
     */
    public DarkThemeDecorator(WindowComponent decoratedWindow) {
        super(decoratedWindow);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void render() {
        super.render();
        ((SimpleWindow) decoratedWindow).getLabel().setForeground(Color.WHITE);
        ((SimpleWindow) decoratedWindow).getLabel().setBackground(Color.BLACK);
        ((SimpleWindow) decoratedWindow).getLabel().setText(((SimpleWindow) decoratedWindow).getLabel().getText() + " (Thème Sombre) ");
        ((SimpleWindow) decoratedWindow).getLabel().setOpaque(true);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void reset() {
        super.reset();
        ((SimpleWindow) decoratedWindow).getLabel().setForeground(null);
        ((SimpleWindow) decoratedWindow).getLabel().setBackground(null);
        ((SimpleWindow) decoratedWindow).getLabel().setOpaque(false);
        ((SimpleWindow) decoratedWindow).getLabel().setText(((SimpleWindow) decoratedWindow).getLabel().getText().replace(" (Thème Sombre) ", ""));
    }
}
