package org.fasttrackit.course13.homework.homework_curs7.advertising;

public class Print implements AdvertisingProvider {
    private static double pricePerAd = 5.99;
    private int adQuantity = 20;
    private double amountToPay = 0;

    @Override
    public String adMessage() {
        adQuantity++;
        amountToPay += adQuantity;
        return "smartwatches";
    }

    @Override
    public int adQuantity() {
        return adQuantity;
    }

    @Override
    public boolean pay(double amount) {
        if (amount > 0 && amount <= amountToPay) {
            amountToPay -= amount;
            System.out.println("Print was paid: " + amount);
            System.out.println("Product promoted: " + adMessage());
            System.out.print("Number of commercials: " + adQuantity());
            return true;
        }
        return false;
    }
}


