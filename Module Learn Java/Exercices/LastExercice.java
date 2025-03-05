import java.util.*;

public class LastExercice {

  public static ArrayList<Integer> pairsEtCroissant(ArrayList<Integer> liste) {

    ArrayList<Integer> sortedList = new ArrayList<>();

    Collections.sort(liste);

    for (Integer element : liste) {
      if (element % 2 == 0) {
        sortedList.add(element);
      }
    }
    return sortedList;
  }

  public static void main(String[] args) {

    ArrayList<Integer> liste = new ArrayList<>();
    liste.add(1);
    liste.add(23);
    liste.add(5);
    liste.add(42);
    liste.add(3);

    // Appeler la méthode et récupérer la liste triée et avec les éléments pairs
    ArrayList<Integer> result = pairsEtCroissant(liste);

    // Afficher le résultat
    System.out.println("Liste triée avec les éléments pairs : " + result);

  }
}