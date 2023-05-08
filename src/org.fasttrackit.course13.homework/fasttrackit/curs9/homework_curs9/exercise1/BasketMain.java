package org.fasttrackit.course13.homework.fasttrackit.curs9.homework_curs9.exercise1;

public class BasketMain {
    Basket basket = new Basket();
    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("apple");
        basket.add("kiwi");
        basket.add("kiwi");
        basket.add("berries");
        basket.add("pineapple");
        System.out.println("Fruits in the basket: " + basket.getAll());
        System.out.println("Number of fruits: " + basket.count() + " fruits.");
        System.out.println("Is there an apple in the basket? " + basket.find("apple"));
        System.out.println("Removing berries  " + basket.remove("berries"));
        System.out.println("Are there berries in the basket now? " + basket.find("berries"));
        System.out.println("The position of pineapple in the basket is: " + basket.position("pineapple"));
        System.out.println("Distinct fruits : " + basket.distinct());
        System.out.println("Custom count number of fruits: " + basket.customCount());
    }


}
