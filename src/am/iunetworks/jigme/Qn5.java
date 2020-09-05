package am.iunetworks.jigme;

public class Qn5 {
    public static void main(String[] args) {
        String str = "Hello";
        char[] CharArray = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            CharArray[i] = str.charAt(i);
        }
        char lowerCh, upperCh;
        for (int i = 0; i < CharArray.length; i++) {
            for (lowerCh = 'a', upperCh = 'A'; lowerCh <= 'z' && upperCh <= 'Z'; ++lowerCh, ++upperCh) {
                if (CharArray[i]==lowerCh || CharArray[i]==upperCh)
                    System.out.print(lowerCh);
            }
        }


    }
}