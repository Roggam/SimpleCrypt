public class main {
    public static void main(String[] args) {
      ROT13 rot13 = new ROT13();

        String str1 = rot13.shifter("ABCDEF", Character.getNumericValue('D')).toString();
        String str2 = rot13.shifter(str1, 5).toString();
      //  System.out.println(str1);
        //System.out.println(Character.getNumericValue('D'));
        System.out.println(rot13.rotate("ABCDEF",'D'));
        System.out.println((char)68);

        for (int i = 65; i < 68; i++) {
            System.out.println((char) i);
        }


//        System.out.println(rot13.shifter("Why did the chicken cross the road?",13));
//        System.out.println(rot13.shifter("Gb trg gb gur bgure fvqr!",13));
    }
}
