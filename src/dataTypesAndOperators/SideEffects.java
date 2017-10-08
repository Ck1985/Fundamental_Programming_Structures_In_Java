package dataTypesAndOperators;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class SideEffects {
    public static void main(String[] args) {
        int i;
        i = 0;
        /*Here is still incremented even though the statement false*/
        if (false & (++i < 100)) {
            System.out.println("This won't be displayed");
        }
        System.out.println("if statement executed i = " + i);
        /*In this case, i is not incremented because short-circuit operator skip i incremented*/
        if (false && (++i < 100)) {
            System.out.println("This won't be displayed");
        }
        System.out.println("if statement executed i = " + i);
    }
}
