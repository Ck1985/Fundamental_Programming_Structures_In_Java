package javaFundamentals;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class Casts {
    public static void main(String[] args) {
        double x = 9.997;
        int nx = (int)x;
        System.out.println("nx = " + nx);
        int rnx = (int)Math.round(x);
        System.out.println("rnx = " + rnx);
    }
}
