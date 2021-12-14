import java.io.FileNotFoundException;
import java.io.StringReader;

public class main {
    public static void main(String[] args) throws FileNotFoundException {
        ROT13 rot13 = new ROT13();
//TESTING
        String str1 = rot13.shifter("ABCDEF", Character.getNumericValue('D')).toString();
        String str2 = rot13.shifter(str1, 5).toString();
        //  System.out.println(str1);
        //System.out.println(Character.getNumericValue('D'));
        String string = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Character ch = 'N';
        System.out.println(rot13.rotate(string, ch));
        System.out.println((int) 'D');

//TESTING


        ROT13 rot131 = new ROT13();
        String output = rot131.encrypt(rot13.loadFile());
        rot131.output(output);


    }




}
