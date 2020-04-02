package Exceptions.ex3;

public class R2 implements AutoCloseable {

    String name;

    public R2(String name) {
        this.name = name;
    }

    @Override
    public void close() throws Exception {
        System.out.println("closing resurce" + name);
        throw new Exception("exception while tryong to close resource " + name);
    }
}
