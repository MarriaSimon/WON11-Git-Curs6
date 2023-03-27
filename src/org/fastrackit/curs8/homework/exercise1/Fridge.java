package org.fastrackit.curs8.homework.exercise1;

public class Fridge extends Electronics {
    public Fridge(String type, int length, int width, int height, double weight) {
        super(type, length, width, height, weight);
    }

    @Override
    public String name() {
        String productName = "Fridge";
        System.out.println("\nProduct name: " + productName);
        return productName;
    }

    @Override
    public String description() {
        String productDescription = "White Fridge with a capacity of 100L ";
        System.out.println("Product name: " + productDescription);
        return productDescription;
    }

    @Override
    public int quantity(int quantity) {
        return super.quantity(quantity);
    }

    private int temperature;

    public int getTemperature(int temp1, int temp2) {
        this.temperature = temperature;
        System.out.println("Fridge temperature is set between: " + temp1 + " - " + temp2 + " °C");
        return temperature;
    }
}
