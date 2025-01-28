package test_fonctionnel;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {
    public static void main(String[] args) {
        // Création des personnages
        Gaulois asterix = new Gaulois("Astérix", 9);
        Romain minus = new Romain("Minus", 6);
        Druide panoramix = new Druide("Panoramix", 5);

        // Test des dialogues
        asterix.parler("Bonjour à tous");
        minus.parler("UN GAU... UN GAUGAU...");

        // Fabrication de potion magique
        panoramix.fabriquerPotion();

        // Combats
        asterix.frapper(minus);
        minus.frapper(asterix);

        asterix.frapper(minus);
        minus.frapper(asterix);

        asterix.frapper(minus);
    }
}