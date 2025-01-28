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

    public int getForce() {
        return force;
    }

    // Méthode abstraite
    public abstract String donnerAuteur();

   

    public abstract void recevoirCoup(int forceCoup);

    public abstract void parler(String texte);
    public abstract void frapper(Personnage adversaire);
}
