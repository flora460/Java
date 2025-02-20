
/*
Exercice5 : Vérifier si un mot est un palindrome
Un palindrome est un mot qui se lit de la même façon à l'endroit et à l'envers (ex : "kayak", "radar", "level").
*/
import java.util.Scanner;

public class Exercice5 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Entrez un mot :");
    String mot = scanner.nextLine();

    boolean isPalindrome = true;

    for (int i = 0; i < mot.length() / 2; i++) { // Parcourir seulement la moitié du mot
      if (mot.charAt(i) != mot.charAt(mot.length() - 1 - i)) { // Comparer les lettres en miroir
        isPalindrome = false;
        break; // On peut s'arrêter dès qu'on trouve une différence
      }
    }

    if (isPalindrome) {
      System.out.println("Le mot \"" + mot + "\" est un palindrome.");
    } else {
      System.out.println("Le mot \"" + mot + "\" n'est pas un palindrome.");
    }

    scanner.close();
  }
}