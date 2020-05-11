package singleton;

public class concurrentLazySingleton {
    private static concurrentLazySingleton istance;

    public static concurrentLazySingleton getIstance() {
        if (istance == null) {
            synchronized (concurrentLazySingleton.class) {
                if (istance == null) {
                    istance = new concurrentLazySingleton();
                }
            }
        }
        return istance;
    }

    private concurrentLazySingleton() {

    }
}
