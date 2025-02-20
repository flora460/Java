/*
 * Exercice : Copier le contenu d'un fichier dans un autre
* Crée un fichier source source.txt avec quelques lignes de texte.
* Utilise un FileReader pour lire le contenu de source.txt et un FileWriter pour écrire ce contenu dans un fichier destination.txt.
* Assure-toi que, après la copie, le contenu de destination.txt soit identique à celui de source.txt.
 */

import java.io.*;

public class Exercice10 {

  public static void main(String[] args) {

    File myFile = new File("source.txt");
    String texte = "J'écris pleins de trucs pour l'exercice djfhqsdfhozeiufhaziepfhpzeofhazoerfzeoir\n ikezrhzoaeiurgzieourgazieurgaizeurh\n oiazeugrhaziuergiazeur\n voila voila !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!";
    File myOtherFile = new File("destination.txt");

    try {
      FileWriter fileWritter = new FileWriter(myFile, true);
      BufferedWriter buffWriter = new BufferedWriter(fileWritter);

      buffWriter.write(texte);
      buffWriter.newLine();
      buffWriter.close();

      FileReader fileReader = new FileReader(myFile);
      BufferedReader buffReader = new BufferedReader(fileReader);
      FileWriter fileWriter2 = new FileWriter(myOtherFile);
      BufferedWriter buffWriter2 = new BufferedWriter(fileWriter2);
      String line;

      while ((line = buffReader.readLine()) != null) {
        System.out.println(line);
        buffWriter2.write(line);
        buffWriter2.newLine();
      }
      buffWriter2.close();
      buffReader.close();

      FileReader fileReader3 = new FileReader(myFile);
      FileReader fileReader4 = new FileReader(myOtherFile);

      BufferedReader buffReader3 = new BufferedReader(fileReader3);
      BufferedReader buffReader4 = new BufferedReader(fileReader4);

      String line1;
      String line2;

      while ((line1 = buffReader3.readLine()) != null && (line2 = buffReader4.readLine()) != null) {
        if (!line1.equals(line2)) {
          System.out.println("Le contenue des fichier est différent");
        }
      }

      buffReader3.close();
      buffReader4.close();

    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}