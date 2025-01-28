package test_fonctionnel;

import personnages.*;

public class TestGaulois {

    public static void main(String[] args) {
        // Créer un Gaulois Astérix et un Romain Minus
        Gaulois asterix = new Gaulois("Astérix", 10);
        Romain minus = new Romain("Minus", 12);

        // Equipement de Minus
        minus.equiper("bouclier");
        minus.equiper("casque");
        minus.equiper("plastron");

        // Potion magique de Panoramix
        System.out.println("Le gaulois Panoramix : « J'ai concocté 3 doses de potion magique. Elle a une force de 3. ».");
        asterix.boost(3);  // Astérix utilise la potion magique

        // Discussion entre les personnages
        asterix.parler("Bonjour à tous");

        minus.parler("UN GAU... UN GAUGAU...");

        // Astérix donne un coup à Minus
        asterix.frapper(minus);
    }
}
