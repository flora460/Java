// Exercice 4 : Trouver le plus grand élément d’un tableau

public class Exercice4 {
  public static void main(String[] args) {

    int[] entiers = { 15, 42, 7, 28, 10 };
    int max = entiers[0];

    for (int i = 1; i < entiers.length; i++) {
      if (entiers[i] > max) {
        max = entiers[i];
      }
    }

    System.out.println("Le plus grand nombre du tableau est : " + max);
  }
}