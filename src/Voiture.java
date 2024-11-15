public class Voiture extends VehiculeAvecMoteur {
    private Modele modele;
    private String couleur;
    private int nombrePortes;
    


    // Constructeur avec tous les paramètres requis
    public Voiture(Marque marque, String numImmat, int vitesseActuelle, Modele modele, String couleur, int nombrePortes) {
        super(marque, numImmat, vitesseActuelle); // Appelle le constructeur de Vehicule
        this.modele = modele;
        this.couleur = couleur;
        this.nombrePortes = nombrePortes;
    }

    // Constructeur avec valeurs par défaut pour vitesseActuelle et nombrePortes
    public Voiture(Marque marque, String numImmat, Modele modele, String couleur) {
        super(marque, numImmat); // Appelle le constructeur de Vehicule avec vitesseActuelle = 0
        this.modele = modele;
        this.couleur = couleur;
        this.nombrePortes = 3; // Valeur par défaut
    }

    
    public Voiture(Marque marque, String numImmat, int vitesseActuelle, Modele modele) {
        super(marque, numImmat, vitesseActuelle); // Appelle le constructeur de Vehicule
        this.modele = modele;
        this.couleur = "Blanche";
        this.nombrePortes = 3;
    }

    // Constructeur sans paramètres
    public Voiture() {
        super(Marque.Renault, "XXX-000-XXX"); // Valeurs par défaut pour marque et numImmat
        this.modele = Modele.BERLINE;
        this.couleur = "Blanche";
        this.nombrePortes = 3;
    }

    @Override
    public String toString() {
        return "Voiture = " + getMarque() + " / " + getNumImmat() + " / vitesseMax = " + getVitesseMax() + " / vitesse = " + getVitesseActuelle() +
               " modele : " + modele + " " + couleur + " avec " + nombrePortes + " portes" + " volumeReservoir : " + getVolumeReservoir();
    }
}
