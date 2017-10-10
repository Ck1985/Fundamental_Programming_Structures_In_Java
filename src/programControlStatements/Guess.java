package programControlStatements;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class Guess {
    public static void main(String[] args) throws java.io.IOException{
        System.out.println("I'm thinking about a character. Can you guess it ?");
        System.out.println("So enter the character which you are thinking, then press Enter ");
        char ch, answer = 'K';
        ch = (char)System.in.read();
        if (ch == answer) System.out.println("You are RIGHT");
    }
}
