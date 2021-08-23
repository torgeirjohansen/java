package creational.singleton;

// Often overused (since they are simple to use)
// Difficult to unit test
// if not careful, they are not thread safe
// Sometimes confused for Factory
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
        // Lazily loaded
        if (instance == null) {
            // Thread safety code
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }

        }
        return instance;
    }
}
