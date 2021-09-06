package creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    private Map<String, Item> items = new HashMap<String, Item>();

    public Registry() {
        loadItems();
    }

    public Item createItem(String type) {
        Item item = null;
        try {
            item = (Item)(items.get(type)).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return item;
    }

    private void loadItems() {
        Movie movie = new Movie();
        movie.setTitle("Scary Movie");
        movie.setPrice(10.99);
        movie.setRunTime("2 hours");
        items.put("Movie", movie);

        Book book = new Book();
        book.setTitle("A really nice book");
        book.setPrice(5.99);
        book.setNumberOfPages(250);
        items.put("Book", book);
    }
}
