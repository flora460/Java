import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercice22 {

  public static ArrayList<String> sortedListAlpha(ArrayList<String> liste) {

    ArrayList<String> listeTrieAlpha = new ArrayList<>();

    for (String element : liste) {

      if (Character.isUpperCase(element.charAt(0))) {
        listeTrieAlpha.add(element);
      }
    }
    Collections.sort(listeTrieAlpha);

    System.out.println(listeTrieAlpha);
    return listeTrieAlpha;
  }

  public static void main(String[] args) {

    ArrayList<String> liste = new ArrayList<>();
    liste.add("Abricot");
    liste.add("Banane");
    liste.add("courgette");

    sortedListAlpha(liste);

  }
}