package org.fasttrackit.course13.homework.fasttrackit.curs10.regex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {
        String text = String.format("Ana are %d de mere. %s", 20, "Merisoare.");


        // oricare dintre caratere
        System.out.println(text.replaceAll("[am]", " * "));

        //oricare dintre caracterele

        //orice caracter din range
        //range => ascii (ascii table - are un numar pt orice caracter)
        System.out.println(text.replaceAll("0-9", "*"));
        System.out.println(text.replaceAll("a-zA-Z", "*"));

        //ORICARE CARACTER dintre cele enumerate
        System.out.println(text.replaceAll("(0|1|2)", "*"));

        //oricare caracter
        System.out.println(text.replaceAll(".", " *"));

        //orice punct
        System.out.println(text.replaceAll("\\.", "*"));

        //orice cifra
        System.out.println(text.replaceAll("\\d", "*"));

        //cu cuvant care incepe cu M si se termina cu e --de rezolvat acest regex
        System.out.println(text.replaceAll("\\bm\\w*e\\b", "*"));

        System.out.println((Pattern.matches("A.*", text)));
        System.out.println((Pattern.matches("A.*", "A")));
        System.out.println((Pattern.matches("A.+", "A")));

        varArgs("test", 2);
        varArgs("secondTest", 2, 5, 6);
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        Arrays.asList("a", "bc", "djl");


    }

    //object ...= metoda care accepta un nr variabil de parametrii.
    //singura limitare: parametrul cu nr variabil trebuie sa fie ultimul ca sa stie cand se termina
    private static void varArgs(String firstParam, Integer... numbers) {
        for (Integer i : numbers) {
            System.out.println(firstParam + i);
        }
    }
}
