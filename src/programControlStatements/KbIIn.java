package programControlStatements;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class KbIIn {
    public static void main(String[] args) throws java.io.IOException{
        System.out.println("Enter any character follow press Enter:");
        char ch;
        ch = (char)System.in.read();
        System.out.println("The Character you 've just input is: " + ch);
    }
}
