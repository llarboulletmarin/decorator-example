package fr.fipcnam.decorators;

import fr.fipcnam.components.WindowComponent;

import javax.swing.*;

public abstract class WindowDecorator extends JFrame implements WindowComponent {

    public WindowComponent decoratedWindow;

    public WindowDecorator(WindowComponent decoratedWindow) {
        this.decoratedWindow = decoratedWindow;
    }

    @Override
    public void render() {
        decoratedWindow.render();
    }

    @Override
    public void reset() {
        decoratedWindow.reset();
    }
}
