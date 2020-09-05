package am.iunetworks.jigme;

public class Qn11 {
    public static void main(String args[]) {
        String a= format("12345678");
        System.out.println("\""+a+"\"");
    }
    private static String format(String s) {
        if (s.length() <= 3)
            return s;
        int first = (s.length() - 1) % 3 + 1;
        StringBuilder buf = new StringBuilder(s.substring(0, first));
        for (int i = first; i < s.length(); i += 3)
            buf.append('.').append(s.substring(i, i + 3));
        return buf.toString();
    }
}