public class Vehicule {
    private final Marque marque;
    private final String numImmat;
    protected int vitesseMax = 100;
    private int vitesseActuelle;

    public Vehicule(Marque marque, String numImmat) {
        this.marque = marque;
        this.numImmat = numImmat;
        this.vitesseActuelle = 0;
    }

    public Vehicule(Marque marque, String numImmat, int vitesseActuelle) {
        this.marque = marque;
        this.numImmat = numImmat;
        this.vitesseActuelle = vitesseActuelle;
    }

    public void accelerer(int n) {
        if (vitesseActuelle + n < vitesseMax) {
            vitesseActuelle += n;
        } else if (vitesseActuelle >= vitesseMax) {

        } else {
            vitesseActuelle = vitesseMax;
        }
    }

    public void freiner(int n) {
        if (vitesseActuelle - n > 0) {
            vitesseActuelle -= n;
        } else {
            vitesseActuelle = 0;
        }
    }

    public Marque getMarque() {
        return marque;
    }

    public String getNumImmat() {
        return numImmat;
    }

    public int getVitesseActuelle() {
        return vitesseActuelle;
    }

    public int getVitesseMax() {
        return vitesseMax;
    }

    public int setVitesseActuelle(int vitesseActuelle) {
        return this.vitesseActuelle = vitesseActuelle;
    }

    @Override
    public String toString() {
        return "Vehicule [marque=" + marque + ", numImmat=" + numImmat + ", vitesseMax=" + vitesseMax
                + ", vitesseActuelle=" + vitesseActuelle + "]";
    }

}
