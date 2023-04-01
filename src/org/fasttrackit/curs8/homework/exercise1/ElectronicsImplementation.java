package org.fasttrackit.curs8.homework.exercise1;

public class ElectronicsImplementation extends Electronics {
    public ElectronicsImplementation(String type, int length, int width, int height, double weight) {
        super(type, length, width, height, weight);
    }

    @Override
    public String name() {
        String productName = "Clothes washing machine";
        System.out.println("\nProduct name: " + productName);
        return productName;
    }

    @Override
    public String description() {
        String productDescription = "Household washing machines with a rated capacity of 8 kg. ";
        System.out.println("Product name: " + productDescription);
        return productDescription;
    }

    @Override
    public int quantity(int quantity) {
        return super.quantity(quantity);
    }
}
