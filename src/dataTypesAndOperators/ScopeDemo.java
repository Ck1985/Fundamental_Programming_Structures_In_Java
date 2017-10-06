package dataTypesAndOperators;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class ScopeDemo {
    public static void main(String[] args) {
        int x; //Known to all code in main method
        x = 10;
        if (x == 10) {//Start new scope
            int y = 20; //known to this block
            //x and y both known here
            System.out.println("x and y: " + x + ", " + y);
            x = y * 2;
        }
        // y = 100;  Error y is not known here because y is outside its scope
        //x is still known here
        System.out.println("x = " + x);
    }
}
