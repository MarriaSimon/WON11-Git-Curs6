package org.fasttrackit.curs9.homework_curs9.exercise1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Basket {
    private ArrayList<String> fruits = new ArrayList<>();

    public boolean find(String findFruit) {
        return fruits.contains(findFruit);
    }

    public boolean remove(String removeFruit) {
        return fruits.remove(removeFruit);
    }

    public Collection<String> distinct() {
        return new ArrayList<>(new HashSet<>(fruits));
    }

    public void add(String addFruit) {
        fruits.add(addFruit);
    }
    public Collection<String> getAll(){
        return fruits;
    }

    public int position(String fruit) {
        return fruits.indexOf(fruit);
    }
    public int count(){
        return fruits.size();
    }
    public int customCount() {
        int count = 0;
        for (String fruit : fruits) {
            count++;
        }
        return count;
    }

}
