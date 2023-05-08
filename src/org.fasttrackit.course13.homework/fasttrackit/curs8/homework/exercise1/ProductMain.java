package org.fasttrackit.course13.homework.fasttrackit.curs8.homework.exercise1;


public class ProductMain {
    public static void main(String[] args) {
        Product cosmetics = new Cosmetics();
        System.out.println("Product name " + cosmetics.name());
        System.out.println("Product description: " + cosmetics.description());
        System.out.println("Product price: " + cosmetics.price(15.99));
        System.out.print("Product quantity: " + cosmetics.quantity(3));
        System.out.println("\nProduct weight: " + ((Cosmetics) cosmetics).weight() + "g");//hardcasting
        System.out.println("Product colour: " + ((Cosmetics) cosmetics).getColour());//hardcasting


        Electronics electronics = new ElectronicsImplementation("biq electronics", 103,90,85,24.5);
        electronics.name();
        electronics.description();
        electronics.price(312.85);
        electronics.quantity(0);
        electronics.type();
        electronics.length();
        electronics.width();
        electronics.height();
        electronics.weight();

        Electronics fridge = new Fridge("Big Electronics",130,54,85,35.6);
        fridge.name();
        fridge.description();
        fridge.price(521.99);
        fridge.quantity(3);
        fridge.type();
        fridge.length();
        fridge.width();
        fridge.height();
        fridge.weight();
        ((Fridge) fridge).getTemperature(0,4);
    }
}
