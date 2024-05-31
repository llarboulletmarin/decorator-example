package fr.fipcnam;

import fr.fipcnam.components.SimpleWindow;
import fr.fipcnam.ui.DarkThemeButton;
import fr.fipcnam.ui.FontButton;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        // Exécution de la création de la fenêtre dans le thread de l'interface graphique.
        SwingUtilities.invokeLater(() -> {
            // Création d'une fenêtre simple.
            SimpleWindow window = new SimpleWindow();
            window.render();

            // Création de boutons pour activer/désactiver le thème sombre et le changement de police, et liaison à la fenêtre créée.
            DarkThemeButton darkThemeButton = new DarkThemeButton(window);
            FontButton fontButton = new FontButton(window);

            // Création d'un panneau pour contenir les boutons et ajout à la fenêtre dans la région SOUTH pour affichage.
            JPanel panel = new JPanel();
            panel.add(darkThemeButton);
            panel.add(fontButton);
            window.add(panel, BorderLayout.SOUTH);
        });
    }
}
