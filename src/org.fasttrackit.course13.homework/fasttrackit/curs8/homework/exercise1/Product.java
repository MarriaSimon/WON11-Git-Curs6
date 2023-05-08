package org.fasttrackit.course13.homework.fasttrackit.curs8.homework.exercise1;

public abstract class Product {
    private int price;
    private String name;
    private String description;
    private int quantity;
    public void Product(){
        this.price = price;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
    }
    public abstract String name();

    public abstract String description();

    public abstract double price(double price);
    public abstract int quantity(int quantity);

}
