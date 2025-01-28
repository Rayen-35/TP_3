package personnages;

import java.security.SecureRandom;
import java.util.Random;

public class Druide extends Gaulois {
    private int dosesPotion; // Nombre de doses disponibles
    private Random random;

    public Druide(String nom, int force) {
        super(nom, force);
        try {
            random = SecureRandom.getInstanceStrong();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void fabriquerPotion() {
        dosesPotion = random.nextInt(5) + 1; // Générer entre 1 et 5 doses
        int puissancePotion = random.nextInt(5) + 2; // Générer une puissance entre 2 et 6
        parler("J'ai concocté " + dosesPotion + " doses de potion magique. Elle a une force de " + puissancePotion + ".");
    }

    public void booster(Gaulois gaulois) {
        if (gaulois.getNom().equals("Obélix")) {
            parler("Non, Obélix Non !... Et tu le sais très bien !");
            return;
        }
        if (dosesPotion <= 0) {
            parler("Désolé " + gaulois.getNom() + " il n'y a plus une seule goutte de potion.");
            return;
        }
        dosesPotion--;
        int puissancePotion = random.nextInt(5) + 2; // Puissance aléatoire entre 2 et 6
        gaulois.boost(puissancePotion);
        parler("Tiens " + gaulois.getNom() + " un peu de potion magique.");
    }
}
