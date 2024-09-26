import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class BluddyRandom {
    public static String randString(
            int length,
            boolean hasLettersUpper,
            boolean hasLettersLower,
            boolean hasDigits,
            boolean hasSymbols
    ) {
        char[] lettersUpper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        char[] lettersLower = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] digits = "1234567890".toCharArray();
        char[] symbols = "!§$%&/()=?'*~_:;,.{[]}<>|^°´`".toCharArray();

        ArrayList<Character> chars = new ArrayList<>();

        if (hasLettersUpper) {
            for (char c : lettersUpper) {
                chars.add(c);
            }
        }
        if (hasLettersLower) {
            for (char c : lettersLower) {
                chars.add(c);
            }
        }
        if (hasDigits) {
            for (char c : digits) {
                chars.add(c);
            }
        }
        if (hasSymbols) {
            for (char c : symbols) {
                chars.add(c);
            }
        }

        String result = "";

        for (int i = 0; i < length; i++) {
            result += chars.get(ThreadLocalRandom.current().nextInt(0, chars.size()));
        }

        return result;
    }


    public static String randString(int length) {
        char[] chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890!§$%&/()=?'*~_:;,.{[]}<>|^°´`".toCharArray();

        String result = "";

        for (int i = 0; i < length; i++) {
            result += chars[ThreadLocalRandom.current().nextInt(0, chars.length)];
        }

        return result;
    }
}
