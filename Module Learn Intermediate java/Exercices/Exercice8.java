/*
 * Exercice: Lire et écrire dans un fichier avec BufferedReader et BufferedWriter
* Demande à l'utilisateur d'entrer une phrase via la console.
* Utilise BufferedWriter pour écrire cette phrase dans un fichier texte nommé outputBuffered.txt.
* Ensuite, lis ce fichier avec BufferedReader et affiche son contenu dans la console.
 */

import java.util.Scanner;
import java.io.*;

public class Exercice8 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Veuillez écrire une phrase : ");
    String phrase = scanner.nextLine();

    try {
      File myFile = new File("outputBuffered.txt"); // Crée un fichier "outputBuffered.txt" pour l'écriture
      FileWriter fileWriter = new FileWriter(myFile); // FileWriter pour écrire dans le fichier
      BufferedWriter writer = new BufferedWriter(fileWriter); // BufferedWriter pour améliorer l'écriture
      writer.close();

      // Écrire la phrase dans le fichier
      writer.write(phrase);

      FileReader fileReader = new FileReader(myFile);
      BufferedReader reader = new BufferedReader(fileReader);
      String line;

      while ((line = reader.readLine()) != null) {
        System.out.println(line);
      }
      // Fermer le BufferedWriter après l'écriture

      reader.close();

    } catch (IOException e) {
      System.out.println("Erreur ... ");
      e.printStackTrace();
    }

    scanner.close();

  }
}