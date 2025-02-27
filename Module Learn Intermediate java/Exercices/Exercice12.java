
/* * Écris un programme qui :* Crée un fichier "message.txt" et y écrit la phrase : "Java, c'est top !"
 * Lit le contenu de ce fichier et l'affiche dans la console.
 * Contraintes :
 * Utilise FileWriter pour écrire dans le fichier.
 * Utilise FileReader pour lire le fichier.
 * Utilise un try-catch pour gérer les exceptions.
 */
import java.io.*;

public class Exercice12 {

  public static void main(String[] args) {

    try {
      FileWriter writer = new FileWriter("message.txt");
      writer.write("Java, c'est top !");
      writer.close();

      FileReader reader = new FileReader("message.txt");
      int data;
      while ((data = reader.read()) != -1) {
        System.out.print((char) data);
      }
      reader.close();

    } catch (IOException e) {
      System.out.println("Something wen wrong : " + e);
    }

  }
}