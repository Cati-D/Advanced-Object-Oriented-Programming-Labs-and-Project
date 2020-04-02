package Exceptions.ex3;

public class ex2 {

    public static void main(String[] args) {

        try (r1 R1 = new r1();
             r1 R2 = new r1();){//ex1 r3 = new ex1()-nu ar functiona, nu e AutoCloseable
            //some logic here;
        }//singurul try fara catch si fara finally
    }
}
