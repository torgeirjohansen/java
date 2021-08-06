package creational.singleton;

public class Singleton {
    // "volatile" will help us ensure the instance will remain a singelton through any of the changes
    // of the JVM.
    private static volatile Singleton instance = null;

    private Singleton() {
        if (instance != null) {
            // Stop reflection from creating an instance of this type
            throw new RuntimeException("Use getInstance() method to create");
        }
    }

    public static Singleton getInstance() {
        if (instance == null) {
            // Lazily loaded
            instance = new Singleton();
        }
        return instance;
    }
}
