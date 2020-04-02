package Exceptions.ex3;

public class ex1 {

    public static void main(String[] args) {

        r1 R1 = null;
        try {
            R1 = new r1();
            //some logic
        } catch(Exception e) {
            System.out.println(e);

        } finally {
            if (R1 != null) {
                try{
                    R1.close();
                }
            catch(Exception e) {
                System.out.println(e);}
            }
        }
    }
}
