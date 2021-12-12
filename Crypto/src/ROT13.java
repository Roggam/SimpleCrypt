import java.util.ArrayList;

import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;

public class ROT13 {
    Character cs;
    Character cf;

    ROT13(Character cs, Character cf) {
        this.cs = cs;
        this.cf = cf;
    }

    ROT13() {
    }


    public String crypt(String text) throws UnsupportedOperationException {

        return shifter(text,13).toString();
    }

    public String encrypt(String text) {

        return shifter(text, 13).toString();
    }

    public String decrypt(String text) {

        return shifter(text,13).toString();
    }

    public  String rotate(String s, Character c) {
       StringBuilder stringBuilder = new StringBuilder();
        int charVal = (int) c;
        for (int i = c; i < c + s.length(); i++) {
            stringBuilder.append((char)i);
        }
        return stringBuilder.toString();
    }


    public StringBuffer shifter (String text, int shift) {
        StringBuffer result = new StringBuffer();

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                result.append(' ');

            } else if (text.charAt(i) == '?' || text.charAt(i) == '!') {
                result.append(text.charAt(i));

            } else if (Character.isUpperCase(text.charAt(i))) {//uppercase
                char ch = (char) (((int) text.charAt(i) +
                        shift - 65) % 26 + 65);
                result.append(ch);

            } else {//lowecase
                char ch = (char) (((int) text.charAt(i) +
                        shift - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result;
    }


}
