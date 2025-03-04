import java.util.*;

public class Calculateur<T extends Number> {

  private T nombre;

  Calculateur() {
  };

  Calculateur(T nombre) {
    this.nombre = nombre;
  }

  public double doubler() {
    return nombre.doubleValue() * 2;
  }

  public static void main(String[] args) {

    Calculateur<Integer> nombre = new Calculateur<>(2);
    System.out.println(nombre.doubler());
  }

}