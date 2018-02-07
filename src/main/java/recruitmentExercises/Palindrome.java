package recruitmentExercises;

public class Palindrome {

  public static void main(String[] args) {

    System.out.println("Is this word a palindrome ? The answer is : " + new Palindrome().checkIfPalindrome("auto"));
    System.out.println("Is this word a palindrome ? The answer is : " + new Palindrome().checkIfPalindromeNoReverseMethod("auto"));

  }

  private boolean checkIfPalindrome(String word) {

    return new StringBuilder(word).reverse().toString().equals(word);
  }


  private boolean checkIfPalindromeNoReverseMethod(String word) {

    for (int i = 0; i < word.length()/2 ; i++) {
      if(word.charAt(i)!= word.charAt(word.length()-1-i)) {
        return false;
      }
    }
    return true;
  }


}
