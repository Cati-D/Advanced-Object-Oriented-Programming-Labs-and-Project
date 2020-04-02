package Exceptions.ex3;

import java.util.Arrays;

public class ex3 {

    public static void main(String[] args) {

        try(R2 r1 = new R2("r1");
            R2 r2 = new R2("r2")) {
            System.out.println("in try block");
            throw new Exception("exception in try block");
        }catch (Exception e) {
            System.out.println(e);
            //suppressed exceptions
            Throwable[] suppressedExceptions = e.getSuppressed();
            System.out.println(Arrays.toString(suppressedExceptions));
        } finally {
            System.out.println("finally");
        }
    }
}
