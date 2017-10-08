package dataTypesAndOperators;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class ModDemo {
    public static void main(String[] args) {
        int iResult, iRem;
        double dResult, dRem;
        iResult = 10 / 3;
        iRem = 10 % 3;
        dResult = 10.0 / 3.0;
        dRem = 10.0 % 3.0;
        System.out.println("iResult and iRem of 10 / 3: " + iResult + ", " + iRem);
        System.out.println("dResult and dRem of 10 % 3: " + dResult + ", " + dRem);
        int x, y;
        x = 10;
        //y = x++;
        y = ++x;
        System.out.println("x = " + x + ", y = " + y);

    }
}
