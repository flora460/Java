import java.util.Scanner;

public class Exercice11 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // Un seul scanner

    System.out.println("Entrez votre nom :");
    String nom = scanner.nextLine();

    System.out.println("Entrez votre âge :");
    int age = scanner.nextInt();
    scanner.nextLine(); // Absorber le retour à la ligne après nextInt()

    System.out.println("Bonjour " + nom + ", tu as " + age + " ans !");

    scanner.close(); // Fermer le scanner une seule fois
  }
}