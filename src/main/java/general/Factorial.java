package general;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(new Factorial().calculateFactorialRecursively(6));
        System.out.println(new Factorial().calculateFactorial(6));
    }

    private int calculateFactorialRecursively(int number) {
        if(number == 1) {
            return 1;
        } else {
            return number * calculateFactorialRecursively(number -1);
        }
    }

    private int calculateFactorial(int number) {
       int factorial = 1;
        for (int i = number; i > 1; i--) {
            factorial*=i;
        }
        return factorial;
    }
}
