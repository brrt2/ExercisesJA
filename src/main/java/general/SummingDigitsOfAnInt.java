package general;

import java.util.Arrays;

public class SummingDigitsOfAnInt {

    public static void main(String[] args) {
        System.out.println(new SummingDigitsOfAnInt().sumDigits(12345));
        System.out.println(new SummingDigitsOfAnInt().sumOfDigitsRecursively(12345));
        System.out.println(new SummingDigitsOfAnInt().sumDigitsWithStreams(12345));
    }

    private int sumDigits(int num) {
        int sum = 0;
        while(num > 0) {
            int lastDigit = num % 10;
            sum+=lastDigit;
            num = num/10;
        }
        return sum;
    }

    private int sumOfDigitsRecursively(int num)
    {
        return num == 0 ? 0 : num % 10 + sumOfDigitsRecursively(num / 10);
    }


    private int  sumDigitsWithStreams (String s) {

        int sum = Arrays
            .stream(s.split("")) // Convert to an array
            .mapToInt(Integer::parseInt)  // Convert to Integers
            .sum(); // Sum
        System.out.println(sum);

    }

}
