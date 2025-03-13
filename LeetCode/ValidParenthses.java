import java.util.Stack;

class Solution {
  public boolean isValid(String s) {

    // Si la String est impair
    if (s.length() % 2 != 0) {
      return false;
    }

    // Pile pour stocker les parenthèses
    Stack<Character> stack = new Stack<>();

    // Parcourir la String
    for (int i = 0; i < s.length(); i++) {
      // Si c'est une parenthèse ouverte on la stocke dans la stack
      if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
        System.out.println("Parenthèse ouvrante : " + s.charAt(i));
        // Je l'ajoute à la stack
        stack.push(s.charAt(i));
      } else { // Si c'est une parenthèse fermante
        System.out.println("Parenthèse fermante : " + s.charAt(i));
        // Je vérifie le dernier élément de la stack
        if (s.charAt(i) == ')' && stack.peek() != '(' || s.charAt(i) == ']' && stack.peek() != '['
            || s.charAt(i) == '}' && stack.peek() != '{') {
          return false;
        } else {
          stack.pop();
        }
      }
    }
    return true;
  }

  public static void main(String[] args) {

  }
}
