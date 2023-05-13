package org.fasttrackit.course15.generics;

import java.util.ArrayList;
import java.util.List;

import static java.awt.PageAttributes.MediaType.A;


public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Johnny");
        names.get(0).toUpperCase();

        OldBox oldBoxWithNumber = new OldBox(12);
        OldBox oldBoxWithString = new OldBox("Mark");

        if (oldBoxWithNumber.getItem() instanceof Integer) {
            System.out.println((int) oldBoxWithNumber.getItem() + 1);
            System.out.println((int) oldBoxWithNumber.getItem() + 1);
        }

        NewBox<Integer> boxWithNumber = new NewBox<>(12);
        NewBox<String> boxWithString = new NewBox<>("Mark");
        System.out.println(boxWithNumber.getItem());

        String stringItem = boxWithString.getItem();

        NumberBox<Long> numberBox = new NumberBox<>(10L);

        Pair<Long, Double> pair = new Pair<>(10L, 23.3);

        GlassBox<String, Double> glassBox = new GlassBox<>("Test", 12.0);
        String item = glassBox.getItem();
        System.out.println(getBigger(12,14));
    }

        public static <A extends Comparable<A>>  A getBigger(A first, A second){
        return first.compareTo(second) > 0 ? first : second;

    }
}
