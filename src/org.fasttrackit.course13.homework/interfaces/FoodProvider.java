package org.fasttrackit.course13.homework.interfaces;

public interface FoodProvider {
    boolean pay(double amount);

    String deliverFood();

    int getDeliveredQuantity();
}
