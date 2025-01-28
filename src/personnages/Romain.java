package personnages;

import java.util.ArrayList;
import java.util.List;

public class Romain extends Personnage {
    private List<String> equipements;

    public Romain(String nom, int force) {
        super(nom, force);
        equipements = new ArrayList<>();
    }

    public void equiper(String equipement) {
        if (equipements.contains(equipement)) {
            System.out.println("Le soldat " + getNom() + " a déjà un " + equipement + ".");
        } else {
            equipements.add(equipement);
            System.out.println("Le soldat " + getNom() + " s'équipe avec un " + equipement + ".");
        }
    }

    @Override
    public void recevoirCoup(int forceCoup) {
        int forceReduite = forceCoup;

        // Réduction de la force en fonction des équipements
        if (equipements.contains("bouclier")) {
            System.out.println("Le bouclier absorbe 3 du coup");
            forceReduite -= 3;
        }
        if (equipements.contains("casque")) {
            System.out.println("Le casque absorbe 2 du coup");
            forceReduite -= 2;
        }
        if (equipements.contains("plastron")) {
            System.out.println("Le plastron absorbe 3 du coup");
            forceReduite -= 3;
        }

        // La force ne peut pas être négative
        forceReduite = Math.max(forceReduite, 0);
        force -= forceReduite;

        // Résultat après le coup
        if (force > 0) {
            System.out.println("Le soldat " + getNom() + " : « Aïe ».");
        } else {
            System.out.println("Le soldat " + getNom() + " : « J’abandonne... ».");
        }
    }

    @Override
    public void parler(String texte) {
        System.out.println("Le soldat " + getNom() + " : « " + texte + " ».");
    }

    @Override
    public String donnerAuteur() {
        return "romain";
    }

    @Override
    public void frapper(Personnage adversaire) {
        int forceReelle = getForce();
        System.out.println("Le soldat " + getNom() + " frappe avec force " + forceReelle);
        adversaire.recevoirCoup(forceReelle);
    }
}
