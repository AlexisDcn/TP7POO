import java.util.ArrayList;
class Main {
  public static void main(String[] args) {
    Voiture vt1 = new Voiture(Marque.Renault, "123AB81", 190, Modele.BERLINE, "Verte", 5);
    Voiture vt2 = new Voiture(Marque.Citroen, "1642BZ18", 140, Modele.BREAK);
    Outil tronçonneuse = new Outil(5);

    System.out.println(vt1);
    System.out.println(vt2);
    System.out.println(tronçonneuse);

    vt1.faireLePlein(50);
    vt2.faireLePlein(50);
    tronçonneuse.faireLePlein(5);

    System.out.println(vt1);
    System.out.println(vt2);
    System.out.println(tronçonneuse);


  }
}