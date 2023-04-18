package org.fasttrackit.Curs11.Maps;

import java.util.*;

public class MapExercise {
    public static void main(String[] args) {
        Map<String, Integer> nameToAge = new HashMap<>();
        Map<String, Integer> nameToAgeTree = new TreeMap<>();

        nameToAge.put("Alex", 31);
        nameToAge.put("John", 20);
        nameToAge.put("Alex", 41);
        for (int i = 0; i < 100000; i++) {
            nameToAge.put("Name" + i, i);
            nameToAgeTree.put("Name" + i, i);
        }
        long time1, time2;

        System.out.println(nameToAge);
        long start = System.currentTimeMillis();
        Set<String> keySet = nameToAge.keySet();
        for (String key : keySet) {
            System.out.println(nameToAge.get(key));
        }
        time1 = System.currentTimeMillis() - start;


        start = System.currentTimeMillis();
        Set<Map.Entry<String, Integer>> entries = nameToAgeTree.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getValue());
        }
        time2 = System.currentTimeMillis() - start;

        Set<String> keyset = nameToAge.keySet();
        for (String key : keyset) {
            System.out.println(nameToAge.get(key));
        }

        // Set<Map.Entry<String, Integer>> entries = nameToAge.entrySet();
        // for (Map.Entry<String, Integer> entry : entries) {
        //     System.out.println(entry.getValue());
        //  }
    }
}

