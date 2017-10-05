package javaFundamentals;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class InchesToMeters {
    public static void main(String[] args) {
        int inche, feet;
        double meter;
        int counter = 0;
        feet = 12;
        for (inche = 1; inche <= feet * 12; inche++) {
            meter = inche / 39.37;
            System.out.println(inche + " inches = " + meter + " meters");
            counter++;
            if (counter == 12) {
                System.out.println();
                counter = 0;
            }
        }
    }
}
