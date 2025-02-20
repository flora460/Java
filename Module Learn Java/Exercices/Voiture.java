//Créer une class avec ses getter et setter

public class Voiture {

  // Les variables de la classes
  private String marque;
  private int annee;
  private int kilometrage;

  // Le constructeur de la classe
  public Voiture(String marque, int annee, int kilometrage) {
    this.marque = marque;
    this.annee = annee;
    this.kilometrage = kilometrage;

  }

  // Les getters de la classe
  public String getMarque() {
    return this.marque;
  }

  public int getAnnee() {
    return this.annee;
  }

  public int getKilometrage() {
    return this.kilometrage;
  }

  // Les setters de la classe
  public void setMarque(String newMarque) {
    this.marque = newMarque;
  }

  public void setAnnee(int newAnnee) {
    this.annee = newAnnee;
  }

  public void setKilometrage(int newKilometrage) {
    this.kilometrage = newKilometrage;
  }

  // La méthode pour afficher toutres les infos d'une voiture
  public void afficherInfos() {
    System.out.println("La voiture est de la marque : " + this.marque);
    System.out.println("La voiture est de l'annee : " + this.annee);
    System.out.println("Le kilométrage de la voiture est de : " + this.kilometrage);
  }

  public static void main(String[] agrs) {

    Voiture Bmw = new Voiture("bmw", 1990, 1000000);
    Bmw.afficherInfos();

  }
}