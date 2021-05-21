This repository contains one of the tasks for the university course Advanced Java. The original description of the task is copied to the README and can be viewed below.


## 4 Lombok használata
Adott a következő kód:

```package org.example;

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
}```

1. Javítsd ki benne az OOP alapelvet sértő kódot.
2. A maven projektbe vezesd be a függöségként a lombok legujabb verzioját.
3. A lombok használatával rövidítsd le a kód méretét. (figyelj a láthatósági módosítókra)
