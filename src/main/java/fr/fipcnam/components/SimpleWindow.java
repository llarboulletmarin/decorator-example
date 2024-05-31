package fr.fipcnam.components;

import javax.swing.*;
import java.awt.*;

/**
 * Implémentation basique de l'interface WindowComponent utilisant JFrame.
 */
public class SimpleWindow extends JFrame implements WindowComponent {

    private final JLabel label;

    /**
     * Constructeur de la fenêtre simple.
     * Initialise le label avec le texte par défaut.
     */
    public SimpleWindow() {
        label = new JLabel("Fenêtre Simple", SwingConstants.CENTER);
        label.setFont(new Font("Serif", Font.PLAIN, 15));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void render() {
        setTitle("decorator-example");
        setSize(1000, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(label, BorderLayout.CENTER);
        setVisible(true);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void reset() {
    }

    /**
     * Renvoie le label de la fenêtre.
     * @return Le label de la fenêtre.
     */
    public JLabel getLabel() {
        return label;
    }
}
