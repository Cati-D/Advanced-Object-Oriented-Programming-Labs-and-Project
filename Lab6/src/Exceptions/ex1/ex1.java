package Exceptions.ex1;

/**
 * try{} catch{}finally{}
 * java.lang -> Throwable
 *                    Error
 *                         OutOfMemoryException
 *                         StackOverflowExceptions
 *                     Exception
 *                         RuntimeException -> uncheckerd exceptions
 *                               java.Lang, NPE, ArithmeticException, IllegalArgumentException (NumberFormatException), ClassCastException
 *                         other exceptions -> checked exceptions
 *                               IOException(java.io) , SqlException(java.sql)
 *                                    FileNotFoundException*/
public class ex1 {

    public static void main(String[] args) throws Exception {//nu e recomandat sa pun exceptia in antetul mainului
        try {
            m1();
        } catch(NullPointerException e) {
            System.out.println(e);
        } finally{
            System.out.println("in finally.");
        }
    }

    static void m1() throws Exception{
        System.out.println("in m1.");
        m2();
       /* try {
            throw new Exception();
        } catch{};*/
       throw new Exception();
    }

    static void m2() {
        System.out.println("in m2.");
        throw new RuntimeException(("exception in m2"));
//        m3();
    }

    static void m3() {
        System.out.println("in m3.");
        //throws NPE
        Object o = null;
        o.toString();
    }
}
