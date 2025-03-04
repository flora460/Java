import java.util.HashMap;
import java.util.Map;

public class Exercice21 {

  public static void main(String[] args) {

    // 1 Créer une HashMap et mettre des trcus dedans
    Map<Integer, String> hashMap = new HashMap<>();

    hashMap.put(0, "Aligator");
    hashMap.put(1, "Baboin");
    hashMap.put(2, "Cheval");

    // 2 Afficher la HashMap
    System.out.println(hashMap);

    // 3 Accéder à l'élément Baboin
    System.out.println(hashMap.get(1));

    // 4 Modifier un élément remplacer baboin par Baleine
    hashMap.replace(1, "Baleine");
    System.out.println(hashMap);

    // 5 supprimer un élément Cheval
    hashMap.remove(2);
    System.out.println(hashMap);

    // 6 Vérifier si une clé existe
    System.out.println(hashMap.containsKey(2));

    // 7 Parcoucrir la Map
    for (int key : hashMap.keySet()) { // Je couble sur les clés
      String value = hashMap.get(key); // Je récupère la valeur associé à chaque fois
      System.out.println("clé : " + key + " valeur : " + value);
    }

  }
}