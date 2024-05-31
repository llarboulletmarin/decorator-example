package fr.fipcnam.components;

/**
 * Interface représentant un composant de fenêtre.
 */
public interface WindowComponent {

    /**
     * Méthode pour afficher le composant de la fenêtre.
     */
    void render();

    /**
     * Méthode pour réinitialiser le composant de la fenêtre.
     * Cette méthode rétablit les paramètres par défaut du composant.
     */
    void reset();

}