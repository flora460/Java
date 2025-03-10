import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Book implements Serializable {

  private static final long serialVersionUID = 1L;

  private String titre;
  private String auteur;
  private int annee;

  public Book() {
  }

  public Book(String titre, String auteur, int annee) {
    this.titre = titre;
    this.auteur = auteur;
    this.annee = annee;
  }

  public String getTitre() {
    return titre;
  }

  public String getAuteur() {
    return auteur;
  }

  public int getAnnee() {
    return annee;
  }

  public void setTitre(String titre) {
    this.titre = titre;
  }

  public void setAuteur(String auteur) {
    this.auteur = auteur;
  }

  public void setAnnee(int annee) {
    this.annee = annee;
  }

  public void displayBook() {
    System.out.println("Titre : " + titre + ", Auteur : " + auteur + ", Année : " + annee);
  }

  public static void main(String[] args) {
    List<Book> livres = new ArrayList<>();
    livres.add(new Book("Stupeur et tremblements", "Amélie Nothomb", 1990));
    livres.add(new Book("Harry Potter", "J.K. Rowling", 2001));
    livres.add(new Book("Alice au pays des merveilles", "Lewis Carroll", 1995));

    // Affichage des livres avant la sérialisation
    System.out.println("📖 Livres avant sérialisation :");
    for (Book livre : livres) {
      livre.displayBook();
    }

    // Sérialisation des livres
    try (FileOutputStream fileOutputStream = new FileOutputStream("fichier1.se");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {

      for (Book livre : livres) {
        objectOutputStream.writeObject(livre);
      }
      System.out.println("\n✅ Sérialisation réussie !");

    } catch (IOException e) {
      System.out.println("❌ Problème lors de la sérialisation : " + e.getMessage());
    }

    // Désérialisation des livres
    List<Book> livresDeserialises = new ArrayList<>();
    try (FileInputStream fileInputStream = new FileInputStream("fichier1.se");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {

      while (true) { // Boucle jusqu'à la fin du fichier
        try {
          Book livre = (Book) objectInputStream.readObject();
          livresDeserialises.add(livre);
        } catch (EOFException e) {
          break; // Sortir de la boucle à la fin du fichier
        }
      }
      System.out.println("\n✅ Désérialisation réussie !");

    } catch (IOException | ClassNotFoundException e) {
      System.out.println("❌ Problème lors de la désérialisation : " + e.getMessage());
    }

    // Affichage des livres après la désérialisation
    System.out.println("\n📖 Livres après désérialisation :");
    for (Book livre : livresDeserialises) {
      livre.displayBook();
    }
  }
}