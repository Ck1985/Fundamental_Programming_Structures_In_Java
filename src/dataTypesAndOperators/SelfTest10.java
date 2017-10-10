package dataTypesAndOperators;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class SelfTest10 {
    public static void main(String[] args) {
        //Find all prime number from 2 to 100:
        for (int i = 2; i <= 100; i++) {
            for (int j = 2; j <= i - 1; j++) {
                if (i % j == 0) {
                    break;
                }
                if ((j == i - 1) && (i % j != 0)) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
