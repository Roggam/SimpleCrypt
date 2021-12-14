import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;

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

        return shifter(text, 13).toString();
    }

    public String encrypt(String text) {

        return shifter(text, 13).toString();
    }

    public String decrypt(String text) {

        return shifter(text, 13).toString();
    }

    public String rotate(String s, Character c) {
        String str = "";
        String[] arr = s.split("");
        for (int i = 0; i < arr.length; i++) {

            if (arr[i].equals(c.toString())) {
                str = leftrotate(s, i);
            }
        }
        return str;
    }


    public StringBuffer shifter(String text, int shift) {
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

            } else {//lowercase
                char ch = (char) (((int) text.charAt(i) +
                        shift - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result;
    }


    public String leftrotate(String str, int d) {
        String ans = str.substring(d) + str.substring(0, d);
        return ans;
    }



    public String loadFile(){
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("sonnet18.txt").getFile());
        StringBuilder result = new StringBuilder("");

        try(Scanner scanner = new Scanner(file)){
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                result.append(line).append("\n");
            }

            scanner.close();
        }catch(IOException e){
            e.printStackTrace();
        }

        return result.toString();
    }
    public void output(String string) throws FileNotFoundException {

        FileOutputStream outputStream= new FileOutputStream("sonnet18.enc");
        Formatter formatter = new Formatter(outputStream);
        formatter.format(string);
        formatter.flush();

    }


}
