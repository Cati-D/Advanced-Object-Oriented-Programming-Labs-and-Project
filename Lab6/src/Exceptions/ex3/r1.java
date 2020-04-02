package Exceptions.ex3;

public class r1 implements AutoCloseable{

    public r1() {
        throw new RuntimeException();
    }
    @Override
    public void close(){
        throw new RuntimeException("new exception");
    }
}
