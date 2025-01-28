package personnages;

public class Gaulois extends Personnage {
    private double puissanceBoost = 1; // Par défaut, pas de boost

    public Gaulois(String nom, int force) {
        super(nom, force);
    }

    @Override
    protected String donnerAuteur() {
        return "gaulois";
    }

    public void boost(int puissancePotion) {
        puissanceBoost = puissancePotion;
    }

    @Override

    public void frapper(Personnage adversaire) {
        int forceReelle = (int) (force * puissanceBoost);
        System.out.println("Le " + donnerAuteur() + " " + getNom() + " donne un grand coup de force " + forceReelle + " au " + adversaire.donnerAuteur() + " " + adversaire.getNom());
        adversaire.recevoirCoup(forceReelle);

        // Réduire la puissance du boost
        if (puissanceBoost > 1) {
            puissanceBoost = Math.max(1, puissanceBoost - 0.5);
        }
    }

}
