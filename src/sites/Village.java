package sites;

import personnages.Gaulois;

public class Village {
    private Gaulois chef;
    private Gaulois[] villageois;
    private int nbVillageois = 0;

    public Village(Gaulois chef, int capacite) {
        this.chef = chef;
        this.villageois = new Gaulois[capacite];
        chef.parler("Je suis un grand guerrier et je vais créer mon village");
    }

    public Gaulois getChef() {
        return chef;
    }

    public void ajouterVillageois(Gaulois gaulois) {
        if (nbVillageois < villageois.length) {
            villageois[nbVillageois++] = gaulois;
            chef.parler("Bienvenue " + gaulois.getNom() + " !");
        } else {
            chef.parler("Désolé " + gaulois.getNom() + " mon village est déjà bien rempli.");
        }
    }

    public void afficherVillageois() {
        System.out.println("Le village de " + chef.getNom() + " est habité par :");
        for (int i = 0; i < nbVillageois; i++) {
            System.out.println("- " + villageois[i].getNom());
        }
    }

    public void changerChef(Gaulois nouveauChef) {
        chef.parler("Je laisse mon grand bouclier au grand " + nouveauChef.getNom() + ".");
        nouveauChef.parler("Merci !");
        chef = nouveauChef;
    }
}
