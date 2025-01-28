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
    public String donnerAuteur() {
        return "romain";
    }

    @Override
    public void frapper(Personnage adversaire) {
        System.out.println("Le romain " + getNom() + " frappe " + adversaire.donnerAuteur() + " " + adversaire.getNom());
        adversaire.recevoirCoup(force);
    }

    @Override
    public void recevoirCoup(int forceCoup) {
        force -= forceCoup;
        if (force > 0) {
            System.out.println("Le soldat " + getNom() + " : « Aïe ! »");
        } else {
            System.out.println("Le soldat " + getNom() + " : « J’abandonne... »");
        }
    }

    @Override
    public void parler(String texte) {
        System.out.println("Le soldat " + getNom() + " : « " + texte + " »");
    }
}
