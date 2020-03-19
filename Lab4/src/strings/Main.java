package strings;

public class Main {

    static String membruClasa;

    public static void main(String[] args) {

        System.out.println(membruClasa);

        String s1 = "";
        String s2 = "abc";// isBlank();//string pool
        System.out.println(s2);//abc
        s2.toUpperCase();
        System.out.println(s2);//abc
//        s2 = s2.toUpperCase();//se creaza un alt string
//        System.out.println(s2);//ABC

        String s3 = new String("abc");//alocat pe heap
        String s4 = "abc \nde\tf";
        System.out.println(s2 == s3);//false
        System.out.println(s2 == s4);//true
        System.out.println(s3 == s4);//false
        s3 = s3.intern();
        System.out.println(s2.equals(s3));//true
        System.out.println(s2 == s3);

        String adresa = s1 + s2 + s3.toUpperCase() + s4.length();
        System.out.println(adresa);
        StringBuilder sb = new StringBuilder(adresa);
        sb.append(1234);

        StringBuffer sbf = new StringBuffer(adresa);
        StringBuffer sbf1 = new StringBuffer(sb);
        StringBuilder sb1 = new StringBuilder(sbf);
    }
}
