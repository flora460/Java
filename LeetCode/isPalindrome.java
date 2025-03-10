class isPalindrome {
  public static boolean isPalindrome(int x) {

    // Dans le cas ou x est négatif
    if (x < 0) {
      return false;
    }

    String xstring = String.valueOf(x); // On convertie x en String pour le manipuler plus facilement
    int xstringlength = xstring.length(); // On récupère la longueur de int

    for (int i = 0; i < xstringlength; i++) { // On boucle sur x
      int j = xstringlength - i - 1;
      if (xstring.charAt(i) != xstring.charAt(j)) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {

    int x = 121;
    System.out.println("Is the number : " + x + " a Palindrome : " + isPalindrome(x));
  }
}