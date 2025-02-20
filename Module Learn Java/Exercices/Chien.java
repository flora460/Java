public class Chien {

  private String nom;
  private int age;

  public Chien(String nom, int age) {
    this.nom = nom;
    this.age = age;
  }

  public String getNom() {
    return this.nom;
  }

  public int getAge() {
    return this.age;
  }

  public void setNom(String newNom) {
    this.nom = newNom;
  }

  public void setAge(int newAge) {
    this.age = newAge;
  }

  public void Aboyer() {
    System.out.println("Woof Woof !");
  }

  public static void main(String[] args) {

    Chien chien = new Chien("Medor", 2);

    chien.Abboyer();
  }
}