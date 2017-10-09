package dataTypesAndOperators;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class LogicalOpTable2 {
    public static void main(String[] args) {
        int p, q;
        System.out.println("P\t\tQ\t\tAND\t\tOR\t\tXOR\t\tNOT");
        p = 0b1010; q = 0b0101;
        System.out.print(Integer.toBinaryString(p) + "\t0" + Integer.toBinaryString(q) + "\t");
        System.out.print(Integer.toBinaryString((p & q)) + "\t\t" + Integer.toBinaryString((p | q)) + "\t");
        System.out.println(Integer.toBinaryString((p ^ q)) + "\t" + Integer.toBinaryString((~p)));
    }
}
