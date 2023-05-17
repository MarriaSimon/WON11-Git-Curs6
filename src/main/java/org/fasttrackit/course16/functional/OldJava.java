package org.fasttrackit.course16.functional;

public class OldJava {
    //public static void doSomething(String s)
    //1000 lines of code
    //a custom piece of code1. s1 = s.toUpperCase()   2. s1 = s.toLowerCase()
    //1000 lines of code


    public static void main(String[] args) {

    }
    public static String transformString(String word, org.fasttrackit.course16.functional.StringTransformer transformer){
        return transformer.transformer(word);
    }
    interface StringTransformer{
        String transformer(String word);
    }
}
