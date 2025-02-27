import java.io.Serializable;

public class Personne implements Serializable {
  private static final long serialVersionUID = 1L; // Bonnes pratiques

  String nom;
  int age;

  public Personne(String nom, int age) {
    this.nom = nom;
    this.age = age;
  }

  @Override
  public String toString() {
    return "Personne{nom='" + nom + "', age=" + age + "}";
  }
}