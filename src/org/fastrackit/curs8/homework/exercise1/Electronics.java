package org.fastrackit.curs8.homework.exercise1;

public abstract class Electronics extends Product {
    @Override
    public String name() {
        System.out.println("Product name " + name());
        return name();
    }

    @Override
    public String description() {
        return description();
    }

    @Override
    public double price(double price) {
        System.out.println("Product price: " + price);
        return price;
    }

    @Override
    public int quantity(int quantity) {
        if (quantity > 1) {
            return quantity;
        }
        System.out.println("Product out of stock. ");
        return 0;
    }

    private String type;
    private int length;
    private int width;
    private int height;
    private double weight;

    public Electronics(String type, int length, int width, int height, double weight) {
        this.type = type;
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    public String type() {
        System.out.println("Category type: " + this.type);
        return type;
    }

    public int length() {
        System.out.println("Product length: " + this.length);
        return length;
    }

    public int width() {
        System.out.println("Product width: " + this.width);
        return width;
    }

    public int height() {
        System.out.println("Product height: " + this.height);
        return height;
    }

    public double weight() {
        System.out.println("Product weight: " + this.weight);
        return weight;
    }
}
