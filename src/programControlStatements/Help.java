package programControlStatements;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class Help {
    public static void main(String[] args) throws java.io.IOException{
        char choice;

        System.out.println("Help on:");
        System.out.println("   if");
        System.out.println("   switch");
        System.out.println("Choose one:");

        System.out.println();

        choice = (char)System.in.read();

        switch (choice) {
            case '1':
                System.out.println("The if: \n");
                System.out.println("if (condition) statement;");
                System.out.println("else statement");
                break;
            case '2':
                System.out.println("The switch: \n");
                System.out.println("switch (expression) {");
                System.out.println("   case constants: ");
                System.out.println("        statement;");
                System.out.println("        break;");
                System.out.println("   ......");
                System.out.println("   default:");
                System.out.println("        statement;");
                System.out.println("}");
                break;
            default:
                System.out.println("The selection is not found");
        }
    }
}
