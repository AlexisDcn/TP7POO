public class VehiculeAvecMoteur extends Vehicule implements Motorisable {
    private int puissance;
    private int volumeReservoir;
    private int volumeMaxReservoir;

    public VehiculeAvecMoteur(Marque marque, String numImmat, int vitesseActuelle) {
        super(marque, numImmat, vitesseActuelle);
        this.vitesseMax = 100; // Initialisation par défaut
        this.puissance = 0; // Initialisation par défaut
        this.volumeReservoir = 0; // Initialisation par défaut
        this.volumeMaxReservoir = 100; // Initialisation par défaut
    }

    public VehiculeAvecMoteur(Marque marque, String numImmat) {
        super(marque, numImmat);
        this.vitesseMax = 100;
        this.puissance = 0;
        this.volumeReservoir = 0;
        this.volumeMaxReservoir = 100;
    }

    

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }

    public void setVolumeMaxReservoir(int volumeReservoir) {
        this.volumeMaxReservoir = volumeReservoir;
    }

    public int getPuissance() {
        return puissance;
    }

    public int getVolumeReservoir() {
        return volumeReservoir;
    }

    public int getVolumeMaxReservoir() {
        return volumeMaxReservoir;
    }

    @Override
    public void faireLePlein(int litres) {
        if (volumeReservoir + litres <= volumeMaxReservoir) {
            volumeReservoir += litres;
        } else {
            System.out.println("Erreur: Le réservoir est plein.");
        }
    }
}
