package fr.fipcnam.decorators;

import fr.fipcnam.components.WindowComponent;

import javax.swing.*;

/**
 * Classe abstraite représentant un décorateur de fenêtre.
 */
public abstract class WindowDecorator extends JFrame implements WindowComponent {

    public WindowComponent decoratedWindow;

    /**
     * Constructeur prenant le composant de fenêtre à décorer.
     * @param decoratedWindow Le composant de fenêtre à décorer.
     */
    public WindowDecorator(WindowComponent decoratedWindow) {
        this.decoratedWindow = decoratedWindow;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void render() {
        decoratedWindow.render();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void reset() {
        decoratedWindow.reset();
    }
}
