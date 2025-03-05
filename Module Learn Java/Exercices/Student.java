import java.io.*;
import java.util.*;

public class Student implements Serializable {

  private String name;
  private int grade;

  private static final long serialVersionUID = 1L;

  public Student(String name, int grade) {
    this.name = name;
    this.grade = grade;
  }

  @Override
  public String toString() {
    return "Nom: " + this.name + ", Grade: " + this.grade;
  }

  public static void main(String[] args) throws IOException, ClassNotFoundException {

    Student student = new Student("ChatGPT", 2);

    try {
      FileOutputStream fileOutputStream = new FileOutputStream("fichier.se");
      ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
      objectOutputStream.writeObject(student);
      objectOutputStream.close();

    } catch (IOException e) {

      System.out.println("Problème lors de la Sérialisation: " + e.getMessage());
    }

    try {
      FileInputStream fileInputStream = new FileInputStream("fichier.se");
      ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
      Student student2 = (Student) objectInputStream.readObject();
      System.out.println(student2);
      objectInputStream.close();

    } catch (IOException e) {

      System.out.println("Problème lors de la Désérialisation: " + e.getMessage());
    }

  }

}