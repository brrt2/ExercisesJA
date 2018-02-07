package recruitmentExercises;

import java.util.stream.Stream;

public class ReverseString {

  public static void main(String[] args) {

    System.out.println("The reversed word is : " + new ReverseString().reverseString("bartek"));
  }

  private String reverseString(String word) {

    return new StringBuilder(word).reverse().toString();
  }


//  private String reverseStringNoReverseMethod(String word) {
//
//    char[] stringAsTable = new char[word.length()];
//
//    for(char c : stringAsTable) {
//
//    }
//
//    for (int i = 0; i < word.length()/2 ; i++) {
//      char temp = word.charAt(i);
//
//    }
//
//  }



}
