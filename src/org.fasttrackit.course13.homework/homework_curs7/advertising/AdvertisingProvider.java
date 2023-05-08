package org.fasttrackit.course13.homework.homework_curs7.advertising;

public interface AdvertisingProvider {
    String adMessage();
    int adQuantity();
    boolean pay(double amount);
}
