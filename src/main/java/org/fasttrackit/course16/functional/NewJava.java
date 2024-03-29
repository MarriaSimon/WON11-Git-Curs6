package org.fasttrackit.course16.functional;

import java.util.function.Function;

public class NewJava {
    public static void main(String[] args) {
        //Lambda Expression
        System.out.println(transformString("mark", (word) -> {return word.toUpperCase();}));
        System.out.println(transformString("mark", word ->word.toLowerCase()));

    }
    public static String transformString(String word, Function<String, String> transformer){//Higher Function
        return  transformer.apply(word);
    }
}
