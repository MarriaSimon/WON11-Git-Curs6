package org.fasttrackit.course13.homework.interfaces;

public class Company {
    private FoodProvider foodSource;
    private int numberOfEmployees = 10;

    public void setFoodSource(FoodProvider foodSource) {
        this.foodSource = foodSource;
    }

    public void sendFoodToEmplyees() {
        for (int i = 0; i < numberOfEmployees; i++) {
            foodSource.deliverFood();
        }
    }

    public void makePayment() {
        foodSource.pay(100);
    }
}
