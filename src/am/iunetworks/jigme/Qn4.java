package am.iunetworks.jigme;
import java.util.Arrays;

public class Qn4 {
    public static void main(String args[]) {
        String s = "leetcode";
        System.out.println(sortString(s));

    }
    public static String sortString(String s) {
        StringBuilder charResult = new StringBuilder("");
        int charCount = s.length();
        int charFrequency[] = new int[26];
        Arrays.fill(charFrequency, 0);

        for (int i = 0; i < s.length(); i++) {
            charFrequency[s.charAt(i) - 'a']++;
        }
        while (charCount > 0) {

            for (int i = 0; i < charFrequency.length; i++) {
                if (charFrequency[i] != 0) {
                    charResult.append((char) (i + 97));
                    charFrequency[i]--;
                    charCount--;
                }
            }

            for (int i = charFrequency.length - 1; i >= 0; i--) {
                if (charFrequency[i] != 0) {
                    charResult.append((char) (i + 97));
                    charFrequency[i]--;
                    charCount--;
                }
            }
        }

        return charResult.toString();
    }
}