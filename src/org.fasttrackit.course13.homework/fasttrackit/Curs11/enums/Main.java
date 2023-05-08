package org.fasttrackit.course13.homework.fasttrackit.Curs11.enums;

import java.util.Scanner;

import static org.fasttrackit.course13.homework.fasttrackit.Curs11.enums.CardinalPoints.WEST;
import static org.fasttrackit.course13.homework.fasttrackit.Curs11.enums.CardinalPoints.fromSymbol;

public class Main {
    public static void main(String[] args) {
        CardinalPoints west = WEST;
        System.out.println(west.getSymbol());

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a cardinal point:");
        String line = scanner.nextLine();

        CardinalPoints cardinalPoints = CardinalPoints.fromName(line);
        if (cardinalPoints != null) {
            System.out.println("It's symbol is: " + cardinalPoints.getSymbol());
        }

        System.out.println("Enter a cardinal symbol: ");
        CardinalPoints fromSymbol = fromSymbol(scanner.nextLine());
        if (fromSymbol != null) {
            System.out.println("the cardinal point is: " + fromSymbol.name());
        }

        System.out.println("Enter a cardinal symbol: ");
        fromSymbol = fromSymbol(scanner.nextLine());
        if (fromSymbol != null) {
            if (fromSymbol == CardinalPoints.NORTH) {
                System.out.println("hurry");
            }
            System.out.println("YOU NEED TO GO: " + fromSymbol.toDirection());
        }
    }
}