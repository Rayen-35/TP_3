package personnages;

public abstract class Personnage {
    protected String nom;
    protected int force;

    public Personnage(String nom, int force) {
        this.nom = nom;
        this.force = force;
    }

    public String getNom() {
        return nom;
    }

    public void parler(String texte) {
        System.out.println("Le " + donnerAuteur() + " " + getNom() + " : « " + texte + " »");
    }

    public void frapper(Personnage adversaire) {
        System.out.println("Le " + donnerAuteur() + " " + getNom() + " donne un grand coup au " + adversaire.donnerAuteur() + " " + adversaire.getNom());
        adversaire.recevoirCoup(force / 3);
    }

    public void recevoirCoup(int forceCoup) {
        force -= forceCoup;
        if (force <= 0) {
            force = 0;
            parler("J’abandonne...");
        } else {
            parler("Aïe");
        }
    }

    protected abstract String donnerAuteur();
}
