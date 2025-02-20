/*
 * Exercice1 : Manipulation de String
 * Écris un programme Java qui demande à l'utilisateur de saisir une chaîne de caractères et qui affiche la même chaîne en majuscules, en minuscules et le nombre de caractères de cette chaîne.
 */

import java.util.Scanner;

public class Exercice1 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Entrez une chaine de caractères : ");
    String chaine = scanner.nextLine();

    System.out.println(chaine.toUpperCase());
    System.out.println(chaine.toLowerCase());
    System.out.println(chaine.length());
    scanner.close();
  }
}