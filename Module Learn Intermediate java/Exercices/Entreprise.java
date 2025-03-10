public class Entreprise {

  String nom;

  public Entreprise(String nom) {
    this.nom = nom;
  }

  public String getName() {
    return nom;
  }

  public void afficherNom() {
    System.out.println("Nom de l'entreprise : " + nom);
  }

  public class Employe {

    String nomEmploye;

    public Employe(String nomEmploye) {
      this.nomEmploye = nomEmploye;
    }

    public String getNomEmploye() {
      return nomEmploye;
    }

    public void afficherDetails() {
      System.out.println(nomEmploye + " travaille chez " + nom);
    }

  }

  public static class Adresse {

    String adresse;
    Employe employe;
    Entreprise entreprise;

    // Correction : Ajout d'un constructeur prenant Employe et Entreprise
    public Adresse(String adresse, Employe employe, Entreprise entreprise) {
      this.adresse = adresse;
      this.employe = employe;
      this.entreprise = entreprise;
    }

    public void afficherAdresse() {
      System.out.println("L'adresse de l'employé " + employe.getNomEmploye() + " qui travaille chez "
          + entreprise.getName() + " est : " + adresse);
    }
  }

  public static void main(String[] args) {

    Entreprise entreprise = new Entreprise("Apple");
    Entreprise.Employe employe = entreprise.new Employe("Flora");

    // Correction : Passer l'employé et l'entreprise au constructeur d'Adresse
    Entreprise.Adresse adresse = new Entreprise.Adresse("29 avenue du général Barbot", employe, entreprise);

    entreprise.afficherNom();
    employe.afficherDetails();
    adresse.afficherAdresse();
  }
}