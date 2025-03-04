import java.util.*;

public class Exercice16<T> {

  static <T> void afficherListe(T nombres) {
    System.out.println(nombres);
  }

  public static void main(String[] agrs) {
    List<Integer> nombres = Arrays.asList(1, 2, 3);
    afficherListe(nombres);
  }
}