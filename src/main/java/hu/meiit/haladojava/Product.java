package hu.meiit.haladojava;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Product {
    @Getter(AccessLevel.PROTECTED) @Setter(AccessLevel.PROTECTED) private String name;
    @Getter @Setter private int price;
    @Getter @Setter @ToString.Exclude private String type; // értéke lehet "csoki" vagy "banan"
    public Product(String name, int price) {
        super();
        this.name = name;
        this.price = price;
    }
    public void increasePrice(int percentage) {
        price += Math.round(price*(float)percentage/100);
    }
    public void decreasePrice(int percentage) {
        price -= Math.round(price*(float)percentage/100);
    }
}
