/*
 * Exercice :
* Écris un programme Java qui :
* Demande à l'utilisateur d'entrer un texte via la console.
* Enregistre ce texte dans un fichier output.txt.
* Lit le contenu du fichier et l'affiche à l'écran.
 */

import java.util.Scanner;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class Exercice7 {

  public static void main(String[] args) throws IOException {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Veuillez entrer du texte");
    String phrase = scanner.nextLine();

    try {
      FileWriter writer = new FileWriter("output.txt");
      writer.write(phrase);

      FileReader reader = new FileReader("output.txt");
      int data;
      while ((data = reader.read()) != -1) {
        System.out.println((char) data);
      }

      writer.close();
      reader.close();

    } catch (IOException e) {
      System.out.println("Il y a une erreur sur l'écriture ou la lecture du fichier");
    }
    scanner.close();

  }

}