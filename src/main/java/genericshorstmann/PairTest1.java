package genericshorstmann;

public class PairTest1 {

  public static void main(String[] args) {
    String[] words = {"Mary", "John", "Andrew", "Joshua"};
    Pair<String> mm = ArrayAlg.minmax(words);
    System.out.println("min = " + mm.getFirst());
    System.out.println("max = " + mm.getSecond());

  }
}
