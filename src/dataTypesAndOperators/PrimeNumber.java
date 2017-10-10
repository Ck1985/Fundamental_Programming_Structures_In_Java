package dataTypesAndOperators;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class PrimeNumber {
    public static void main(String[] args) {
        boolean isPrime;
        for (int i = 1; i <= 100; i++) {
            isPrime = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime && (i != 1)) {
                System.out.print(i + " ");
            }
        }
    }
}
