import java.util.*;

public class Exercice17 {

  public static double somme(List<? extends Number> liste) {

    double somme = 0;
    for (Number element : liste) {

      somme += element.doubleValue();
    }
    return somme;
  }

  public static void main(String[] args) {
    List<Double> liste = Arrays.asList(1.5, 2.5, 3.0);
    System.out.println(somme(liste));
  }

}