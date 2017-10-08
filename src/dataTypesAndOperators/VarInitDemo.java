package dataTypesAndOperators;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class VarInitDemo {
    public static void main(String[] args) {
        int x;
        for (x = 0; x < 3; x++) {
            int y = -1; //y variable is initialized every time block is entered
            System.out.println("y is: " + y);
            y = 100;
            System.out.println("y is now: " + y);
        }
    }
}
