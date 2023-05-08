package org.fasttrackit.course13;

import java.util.ArrayList;
import java.util.List;

public class First {
    public int sum(int a, int b) {
        return a + b;
    }

    public List<Integer> getEven(List<Integer> list) {
        System.out.println("enetered geteven method");
        List<Integer> result = new ArrayList<>();
        if (validateInput(list)) {

            for (Integer integer : list) {
                if (integer % 2 == 0) {
                    result.add(integer);
                }
            }
        }
        return result;
    }

    public boolean validateInput(List<Integer> list) {
        System.out.println("enetered validateInput method");
        if (list == null) {
            throw new NullPointerException();
        }
        return true;
    }
}
