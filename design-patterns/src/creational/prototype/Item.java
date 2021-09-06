package creational.prototype;

public abstract class Item implements Cloneable {
    private String title;
    private double price;
    private String uri;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUrl() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }
}
