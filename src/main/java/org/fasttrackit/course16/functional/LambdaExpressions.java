package org.fasttrackit.course16.functional;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.Predicate;

public class LambdaExpressions {
    public static void main(String[] args) {
        tryFunction(a -> a + 1);
        tryFunction(a -> a * 10);
        tryFunction(a -> {
            Random r = new Random();
            int randomNumber = r.nextInt(100);
            return a + randomNumber;
        });


        trySupplier(() -> "Hello");
       /*
       trySupplier(() -> {
            Scanner scanner = null;
            try {
                scanner = new Scanner(new File(""));
                return scanner.nextLine();
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        });
        */

        tryConsummer(System.out::println); //method reference
        tryConsummer(st -> System.out.println(st));

        tryConsummer(string -> string.toLowerCase());
        tryConsummer(String::toLowerCase); //method reference

        tryPredicate(i -> i < 10);
        tryPredicate(i -> i % 2 == 0);
    }

    public static void tryPredicate(Predicate<Integer> tester) {
        int a = 100;
        if (tester.test(a)) {
            System.out.println("won");
        } else {
            System.out.println("lost");
        }

    }

    public static void tryConsummer(Consumer<String> consumer) {
        String s = "teste";
        consumer.accept(s);
    }

    public static void trySupplier(Supplier<String> stringSupplier) {
        String s = stringSupplier.get();
        System.out.println(s);
    }

    public static void tryFunction(Function<Integer, Integer> increase) {
        //100 lines of code
        int i = 4;
        System.out.println(increase.apply(i));

        //100 lines of code
    }
}
