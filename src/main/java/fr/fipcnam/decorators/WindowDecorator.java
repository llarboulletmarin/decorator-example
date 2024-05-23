package fr.fipcnam.decorators;

import fr.fipcnam.components.WindowComponent;

import javax.swing.*;

public abstract class WindowDecorator extends JFrame implements WindowComponent {

    protected WindowComponent decoratedWindow;

    public WindowDecorator(WindowComponent decoratedWindow) {
        this.decoratedWindow = decoratedWindow;
    }

    public void render() {
        decoratedWindow.render();
    }

}
