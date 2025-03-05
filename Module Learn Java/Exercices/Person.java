public class Person {
  private String name;
  private int age;

  // Constructeur à compléter
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // Getter et Setter pour "name"
  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  // Méthode pour afficher "Je m'appelle [name] et j'ai [age] ans"
  public void afficherPerson() {
    System.out.println("Je m'appelle " + this.name + " et j'ai " + this.age + " ans.");
  }

  public static void main(String[] agrs) {

    Person chatGPT = new Person("chatGTP", 10);

    chatGPT.affichePerson();
  }
}