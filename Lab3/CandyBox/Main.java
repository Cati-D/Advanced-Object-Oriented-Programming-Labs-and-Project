package CandyBox;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {

        Lindt lindt1 = new Lindt("abc", "efg", 1, 2, 3);
        Lindt lindt2 = new Lindt("efg", "hij", 3, 4, 5);
        Lindt lindt3 = new Lindt("abc", "efg", 1, 2, 3);
        Lindt lindt4 = new Lindt("klm", "nop", 7, 8, 9);

        System.out.println(lindt1);
        System.out.println(lindt2);
        System.out.println(lindt3);
        System.out.println(lindt4);
        System.out.println(lindt1.equals(lindt1));//true
        System.out.println(lindt2.equals(lindt1));//false
        System.out.println(lindt1.equals(lindt3));//true
        System.out.println(lindt1.equals(lindt4));//false

        Milka milka1 = new Milka("abc", "efg", 1, 2);
        Milka milka2 = new Milka("efg", "hij", 2, 3);
        Milka milka3 = new Milka("abc", "efg", 1, 2);
        Milka milka4 = new Milka("klm", "nop", 4, 5);

        System.out.println(milka1);
        System.out.println(milka2);
        System.out.println(milka3);
        System.out.println(milka4);
        System.out.println(milka1.equals(milka1));//true
        System.out.println(milka2.equals(milka2));//false
        System.out.println(milka3.equals(milka3));//true
        System.out.println(milka4.equals(milka4));//false

        Heidi heidi1 = new Heidi("abc", "def", 1);
        Heidi heidi2 = new Heidi("ghi", "jkl", 2);
        Heidi heidi3 = new Heidi("abc", "def", 1);
        Heidi heidi4 = new Heidi("mno", "pqr", 3);

        System.out.println(heidi1);
        System.out.println(heidi2);
        System.out.println(heidi3);
        System.out.println(heidi4);
        System.out.println(heidi1.equals(heidi1));
        System.out.println(heidi1.equals(heidi2));
        System.out.println(heidi1.equals(heidi3));
        System.out.println(heidi2.equals(heidi4));

    }
}
