public class Camion extends VehiculeAvecMoteur{

    private int pdcMax;
    private int pdcActuelle;

    public Camion(Marque marque, String numImmat, int vitesseActuelle, int pdcMax) {
        super(marque, numImmat);
        this.pdcActuelle = 0;
        this.pdcMax = pdcMax;
    }

    public Camion(Marque marque, String numImmat, int vitesseActuelle, int pdcMax, int pdcActuelle) {
        super(marque, numImmat, vitesseActuelle);
        this.pdcActuelle = pdcActuelle;
        this.pdcMax = pdcMax;
    }

    public void charger(int poids) {
        if (pdcActuelle + poids <= pdcMax) {
            pdcActuelle += poids;
        } else {
            System.out.println("Erreur: Le poids de chargement dépasse la capacité maximale.");
        }
    }

    public void decharger(int poids) {
        if (pdcActuelle - poids >= 0) {
            pdcActuelle -= poids;
        } else {
            System.out.println("Erreur: Le poids de déchargement dépasse le poids actuel.");
        }
    }

    @Override
    public String toString() {
        return "Camion = " + getMarque() + " / " + getNumImmat() + " / vitesseMax = " + getVitesseMax() + 
               " / vitesse = " + getVitesseActuelle() + " poidsChargementMax : " + pdcMax + " kg / poidsChargement " + pdcActuelle + " kg";
    }

}
