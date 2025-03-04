import java.util.*;

public class Exercice18 {

  public static void ajouterEntier(List<? super Integer> liste, Integer integer) {

    liste.add(integer);
  }

  public static void main(String[] args) {

    List<Number> nombres = new ArrayList<>();
    ajouterEntier(nombres, 2);
    System.out.println(nombres);
  }
}