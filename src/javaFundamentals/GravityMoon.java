package javaFundamentals;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class GravityMoon {
    public static void main(String[] args) {
        double weightEarth;
        double weightMoon;
        weightEarth = 85.98;
        weightMoon = (weightEarth * 17) / 100;
        System.out.println("Weight on Earth is: " + weightEarth +
                           " so weight on Moon is " +
                           weightMoon);
    }
}
