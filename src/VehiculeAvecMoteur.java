public class VehiculeAvecMoteur extends Vehicule implements Motorisable {
    private int puissance;
    private int carburant;
    private int volumeReservoir;

    public VehiculeAvecMoteur(Marque marque, String numImmat, int vitesseActuelle) {
        super(marque, numImmat, vitesseActuelle);
        this.vitesseMax = 100; // Initialisation par défaut
        this.puissance = 0; // Initialisation par défaut
        this.carburant = 0; // Initialisation par défaut
        this.volumeReservoir = 0; // Initialisation par défaut
    }

    public VehiculeAvecMoteur(Marque marque, String numImmat) {
        super(marque, numImmat);
        this.vitesseMax = 100;
        this.puissance = 0;
        this.carburant = 0;
        this.volumeReservoir = 0;
    }

    

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }

    public void setVolumeReservoir(int volumeReservoir) {
        this.volumeReservoir = volumeReservoir;
    }

    public int getPuissance() {
        return puissance;
    }

    public int getCarburant() {
        return carburant;
    }

    public int getVolumeReservoir() {
        return volumeReservoir;
    }

    @Override
    public void faireLePlein(int litres) {
        if (carburant + litres <= volumeReservoir) {
            carburant += litres;
        } else {
            System.out.println("Erreur: Le réservoir est plein.");
        }
    }
}
