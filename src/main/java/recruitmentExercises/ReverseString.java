package recruitmentExercises;

public class ReverseString {

  public static void main(String[] args) {

    System.out.println("The reversed word is : " + new ReverseString().reverseString("bartek"));
  }

  private String reverseString(String word) {

    return new StringBuilder(word).reverse().toString();
  }

}
