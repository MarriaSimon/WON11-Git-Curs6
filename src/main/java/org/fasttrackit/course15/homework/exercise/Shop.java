package org.fasttrackit.course15.homework.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Shop<T extends ShopItem> {
    private List<T> items;

    public Shop() {
        items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
    }

    //findByCategory(Category cat): List<T>
    public List<T> findByCategory(Category cat) {
        List<T> list = new ArrayList<>();
        for (T item : items) {
            if (item.category() == cat) {
                list.add(item);
            }
        }
        return list;
    }


    //findWithLowerPrice(int maxPrice) : List<T>
    List<T> findWithLowerPrice(int maxPrice) {
        List<T> list = new ArrayList<>();
        for (T item : items) {
            if (item.price() <= maxPrice) {
                list.add(item);
            }
        }
        return list;
    }


    //  findByName(String name) : Optional<T>
    public Optional<T> findByName(String name) {
        boolean check = false;
        for (T item : items) {
            if (item.name().equals(name)) {
                check = true;
                return Optional.of(item);
            }
        }
        throw new IllegalArgumentException("Category not found: " + name);
    }


    //removeItem(String name): Optional<T>
    public Optional<T> removeItem(String names) {
        for (T item : items) {
            if (item.name().equals(names)) {
                items.remove(item);
                return Optional.of(item);
            }
        }
        throw new IllegalArgumentException("Product not found: " + names);
    }
}
