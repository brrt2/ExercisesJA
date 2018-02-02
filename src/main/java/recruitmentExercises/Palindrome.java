package recruitmentExercises;

public class Palindrome {

  public static void main(String[] args) {

    System.out.println("Is this word a palindrome ? The answer is : " + new Palindrome().checkIfPalindrome("rentner"));

  }

  private boolean checkIfPalindrome(String word) {

    return new StringBuilder(word).reverse().toString().equals(word);
  }

}
