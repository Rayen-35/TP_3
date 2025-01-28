package personnages;

import java.util.Random;

public class Druide extends Gaulois {
    public Druide(String nom, int force) {
        super(nom, force);
    }

    public void fabriquerPotion() {
        Random random = new Random();
        int doses = random.nextInt(5) + 1; // Entre 1 et 5 doses
        int forcePotion = random.nextInt(5) + 2; // Entre 2 et 6

        parler("J'ai concocté " + doses + " doses de potion magique. Elle a une force de " + forcePotion + ".");
    }
}