import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class BluddyRandom {

    private static final String lettersUpper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String lettersLower = "abcdefghijklmnopqrstuvwxyz";
    private static final String digits = "1234567890";
    private static final String symbols = "!§$%&/()=?'*~_:;,.{[]}<>|^°´`";
    private static final String chars = lettersUpper + lettersLower + digits + symbols;

    public static String randString(
            int length,
            boolean hasLettersUpper,
            boolean hasLettersLower,
            boolean hasDigits,
            boolean hasSymbols
    ) {

        ArrayList<Character> chars = new ArrayList<>();

        if (hasLettersUpper) {
            for (char c : lettersUpper.toCharArray()) {
                chars.add(c);
            }
        }
        if (hasLettersLower) {
            for (char c : lettersLower.toCharArray()) {
                chars.add(c);
            }
        }
        if (hasDigits) {
            for (char c : digits.toCharArray()) {
                chars.add(c);
            }
        }
        if (hasSymbols) {
            for (char c : symbols.toCharArray()) {
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
        String result = "";

        for (int i = 0; i < length; i++) {
            result += chars.toCharArray()[ThreadLocalRandom.current().nextInt(0, chars.length())];
        }

        return result;
    }
}
