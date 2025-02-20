
//Créer une class Bibliothèque qui fait appel à la classe Livre
import java.util.Scanner;

public class Bibliotheque {

  public static void main(String[] args) {

    Livre[] tableauDeLivre = new Livre[3];
    Scanner scanner = new Scanner(System.in);

    int index = 0;

    for (index = 0; index < 3; index++) {
      System.out.println("Entrez les informations du livre " + index + " : ");

      System.out.println("Titre : ");
      String titre = scanner.nextLine();

      System.out.println("Auteur : ");
      String auteur = scanner.nextLine();

      System.out.println("Année du publication : ");
      int anneeDePublication = scanner.nextInt();
      scanner.nextLine(); // Important pour consommer le retour à la ligne

      // On crée directement l'objet et on l'ajoute au tableau
      tableauDeLivre[index] = new Livre(titre, auteur, anneeDePublication);

    }

    scanner.close();

    System.out.println(" Liste des livres enregistrés : ");
    for (Livre livre : tableauDeLivre) {
      livre.afficherInfos();
      System.out.println("----------------------");
    }

  }
}