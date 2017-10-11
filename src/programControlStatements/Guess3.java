package programControlStatements;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class Guess3 {
    public static void main(String[] args) throws java.io.IOException{
        System.out.println("I'm thinking about a character from a - Z");
        System.out.println("Can you guess it");
        char ch, answer = 'K';
        ch = (char)System.in.read();
        if (ch == answer) {
            System.out.println("----RIGHT----");
        } else {
            System.out.println("Sorry, you're");
            if (ch < answer) {
                System.out.println("Too low");
            } else {
                System.out.println("Too high");
            }
        }
    }
}
