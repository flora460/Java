import java.io.*;

public class Exercice13 {
  public static void main(String[] args) {

    try {
      FileReader reader = new FileReader("fichier_inexistant.txt");
      int caractere;
      while ((caractere = reader.read()) != -1) {
        System.out.print((char) caractere);
      }
      reader.close();

    } catch (IOException e) {
      System.out.println("Something went wrong" + e.getMessage);
    }

  }
}