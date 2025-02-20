/*
 Exercice2 : Boucle et Tableaux
 Écris un programme Java qui crée un tableau d'entiers contenant les valeurs suivantes : [2, 5, 7, 10, 12]. Ensuite, utilise une boucle pour afficher chaque élément du tableau.
 */

public class Exercice2 {
  public static void main(String[] args) {

    int[] nombres = { 2, 5, 7, 10, 12 };

    for (int i = 0; i < nombres.length; i++) {
      System.out.println(nombres[i]);
    }
  }
}