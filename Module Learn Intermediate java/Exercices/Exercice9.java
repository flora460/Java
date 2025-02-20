/*
 * Exercice: Compter les mots dans un fichier texte
* Crée un fichier texte nommé texte.txt qui contient plusieurs lignes de texte.
* Écris un programme qui lit ce fichier ligne par ligne avec BufferedReader.
* Pour chaque ligne, compte le nombre de mots (les mots étant séparés par des espaces) et affiche ce nombre dans la console.
 */

import java.io.*;

public class Exercice9 {

  public static void main(String[] args) {

    File myFile = new File("fichier.txt");
    String phrase = ("J'en ai marre de cette journée de merde, je me fais chier dans ma vie, ça me gave d'être ici, blablbalbalbalbalbalablabalbalablabalbalabalbalbalablabalbalab\n bazjdbazjdoadhozeiozieoize");

    try {
      FileWriter fileWritter = new FileWriter(myFile, true);
      BufferedWriter bufferedWriter = new BufferedWriter(fileWritter);
      bufferedWriter.write(phrase);
      bufferedWriter.newLine(); // Ajoute une vraie nouvelle ligne
      bufferedWriter.close(); // **FERMER avant de lire !!**

      FileReader fileReader = new FileReader(myFile);
      BufferedReader bufferedReader = new BufferedReader(fileReader);
      String line;

      while ((line = bufferedReader.readLine()) != null) {
        System.out.println(line);
      }

      bufferedReader.close();

    } catch (IOException e) {
      System.out.println("Il y a une erreur ...");
      e.printStackTrace();
    }

  }
}