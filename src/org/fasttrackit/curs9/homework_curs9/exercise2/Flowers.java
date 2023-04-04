package org.fasttrackit.curs9.homework_curs9.exercise2;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Flowers {
    private Set<String> flowerName;

    public Flowers() {

        flowerName = new HashSet<>();
    }

    public Collection<String> getAll() {
        return flowerName;
    }

    public void add(String addFlowers) {
        flowerName.add(addFlowers);
    }

    public void remove(String removeFlowers) {
        flowerName.remove(removeFlowers);
    }
}


