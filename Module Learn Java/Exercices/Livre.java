//Créer une class livre

public class Livre {

  private String titre;
  private String auteur;
  private int anneeDePublication;

  public Livre(String titre, String auteur, int anneeDePublication) {
    this.titre = titre;
    this.auteur = auteur;
    this.anneeDePublication = anneeDePublication;
  }

  public String getTitre() {
    return this.titre;
  }

  public String getAuteur() {
    return this.auteur;
  }

  public int getAnneeDePublication() {
    return this.anneeDePublication;
  }

  public void setTitre(String newTitre) {
    this.titre = newTitre;
  }

  public void setAuteur(String newAuteur) {
    this.auteur = newAuteur;
  }

  public void setAnneeDePublication(int newAnneeDePublication) {
    this.anneeDePublication = newAnneeDePublication;
  }

  public void afficherInfos() {
    System.out.println("Titre : " + getTitre());
    System.out.println("Auteur : " + getAuteur());
    System.out.println("Année de publication : " + getAnneeDePublication());
  }

}