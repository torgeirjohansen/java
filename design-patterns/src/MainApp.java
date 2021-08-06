import creational.singleton.Singleton;

public class MainApp {
    public static  void main(String args[]) {
        System.out.println("Testing creational patterns.");

        System.out.println("Testing singleton.");
        Singleton instance = Singleton.getInstance();
        System.out.println(instance);
        Singleton anotherInstance = Singleton.getInstance();
        System.out.println(anotherInstance);
    }
}

