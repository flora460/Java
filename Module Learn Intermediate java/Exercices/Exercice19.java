import java.util.*;

//Exercice sur les List
public class Exercice19 {

  public static void main(String[] args) {

    // 1 Créer et affichr
    List<String> listeFruits = new ArrayList<>();
    listeFruits.add("pomme");
    listeFruits.add("banane");
    listeFruits.add("orange");
    System.out.println(listeFruits);

    // 2 Accéder à un élément
    System.out.println(listeFruits.get(1));

    // 3 Modifier un élément
    listeFruits.set(1, "poire");
    System.out.println(listeFruits);

    // 4 Ajouter et supprimer des éléments
    listeFruits.add(listeFruits.size(), "fraise");
    System.out.println(listeFruits);
    listeFruits.remove(0);
    System.out.println(listeFruits);

    // 5 parcourir la liset
    for (String element : listeFruits) {
      System.out.println(element);
    }
  }
}