package Exceptions.ex2;

public class Main {

    private static final int AMOUNT = 100;

    public static void main(String[] args) {

        try {
            m1(101);
        } catch (MyCheckedException e) {
            System.out.println(e);
            m2();
        }finally {
            System.out.println("finally");//se executa tot timpul
        }
    }

    static int m1(int x) throws MyCheckedException{
        if (x < AMOUNT) {
            return x;
        } else {
            throw new MyCheckedException(":(");
        }
    }

    static void m2() {
        try {
            throw new MyRuntimeException("my rt exception in m2");
        } catch (MyRuntimeException e) {
            e.printStackTrace();
        }
    }
}
