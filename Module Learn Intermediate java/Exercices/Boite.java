public class Boite<T> {

  private T boite;

  public Boite() {
  };

  public Boite(T boite) {
    this.boite = boite;
  }

  public T getBoite() {
    return this.boite;
  }

  public void setBoite(T boite) {
    this.boite = boite;
  }

  public static void main(String[] agrs) {
    Boite<String> boiteDeTexte = new Boite<>();
    boiteDeTexte.setBoite("Coucou");
    System.out.println(boiteDeTexte.getBoite());
  }

}
