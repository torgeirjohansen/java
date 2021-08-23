import creational.builder.LunchOrder;
import creational.singleton.Singleton;

public class MainApp {
    public static  void main(String args[]) {
        System.out.println("Testing creational patterns.");

        System.out.println("Testing singleton.");
        Singleton instance = Singleton.getInstance();
        System.out.println(instance);
        Singleton anotherInstance = Singleton.getInstance();
        System.out.println(anotherInstance);

        System.out.println("");
        System.out.println("Testing builder.");
        LunchOrder.Builder builder = new LunchOrder.Builder();
        builder
                .bread("Wheat")
                .condiments("Lettuce")
                .dressing("Mayo")
                .meat("Turkey");
        LunchOrder order = builder.build();
        System.out.println(order.getBread());
        System.out.println(order.getCondiments());
        System.out.println(order.getDressing());
        System.out.println(order.getMeat());
    }
}

