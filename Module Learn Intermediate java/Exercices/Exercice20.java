import java.util.*;

public class Exercice20 {

  public static void main(String[] args) {

    // 1 Créer un HasSet et ajouter des élement
    Set<Integer> hashSet = new HashSet<>();
    hashSet.add(5);
    hashSet.add(10);
    hashSet.add(15);
    hashSet.add(20);
    hashSet.add(10); // doublons
    hashSet.add(5); // doublons

    // 2 Afficher le résultat
    System.out.println(hashSet);

    // 3 Vérifier si 10 existe
    System.out.println(hashSet.contains(10));

    // 4 Supprimer le nombre 15
    hashSet.remove(15);
    System.out.println(hashSet);

    // 5 Parcourir et afficher les éléments
    for (int element : hashSet) {
      System.out.println(element);
    }
  }
}