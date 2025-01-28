package personnages;

public class Romain extends Personnage {

    public Romain(String nom, int force) {
        super(nom, force);
    }

    @Override
    protected String donnerAuteur() {
        return "romain";
    }

    @Override

    public void recevoirCoup(int forceCoup) {
        force -= forceCoup;
        if (force > 0) {
            System.out.println("Le romain " + getNom() + " : « Aïe ».");
        } else {
            System.out.println("Le romain " + getNom() + " : « J’abandonne... ».");
        }
    }

}
