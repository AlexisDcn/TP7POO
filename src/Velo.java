public class Velo extends Vehicule{
    private typeCadre cadre;
    public Velo(Marque marque, String numImmat, int vitesseActuelle) {
        super(marque, numImmat, vitesseActuelle);
        this.vitesseMax = 25;
    }

    public Velo(Marque marque, String numImmat) {
        super(marque, numImmat);
        this.vitesseActuelle = 0;
        this.vitesseMax = 25;
        this.cadre = typeCadre.HOMME;
    }

    public Velo(Marque marque, String numImmat, typeCadre cadre) {
        super(marque, numImmat);
        this.vitesseActuelle = 0;
        this.vitesseMax = 25;
        this.cadre = cadre;
    }
    public typeCadre getCadre() {
        return cadre;
    }


    @Override
    public String toString() {
        return "Velo [marque=" + getMarque() + ", numImmat=" + getNumImmat() + ", vitesseMax=" + getVitesseMax()
                + ", vitesseActuelle=" + getVitesseActuelle() + ", type de cadre=" + getCadre() + "]";
    }

    
}
