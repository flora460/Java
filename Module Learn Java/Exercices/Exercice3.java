// Exercice3 : Somme des éléments d’un tableau

public class Exercice3 {
  public static void main(String[] args) {
    int[] chiffres = { 3, 8, 4, 6, 10 };
    int result = 0;

    for (int i = 0; i < chiffres.length; i++) {
      result += chiffres[i];
    }

    System.out.println("La somme des éléments du tableau est : " + result);
  }
}