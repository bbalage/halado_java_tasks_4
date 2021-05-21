package hu.meiit.haladojava;

public class Product {
    private String name;
    private int price;
    public String type; // értéke lehet "csoki" vagy "banan"
    public Product(String name, int price) {
        super();
        this.name = name;
        this.price = price;
    }
    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + "]";
    }
    protected String getName() {
        return name;
    }
    protected void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void increasePrice(int percentage) {
        price += Math.round(price*(float)percentage/100);
    }
    public void decreasePrice(int percentage) {
        price -= Math.round(price*(float)percentage/100);
    }
}
