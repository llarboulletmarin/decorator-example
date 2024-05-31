package fr.fipcnam.decorators;

import fr.fipcnam.components.SimpleWindow;
import fr.fipcnam.components.WindowComponent;

import java.awt.*;

/**
 * Décorateur de fenêtre modifiant la police du texte.
 */
public class FontDecorator extends WindowDecorator {

    /**
     * Constructeur prenant le composant de fenêtre à décorer.
     * @param decoratedWindow Le composant de fenêtre à décorer.
     */
    public FontDecorator(WindowComponent decoratedWindow) {
        super(decoratedWindow);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void render() {
        super.render();
        ((SimpleWindow) decoratedWindow).getLabel().setFont(new Font("Serif", Font.BOLD, 25));
        ((SimpleWindow) decoratedWindow).getLabel().setText(((SimpleWindow) decoratedWindow).getLabel().getText() + " (Changement de Police) ");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void reset() {
        super.reset();
        ((SimpleWindow) decoratedWindow).getLabel().setFont(new Font("Serif", Font.PLAIN, 15));
        ((SimpleWindow) decoratedWindow).getLabel().setText(((SimpleWindow) decoratedWindow).getLabel().getText().replace(" (Changement de Police) ", ""));
    }

}