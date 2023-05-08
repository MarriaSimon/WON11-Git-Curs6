package org.fasttrackit.course13.homework.fasttrackit.curs9.homework_curs9.exercise2;

public class FlowersMain {
    public static void main(String[] args) {
        Flowers flowers = new Flowers();
        flowers.add("Red Rose");
        flowers.add("Red Rose");
        flowers.add("White Rose");
        flowers.add("Lilly");

        System.out.println(flowers.getAll());

        flowers.remove("Red Rose");
        System.out.println(flowers.getAll());
    }
}
