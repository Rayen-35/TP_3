package personnages;

public class Gaulois extends Personnage {
    private double puissanceBoost = 1; // Par défaut, pas de boost

    public Gaulois(String nom, int force) {
        super(nom, force);
    }

    @Override
    public String donnerAuteur() {
        return "gaulois";
    }

    public void boost(int puissancePotion) {
        puissanceBoost = puissancePotion;
    }

    @Override
    public void frapper(Personnage adversaire) {
        int forceReelle = (int) (force * puissanceBoost);
        System.out.println("Le gaulois " + getNom() + " donne un grand coup de force " + forceReelle + " au " + adversaire.donnerAuteur() + " " + adversaire.getNom());
        adversaire.recevoirCoup(forceReelle);

        // Réduire la puissance du boost
        if (puissanceBoost > 1) {
            puissanceBoost = Math.max(1, puissanceBoost - 0.5);
        }
    }

    @Override
    public void recevoirCoup(int forceCoup) {
        force -= forceCoup;
        if (force > 0) {
            System.out.println("Le gaulois " + getNom() + " : « Aïe ! »");
        } else {
            System.out.println("Le gaulois " + getNom() + " : « J’abandonne... »");
        }
    }

    @Override
    public void parler(String texte) {
        System.out.println("Le gaulois " + getNom() + " : « " + texte + " »");
    }
}
