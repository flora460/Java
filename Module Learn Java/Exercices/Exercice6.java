// Trouver la plus petite valeur d'un tableau et son index 

import java.util.Scanner;

public class Exercice6 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Demander à l'utilisateur la taille du tableau
    System.out.println("Combien de nombres voulez-vous entrer ?");
    int taille = scanner.nextInt();

    if (taille <= 0) { // Vérifier que la taille est valide
      System.out.println("La taille du tableau doit être supérieure à 0.");
      scanner.close();
      return;
    }

    int[] tableau = new int[taille];

    // Remplir le tableau avec les entrées de l'utilisateur
    for (int i = 0; i < taille; i++) {
      System.out.print("Entrez un nombre : ");
      tableau[i] = scanner.nextInt();
    }

    // Trouver le minimum
    int min = tableau[0];
    int index = 0;

    for (int i = 1; i < tableau.length; i++) { // On commence à 1 car min = tableau[0] déjà
      if (tableau[i] < min) {
        min = tableau[i];
        index = i;
      }
    }

    // Afficher le résultat
    System.out.println("La plus petite valeur du tableau est : " + min);
    System.out.println("l'index de la plus petite valeur est : " + index);

    scanner.close();
  }
}