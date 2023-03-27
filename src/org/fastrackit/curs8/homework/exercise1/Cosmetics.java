package org.fastrackit.curs8.homework.exercise1;


public class Cosmetics extends Product {
    public int weight() {
        int weight = 21 ;
        return weight;
    }

    private String colour;


    public String getColour() {
        this.colour = "light beige";
        return colour;
    }
    @Override
    public String name() {
        return "Foundation";
    }

    @Override
    public String description() {
        return "Foundation is meant to even out skin imperfections and create a blank canvas for makeup application";
    }

    @Override
    public double price(double price) {
        return price;
    }

    @Override
    public int quantity(int quantity) {
        if (quantity > 1) {
            return quantity;
        }
        System.out.print("Product out of stock. ");
        return 0;
    }
}


