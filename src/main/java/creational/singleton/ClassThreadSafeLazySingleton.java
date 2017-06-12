package creational.singleton;


public class ClassThreadSafeLazySingleton {
    private static ClassThreadSafeLazySingleton INSTANCE;

    private ClassThreadSafeLazySingleton() {
    }

    public static ClassThreadSafeLazySingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (ClassThreadSafeLazySingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new ClassThreadSafeLazySingleton();
                }
            }
        }
        return INSTANCE;
    }
}
