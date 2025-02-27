import java.io.*;

public class Exercice14 {
  public static void main(String[] args) {
    Personne personne = new Personne("Toto", 21);

    // Sérialisation
    try (FileOutputStream fileOutput = new FileOutputStream("personne.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutput)) {

      objectOutputStream.writeObject(personne);
      System.out.println("Sérialisation réussie !");
    } catch (IOException e) {
      System.out.println("Erreur lors de la sérialisation : " + e.getMessage());
    }

    // Désérialisation
    try (FileInputStream fileInputStream = new FileInputStream("personne.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {

      Personne personneLue = (Personne) objectInputStream.readObject();
      System.out.println("Désérialisation réussie !");
      System.out.println("Objet récupéré : " + personneLue);
    } catch (IOException | ClassNotFoundException e) {
      System.out.println("Erreur lors de la désérialisation : " + e.getMessage());
    }
  }
}