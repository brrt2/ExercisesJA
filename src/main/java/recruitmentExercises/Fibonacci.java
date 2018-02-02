package recruitmentExercises;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Fibonacci {

  public static void main(String[] args) {

    Map<Integer,Integer> map = new HashMap<>();

    System.out.println(new Fibonacci().calculateFibonacciIteratively(6));
    System.out.println(new Fibonacci().calculateFibonacciRecursively(6));
    System.out.println(new Fibonacci().calculateFibonacciWithStreams(6));

  }

  private int calculateFibonacciIteratively(int element) {

    int[] fibonacciArray = new int[100];
    fibonacciArray[0] = 0;
    fibonacciArray[1] = 1;
    fibonacciArray[2] = 1;

    for (int i = 3; i < fibonacciArray.length; i++) {
      fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
    }

    return fibonacciArray[element];
  }

  private int calculateFibonacciRecursively(int element) {

    if (element == 0) {
      return 0;
    }
    if (element == 1 || element == 2) {
      return 1;
    }

    return calculateFibonacciRecursively(element - 1) + calculateFibonacciRecursively(element - 2);
  }

  private BigDecimal calculateFibonacciWithStreams(int element) {

    BigDecimal result = Stream.iterate((new BigDecimal[] {BigDecimal.ZERO, BigDecimal.ONE}), p -> new BigDecimal[] {p[1], p[0].add(p[1])}).limit(element).skip(element - 1)
        .findFirst().get()[1];

    return result;
  }

}
