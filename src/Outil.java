public class Outil implements Motorisable {
    private int puissance;
    private int volumeReservoir = 0;
    private int volumeMaxReservoir = 5;

    public Outil(int volumeMaxReservoir){
        this.volumeReservoir = 0;
        this.volumeMaxReservoir = volumeMaxReservoir;
    }
    public void faireLePlein(int litres) {
        if (volumeReservoir + litres <= volumeMaxReservoir) {
            volumeReservoir += litres;
        } else {
            System.out.println("Erreur: Le réservoir est plein.");
        }
    }
    @Override
    public String toString() {
        return "Outil [volumeReservoir=" + volumeReservoir + ", volumeMaxReservoir=" + volumeMaxReservoir + "]";
    }

    

}
