import static java.lang.Math.abs;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Quiz {
    public static void main(String[] args) {
        String s = new String("Madam In Eden, I’m Adam");

        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {

        String nowhitespace = new String();

        nowhitespace = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

        String reversedString = new StringBuffer(nowhitespace).reverse().toString();
        boolean result = reversedString.matches(nowhitespace);
        return result;
    }

}