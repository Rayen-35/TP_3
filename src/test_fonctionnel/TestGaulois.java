package test_fonctionnel;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {
	public static void main(String[] args) {
	    // Création des personnages
	    Druide panoramix = new Druide("Panoramix", 5);
	    Gaulois asterix = new Gaulois("Asterix", 5);
	    Gaulois obelix = new Gaulois("Obélix", 15);
	    Romain minus = new Romain("Minus", 6);

	    // Fabrication de la potion magique
	    panoramix.fabriquerPotion();

	    // Tests de boost
	    panoramix.booster(asterix); // Asterix boosté
	    panoramix.booster(obelix); // Obélix refuse
	    panoramix.booster(new Gaulois("Assurancetourix", 4)); // Assurancetourix boosté
	    panoramix.booster(new Gaulois("Abraracourcix", 6)); // Abraracourcix boosté
	    panoramix.booster(new Gaulois("Agecanonix", 3)); // Agecanonix : plus de potion

	    // Début du combat
	    asterix.parler("Bonjour à tous");
	    minus.parler("UN GAU... UN GAUGAU...");

	    // Boucle de combat
	    while (!asterix.estATerre() && !minus.estATerre()) {
	        asterix.frapper(minus);
	        if (!minus.estATerre()) {
	            minus.frapper(asterix);
	        }
	    }
	}

}
