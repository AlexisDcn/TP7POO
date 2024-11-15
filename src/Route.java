import java.util.ArrayList;
import java.util.List;

public class Route {
    private List<Vehicule> vehicules;
    private int capaciteMax;
    private int vitesseMax;

    public Route(int capaciteMax, int vitesseMax) {
        this.capaciteMax = capaciteMax;
        this.vitesseMax = vitesseMax;
        this.vehicules = new ArrayList<>();
    }

    public List<Vehicule> getVehicules() {
        return vehicules;
    }

    public int getVitesseMax() {
        return vitesseMax;
    }

    public boolean entrer(Vehicule vehicule) {
        if (vehicules.size() < capaciteMax) {
            vehicules.add(vehicule);
            return true;
        }
        return false;
    }

    public List<String> controleRadar() {
        List<String> enExces = new ArrayList<>();
        for (Vehicule v : vehicules) {
            if (v.getVitesseActuelle() > vitesseMax) {
                enExces.add(v.getNumImmat());
                System.out.println(v.getNumImmat());
            }
        }
        return enExces;
    }

    public void ralentirCamion() {
        for (Vehicule v : vehicules) {
            if (v instanceof Camion) {
                v.setVitesseActuelle(v.getVitesseActuelle() - 10);
            }
        }
    }

    @Override
    public String toString() {
        return "contenu de la route :"+"\n"+"Route [vehicules = " + vehicules + "]";
    }

    

     
    
}
