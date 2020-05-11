package singleton;

public class EagerSingleton {
    private static EagerSingleton ourIstance = new EagerSingleton();

    public static EagerSingleton getInstance() {
        return ourIstance;
    }

    private EagerSingleton() {

    }
}
