package general;

public class Powers {

    public static void main(String[] args) {
        System.out.println(new Powers().calculatePower(5,3));
        System.out.println(new Powers().calculatePowerRecursively(5,3));
    }

    private int calculatePower(int base, int exponent) {

        int result = 1;

        for (; exponent != 0; --exponent) {
            result*=base;
        }
        return result;
    }

    private int calculatePowerRecursively(int base, int exponent) {
       if(exponent == 0) return 1;
        return base * calculatePowerRecursively(base,exponent - 1);
    }
}
