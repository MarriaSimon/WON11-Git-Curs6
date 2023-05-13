package org.fasttrackit.course15.homework.exercise;

import java.util.List;
import java.util.Optional;

public class ShopMain {
    public static void main(String[] args) {
        Shop<ShopItem> shop = new Shop<>();

        Clothes skirt = new Clothes("A-line skirt", 35, Category.NEW);
        shop.addItem(skirt);

        Clothes blouse = new Clothes("Blouse", 15, Category.NEW);
        shop.addItem(blouse);

        Electronics laptop = new Electronics("Apple Laptop", 1200, Category.ON_SALE);
        shop.addItem(laptop);

        Electronics dellLaptop = new Electronics("Dell Laptop", 250, Category.REFURBISHED);
        shop.addItem(dellLaptop);

        Fruit banana = new Fruit("Banana", 1, Category.NEW);
        shop.addItem(banana);

        List<ShopItem> newShop = shop.findByCategory(Category.NEW);
        System.out.println("New Items: ");
        for (ShopItem item : newShop) {
            System.out.println(item.name() + " " + item.price());
        }

        List<ShopItem> lowerPrice = shop.findWithLowerPrice(250);
        System.out.println("New Items: ");
        for (ShopItem item : lowerPrice) {
            System.out.println(item.name() + " " + item.price());
        }


        Optional<ShopItem> findName = shop.findByName("Blouse");
        System.out.println("Found Items: ");

        if (findName.isPresent()) {
            ShopItem item = findName.get();
            System.out.println(item.name() + " " + item.price());
        }

        Optional<ShopItem> remove = shop.removeItem("Apple Laptop");
        System.out.println("Removed Items: ");

        if (remove.isPresent()) {
            ShopItem item = remove.get();
            System.out.println(item.name() + " " + item.price());
        }

    }


    }


