package org.fasttrackit.course13.homework.fasttrackit.curs10.homework_c9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class BucketFlowers {
    private ArrayList<String> fruits = new ArrayList<>();
   /* public BucketFlowers() {
        List<String> fruits;
    }

    */

    public boolean find(String fruit) {
        return fruits.contains(fruit);
    }

    public boolean remove(String fruit) {
        return fruits.remove(fruit);
    }

    public int position(String fruit) {
        return fruits.indexOf(fruit);
    }

    public Collection<String> distinct() {
        return new HashSet<>(fruits);
    }

    public void add(String fruit) {
        fruits.add(fruit);
    }
}
