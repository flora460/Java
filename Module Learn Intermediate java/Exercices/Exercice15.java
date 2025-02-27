import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Exercice15 {

  public static void main(String[] args) {

    List<Personne> listPersonne = new ArrayList<>();

    Personne personne1 = new Personne("personne1", 10);
    Personne personne2 = new Personne("personne2", 12);
    Personne personne3 = new Personne("personne3", 13);

    listPersonne.add(personne1);
    listPersonne.add(personne2);
    listPersonne.add(personne3);

    try {
      FileOutputStream fileOutputStream = new FileOutputStream("listePersonne.se");
      ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
      objectOutputStream.writeObject(listPersonne);
      objectOutputStream.close();

      System.out.println("Sérialisation réussie !");
    } catch (IOException e) {
      System.out.println("Sérialisation a échoué :" + e.getMessage());
    }

    try {
      FileInputStream fileInputStream = new FileInputStream("listePersonne.se");
      ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

      // Cast explicite
      List<Personne> listPersonneLue = (List<Personne>) objectInputStream.readObject();
      objectInputStream.close();

      System.out.println("Désérialisation réussie !");
    } catch (IOException | ClassNotFoundException e) {
      System.out.println("Désérialisation a échoué :" + e.getMessage());
    }
  }
}