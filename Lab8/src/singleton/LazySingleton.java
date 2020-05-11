package singleton;

public class LazySingleton {
    private static LazySingleton istance;

    public static LazySingleton getInstance()  {
        if (istance == null){
            istance = new LazySingleton();
        }
        return istance;
    }

    private LazySingleton() {

    }
}
