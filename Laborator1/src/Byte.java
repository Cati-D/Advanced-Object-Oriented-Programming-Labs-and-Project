public class Byte {
    static byte defaultValue;

    public static void main(String[] args) {

        //byte -->8-bit integer values
        byte b1 = -128;//variabila locala trebuie sa fie initializata; // o variabila care nu este declarata local, in corpul metodei nu poate fi utilizata
        System.out.println(b1);

        byte b2 = 127;
        System.out.println(b2);
        b2++;

        System.out.println(b2++);
        System.out.println(++b2);

        byte b3 = (byte)12345;
        System.out.println(b3);

        System.out.println(defaultValue);

    }

}
