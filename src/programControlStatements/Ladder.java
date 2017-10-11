package programControlStatements;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class Ladder {
    public static void main(String[] args) {
        int x;
        for (x = 0; x < 6; x++) {
            if (x == 1) System.out.println("x is One");
            else if (x == 2) System.out.println("x is Two");
            else if (x == 3) System.out.println("x is Three");
            else if (x == 4) System.out.println("x is Four");
            else System.out.println("X is not between from 1 to 4");
        }
    }
}
