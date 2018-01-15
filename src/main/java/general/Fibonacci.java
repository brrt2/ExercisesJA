package general;

import java.util.stream.Stream;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(new Fibonacci().calculateFibonacci(7));
        System.out.println(new Fibonacci().calculateFibonacciRecursively(7));
        System.out.println(new Fibonacci().calculateFibonacciWithStream(7));
    }

    private int calculateFibonacci(int desiredElement) {

        int[] result = new int[100];
        result[0] = 0;
        result[1] = 1;
        result[2] = 1;
        for (int i = 3; i < 100; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }
        return result[desiredElement];
    }

    private int calculateFibonacciRecursively(int desiredElement) {
        if(desiredElement == 0) return 0;
        if(desiredElement == 1 || desiredElement == 2) return 1;
        return calculateFibonacciRecursively(desiredElement -1) + calculateFibonacciRecursively(desiredElement -2);
    }

    private int calculateFibonacciWithStream(int desiredElement) {

      return Stream.iterate(new int[] {1, 1}, f -> new int[] {f[1], f[0] + f[1]})
                .limit(desiredElement)
                .reduce((a, b) -> b)
                .get()[0];
    }
}
